/**
* Clase que define las recomendaciones de Twitsh
*/
public class R_Twitsh implements Recomendacion{

  /**
  * Metodo que defne la recomendacion que se dara dependiendo del dia del contrato
  * @param dia Dia con el que se escogera la recomendacion del dia
  * @return String Un mensaje con la recomendacion del dia
  */
  public String recomendar(int dia){
    int m = dia;
    String[] recomendaciones = {"auronplay", "IFrostBolt", "ZkMushroom", "Stronk", "I Am Mava", "Rubius"};
    return "La recomendacion de hoy es: " + recomendaciones[m];
  }
}
