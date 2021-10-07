/**
* Clase para el Blindaje Simple
*/
public class BlindajeSimple extends Blindaje{

   /**
   * Metodo que delvuelve el tipo del producto
   * @return String el tipo del producto
   */
   @Override public String tipo(){
     return " Blindaje Simple";
   }

   /**
   * Metodo que devuelve el costo del producto
   * @return int el costo
   */
   @Override public int costo(){
     return 1000;
   }

   /**
   * Metodo que devuelve los puntos de velocidad del producto
   * @return int la velocidad
   */
   @Override public int velocidad(){
     return -2;
   }

   /**
   * Metodo que devuelve los puntos de defensa del producto
   * @return int la defensa
   */
   @Override public int defensa(){
     return 10;
   }

   /**
   * Metodo que devuelve los puntos de ataque del producto
   * @return int el ataque
   */
   @Override public int ataque(){
     return 0;
   }
 }
