/**
* Clase que define las recomendaciones de Spootify
*/
public class R_Spootify implements Recomendacion{

  /**
  * Metodo que define la recomendacion que se dara dependiendo del dia del contrato
  * @param dia Dia con el que se decidira la recomendacion
  * @return String Un mensaje con la recomendacion del dia
  */
  public String recomendar(int dia){
    int m = dia;
    String[] recomendaciones = {"She - Harry Styles", "Gimme Love - Joji", "Stay In - JAWS", "El Triste - Jose Jose", "Show Must Go On - Queen", "Le Llamaban Loca - Jose Luis Perales"};
    return "La recomendacion de hoy es: " + recomendaciones[m];
  }
}
