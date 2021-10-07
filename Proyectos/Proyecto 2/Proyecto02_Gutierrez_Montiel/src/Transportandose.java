/**
* Clase para el estado Transportandose del robot
*/
public class Transportandose implements EstadoRobot{

  // EL Robot
  private Robot robot;

  /**
  * Define el estado Transportandose del  Robot
  * @param robot el robot
  */
  public Transportandose(Robot robot){
    this.robot = robot;
  }

  /**
  * Metodo para activarse
  */
  public void activar(){

  }

  /**
  * Metodo para suspenderse
  */
  public void suspender(){
    if(this.robot.getTipo() == "repartidor" && this.robot.getPedido() == null)
      this.robot.setEstadoActual(this.robot.getEstadoSuspendido());
      System.out.println("El Robot llego a la sucursal y se suspendera hasta que haya alguna otra orden para su entrega");
  }

  /**
  * Metodo para empaquetar
  */
  public void empaquetar(){

  }

  /**
  * Metodo para transportar
  */
  public void transportar(){

  }

  /**
  * Metodo para entregar
  */
  public void entregar(){
    if(this.robot.getTipo() == "repartidor" && this.robot.getPedido() != null)
      this.robot.setEstadoActual(this.robot.getEstadoEntregando());
      System.out.println("Ya estoy entregando la comida a " + this.robot.getPedido().getCliente().getNombre());
  }
}
