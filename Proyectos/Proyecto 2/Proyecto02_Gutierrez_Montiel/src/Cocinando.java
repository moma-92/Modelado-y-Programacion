/**
* Clase para el estado cocinando del robot
*/
public class Cocinando implements EstadoRobot{

  // El Robot
  private Robot robot;

  /**
  * Constructor del estado Cocinando del  Robot
  * @param robot el robot
  */
  public Cocinando(Robot robot){
    this.robot = robot;
  }

  /**
  * Metodo para activarse
  */
  @Override public void activar(){

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
    if(this.robot.getTipo() == "cocinero"){
      this.robot.setEstadoActual(this.robot.getEstadoEmpaquetando());
      this.robot.empaquetar();
      System.out.println("Su comida se esta empaquetando, pronto estará lista para su entrega.");
    }
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
