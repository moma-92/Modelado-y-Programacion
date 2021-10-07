/**
* Clase que define la torta CQ (Chorizo y Quesillo)
*/
public class CQ extends Tortas{
 
  /**
  * Constructor por default el nombre es CQ, el precio es 40 y el id 1
  */
  public CQ(){
    super("CQ", 40, 1);
  }

  /**
  * Metodo para cocinar la Carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Cocinamos el Chorizo y doramos el Quesillo");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos el Chorizo sobre el pan");
    addIngrediente("Chorizo");
    setCosto(40);
  }

  /**
  * Metodo para poner extras sobre la carne
  */
  @Override public void ponerExtrasSobreCarne(){
    System.out.println("Ponemos Quesillo sobre el Chorizo");
    addIngrediente("Quesillo");
    }
}
