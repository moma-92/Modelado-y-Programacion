/**
* Clase que define las recomendaciones de Hammazon
*/
public class R_Hammazon implements Recomendacion{

  /**
  * Metodo que define la recomendacion que se dara del dia dependiendo de dia del contrato
  * @param dia Dia con el que se decidira la recomendacion del Dia
  * @return String Mensaje con la recomendacion del dia
  */
  public String recomendar(int dia){
    int m = dia;
    String[] recomendaciones = {"American Horror Story", "IT", "Shrek", "Beetlejuice", "Malcolm in the Middle", "Inuyasha"};
    return "La recomendacion de hoy es: " + recomendaciones[m];
  }
}
