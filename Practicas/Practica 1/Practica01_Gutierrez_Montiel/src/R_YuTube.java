/*
* Clase que define las recomendaciones de YuTube
*/
public class R_YuTube implements Recomendacion{

  /**
  * Metodo que decide de una lista de recomendaciones dependiendo del dia de tu contrato que se recomendara
  * @param dia Dia del contrato con el que se escogera la recomendacion
  * @return String Mensaje con la recomendacion del dia
  */
  public String recomendar(int dia){
    int m = dia;
    String[] recomendaciones = {"Billie Eilish Plays With Puppies While Answering Fan Question", "Heart Attack Burger | La Capital", "CÓMO HACER DONAS | #VickyRecetaFacil",
                                "Corto animado de Overwatch | 'Honor and Glory'", "The Killers cover Electric Blue by Icehouse (Full Performance)", "Trends People Forgot About"};
    return "La recomendacion de hoy es: " + recomendaciones[m];
  }
}
