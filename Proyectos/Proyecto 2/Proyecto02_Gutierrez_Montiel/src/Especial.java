/**
* Clase que define la torta Especial
*/
public class Especial extends Tortas{

  /**
  * Constructor por default el nombre es Especial, el precio es 60 y el id 8
  */
  public Especial(){
    super("Especial", 60, 8);
  }

  /** 
  * Metodo para cocinar la Carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Cocinamos la Pierna Roja y doramos el Jamon y el Quesillo");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos la Pierna Roja y el Jamon sobre el pan");
    addIngrediente("Pierna Roja");
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
