/**
* Clase que define el estado Cocinando del Robot
*/
public class Cocinando implements EstadoRobot{

  // EL Robot
  private Robot robot;

  /**
  * Define el estado Cocinando del Robot
  * @param robot el robot
  */
  public Cocinando(Robot robot){
    this.robot = robot;
  }

  /**
  * Metodo para activarse en este estado
  */
  public void activar(){

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
    this.robot.asignarEstadoActual(this.robot.getEstadoCaminar());
    System.out.println("La orden esta lista, la llevare a la barra para entregarla al cliente.");
  }

  /**
  * Metodo para atender en este estado
  */
  public  void atender(){

  }

  /**
  * Metood para cocinar en este estado
  */
  public void cocinar(){

  }
}
