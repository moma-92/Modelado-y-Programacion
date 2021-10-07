/**
* Clase que define la torta Lambada
*/
public class Lambada extends Tortas{

  /**
  * Constructor por default el nombre es Lambada, el precio es 60, y el id 12
  */
  public Lambada(){
    super("Lambada", 60, 12);
  }

  /**
  * Metodo para cocinar la carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Cocinamos la Pierna Roja, el Huevo y el Chorizo");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos la Pierna, el Huevo y el Chorizo sobre el pan");
    addIngrediente("Pierna");
    addIngrediente("Huevo");
    addIngrediente("Chorizo");
    setCosto(60);
  }

  /**
  * Metodo para poner extras sobre la carne
  */
  @Override public void ponerExtrasSobreCarne(){

  }
}
