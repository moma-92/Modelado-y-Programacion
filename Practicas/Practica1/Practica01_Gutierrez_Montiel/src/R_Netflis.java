/**
* Clase que define las recomendaciones de Netflis
*/
public class R_Netflis implements Recomendacion{

  /**
  * Metodo que define la recomendacion que se dara del dia dependiendo de dia del contrato
  * @param dia Dia con el que se decidira la recomendacion del Dia
  * @return String Mensaje con la recomendacion del dia
  */
  public String recomendar(int dia){
    int m = dia;
    String[] recomendaciones = {"Bosque adentro", "Altered Carbon", "The Last Dance", "Gotham", "Sex Education", "Sherlock"};
    return "La recomendacion de hoy es: " + recomendaciones[m];
  }
}
