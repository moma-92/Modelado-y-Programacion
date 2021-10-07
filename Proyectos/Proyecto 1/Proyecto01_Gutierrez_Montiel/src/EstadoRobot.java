/**
* Interfaz para los estados del robot
*/
public interface EstadoRobot{

  /**
  * Metodo para activarse
  */
  public void activar();

  /**
  * Metodo para suspenderse
  */
  public void suspender();

  /**
  * Metodo para caminar
  */
  public void caminar();

  /**
  * Metodo para atender
  */
  public void atender();

  /**
  * Metodo para cocinar
  */
  public void cocinar();
}
