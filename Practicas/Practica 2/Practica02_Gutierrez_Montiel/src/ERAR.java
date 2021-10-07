/**
* Clase que derine el tipo de construccion de la casa
*/
public class ERAR extends Casa{

  /**
  * Metodo que define el tipo de aislamiento de la casa (Reforzado)
  */
  @Override public void aislamientoDeLaCasa(){
    System.out.println("Estoy colocando el aislamiento reforzado de la casa");
    asignarCosto(getCosto() + 3000000);
  }

  /**
  * Metodo que define el tipo de esqueleto de la casa (Reforzado)
  */
  @Override public void construccionDelEsqueletoDeLaCasa(){
    System.out.println("Estoy construyendo el esqueleto reforzado de la casa");
    asignarCosto(getCosto() + 1000000);
  }
}
