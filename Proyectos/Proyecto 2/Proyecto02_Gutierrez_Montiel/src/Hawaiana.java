/**
* Clase que define la torta Hawaiana
*/
public class Hawaiana extends Tortas{

  /**
  * Constructor por default el nombre es Hawaiana, el precio es 60 y el id 16
  */
  public Hawaiana(){
    super("Hawaiana", 60, 16);
  }

  /**
  * Metodo para cocinar la Carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Doramos el Jamón, la Pinia y el Quesillo");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos el Jamon sobre el pan");
    addIngrediente("Jamon");
    setCosto(60);
  }

  /**
  * Metodo para poner extras sobre la carne
  */
  @Override public void ponerExtrasSobreCarne(){
    System.out.println("Ponemos Quesillo sobre el Jamon");
    System.out.println("Ponemos la Pinia sobre el Quesillo");
    addIngrediente("Quesillo");
    addIngrediente("Pinia");
    }
  }
