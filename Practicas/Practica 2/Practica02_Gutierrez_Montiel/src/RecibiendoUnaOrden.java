/**
* Clase que define el estado Recibiendo una Orden del Robot
*/
public class RecibiendoUnaOrden implements EstadoRobot{

  //El Robot.
  public Robot robot;

  /**
  * Define el estado RecibiendoUnaOrden del  Robot
  * @param robot el robot
  */
  public RecibiendoUnaOrden(Robot robot){
    this.robot = robot;
  }

  /**
  * Metodo activar en este estado
  */
  public void activar(){
    System.out.println("El robot ya esta activado.");
    System.out.println("Termine de recibir la orden");
    System.out.println("Comenzare a caminar");
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

  /**
  * Metodo caminar en este estado
  */
  public void caminar(){
    System.out.println("Comenzare a caminar cuando termine de recibir la orden.");
    System.out.println("Termine de recibir la orden");
    System.out.println("Comenzare a caminar");
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

  /**
  * Metodo reabastecer en este estado
  */
  public void reabastecer(){
    System.out.println("El robot no puede reabastecerse mientras recibe una orden.");
    System.out.println("Termine de recibir la orden");
    System.out.println("Comenzare a caminar");
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

  /**
  * Metodo recibir orden en este estado
  */
  public void recibirOrden(){
    System.out.println("El robot ya esta recibiendo una orden.");
    System.out.println("Termine de recibir la orden");
    System.out.println("Comenzare a caminar");
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

  /**
  * Metodo trabajar en este estado
  */
  public void trabajar(){
    System.out.println("El robot no puede trabajar mientras recibe una orden.");
    System.out.println("Termine de recibir la orden");
    System.out.println("Comenzare a caminar");
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

  /**
  * Metodo suspender en este estado
  */
  public void suspender(){
    System.out.println("El robot no se puede suspender mientras recibe una orden.");
    System.out.println("Termine de recibir la orden");
    System.out.println("Comenzare a caminar");
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }
}
