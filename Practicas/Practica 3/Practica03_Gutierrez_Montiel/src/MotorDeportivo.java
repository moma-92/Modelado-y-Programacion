/**
* Clase para el Motor Deportivo
*/
public class MotorDeportivo extends Motor{

  /**
  * Metodo que delvuelve el tipo del motor
  @return String el tipo 
  */
  @Override public String tipo(){
    return "Motor Deportivo";
  }

  /**
  * Metodo que devuelve el costo del motor
  * @return int el costo
  */
  @Override public int costo(){
    return 10000;
  }

  /**
  * Metodo que devuelve los puntos de velocidad del motor
  * @return int la velocidad
  */
  @Override public int velocidad(){
    return 20;
  }

  /**
  * Metodo que devuelve los puntos de defensa del motor
  * @return int la defensa
  */
  @Override public int defensa(){
    return 0;
  }

  /**
  * Metodo que devuelve los puntos de ataque del motor
  * @return int el ataque
  */
  @Override public int ataque(){
    return 0;
  }
}
