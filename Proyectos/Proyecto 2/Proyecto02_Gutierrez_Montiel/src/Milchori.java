/**
* Clase que define la torta MIlchori
*/
public class Milchori extends Tortas{

  /**
  * Constructor por default el nombre es Milchori, el precio es 60, y el id 17
  */
  public Milchori(){
    super("Milchori", 60, 17);
  }

  /**
  * Metodo para cocinar la Carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Cocinamos la Milaneza y el Chorizo, y doramos el Quesillo");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos la Milanesa y el Chorizo sobre el pan");
    addIngrediente("Milanesa");
    addIngrediente("Chorizo");
    setCosto(60);
  }

  /**
  * Metodo para poner extras sobre la carne
  */
  @Override public void ponerExtrasSobreCarne(){
    System.out.println("Ponemos Quesillo sobre el Chorizo");
    addIngrediente("Quesillo");
    }
  }
