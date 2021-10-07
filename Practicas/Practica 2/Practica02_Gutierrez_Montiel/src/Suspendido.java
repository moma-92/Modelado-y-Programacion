/**
* Clase que define el estado Suspendido del Robot
*/
public class Suspendido implements EstadoRobot{

  //El Robot
  Robot robot;

  /**
  * Define el estado Suspendido del  Robot
  * @param robot el robot
  */
  public Suspendido(Robot robot){
    this.robot = robot;
  }

  /**
  * Metodo para activarse en este estado
  */
  public void activar(){
    if(robot.getOrden() == true){
      System.out.println("Continuare con lo que estaba haciendo antes de que me suspendieras");
      System.out.println("Empezare a Reabastecerme");
      robot.asignarNuevoEstado(robot.getEstadoReabastecerse());
    } else if(robot.getTrabajo() == true){
      System.out.println("Continuare con lo que estaba haciendo antes de que me suspendieras");
      System.out.println("Empexare a trabajar");
      robot.asignarNuevoEstado(robot.getEstadoTrabajar());
    } else{
      System.out.println("El robot se activara.");
      System.out.println("Bienvenido a mi hogarcito.");
      robot.asignarNuevoEstado(robot.getEstadoRecibirOrden());
    }
  }

  /**
  * Metodo para caminar en este estado
  */
  public void caminar(){
    System.out.println("El robot esta suspendido y no puede caminar.");
  }

  /**
  * Metodo reabastecerse en este estado
  */
  public void reabastecer(){
    System.out.println("El robot esta suspendido y no se puede reabastecer.");
  }

  /**
  * Metodo recibir una orden en este estado
  */
  public void recibirOrden(){
    System.out.println("El robot esta suspendido y no puede recibir ordenes.");
  }

  /**
  * Metodo trabajar en este estado
  */
  public void trabajar(){
    System.out.println("El robot esta suspendido y no puede trabajar.");
  }

  /**
  * Metodo suspender en este estado
  */
  public void suspender(){
    System.out.println("El robot ya esta suspendido.");
  }

}
