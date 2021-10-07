/**
* Clase que define la torta Texana
*/
public class Texana extends Tortas{

  /**
  * Constructor por default el nombre es texana, el precio es 60 y el id 15
  */
  public Texana(){
    super("Texana", 60, 15);
  }

  /**
  * Metodo para cocinar la Carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Cocinamos la Milanesa y doramos el Jamon y el Quesillo");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos la Milanesa y el Jamon sobre el pan");
    addIngrediente("Milanesa");
    addIngrediente("Jamon");
    setCosto(60);
  }

  /**
  * Metodo para poner extras sobre la carne
  */
  @Override public void ponerExtrasSobreCarne(){
    System.out.println("Ponemos Quesillo sobre el Jamon");
    addIngrediente("Quesillo");
    }
  }
