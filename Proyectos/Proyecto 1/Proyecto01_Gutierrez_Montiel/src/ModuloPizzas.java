/**
* Clase que funciona como modulo para cocinar Pizzas
*/
public class ModuloPizzas implements Modulo{

  /**
  * Metodo para imprimir el proceso de preparacion de las Pizzas
  */
  public void cocinar(){
    System.out.println("Sacamos la masa del refrigerador. \n" +
                        "Amasamos la masa para que sea manejable. \n" +
                        "Le damos forma circular a la masa y doblamos la orillas. \n" +
                        "Sacamos los ingredientes elegidos del refrigerador. \n" +
                        "Ponemos una capa de salsa de jitomate sobre la masa. \n" +
                        "Cubrimos la salsa con queso espolvoreado. \n" +
                        "Ponemos los ingredientes elegidos sobre el queso. \n" +
                        "Metemos la pizza al horno y esperamos 15 minutos para que se doren las orillas. \n");
  }
}
