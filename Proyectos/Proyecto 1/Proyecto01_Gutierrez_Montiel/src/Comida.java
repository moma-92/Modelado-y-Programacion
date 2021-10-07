/**
* Clase que guarda la informacion de la comida y tambien implementa los metodos de menuItem
*/
public class Comida implements MenuItem{
  // El nombre del platillo
  private String nombre = "";
  // La descripcion del platillo
  private String descripcion = "";
  // Booleano para saber si es vegetariano
  private boolean esVegetariano = false;
  // Precio del platillo
  private int precio;

  /**
  * Constructor de Comida
  * @param nombre el nombre del platillo
  * @param descripcion la descripcion el platillo
  * @param veg true si el platillo es vegetariano y false si no lo es
  * @param precio el precio del platillo
  */
  public Comida(String nombre, String descripcion, boolean veg, int precio){
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.esVegetariano = veg;
    this.precio = precio;
  }

  /**
  * Metodo que devuelve el nombre del platillo
  * @return nombre el nombre del platillo
  */
  public String getNombre(){
    return nombre;
  }

  /**
  * Metodo que devuelve la descripcion del platillo
  * @return descripion la descripcion del platillo
  */
  public String getDescripcion(){
    return descripcion;
  }

  /**
  * Metodo que devuelve el booleano de si es vegetariano o no
  * @return esVegetariano booleano true si el platillo es vegetariano, false si no lo es
  */
  public boolean getEsVegetariano(){
    return esVegetariano;
  }

  /**
  * Metodo que devuelve el precio del platillo
  * @return precio el precio del platillo
  */
  public int getPrecio(){
    return precio;
  }

  /**
  * Metodo para asignarle un nuevo precio al platillo
  * @return precio el nuevo precio del platillo
  */
  public void setPrecio(int nuevoPrecio){
    this.precio = nuevoPrecio;
  }

  /**
  * Metodo que convierte los atributos a String y los imprime
  */
  public void aString(){
    String e = "";
    if(esVegetariano == true){
      e = "Platillo Vegetariano.";
    } else {
      e = "Platillo No Vegentariano.";
    }
    System.out.println(nombre + " Precio: " + precio + " " + e + "\n" + descripcion);
  }
}
