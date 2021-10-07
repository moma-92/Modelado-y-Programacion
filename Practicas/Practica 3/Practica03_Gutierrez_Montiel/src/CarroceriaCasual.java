/**
* Clase para la Carroceria Casual
*/
public class CarroceriaCasual extends Carroceria{

   /**
   * Metodo que delvuelve el tipo de la carroceria
   * @return String el tipo
   */
   @Override public String tipo(){
     return "Carroceria Casual";
   }

   /**
   * Metodo que devuelve el costo de la carroceria
   * @return el costo
   */
   @Override public int costo(){
     return 1000;
   }

   /**
   * Metodo que devuelve los puntos de velocidad de la carroceria
   * @return int la velocidad
   */
   @Override public int velocidad(){
     return 2;
   }

   /**
   * Metodo que devuelve los puntos de defensa de la carroceria
   * @return int la defensa
   */
   @Override public int defensa(){
     return 3;
   }

   /**
   * Metodo que devuelve los puntos de ataque de la carroceria
   * @return int el ataque
   */
   @Override public int ataque(){
     return 0;
   }
 }
