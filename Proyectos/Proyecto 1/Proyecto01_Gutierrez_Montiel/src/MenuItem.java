/**
* Interfaz para la los item del menu
*/
public interface MenuItem{

  /**
  * Metodo que devuelve el nombre
  */
  public String getNombre();

  /**
  * Metodo que devuelve la descripcion
  */
  public String getDescripcion();

  /**
  * Metodo que devuelve si es Vegetariano o no
  */
  public boolean getEsVegetariano();

  /**
  * Metodo que devuelve el precio
  */
  public int getPrecio();

  /**
  * Metodo que asigna el precio
  * @param m el precio
  */
  public void setPrecio(int m);

  /**
  * Metodo que convierte los atributos a String
  */
  public void aString();
}
