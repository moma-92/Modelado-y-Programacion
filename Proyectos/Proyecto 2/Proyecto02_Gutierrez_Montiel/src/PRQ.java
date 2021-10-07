/**
* Clase que define la torta PRQ (Pierna Roja y Quesillo)
*/
public class PRQ extends Tortas{

  /**
  * Constructor por defualt el nombre es PRQ, el precio es 40 y el id 6
  */
  public PRQ(){
    super("PRQ", 40, 6);
  }

  /**
  * Metodo para cocinar la Carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Cocinamos la Pierna Roja y doramos el Quesillo");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos la Pierna Roja sobre el pan");
    addIngrediente("Pierna Roja");
    setCosto(40);
  }

  /**
  * Metodo para poner extras sobre la carne
  */
  @Override public void ponerExtrasSobreCarne(){
    System.out.println("Ponemos Quesillo sobre la Pierna Roja");
    addIngrediente("Quesillo");
  }
}
