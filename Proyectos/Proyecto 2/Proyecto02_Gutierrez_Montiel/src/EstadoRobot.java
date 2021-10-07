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
  * Metodo para empaquetar
  */
  public void empaquetar();

  /**
  * Metodo para transportar
  */
  public void transportar();

  /**
  * Metodo para entregar
  */
  public void entregar();
}
