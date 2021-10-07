/**
* Clase que derine el tipo de construccion de la casa
*/
public class ECAC extends Casa{

  /**
  * Metodo que define el tipo de aislamiento de la casa (Concreto)
  */
  @Override public void aislamientoDeLaCasa(){
    System.out.println("Estoy colocando el aislamiento de concreto de la casa");
    asignarCosto(getCosto() + 2000000);
  }

  /**
  * Metodo que define el tipo de esqueleto de la casa (Concreto)
  */
  @Override public void construccionDelEsqueletoDeLaCasa(){
    System.out.println("Estoy construyendo el esqueleto de concreto de la casa");
    asignarCosto(getCosto() + 500000);
  }
}
