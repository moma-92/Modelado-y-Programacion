/**
* Clase para la Armas de Sierra
*/
public class ArmasSierra extends Armas{

  /**
  * Metodo que devuelve el tipo del arma
  * @return tipo el tipo del arma
  */
 @Override public String tipo(){
   return "Arma Sierra";
  }

  /**
  * Metodo que delvuelve el costo del arma
  * @return int el costo
  */
 @Override public int costo(){
   return 500;
  }

  /**
  * Metodo que devuelve los puntos de velocidad del arma
  * @return int la velocidad
  */
 @Override public int velocidad(){
   return 0;
  }

  /**
  * Metodo que devuelve los puntos de defensa del arma
  * @return int la defensa
  */
 @Override public int defensa(){
   return 0;
  }

  /**
  * Metodo que devuelve los puntos de ataque del arma
  * @return int el ataque
  */
 @Override public int ataque(){
   return 5;
  }
}
