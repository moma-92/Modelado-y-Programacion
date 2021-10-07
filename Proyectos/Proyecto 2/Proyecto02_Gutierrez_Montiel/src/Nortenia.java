/**
* Clase para la torta Nortenia
*/
public class Nortenia extends Tortas{

  /**
  * Constructor por default el nombre es Nortenia, el precio es 60, y el id 10
  */
  public Nortenia(){
    super("Nortenia", 60, 10);
  }

  /**
  * Metodo para cocinar la carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Cocinamos el Chorizo y el Huevo, y calentamos el Jamon");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos el huevo, el chorizo y el jamon en el pan");
    addIngrediente("Huevo");
    addIngrediente("Chorizo");
    addIngrediente("Jamon");
    setCosto(60);
  }

  /**
  * Metodo para poner extras sobre la carne
  */
  @Override public void ponerExtrasSobreCarne(){

  }
}
