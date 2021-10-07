import java.util.Scanner;
import java.util.InputMismatchException;

/**
*   @author: Gutiérrez Sánchez Claudia Itzel / Montiel Manriquez Ricardo.
*   @version 25 / 11 / 2020
*/

public class Main{

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

  public static void main(String[] args){

    // Creamos al Robot
    Robot robot = new Robot();
    // Creamos el Scanner
    Scanner sc = new Scanner(System.in);
    // Asignamos el estado inicial
    robot.asignarNuevoEstado(robot.getEstadoSuspender());
    // Variable para manejar los while
    int opcion = -1;
    // La opcion del Robot
    int o;
    // Variable para detener o correr el programa
    boolean corriendo = true;
    //Contador
    int cont = 0;

    //Comienza la simulacion
    do{
    //Mantiene al robot suspendido hasta que lo activen
      do{
        //Nos aseguramos de que no nos pasen un valor invalido
        do{
          if(opcion == -1)
          robot.inicio();
          try{
            opcion = sc.nextInt();
          }
          catch(InputMismatchException e){
            limpiaPantalla();
            imprime("Favor de ingresar un valor válido");

            sc = new Scanner(System.in);
          }
          if(opcion<1 || opcion >6){
            limpiaPantalla();
            imprime("Opcion no valida");

            opcion = -1;
          }
        }while(opcion == -1);
          o = opcion;
          if(o == 1){
            limpiaPantalla();
            robot.activar();
          } else if(o == 2){
            limpiaPantalla();
            robot.suspender();
            robot.imprimeMenuEstados();
          } else if(o == 3){
            limpiaPantalla();
            robot.reabastecer();
            robot.imprimeMenuEstados();
          } else if(o == 4){
            limpiaPantalla();
            robot.recibirOrden();
            robot.imprimeMenuEstados();
          } else if(o == 5){
            limpiaPantalla();
            robot.trabajar();
            robot.imprimeMenuEstados();
          } else {
            limpiaPantalla();
            robot.caminar();
            robot.imprimeMenuEstados();
          }
        }while(opcion != 1);


      opcion = -1;
      //Nos aseguramos de que no nos pasen un valor invalido
      //Menu para escoger casa
      do{
        robot.imprimeMenuRobot();
        try{
          opcion = sc.nextInt();
        }
        catch(InputMismatchException e){
          limpiaPantalla();
          imprime("Favor de ingresar un valor válido");
        sc = new Scanner(System.in);
        }
        if(opcion  < 1 || opcion > 8){
          limpiaPantalla();
          imprime("Opcion no valida");
          opcion = -1;
        }
      }while(opcion == -1);

      robot.asignarID(opcion);
      opcion = -1;
      robot.asignarOrden(true);
      sc = new Scanner(System.in);
      //Menu después de recibirOrden
      //Nos aseguramos de que nos pasen un valor valido

      do{
        robot.imprimeMenuEstados();
        try{
          opcion = sc.nextInt();
        }
        catch(InputMismatchException e){
          limpiaPantalla();
          imprime("Favor de ingresar un valor válido");
          sc = new Scanner(System.in);
        }
        if(opcion<1 || opcion >6){
          limpiaPantalla();
          imprime("Opcion no valida");
          opcion = -1;
        }
      }while(opcion == -1);


      o = opcion;
      robot.accion(o);
      opcion = -1;
      sc = new Scanner(System.in);

      //menu despues de comenzar a caminar
      do{
        robot.imprimeMenuEstados();
        try{
          opcion = sc.nextInt();
        }
        catch(InputMismatchException e){
          limpiaPantalla();
          imprime("Favor de ingresar un valor válido");
          sc = new Scanner(System.in);
        }
        if(opcion<1 || opcion >6){
          limpiaPantalla();
          imprime("Opcion no valida");
          opcion = -1;
        }
      }while(opcion == -1);

    //
      o = opcion;
      opcion = -1;
      sc = new Scanner(System.in);
      if(o == 1){
        limpiaPantalla();
        robot.activar();
      } else if(o == 2){
        limpiaPantalla();
        robot.suspender();
        //el robot se queda suspendido hasta que lo activen
        do{
          //Nos aseguramos de que nos pasen un valor valido
          do{
            opcion = -1;
            if(cont == 0)
              robot.inicio();
            try{
              opcion = sc.nextInt();
            }
            catch(InputMismatchException e){
              limpiaPantalla();
              imprime("Favor de ingresar un valor válido");
              sc = new Scanner(System.in);
            }
            if(opcion<1 || opcion >6){
              limpiaPantalla();
              imprime("Opcion no valida");
              opcion = -1;
            }
          }while(opcion == -1);
            o = opcion;
            if(o == 1){
              limpiaPantalla();
              robot.activar();
            } else if(o == 2){
              limpiaPantalla();
              robot.suspender();
              robot.imprimeMenuEstados();
            } else if(o == 3){
              limpiaPantalla();
              robot.reabastecer();
              robot.imprimeMenuEstados();
            } else if(o == 4){
              limpiaPantalla();
              robot.recibirOrden();
              robot.imprimeMenuEstados();
            } else if(o == 5){
              limpiaPantalla();
              robot.trabajar();
              robot.imprimeMenuEstados();
            } else {
              limpiaPantalla();
              robot.caminar();
              robot.imprimeMenuEstados();
            }
            cont ++;
          }while(opcion != 1);
        } else if(o == 3){
          limpiaPantalla();
          robot.reabastecer();
        } else if(o == 4){
          limpiaPantalla();
          robot.recibirOrden();
        } else if(o == 5){
          limpiaPantalla();
          robot.trabajar();
        } else {
          limpiaPantalla();
          robot.caminar();
        }

    //Menu despues de empezar a reabastecerse
    //Nos aseguramos de que nos pasen un valor valido
    opcion = -1;
    sc = new Scanner(System.in);
      do{
        robot.imprimeMenuEstados();
        try{
          opcion = sc.nextInt();
        }
        catch(InputMismatchException e){
          limpiaPantalla();
          imprime("Favor de ingresar un valor válido");
          sc = new Scanner(System.in);
        }
        if(opcion<1 || opcion >6){
          limpiaPantalla();
          imprime("Opcion no valida");
          opcion = -1;
        }
      }while(opcion == -1);


      o = opcion;
      robot.accion(o);
      opcion = -1;
      robot.asignarTrabajo(true);
      sc = new Scanner(System.in);
      //Menu despues de caminar
      //Nos aseguramos de que nos pasen un valor valido

      do{
        robot.imprimeMenuEstados();
        try{
          opcion = sc.nextInt();
        }
        catch(InputMismatchException e){
          limpiaPantalla();
          imprime("Favor de ingresar un valor válido");
          sc = new Scanner(System.in);
        }
        if(opcion<1 || opcion >6){
          limpiaPantalla();
          imprime("Opcion no valida");
          opcion = -1;
        }
      }while(opcion == -1);

      o = opcion;
      if(o == 1){
        limpiaPantalla();
        robot.activar();
      } else if(o == 2){
        limpiaPantalla();
        robot.suspender();
        do{
          do{
            robot.inicio();
            opcion = -1;
            try{
              opcion = sc.nextInt();
            }
            catch(InputMismatchException e){
              limpiaPantalla();
              imprime("Favor de ingresar un valor válido");
              sc = new Scanner(System.in);
            }
            if(opcion < 1 || opcion > 6){
              limpiaPantalla();
              imprime("Opcion no valida");
              opcion = -1;
            }
          }while(opcion == -1);
            o = opcion;
            if(o == 1){
              limpiaPantalla();
              robot.activar();
            } else if(o == 2){
              limpiaPantalla();
              robot.suspender();
              robot.imprimeMenuEstados();
            } else if(o == 3){
              limpiaPantalla();
              robot.reabastecer();
              robot.imprimeMenuEstados();
            } else if(o == 4){
              limpiaPantalla();
              robot.recibirOrden();
              robot.imprimeMenuEstados();
            } else if(o == 5){
              limpiaPantalla();
              robot.trabajar();
              robot.imprimeMenuEstados();
            } else {
              limpiaPantalla();
              robot.caminar();
              robot.imprimeMenuEstados();
            }
          }while(opcion != 1);
        } else if(o == 3){
          limpiaPantalla();
          robot.reabastecer();
        } else if(o == 4){
          limpiaPantalla();
          robot.recibirOrden();
        } else if(o == 5){
          limpiaPantalla();
          robot.trabajar();
        } else {
          limpiaPantalla();
          robot.caminar();
        }
        opcion = -1;
        sc = new Scanner(System.in);
        //Menu despues de trabajar

        do{//Nos aseguramos de que nos pasen un valor valido
          robot.imprimeMenuEstados();
          try{
            opcion = sc.nextInt();
          }
          catch(InputMismatchException e){
            limpiaPantalla();
            imprime("Favor de ingresar un valor válido");
            sc = new Scanner(System.in);
          }
          if(opcion<1 || opcion >6){
            limpiaPantalla();
            imprime("Opcion no valida");
            opcion = -1;
          }
        }while(opcion == -1);

      o = opcion;
      robot.accion(o);
      opcion = -1;
      sc = new Scanner(System.in);

      //Menu despues de caminar
      //nos aseguramos de que nos pasen un valor valido
      do{
        robot.imprimeMenuEstados();
        try{
          opcion = sc.nextInt();
        }
        catch(InputMismatchException e){
          limpiaPantalla();
          imprime("Favor de ingresar un valor válido");
          sc = new Scanner(System.in);
        }
        if(opcion<1 || opcion >6){
          limpiaPantalla();
          imprime("Opcion no valida");
          opcion = -1;
        }
      }while(opcion == -1);

      o = opcion;
      opcion = -1;
      if(o == 1){
        limpiaPantalla();
        robot.activar();
      } else if(o == 2){
        limpiaPantalla();
        robot.suspender();
        } else if(o == 3){
          limpiaPantalla();
          robot.reabastecer();
        } else if(o == 4){
          limpiaPantalla();
          robot.recibirOrden();
        } else if(o == 5){
          limpiaPantalla();
          robot.trabajar();
        } else {
          limpiaPantalla();
          robot.caminar();
        }
        opcion = -1;


        imprime("0.- Si deseas salirte el programa \n Cualquier otra cosa si no es así");
         try{
            opcion = sc.nextInt();
        }
        catch(InputMismatchException e){
           corriendo = true;
           robot.reinicializarRobot();
            robot.inicio();
        }
        if(opcion == 0){
            corriendo = false;
        } else{
            robot.inicio();
        }
      }while(corriendo == true);


    }
}
