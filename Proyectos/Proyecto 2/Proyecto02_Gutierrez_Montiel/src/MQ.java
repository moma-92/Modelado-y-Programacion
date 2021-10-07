/**
* Clase que define la torta MQ (Milanesa y Quesillo)
*/
public class MQ extends Tortas{

  /**
  * Constructor por default el nombre es MQ, el precio es 40, y el id 4
  */
  public MQ(){
    super("MQ", 40, 4);
  }

  /**
  * Metodo para cocinar la Carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Cocinamos la Milanesa y doramos el Quesillo");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos la Milanesa sobre el pan");
    addIngrediente("Milanesa");
    setCosto(40);
  }

  /**
  * Metodo para poner extras sobre la carne
  */
  @Override public void ponerExtrasSobreCarne(){
    System.out.println("Ponemos Quesillo sobre la Milanesa");
    addIngrediente("Quesillo");
  }
}
