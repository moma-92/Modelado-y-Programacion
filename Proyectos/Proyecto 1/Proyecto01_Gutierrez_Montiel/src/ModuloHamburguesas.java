/**
* Clase que funciona como modulo para cocinar hamburguesas
*/
public class ModuloHamburguesas implements Modulo{

  /**
  * Metodo para imprimir el proceso de preparacion de las hamburguesas
  */
  public void cocinar(){
    System.out.println("Sacamos la carne elegida del refrigerador. \n" +
                        "Si se trata de la opcion vegetariana, se saca la carne de soya del refrigerador. \n" +
                        "Ponemos a cocinar la carne en la plancha si lleva tocino y huevo también lo cocinamos. \n" +
                        "Sacamos el pan de la alacena. \n" +
                        "Volteamos la carne y le agregamos una o dos rebanadas de queso y el tocino si lleva. \n" +
                        "Ponemos a calentar el pan en la plancha. \n" +
                        "Una vez que el pan este caliente lo quitamos de la plancha. \n" +
                        "Untamos mayonesa en la tapa del pan. \n" +
                        "En la parte de abajo del pan ponemos lechuga, jitomate y cebolla. \n" +
                        "Quitamos la carne o carne de soya de la plancha. \n" +
                        "Ponemos la carne en el pan. \n" +
                        "Si lleva tocino y/o huevo los ponemos encima de la carne. \n" +
                        "Agregamos catsup y mostaza encima de la carne y la tapamos. \n");
  }
}
 
