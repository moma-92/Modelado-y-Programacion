/**
* Clase que define el estado Reabastecerse del robot
*/
public class Reabasteciendose implements EstadoRobot{

  //El Robot
  Robot robot;

  /**
  * Define el estado Reabasteciendose del  Robot
  * @param robot el robot
  */
  public Reabasteciendose(Robot robot){
    this.robot = robot;
  }

  /**
  * Metodo activar en este estado
  */
  public void activar(){
    System.out.println("El robot ya se encuentra activado.");
    System.out.println("Termine de reabastecerme");
        robot.asignarOrden(false);
    System.out.println("Comenzare a caminar");
    robot.asignarTrabajo(true);
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

  /**
  * Metodo caminar en este estado
  */
  public void caminar(){
    System.out.println("Comenzare a caminar cuando termine de reabastecerme.");
    System.out.println("Termine de reabastecerme");
    robot.asignarOrden(false);
    System.out.println("Comenzare a caminar");
        robot.asignarTrabajo(true);
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

  /**
  * Metodo reabastecer en este estado
  */
  public void reabastecer(){
    System.out.println("El robot ya se esta reabasteciendo.");
    System.out.println("Termine de reabastecerme");
        robot.asignarOrden(false);
    System.out.println("Comenzare a caminar");
        robot.asignarTrabajo(true);
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

  /**
  * Metodo recibir orden en este estado
  */
  public void recibirOrden(){
    System.out.println("El robot no puede recibir una orden mientras se reabastece.");
    System.out.println("Termine de reabastecerme");
        robot.asignarOrden(false);
    System.out.println("Comenzare a caminar");
        robot.asignarTrabajo(true);
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

  /**
  * Metodo trabajar en este estado
  */
  public void trabajar(){
    System.out.println("El robot no puede trabajar mientras se reabastece.");
    System.out.println("Termine de reabastecerme");
        robot.asignarOrden(false);
    System.out.println("Comenzare a caminar");
        robot.asignarTrabajo(true);
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

  /**
  * Metodo suspender en este estado
  */
  public void suspender(){
    System.out.println("El robot no se puede suspender mientras se reabastece.");
    System.out.println("Termine de reabastecerme");
        robot.asignarOrden(false);
    System.out.println("Comenzare a caminar");
        robot.asignarTrabajo(true);
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

}
