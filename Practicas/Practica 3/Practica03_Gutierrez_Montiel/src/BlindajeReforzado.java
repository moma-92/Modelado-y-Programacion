/**
* Clase para el Blindaje Reforzado
*/
public class BlindajeReforzado extends Blindaje{

   /**
   * Metodo que devuelve el tipo del blindaje
   * @return String el tipo de blindaje
   */
  @Override public String tipo(){
    return "Blindaje Reforzado";
   }

   /**
   * Metodo que delvuelve el costo del blindaje
   * @return int el costo
   */
  @Override public int costo(){
    return 2000;
   }

   /**
   * Metodo que devuelve los puntos de velocidad de este blindaje
   * @return int la velocidad
   */
  @Override public int velocidad(){
    return -4;
   }

   /**
   * Metodo que devuelve los puntos de defensa de este blindaje
   * @return int la defensa
   */
  @Override public int defensa(){
    return 20;
   }

   /**
   * Metodo que devuelve los puntos de ataque de este blindaje
   * @return int el ataque
   */
  @Override public int ataque(){
    return 0;
   }
 }
