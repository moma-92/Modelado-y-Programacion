/**
* Clase para el estado Empaquetando del robot
*/
public class Empaquetando implements EstadoRobot{

  // El Robot
  private Robot robot;

  /**
  * Constructor del estado Empaquetando del  Robot
  * @param robot el robot
  */
  public Empaquetando(Robot robot){
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
    if(this.robot.getTipo() == "cocinero"){
      this.robot.setEstadoActual(this.robot.getEstadoSuspendido());
      System.out.println("El robot se suspendera hasta que llegue la proxima orden");
    }
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

  }
}
