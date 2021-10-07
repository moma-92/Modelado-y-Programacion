/**
* Clase que guarda toda la informacion de la Mercancia
*/
public class Mercancia{

  //El nombre de la mercancia
  private String nombre = "";
  //El tipo de la mercancia
  private String tipo = "";
  //El color de la mercancia
  private String color = "";
  //El material de la mercancia
  private String material = "";
  //El precio de la mercancia
  private int precio = 0;

  /**
  * Constructor de la clase Mercancia
  * @param nombre el nombre de la mercancia
  * @param tipo el tipo de la mercancia
  * @param color el color de la mercancia
  * @param material el material de la mercancia
  * @param precio el precio de la mercancia
  */
  public Mercancia(String nombre, String tipo, String color, String material, int precio){
    this.nombre = nombre;
    this.tipo = tipo;
    this.color = color;
    this.material = material;
    this.precio = precio;
  }

  /**
  * Metodo que devuelve el nombre de la mercancia
  * @return nombre el nombre de la mercancia
  */
  public String getNombre(){
    return nombre;
  }

  /**
  * Metodo que devuelve el tipo de la mercancia
  * @return tipo el tipo de la mercancia
  */
  public String getTipo(){
    return tipo;
  }

  /**
  * Metodo que devuelve el color de la mercancia
  * @return color el color de la mercancia
  */
  public String getColor(){
    return color;
  }

  /**
  * Metodo que devuelve el material de la mercancia
  * @return material el material de la mercancia
  */
  public String getMaterial(){
    return material;
  }

  /**
  * Metodo que devuelve el precio de la mercancia
  * @return precio el precio de la mercancia
  */
  public int getPrecio(){
    return precio;
  }

  /**
  * Metodo para asignarle nuevo precio a la mercancia
  * @param precio el precio que le asignaremos a la mercancia
  */
  public void setPrecio(int precio){
    this.precio = precio;
  }

  /**
  * Metodo que convierte el objeto a un String
  */
  public void aString(){
    System.out.println("Mercancia: " + nombre + " " + "Tipo: " + tipo + " " +
                        "Color: " + color + " Material: " + material + "\n" + "Precio: " + precio);
  }
}
