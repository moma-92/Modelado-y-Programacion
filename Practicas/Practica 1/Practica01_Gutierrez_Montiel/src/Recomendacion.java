/**
* Interfaz que define el comportamiento de recomendaciones que tienen las plataformas en común.
*/
public interface Recomendacion{
  /**
  * Metodo que define la recomendacion que se dara del dia dependiendo de dia del contrato
  * @param dia Dia con el que se decidira la recomendacion del Dia
  * @return String Mensaje con la recomendacion del dia
  */
  public String recomendar(int dia);

}
