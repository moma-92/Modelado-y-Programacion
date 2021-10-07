/**
* Clase que define el estado Suspendido del Robot
*/
public class Suspendido implements EstadoRobot{

  // El Robot
  private Robot robot;

  /**
  * Define el estado Suspendido del Robot
  * @param robot el robot
  */
  public Suspendido(Robot robot){
    this.robot = robot;
  }

  /**
  * Metodo para activarse en este estado
  */
  public void activar(){
    this.robot.asignarEstadoActual(this.robot.getEstadoAtender());
    System.out.println("El robot se activara para que pueda recibir la orden.");
  }

  /**
  * Metodo para suspenderse en este estado
  */
  public void suspender(){

  }

  /**
  * Metodo para caminar en este estado
  */
  public void caminar(){

  }

  /**
  * Metodo para atender en este estado
  */
  public void atender(){

  }

  /**
  * Metodo para cocinar en este estado
  */
  public void cocinar(){

  }
}
