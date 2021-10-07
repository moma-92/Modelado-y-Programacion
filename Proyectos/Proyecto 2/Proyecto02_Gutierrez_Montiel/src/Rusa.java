/**
* Clase que define la torta Rusa
*/
public class Rusa extends Tortas{

  /**
  * Constructor por default el nombre es Rusa, el precio es 60 y el id 18
  */
  public Rusa(){
    super("Rusa", 60, 18);
  }

  /**
  * Metodo para cocinar la Carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Cocinamos la Pierna Roja y la Milanesa, y doramos el Quesillo");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos la Pierna Roja y la Milanesa sobre el pan");
    addIngrediente("Pierna Roja");
    addIngrediente("Milanesa");
    setCosto(60);
  }

  /**
  * Metodo para poner extras sobre la carne
  */
  @Override public void ponerExtrasSobreCarne(){
    System.out.println("Ponemos Quesillo sobre la Milanesa");
    addIngrediente("Quesillo");
    }
  }
