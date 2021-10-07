/**
* Clase que define la torta Suiza
*/
public class Suiza extends Tortas{

  /**
  * Constructor por default el nombre es suiza, el precio es 60 y el id 14
  */
  public Suiza(){
    super("Suiza", 60, 14);
  } 

  /**
  * Metodo para cocinar la Carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Doramos el Quesillo, Queso Blanco y Queso Amarillo");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){

  }

  /**
  * Metodo para poner extras sobre la carne
  */
  @Override public void ponerExtrasSobreCarne(){
    System.out.println("Ponemos Quesillo, Queso Blanco y Queso Amarillo sobre el pan");
    addIngrediente("Quesillo");
    addIngrediente("Queso Blanco");
    addIngrediente("Queso Amarillo");
    setCosto(60);
    }
}
