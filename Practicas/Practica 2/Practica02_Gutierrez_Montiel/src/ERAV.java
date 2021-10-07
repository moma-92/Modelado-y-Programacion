/**
* Clase que derine el tipo de construccion de la casa
*/
public class ERAV extends Casa{

  /**
  * Metodo que define el tipo de aislamiento de la casa (Vidrio)
  */
  @Override public void aislamientoDeLaCasa(){
    System.out.println("Estoy colocando el aislamiento de vidrio de la casa");
    asignarCosto(getCosto() + 2500000);
  }

  /**
  * Metodo que define el tipo de esqueleto de la casa (Reforzado)
  */
  @Override public void construccionDelEsqueletoDeLaCasa(){
    System.out.println("Estoy construyendo el esqueleto reforzado de la casa");
    asignarCosto(getCosto() + 1000000);
  }
}
