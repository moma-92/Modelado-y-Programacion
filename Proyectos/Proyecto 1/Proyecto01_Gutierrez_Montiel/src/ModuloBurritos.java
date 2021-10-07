/**
* Clase que funciona como modulo para cocinar burritos
*/
public class ModuloBurritos implements Modulo{

  /**
  * Metodo para imprimir el proceso de preparacion de los burritos
  */
  public void cocinar(){
    System.out.println("Sacamos la carne elegida, vegetales y torillas del refrigerador. \n" +
                       "Si no es opcion vegetariana calentamos la carne elegida. \n" +
                       "Ponemos a calentar la tortilla en el comal. \n" +
                       "Una vez que este caliente untamos frijoles en la tortilla. \n" +
                       "Ponemos queso sobre los frijoles. \n" +
                       "Sacamos la carne del comal y la ponemos en la torilla. \n" +
                       "Si se trata de la opcion vegetariana solo ponemos pimientos sobre el queso. \n" +
                       "En caso de no ser vegetariana le agregamos aguacate y pico de gallo al burrito. \n");
  }
}
 
