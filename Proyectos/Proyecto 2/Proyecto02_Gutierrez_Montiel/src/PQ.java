/**
* Clase que define la torta PQ (Pastor y Quesillo)
*/
public class PQ extends Tortas{

  /**
  * Constructor por default el nombre es PQ, el precio es 40 y el id 5
  */
  public PQ(){
    super("PQ", 40, 5);
  }

  /**
  * Metodo para cocinar la Carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Cocinamos el Pastor y doramos el Quesillo");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos el Pastor sobre el pan");
    addIngrediente("Pastor");
    setCosto(40);
  }

  /**
  * Metodo para poner extras sobre la carne
  */
  @Override public void ponerExtrasSobreCarne(){
    System.out.println("Ponemos Quesillo sobre el Pastor");
    addIngrediente("Quesillo");
    }
  }
