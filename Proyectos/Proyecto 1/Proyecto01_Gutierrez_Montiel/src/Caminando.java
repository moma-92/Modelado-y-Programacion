/**
* Clase que define el estado Caminando del Robot
*/
public class Caminando implements EstadoRobot{

  // El Robot
  private Robot robot;

  /**
  * Define el estado Caminando del  Robot
  * @param robot el robot
  */
  public Caminando(Robot robot){
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

  }

  /**
  * Metodo para atender en este estado
  */
  public void atender(){
    if(this.robot.getOrden()==true){
      this.robot.asignarEstadoActual(this.robot.getEstadoAtender());
      System.out.println("¡Tu pedido esta listo!");
      this.robot.imprimirTicket();
    }
  }

  /**
  * Metodo para cocinar en este estado
  */
  public void cocinar(){
    if(this.robot.getOrden()==true){
      System.out.println("Comenzare a procesar tu pedido.");
      this.robot.asignarEstadoActual(this.robot.getEstadoCocinar());
    }
  }
}
