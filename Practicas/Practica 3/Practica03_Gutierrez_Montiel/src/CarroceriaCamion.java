/**
* Clase para la Carroceria Camion
*/
public class CarroceriaCamion extends Carroceria{
   /**
   * Metodo que delvuelve el tipo de la carroceria
   * @return String el tipo de la carroceria
   */
   @Override public String tipo(){
     return "Carroceria Camion";
   }

   /**
   * Metodo que devuelve el costo de la carroceria
   * @return int el costo
   */
   @Override public int costo(){
     return 2000;
   }

   /**
   * Metodo que devuelve los puntos de velocidad de la carroceria
   * @return int la velocidad
   */
   @Override public int velocidad(){
     return 4;
   }

   /**
   * Metodo que devuelve los puntos de defensa del producto
   * @return int la defensa
   */
   @Override public int defensa(){
     return 6;
   }

   /**
   * Metodo que devuelve los puntos de ataque del producto
   * @return int el ataque
   */
   @Override public int ataque(){
     return 0;
   }
 }
