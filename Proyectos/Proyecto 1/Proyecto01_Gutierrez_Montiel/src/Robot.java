import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;

/**
* Clase para definir todo lo que puede hacer el robot
*/
public class Robot{

  //El estado Actual del Robot
  private EstadoRobot estadoActual;
  //El objeto de clase de Estado Caminando del Robot
  private EstadoRobot caminando;
  //El objeto de clase de Estado Atendiendo del Robot
  private EstadoRobot atendiendo;
  //El objeto de clase de Estado Suspendido del Robot
  private EstadoRobot suspendido;
  //El objeto de clase de Estado Cocinando del Robot
  private EstadoRobot cocinando;
  //El menu de pizzas
  private ArregloPizza menuPizza;
  //El menu de hamburguesas
  private ListaHamburguesa menuHamburguesas;
  //El menu de burritos
  private HashtableBurritos menuBurritos;
  //Boolean para saber si el robot ya recibio una orden
  private boolean orden;
  //Modulo con el que va a cocinar
  private Modulo modulo;
  //El platillo a cocinar
  private MenuItem platillo;
  // El numero de orden
  private int numOrden;

  /**
  * Constructor de la clase robot, comienza en el estado suspendido y no tiene orden
  * @param pizza objeto de la clase ArregloPizza, clase que contiene al menu
  * @param hamburguesa objeto de la clase ListaHamburguesa, clase que contiene al menu
  * @param burritos objeto de la clase HashtableBurritos, clase que contiene al menu
  */
  public Robot(ArregloPizza pizza, ListaHamburguesa hamburguesa, HashtableBurritos burritos){
    suspendido = new Suspendido(this);
    caminando = new Caminando(this);
    atendiendo = new Atendiendo(this);
    cocinando = new Cocinando(this);
    estadoActual = suspendido;
    menuPizza = pizza;
    menuHamburguesas = hamburguesa;
    menuBurritos = burritos;
    orden = false;
  }

  /**
  * Metodo que devuelve al robot al estado suspendido, y que convierte su booleano orden a false, ya que no ha recibido orden
  */
  public void reiniciar(){
    estadoActual = suspendido;
    orden = false;
  }
  /**
  * Metodo que devuelve el estado actual del robot
  * @return estadoActual el estado actual del robot
  */
  public EstadoRobot getEstadoActual(){
    return estadoActual;
  }

  /**
  * Metodo que devuelve el objeto de estado caminando
  * @return caminando el objeto del Estado Caminando
  */
  public EstadoRobot getEstadoCaminar(){
    return caminando;
  }

  /**
  * Metodo que devuelve el objeto de estado atendiendo
  * @return atendiendo el objeto del Estado Atendiendo
  */
  public EstadoRobot getEstadoAtender(){
    return atendiendo;
  }

  /**
  * Metodo que devuelve el objeto de estado Suspendido
  * @return suspendido el objeto del Estado Suspendido
  */
  public EstadoRobot getEstadoSuspender(){
    return suspendido;
  }

  /**
  * Metodo que devuelve el objeto de estado Cocinando
  * @return cocinando el objeto del Estado Cocinando
  */
  public EstadoRobot getEstadoCocinar(){
    return cocinando;
  }

  /**
  * Metodo que devuelve el objeto boolean de orden
  * @return orden el boolean que nos dice si ya recibio una orden
  */
  public boolean getOrden(){
    return orden;
  }

  /**
  * Metodo para imprimir el ticket del platillo o mercancia correspondiente a entregar
  */
  public void imprimirTicket(){
    this.platillo.aString();
    imprimir("¡Gracias por tu compra!" + "\n");
  }

  /**
  * Metodo que imprime el menu inicial, para saber si se quiere realizar un pedido o salir del programa
  */
  public void menuGeneral(){
    imprimir("Bienvenido. El robot se encuentra suspendido, escoja la opcion que desee: \n" +
              "1.-Realizar un pedido. \n" +
              "2.-Salir del programa. \n");
  }

  /**
  * Metodo que imprime en terminal el menu completo
  */
  public void imprimirMenu(){
    imprimir("Bienvenido al restaurante McBurguesas escoge el numero de platillo o mercancia que desees.");
    imprimirMenuPizzas();
    imprimirMenuBurritos();
    imprimirMenuHamburguesas();
  }
  /**
  * Metodo que imprime en terminal el menu de las pizzas
  */
  public void imprimirMenuPizzas(){
    int n = 1;
    Iterador p = this.menuPizza.createIterator();
    while(p.hasNext() == true){
      System.out.print(n + " ");
      p.next().aString();
      n++;
    }
  }

  /**
  * Metodo que imprime en terminal el menu de las Hamburguesas
  */
  public void imprimirMenuHamburguesas(){
    int l = 9;
    Iterador h = this.menuHamburguesas.createIterator();
    while(h.hasNext() == true){
      System.out.print(l + " ");
      h.next().aString();
      l++;
    }
  }

  /**
  * Metodo que imprime en terminale el menu de los Burritos
  */
  public void imprimirMenuBurritos(){
    int m = 5;
    Iterador b = this.menuBurritos.createIterator();
    while(b.hasNext() == true){
      System.out.print(m + " ");
      b.next().aString();
      m++;
    }
  }

  /**
  * Metodo que asigna al modulo necesario para cocinar el platillo
  * @param int el numero de platillo que esta ordenando
  */
  public void asignarModulo(int tipo){
    if(tipo <= 4){
      imprimir("Ocupare el modulo para cocinar pizzas.");
      this.modulo = new ModuloPizzas();
    } else if(tipo <= 8){
      imprimir("Ocupare el modulo para cocinar burritos.");
      this.modulo = new ModuloBurritos();
    } else {
      imprimir("Ocupare el modulo para cocinar hamburguesas.");
      this.modulo = new ModuloHamburguesas();
    }
  }

  /**
  * Metodo que asigna el platillo que se va a preparar o mercancia que se va a entregar
  * @param int el numero de platillo que esta ordenando
  */
  public void asignarPlatillo(int tipo){
    Iterador b = new IteradorBurritos(menuBurritos);
    if(tipo < 5){
      this.platillo = menuPizza.getMenu()[tipo-1];
    } else if(tipo == 5){
      this.platillo = b.next();
    } else if(tipo == 6){
      this.platillo = b.next();
    } else if(tipo == 7){
      this.platillo = b.next();
    } else if(tipo == 8){
      this.platillo = b.next();
    } else {
      this.platillo = menuHamburguesas.getMenu().get(tipo-9);
    }
  }

  /**
  * Metodo que guarda el numero de Orden, asigna el platillo y toma en cuenta el caso de que se trate de mercancia
  * @param int el numero de el platillo que esta ordenando
  */
  public void recibirOrden(int numOrden){
    this.orden = true;
    this.numOrden = numOrden;
    asignarPlatillo(numOrden);
    if(numOrden > 13)
      imprimir("Has pedido mercancia, por lo que no es necesario que vaya a la cocina. Toma tu mercancia.");
  }

  /**
  * Metodo que devuelve el objeto de clase Modulo que posee el Robot
  * @return modulo el objeto modulo que tiene el robot
  */
  public Modulo getModulo(){
    return modulo;
  }

  /**
  * Metodo para asignarle un estado actual nuevo al Robot
  * @param estadoNuevo el estado que se va a asignar como estado actual
  */
  public void asignarEstadoActual(EstadoRobot estadoNuevo){
    this.estadoActual = estadoNuevo;
  }

  /**
  * Metodo que devuelve el platillo a cocinar
  * @return platillo el platillo a cocinar
  */
  public MenuItem getPlatillo(){
    return platillo;
  }

  /**
  * Metodo que activa al robot dependiendo de su estado actual
  */
  public void activar(){
    this.estadoActual.activar();
  }

  /**
  * Metodo que suspende al robot dependiendo de su estado actual
  */
  public void suspender(){
    this.estadoActual.suspender();
  }

  /**
  * Metodo que pone al robot a cocinar dependiendo de su estado actual
  */
  public void cocinar(){
    this.estadoActual.cocinar();
    asignarModulo(this.numOrden);
    this.modulo.cocinar();
  }

  /**
  * Metodo que pone al robot a atender dependiendo de su estado actual
  */
  public void atender(){
    this.estadoActual.atender();
  }

  /**
  * Metodo que pone al robot a caminar dependiendo de su estado actual
  */
  public void caminar(){
    this.estadoActual.caminar();
  }

  /**
  * Metodo para imprimir rapido
  */
  public static void imprimir(Object o){
    System.out.println(o);
  }
}
