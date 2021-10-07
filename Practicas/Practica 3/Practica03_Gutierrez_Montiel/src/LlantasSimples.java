/**
* Clae para la fabrica Llantas Simples
*/
public class LlantasSimples extends Llantas{

  /**
  * Metodo que delvuelve el tipo del producto
  * @return String el tipo
  */
  @Override public String tipo(){
    return "Llantas Simples";
  }

  /**
  * Metodo que devuelve el costo del producto
  * @return int el costo
  */
  @Override public int costo(){
    return 100;
  }

  /**
  * Metodo que devuelve los puntos de velocidad del producto
  * @return int la velocidad
  */
  @Override public int velocidad(){
    return 0;
  }

  /**
  * Metodo que devuelve los puntos de defensa del producto
  * @return int la defensa
  */
  @Override public int defensa(){
    return 0;
  }

  /**
  * Metodo que devuelve los puntos de ataque del producto
  * @return int el ataque
  */
  @Override public int ataque(){
    return 0;
  }
}
