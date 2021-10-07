/**
* Interfaz de la fabrica
*/
public interface RobotFabrica{

  /**
  * Metodo que crea las Llantas del Robot
  */
  public Llantas crearLlantas();

  /**
  * Metodo que crea la Bateria del Robot
  */
  public Bateria crearBateria();

  /**
  * Metodo que crea las Herramientas del Robot
  */
  public Herramientas crearHerramientas();

  /**
  * Metodo que defin el tipo de Robot
  */
  public String nombre();
}
