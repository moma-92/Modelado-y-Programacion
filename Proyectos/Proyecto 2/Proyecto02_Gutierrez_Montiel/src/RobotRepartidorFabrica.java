/**
* Clase que define al Robot Repartidor
*/
public class RobotRepartidorFabrica implements RobotFabrica{

  /**
  * Metodo que define las Llantas todo terreno
  */
  public Llantas crearLlantas(){
    return new LlantasTodoTerreno();
  }

  /**
  * Metodo que define Bateria 24H
  */
  public Bateria crearBateria(){
    return new Bateria24H();
  }

  /**
  * Metodo que define la Herramienta GPS
  */
  public Herramientas crearHerramientas(){
    return new GPS();
  }

  /**
  * Metodo que define el tipo de Robot
  */
  public String nombre(){
    return "repartidor";
  }
}
