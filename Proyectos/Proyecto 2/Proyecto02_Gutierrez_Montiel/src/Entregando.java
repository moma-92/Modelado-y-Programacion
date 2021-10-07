/**
* Clase para el estado Entregando del robot
*/
public class Entregando implements EstadoRobot{

  // EL Robot
  private Robot robot;

  /**
  * Constructor del estado Entregando del  Robot
  * @param robot el robot
  */
  public Entregando(Robot robot){
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
    if(this.robot.getTipo() == "repartidor"){
      this.robot.setEstadoActual(this.robot.getEstadoTransportandose());
      System.out.println("El robot ha terminado de hacer la entrega, regresara a la sucursal");
    }
  }

  /**
  * Metodo para entregar
  */
  public void entregar(){

  }
}
