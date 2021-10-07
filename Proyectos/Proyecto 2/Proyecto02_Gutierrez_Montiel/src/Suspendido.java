/**
* Clase para el estado Suspendido del robot
*/
public class Suspendido implements EstadoRobot{

  // EL Robot
  private Robot robot;

  /**
  * Constructor del estado Suspendido del  Robot
  * @param robot el robot
  */
  public Suspendido(Robot robot){
    this.robot = robot;
  }
 
  /**
  * Metodo para activarse
  */
  @Override public void activar(){
    if(this.robot.getTipo() == "cocinero"){
      this.robot.setEstadoActual(this.robot.getEstadoCocinando());
      System.out.println("El robot comenzara a cocinar la orden");
      this.robot.cocinar();
    } else {
      this.robot.setEstadoActual(this.robot.getEstadoTransportandose());
      this.robot.getPedido().getCliente().addNotificaciones("Su pedido ya va en camino");
      System.out.println("El robot comenzara a transportar la orden a " + this.robot.getPedido().getCliente().getDomicilio());
    }

  }

  /**
  * Metodo para suspenderse
  */
  @Override public void suspender(){

  }


  /**
  * Metodo para empaquetar
  */
  @Override public void empaquetar(){

  }

  /**
  * Metodo para transportar
  */
  @Override public void transportar(){

  }

  /**
  * Metodo para entregar
  */
  @Override public void entregar(){

  }
}
