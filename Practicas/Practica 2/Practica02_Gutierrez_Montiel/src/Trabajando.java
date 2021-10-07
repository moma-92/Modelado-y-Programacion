/**
* Clase que define el estado Trabajando del Robot
*/
public class Trabajando implements EstadoRobot{

  //El Robot.
  public Robot robot;

  /**
  * Define el estado Trabajando del  Robot
  * @param robot el robot
  */
  public Trabajando(Robot robot){
    this.robot = robot;
  }

  /**
  * Metodo activar en este estado
  */
  public void activar(){
    System.out.println("El robot ya se encuentra activado.");
    robot.construir();
    System.out.println("Termine de trabajar");
    robot.asignarTrabajo(false);
    System.out.println("Comenzare a caminar");
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

  /**
  * Metodo caminar en este estado
  */
  public void caminar(){
    System.out.println("El robot no puede caminar mientras trabaja.");
    robot.construir();
    System.out.println("Termine de trabajar");
    robot.asignarTrabajo(false);
    System.out.println("Comenzare a caminar");
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

  /**
  * Metodo reabastecer en este estado
  */
  public void reabastecer(){
    System.out.println("El robot no puede reabastecerse mientras trabaja.");
    robot.construir();
    System.out.println("Termine de trabajar");
        robot.asignarTrabajo(false);
    System.out.println("Comenzare a caminar");
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

  /**
  * Metodo recibir orden en este estado
  */
  public void recibirOrden(){
    System.out.println("El robot no puede recibir una orden mientras trabaja.");
    robot.construir();
    System.out.println("Termine de trabajar");
        robot.asignarTrabajo(false);
    System.out.println("Comenzare a caminar");
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

  /**
  * Metodo trabajar en este estado
  */
  public void trabajar(){
    System.out.println("El robot ya esta trabajando.");
    robot.construir();
    System.out.println("Termine de trabajar");
        robot.asignarTrabajo(false);
    System.out.println("Comenzare a caminar");
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

  /**
  * Metodo suspender en este estado
  */
  public void suspender(){
    System.out.println("El robot no puede suspenderse mientras trabaja.");
    robot.construir();
    System.out.println("Termine de trabajar");
        robot.asignarTrabajo(false);
    System.out.println("Comenzare a caminar");
    robot.asignarNuevoEstado(robot.getEstadoCaminar());
  }

}
