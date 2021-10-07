/**
* Clase que define la torta SQ (Salchicha y Quesillo)
*/
public class SQ extends Tortas{

  /**
  * Constructor por defualt el nombre es SQ, el precio es 40 y el id 7
  */
  public SQ(){
    super("SQ", 40, 7);
  }

  /**
  * Metodo para cocinar la Carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Doramos la Salchicha y el Quesillo");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos la Salchicha sobre el pan");
    addIngrediente("Salchicha");
    setCosto(40);
  }

  /**
  * Metodo para poner extras sobre la carne
  */
  @Override public void ponerExtrasSobreCarne(){
    System.out.println("Ponemos Quesillo sobre la Salchicha");
    addIngrediente("Quesillo");
    }
  }
