/**
* Clase para la Carroceria Deportiva
*/
public class CarroceriaDeportiva extends Carroceria{

   /**
   * Metodo que devuelve el tipo de la carroceria
   * @return String el tipo
   */
  @Override public String tipo(){
    return "Carroceria Deportiva";
   }

   /**
   * Metodo que delvuelve el costo de la carroceria
   * @return int el costo
   */
  @Override public int costo(){
    return 3000;
   }

   /**
   * Metodo que devuelve los puntos de velocidad de esta carroceria
   * @return int la velocidad
   */
  @Override public int velocidad(){
    return 6;
   }

   /**
   * Metodo que devuelve los puntos de defensa de esta carroceria
   * @return int la defensa
   */
  @Override public int defensa(){
    return 9;
   }

   /**
   * Metodo que devuelve los puntos de ataque de esta carroceria
   * @return int el ataque
   */
  @Override public int ataque(){
    return 0;
   }
 }
