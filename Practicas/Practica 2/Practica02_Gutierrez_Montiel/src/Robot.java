
/**
* Clase para definir todo lo que puede hacer el robot junto con los estados
*/
public class Robot{

  // id de la casa a construir
  private int id;
  // Estado caminando del robot
  private EstadoRobot caminando;
  // Estado activado del robot
  private EstadoRobot reabasteciendose;
  // Estado suspendido del robot
  private EstadoRobot suspendido;
  // Estado trabajando del robot
  private EstadoRobot trabajando;
  // Estado recibiendo una orden del robot
  private EstadoRobot recibiendoUnaOrden;
  // Estado actual del robot
  private EstadoRobot estadoActual;
  // Casa a construir
  private Casa casa;
  // Booleano para saber si ya recibio alguna orden
  private boolean orden = false;
  // Booleano para saber si ya va a trabajar
  private boolean trabajo = false;

  private boolean inicio = false;


  /**
  * Constructor del Robot
  */
  public Robot(){
    caminando = new Caminando(this);
    reabasteciendose = new Reabasteciendose(this);
    suspendido = new Suspendido(this);
    trabajando = new Trabajando(this);
    recibiendoUnaOrden = new RecibiendoUnaOrden(this);
    estadoActual = suspendido;
  }

  /**
  * Metodo para asignar el ID el tipo de Casa
  * @param id del tipo de casa a construir
  */
  public void asignarID(int id){
    this.id = id;
  }

  /**
  * Metodo que devuelve el id del tipo de Casa
  * @return id el tipo de casa
  */
  public int getID(){
    return id;
  }
  public void reinicializarRobot(){
    estadoActual = suspendido;
  }

  /**
  * Metodo para asignar el nuevo estado actual del robot
  * @param nEstado el nuevo estado actual del robot
  */
  public void asignarNuevoEstado(EstadoRobot nEstado){
    estadoActual = nEstado;
  }

  /**
  * Metodo que devuelve el estado actual del Robot
  * @return estadoActual el estado actual del robot
  */
  public EstadoRobot getEstadoActual(){
    return estadoActual;
  }

  /**
  * Metodo para asignar una casa a construir
  * @param casa la casa a construir
  */
  public void asignarCasa(Casa casa){
    this.casa = casa;
  }

  /**
  * Metodo que devuelve el objeto del estado suspender
  * @return suspendido el objeto de estado Suspendido
  */
  public EstadoRobot getEstadoSuspender(){
    return suspendido;
  }

  /**
  * Metodo que devuelve el objeto del estado reabasteciendose
  * @return reabasteciendose el objeto de la clase Reabasteciendose
  */
  public EstadoRobot getEstadoReabastecerse(){
    return reabasteciendose;
  }

  /**
  * Metodo que devuelve el objeto del estado trabajando
  * @return trabajando el objeto de la clase Trabajando
  */
  public EstadoRobot getEstadoTrabajar(){
    return trabajando;
  }

  /**
  * Metodo que devuelve el objeto del estado recibiendo orden
  * @return recibiendoUnaOrden el objeto de la clase RecibiendoUnaOrden
  */
  public EstadoRobot getEstadoRecibirOrden(){
    return recibiendoUnaOrden;
  }

  /**
  * Metodo que devuelve el objeto del estado caminar
  * @return caminando el objeto de la clase Caminando
  */
  public EstadoRobot getEstadoCaminar(){
    return caminando;
  }

  /**
  * Metodo para limpiar la pantalla de la terminal despues de seleccionar alguna opcion.
  */
  public static void limpia(){
    System.out.println("\033[H\033[2J");
    System.out.flush();
  }
  /**
  * Metodo para activarse
  */
  public void activar(){
    estadoActual.activar();
  }

  /**
  * Metodo para suspenderse
  */
  public void suspender(){
    estadoActual.suspender();
  }

  /**
  * Metodo para reabastecerse
  */
  public void reabastecer(){
    estadoActual.reabastecer();
  }

  /**
  * Metodo para trabajar
  */
  public void trabajar(){
    estadoActual.trabajar();
  }

  /**
  * Metodo para recibir orden
  */
  public void recibirOrden(){
    estadoActual.recibirOrden();
  }

  /**
  * Metodo para caminar
  */
  public void caminar(){
    estadoActual.caminar();
  }

  /**
  * Metodo que contruye la casa paso por paso y dependiendo de la casa que sea.
  */
  public void construir(){

    //
    if(this.id == 1){
    Casa casa = new ECAC();
    asignarCasa(casa);
  } else if(this.id == 2){
      Casa casa = new ECAM();
      asignarCasa(casa);
    } else if(this.id == 3){
      Casa casa = new ECAR();
      asignarCasa(casa);
    }else if(this.id == 4){
      Casa casa = new ECAV();
      asignarCasa(casa);
    }else if(this.id == 5){
      Casa casa = new ERAC();
      asignarCasa(casa);
    }else if(this.id == 6){
      Casa casa = new ERAM();
      asignarCasa(casa);
    }else if(this.id == 7){
      Casa casa = new ERAR();
      asignarCasa(casa);
    }else if(this.id == 8){
      Casa casa = new ERAV();
      asignarCasa(casa);
    } else {
      System.exit(0);
    }

    casa.preparacionDelTerreno();
    casa.colocacionDeCimientos();
    casa.construccionDelEsqueletoDeLaCasa();
    casa.instalacionElectricaYPlomeria();
    casa.aislamientoDeLaCasa();
    casa.acabados();
    System.out.println("El precio de su casa sera: " + casa.getCosto());

  }

  /**
  * Metodopara definir la accion la accion a realizar del Robot
  * @param o la opcion de la accion a realizar del Robot
  */
  public void accion(int o){
    if(o == 1){
      limpia();
      getEstadoActual().activar();
    } else if(o == 2){
      limpia();
      getEstadoActual().suspender();
    } else if(o == 3){
      limpia();
      getEstadoActual().reabastecer();
    } else if(o == 4){
      limpia();
      getEstadoActual().recibirOrden();
    } else if(o == 5){
      limpia();
      getEstadoActual().trabajar();
    } else {
      limpia();
      getEstadoActual().caminar();
    }
  }

  /**
  * Metodo que imprime el inicio de la simulacion
  */
  public void inicio(){
    System.out.println("El robot se encuentra suspendido.");
    imprimeMenuEstados();
  }

  /**
  * Metodo que devuelve el valor del atributo Orden
  * @return orden booleano que nos dice si ya recibio orden
  */
  public boolean getOrden(){
    return orden;
  }

  /**
  * Metodo para asignar el valor de orden
  * @param orden booleano para decir si ya recibio o no una orden
  */
  public void asignarOrden(boolean orden){
    this.orden = orden;
  }

  /**
  * Metodo que devuelve el valor del atributo trabajo
  * @return trabajo booleano que nos dice si ya va a empezar su trabajo
  */
  public boolean getTrabajo(){
    return trabajo;
  }

  /**
  * Metodo para asignar el valor de trabajo
  * @param trabajo  booleano para decir si ya recibio trabajo o no.
  */
  public void asignarTrabajo(boolean trabajo){
    this.trabajo = trabajo;
  }

  /**
  * Metodo que imprime el menu de estados del robot.
  */
  public void imprimeMenuEstados(){
    String s = "¿Que desea que el robot realice a continuacion? \n" +
               "1.- Activarse. \n" +
               "2.- Suspenderse. \n" +
               "3.- Reabastecerse. \n" +
               "4.- Recibir una Orden. \n" +
               "5.- Trabajar \n" +
               "6.- Caminar \n";

    System.out.println(s);
  }

  /**
  * Menu que imprime el la estructas que se pueden construir.
  */
  public void imprimeMenuRobot(){
    String s = "1.- Estructura de Concreto y Aislamiento de Concretro (ECAC). 2,500,000 \n" +
               "2.- Estructura de Concreto y Aislamiento de Madera (ECAM). 1,500,000 \n"+
               "3.- Estructura de Concreto y Aislamiento Rerforzado (ECAR). 3,500,000 \n" +
               "4.- Estructura de Concreto y Aislamiento de Vidrio (ECAV). 3,000,000 \n" +
               "5.- Estructura Rerforzada y Aislamiento de Concreto (ERAC). 3,000,000 \n" +
               "6.- Estructura Rerforzada y Aislamiento de Madera (ERAM). 2,000,000 \n" +
               "7.- Estructura Rerforzada y Aislamiento Rerforzado (ERAR). 4,000,000 \n" +
               "8.- Estructura Rerforzada Y Aislamiento de Vidrio (ERAV). 3,500,000 \n";

    System.out.println(s);
  }
}
