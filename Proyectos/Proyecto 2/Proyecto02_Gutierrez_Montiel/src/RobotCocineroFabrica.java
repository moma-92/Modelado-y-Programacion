/**
* Clase que define al Robot Cocinero
*/
public class RobotCocineroFabrica implements RobotFabrica{

  /**
  * Metodo que define las Llantas anti-derrape
  */
  public Llantas crearLlantas(){
    return new LlantasAntiDerrape();
  }

  /**
  * Metodo que define la Bateria 12H
  */
  public Bateria crearBateria(){
    return new Bateria12H();
  }

  /**
  * Metodo que define las Herramientas Kit de Cocina
  */
  public Herramientas crearHerramientas(){
    return new KitCocina();
  }

  /**
  * Metodo que define el tipo de Robot
  */
  public String nombre(){
    return "cocinero";
  }
}
