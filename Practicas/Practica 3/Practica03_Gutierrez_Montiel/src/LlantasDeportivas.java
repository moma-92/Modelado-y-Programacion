public class LlantasDeportivas extends Llantas{

  /**
  * Metodo que devuelve el tipo de llantas
  * @return String el tipo de llantas
  */
 @Override public String tipo(){
   return "Llantas Deportivas";
  }

  /**
  * Metodo que delvuelve el costo de las llantas
  * @return int el costo
  */
 @Override public int costo(){
   return 550;
  }

  /**
  * Metodo que devuelve los puntos de velocidad de estas llantas
  * @return int la velocidad
  */
 @Override public int velocidad(){
   return 20;
  }

  /**
  * Metodo que devuelve los puntos de defensa de estas llantas
  * @return int la defensa
  */
 @Override public int defensa(){
   return 0;
  }

  /**
  * Metodo que devuelve los puntos de ataque de estas llantas
  * @return int el ataque
  */
 @Override public int ataque(){
   return 0;
  }

}
