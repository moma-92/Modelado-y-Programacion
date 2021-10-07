/**
* Clase para el Blindaje Tanque
*/
public class BlindajeTanque extends Blindaje{

   /**
   * Metodo que devuelve el tipo del blindaje
   * @return String tipo del blindaje
   */
  @Override public String tipo(){
    return "Blindaje Tanque";
   }

   /**
   * Metodo que delvuelve el costo del blindaje
   * @return int el costo
   */
  @Override public int costo(){
    return 3000;
   }

   /**
   * Metodo que devuelve los puntos de velocidad de este blindaje
   * @return int la velocidad
   */
  @Override public int velocidad(){
    return -6;
   }

   /**
   * Metodo que devuelve los puntos de defensa de este blindaje
   * @return int la defensa
   */
  @Override public int defensa(){
    return 30;
   }

   /**
   * Metodo que devuelve los puntos de ataque de este blindaje
   * @return int el ataque
   */
  @Override public int ataque(){
    return 0;
   }
 }
