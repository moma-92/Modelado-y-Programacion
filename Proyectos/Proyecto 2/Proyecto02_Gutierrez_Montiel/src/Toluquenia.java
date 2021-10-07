/**
* Clase que define la torta Toluquenia
*/
public class Toluquenia extends Tortas{

  /**
  * Constructor por defaul el bnombre es toluquenia, el precio 60 y el id 11
  */
  public Toluquenia(){
    super("Toluquenia", 60, 11);
  } 
  /**
  * Metodo para cocinar la Carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Cocinamos la Salchicha, el Chorizo y a dorar el Quesillo");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos la Salchicha y el Chorizo sobre el pan");
    addIngrediente("Salchicha");
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
