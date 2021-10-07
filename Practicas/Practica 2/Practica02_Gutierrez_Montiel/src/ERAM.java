/**
* Clase que derine el tipo de construccion de la casa
*/
public class ERAM extends Casa{

  /**
  * Metodo que define el tipo de aislamiento de la casa (Madera)
  */
  @Override public void aislamientoDeLaCasa(){
    System.out.println("Estoy colocando el aislamiento de madera de la casa");
    asignarCosto(getCosto() + 1000000);
  }

  /**
  * Metodo que define el tipo de esqueleto de la casa (Reforzado)
  */
  @Override public void construccionDelEsqueletoDeLaCasa(){
    System.out.println("Estoy construyendo el esqueleto reforzado de la casa");
    asignarCosto(getCosto() + 1000000);
  }
}
