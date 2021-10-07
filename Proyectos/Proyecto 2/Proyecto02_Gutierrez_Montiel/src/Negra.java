/**
* Clase que define la torta Negra
*/
public class Negra extends Tortas{

  /**
  * Constructor por default el nombre es Negra, el precio es 60, y el id 13
  */
  public Negra(){
    super("Negra", 60, 13);
  }

  /**
  * Metodo para cocinar la Carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Cocinamos la Milanesa y doramos la Salchicha y el Quesillo");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos la Milanesa y la Salchicha sobre el pan");
    addIngrediente("Milanesa");
    addIngrediente("Salchicha");
    setCosto(60);
  }

  /**
  * Metodo para poner extras sobre la carne
  */
  @Override public void ponerExtrasSobreCarne(){
    System.out.println("Ponemos el Quesillo sobre la Salchicha");
    addIngrediente("Quesillo");
  }
}
