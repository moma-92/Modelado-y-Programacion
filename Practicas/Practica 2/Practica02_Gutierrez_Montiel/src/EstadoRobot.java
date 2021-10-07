/**
* Interfaz que contiene los estados en los que puede estar el robot
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
  * Metodo para reabastecerse
  */
  public void reabastecer();

  /**
  * Metodo para trabajar
  */
  public void trabajar();

  /**
  * Metodo para recibir orden
  */
  public void recibirOrden();

  /**
  * Metodo para caminar
  */
  public void caminar();
}
