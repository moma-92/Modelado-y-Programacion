/**
* Clase que define la torta HQ (Huevo con Quesillo)
*/
public class HQ extends Tortas{

  /**
  * Constructor por default el nombre es HQ, el precio es 40 y el id 2
  */
  public HQ(){
    super("HQ", 40, 2);
  }

  /**
  * Metodo para cocinar la Carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Cocinamos el Huevo y doramos el Quesillo");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos el Huevo sobre el pan");
    addIngrediente("Huevo");
    setCosto(40);
  }

  /**
  * Metodo para poner extras sobre la carne
  */
  @Override public void ponerExtrasSobreCarne(){
    System.out.println("Ponemos Quesillo sobre el Huevo");
    addIngrediente("Quesillo");
    }
  }
