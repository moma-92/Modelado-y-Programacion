/**
* Clase que define el estado Atendiendo del Robot
*/
public class Atendiendo implements EstadoRobot{

  // EL Robot
  private Robot robot;

  /**
  * Define el estado Atendiendo del Robot
  * @param robot el robot
  */
  public Atendiendo(Robot robot){
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
    if(this.robot.getOrden() == true){
      System.out.println("He terminado de atender al cliente, me suspendere." + "\n");
      this.robot.asignarEstadoActual(this.robot.getEstadoSuspender());
    }
  }

  /**
  * Metodo para caminar en este estado
  */
  public void caminar(){
    if(this.robot.getOrden() == true){
      System.out.println("Ya tengo la orden, caminare a la cocina para empezar a prepararla.");
      this.robot.asignarEstadoActual(this.robot.getEstadoCaminar());
    }
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
