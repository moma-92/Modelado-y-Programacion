/**
* Clase que define la torta Pachuquenia
*/
public class Pachuquenia extends Tortas{

  /**
  * Constructor por default el nombre es Pachuquenia, el precio es 60, y el id 9
  */
  public Pachuquenia(){
    super("Pachuquenia", 60, 9);
  }

  /**
  * Metodo para cocinar la Carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Cocinamos la Milanesa, doramos el Quesillo y la Pinia");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos la Milanesa sobre el pan");
    addIngrediente("Milanesa");
    setCosto(60);
  }

  /**
  * Metodo para poner extras sobre la carne
  */
  @Override public void ponerExtrasSobreCarne(){
    System.out.println("Ponemos el Quesillo sobre la Milanesa");
    addIngrediente("Quesillo");
    System.out.println("Ponemos la Pinia sobre el Quesillo");
    addIngrediente("Pinia");
  }
}
