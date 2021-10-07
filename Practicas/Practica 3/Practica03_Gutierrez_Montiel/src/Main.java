import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{

  // Las opciones a elegir en el menu
  public static int opcion = -1;
  public static int presupuesto = -1;
  public static int opcion1 = -1;
  public static int opcion2 = -1;
  public static int opcion3 = -1;
  public static int opcion4 = -1;
  public static int opcion5 = -1;

  public static Builder builder = new Builder();
  public static Auto default1 = builder.autodefault1();
  public static Auto default2 = builder.autodefault2();
  public static Auto default3 = builder.autodefault3();

  public static Llantas simples = new LlantasSimples();
  public static Llantas oruga = new LlantasOrugaDeTanque();
  public static Llantas deportivas = new LlantasDeportivas();
  public static Llantas offroad = new LlantasOffRoad();

  public static Carroceria casual = new CarroceriaCasual();
  public static Carroceria camion = new CarroceriaCamion();
  public static Carroceria deportiva = new CarroceriaDeportiva();

  public static Motor deportivo = new MotorDeportivo();
  public static Motor diesel = new MotorDiesel();
  public static Motor turbo = new MotorTurbo();

  public static Blindaje simple = new BlindajeSimple();
  public static Blindaje reforzado = new BlindajeReforzado();
  public static Blindaje tanque = new BlindajeTanque();

  public static Armas arpones = new ArmasArpones();
  public static Armas sierra = new ArmasSierra();
  public static Armas lanzallamas = new ArmasLanzallamas();
  public static Armas metralleta = new ArmasMetralleta();
  public static Armas caniones = new ArmasCaniones();
  /**
   * Metodo para imprimir rapido
   */
   public static void imprime(Object o){
     System.out.println(o);
   }

   /**
  * Metodo para limpiar la pantalla de la terminal
  */
  public static void limpiaPantalla(){
    System.out.println("\033[H\033[2J");
    System.out.flush();
  }

  public static void main(String[] args) {

    // El Scanner
    Scanner sc = new Scanner(System.in);

    do{
      if(opcion == -1)
        imprime("Bienvenido ingrese su presupuesto");
      try{
        opcion = sc.nextInt();
      }
      catch(InputMismatchException e){
        limpiaPantalla();
        imprime("Favor de ingresar un valor válido");

        sc = new Scanner(System.in);
      }
      if(opcion < 7600){
        limpiaPantalla();
        imprime("Opcion no valida");

        opcion = -1;
      }
    }while(opcion == -1);
    presupuesto = opcion;
    opcion = -1;
    sc = new Scanner(System.in);
    do{
      if(opcion == -1){
        imprime("Ahora que conocemos su presupuesto, escoja una de las siguientas opciones");
        imprime("1.Armar paso a paso tu auto");
        imprime("2.Escoger uno de nuestros autos preconstruidos");
      }
      try{
        opcion = sc.nextInt();
      }
      catch(InputMismatchException e){
        limpiaPantalla();
        imprime("Favor de ingresar un valor válido");

        sc = new Scanner(System.in);
      }
      if(opcion < 1 || opcion > 2){
        limpiaPantalla();
        imprime("Opcion no valida");

        opcion = -1;
      }
    }while(opcion == -1);
    limpiaPantalla();

    if(opcion == 1){
      opcion =-1;
      sc = new Scanner(System.in);
      do{
        if(opcion == -1)
        imprime("Escoja unas llantas:");
        imprime("1.");
        simples.informacion();
        imprime("2.");
        oruga.informacion();
        imprime("3.");
        deportivas.informacion();
        imprime("4.");
        offroad.informacion();
        try{
          opcion = sc.nextInt();
        }
        catch(InputMismatchException e){
          limpiaPantalla();
          imprime("Favor de ingresar un valor válido");

          sc = new Scanner(System.in);
        }
        if(opcion<1 || opcion >4){
          limpiaPantalla();
          imprime("Opcion no valida");

          opcion = -1;
        }
      }while(opcion == -1);
      opcion1 = opcion;
      if(opcion1 == 1){
        presupuesto -= simples.costo();
      } else if(opcion1 == 2){
        presupuesto -= oruga.costo();
      } else if(opcion1 == 3){
        presupuesto -= deportivas.costo();
      } else {
        presupuesto -= offroad.costo();
      }
      limpiaPantalla();
      imprime("Presupuesto resultante : " + presupuesto);
      opcion =-1;
      sc = new Scanner(System.in);
      do{
        if(opcion == -1)
        imprime("Escoja una carroceria:");
        imprime("1.");
        casual.informacion();
        imprime("2.");
        camion.informacion();
        imprime("3.");
        deportiva.informacion();
        try{
          opcion = sc.nextInt();
        }
        catch(InputMismatchException e){
          limpiaPantalla();
          imprime("Favor de ingresar un valor válido");
          sc = new Scanner(System.in);
        }
        if(opcion<1 || opcion >3){
          limpiaPantalla();
          imprime("Opcion no valida");

          opcion = -1;
        }
      }while(opcion == -1);
      opcion2 = opcion;
      /////
      if(opcion2 == 1){
        presupuesto -= casual.costo();
      }else if(opcion2 == 2){
        presupuesto -= camion.costo();
      }else{
        presupuesto -= deportiva.costo();
      }
      limpiaPantalla();
      imprime("Presupuesto resultante : " + presupuesto);
      opcion = -1;
      sc = new Scanner(System.in);
      do{
        if(opcion == -1){
          imprime("Escoja un motor:");
          imprime("1.");
          diesel.informacion();
          imprime("2.");
          deportivo.informacion();
          imprime("3.");
          turbo.informacion();
        }
        try{
          opcion = sc.nextInt();
        }
        catch(InputMismatchException e){
          limpiaPantalla();
          imprime("Favor de ingresar un valor válido");
          sc = new Scanner(System.in);
        }
        if(opcion<1 || opcion >3){
          limpiaPantalla();
          imprime("Opcion no valida");

          opcion = -1;
        }
      }while(opcion == -1);
      opcion3 = opcion;
      if(opcion3 == 1){
        presupuesto -= diesel.costo();
      } else if(opcion3 == 2){
        presupuesto -= deportivo.costo();
      } else {
        presupuesto -= turbo.costo();
      }
      opcion = -1;
      limpiaPantalla();
      imprime("Presupuesto resultante : " + presupuesto);
      sc = new Scanner(System.in);
      if(presupuesto > 0){
        do{
          if(opcion == -1){
            imprime("Escoja un blindaje:");
            imprime("1.");
            simple.informacion();
            imprime("2.");
            reforzado.informacion();
            imprime("3.");
            tanque.informacion();
          }
          try{
            opcion = sc.nextInt();
          }
          catch(InputMismatchException e){
            limpiaPantalla();
            imprime("Favor de ingresar un valor válido");
            sc = new Scanner(System.in);
          }
          if(opcion<1 || opcion >3){
            limpiaPantalla();
            imprime("Opcion no valida");

            opcion = -1;
          }
        }while(opcion == -1);
        opcion4 = opcion;
        if(opcion4 == 1){
          presupuesto -= simple.costo();
        }else if(opcion4 == 2){
          presupuesto -= reforzado.costo();
        }else{
          presupuesto -= tanque.costo();
        }
        limpiaPantalla();
        imprime("Presupuesto resultante : " + presupuesto);
        if(presupuesto >0){
          opcion = -1;
          sc = new Scanner(System.in);
          do{
            if(opcion == -1){
              imprime("Escoja un arma:");
              imprime("1.");
              sierra.informacion();
              imprime("2.");
              arpones.informacion();
              imprime("3.");
              lanzallamas.informacion();
              imprime("4.");
              metralleta.informacion();
              imprime("5.");
              caniones.informacion();
            }
            try{
              opcion = sc.nextInt();
            }
            catch(InputMismatchException e){
              limpiaPantalla();
              imprime("Favor de ingresar un valor válido");
              sc = new Scanner(System.in);
            }
            if(opcion < 1 || opcion > 5){
              limpiaPantalla();
              imprime("Opcion no valida");

              opcion = -1;
            }
          }while(opcion == -1);
          opcion5 = opcion;
          if(opcion5 == 1){
            presupuesto -= sierra.costo();
          }else if(opcion5 == 2){
            presupuesto -= arpones.costo();
          }else if(opcion5 == 3){
            presupuesto -= lanzallamas.costo();
          }else if(opcion5 == 4){
            presupuesto -= metralleta.costo();
          }else{
            presupuesto -= caniones.costo();
          }
          limpiaPantalla();
          imprime("Presupuesto resultante : " + presupuesto);
          if(presupuesto > 0){
            Auto auto = builder.crearAuto(opcion1, opcion2, opcion3, opcion4, opcion5);
            imprime("Su auto es el siguiente:");
            auto.imprimirInfo();
            imprime("Su presupuesto restante es " + presupuesto);
          } else{
            imprime("No tiene suficiente presupuesto para este auto. Regrese cuando tenga más presupuesto o cambie las especificaciones del auto. ");
          }
        } else {
          imprime("No tiene suficiente presupuesto para este auto. Regrese cuando tenga más presupuesto o cambie las especificaciones del auto. ");
        }
      } else {
        imprime("No tiene suficiente presupuesto para este auto. Regrese cuando tenga más presupuesto o cambie las especificaciones del auto. ");
      }
    } else {
      opcion = -1;
      do{
        if(opcion == -1){
          imprime("Escoja un auto predeterminado:");
          imprime("1.");
          default1.imprimirInfo();
          imprime("2.");
          default2.imprimirInfo();
          imprime("3.");
          default3.imprimirInfo();
        }
        try{
          opcion = sc.nextInt();
        }
        catch(InputMismatchException e){
          limpiaPantalla();
          imprime("Favor de ingresar un valor válido");
          sc = new Scanner(System.in);
        }
        if(opcion < 1 || opcion > 3){
          limpiaPantalla();
          imprime("Opcion no valida");

          opcion = -1;
        }
      }while(opcion == -1);
      limpiaPantalla();
      if(opcion == 1){
        if(presupuesto - default1.getCosto() < 0){
          imprime("No tiene suficiente presupuesto para este auto. Regrese cuando tenga más presupuesto. ");
        } else {
          imprime("Su auto es el siguiente:");
          default1.imprimirInfo();
          imprime("Su presupuesto restante es " + (presupuesto - default1.getCosto()));
        }
      } else if(opcion == 2){
        if(presupuesto - default2.getCosto() < 0){
          imprime("No tiene suficiente presupuesto para este auto. Regrese cuando tenga más presupuesto. ");
        } else {
          imprime("Su auto es el siguiente:");
          default2.imprimirInfo();
          imprime("Su presupuesto restante es " + (presupuesto - default2.getCosto()));
        }
      } else {
        if(presupuesto - default3.getCosto() < 0){
          imprime("No tiene suficiente presupuesto para este auto. Regrese cuando tenga más presupuesto. ");
        } else {
          imprime("Su auto es el siguiente:");
          default3.imprimirInfo();
          imprime("Su presupuesto restante es " + (presupuesto - default3.getCosto()));
        }
      }

    }
    opcion = -1;
    presupuesto = -1;
    sc = new Scanner(System.in);

  }
}
