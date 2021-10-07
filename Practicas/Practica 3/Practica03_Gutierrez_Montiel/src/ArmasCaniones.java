/**
* Clase para las Armas de  Caniones
*/
public class ArmasCaniones extends Armas{

  /**
  * Metodo que delvuelve el tipo del arma
  * @return String el tipo
  */
  @Override public String tipo(){
    return "Aramas Caniones";
  }

  /**
  * Metodo que devuelve el costo del arma
  * @return int el costo
  */
  @Override public int costo(){
    return 2500;
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
    return 25;
  }
}
