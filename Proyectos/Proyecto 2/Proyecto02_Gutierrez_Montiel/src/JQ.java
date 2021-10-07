/**
* Clase que define la torta JQ (Jamon y Quesillo)
*/
public class JQ extends Tortas{

  /**
  * Constructor por default el nombre es JQ, el precio es 40, y el id 3
  */
  public JQ(){
    super("JQ", 40, 3);
  }

  /**
  * Metodo para cocinar la Carne
  */
  @Override public void cocinarCarne(){
    System.out.println("Doramos el Jamon y el Quesillo");
  }

  /**
  * Metodo para poner la carne sobre el pan
  */
  @Override public void ponerCarneSobrePan(){
    System.out.println("Ponemos el Jamon sobre el pan");
    addIngrediente("Jamon");
    setCosto(40);
  }

  /**
  * Metodo para poner extras sobre la carne
  */
  @Override public void ponerExtrasSobreCarne(){
    System.out.println("Ponemos Quesillo sobre el Jamon");
    addIngrediente("Quesillo");
    }
  }
