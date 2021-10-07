/**
* Clase abstracta para los componentes de tipo Blindaje
*/
public abstract class Blindaje implements Componente{

  /**
  * Metodo que delvuelve el tipo del Blindaje
  */
  @Override public abstract String tipo();

  /**
  * Metodo que devuelve el costo del Blindaje
  */
  @Override public abstract int costo();

  /**
  * Metodo que devuelve los puntos de velocidad del producto
  */
  @Override public abstract int velocidad();

  /**
  * Metodo que devuelve los puntos de defensa del producto
  */
  @Override public abstract int defensa();

  /**
  * Metodo que devuelve los puntos de ataque del producto
  */
  @Override public abstract int ataque();

  /**
  * Metodo que imprime la informacion del componente
  */
  @Override public void informacion(){
    String s = "Tipo de Blindaje: " + tipo() + "\n" +
               "Costo: " + costo() + "\n" +
               "Velocidad: " + velocidad() + "\n" +
               "Defensa: " + defensa() + "\n" +
               "Ataque: " + ataque() + "\n";

    System.out.println(s);
  }

}
