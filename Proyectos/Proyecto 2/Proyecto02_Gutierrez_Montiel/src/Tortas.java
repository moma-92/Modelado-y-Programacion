import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
* Clase abstracta que contiene todos los metodos necesarios para la contruccion de la Torta.
*/
public abstract class Tortas{

  // Costo de la Torta
  private int costo;
  // ID de la Torta
  private int id;
  // El nombre de la Torta
  private String nombre;
  // Lista de ingredientes de la Torta
  private List<String> ingredientes = new ArrayList<String>();

  /**
  * Constructor de la clase Tortas
  * @param nombre El nombre de la torta
  * @param costo El costo de la torta
  * @param id El id de la torta
  */
  public Tortas(String nombre, int costo, int id){
    this.nombre = nombre;
    this.costo = costo;
    this.id = id;
  }

  /**
  * Metodo que devuelve el costo de la Torta
  * @return costo el costo de la Torta
  */
  public int getCosto(){
    return costo;
  }

  /**
  * Metodo que define el costo de la Torta
  * @param costo el costo de la Torta
  */
  public void setCosto(int costo){
    this.costo = costo;
  }

  /**
  * Metodo que agrega un ingrediente.
  */
  public void addIngrediente(String ingrediente){
    ingredientes.add(ingrediente);
  }

  /**
  * Metodo abstracto que se encarga de coninar la carne
  */
  public abstract void cocinarCarne();

  /**
  * Metodo que se encarga de la preparacion del Pan de la Torta
  */
  public void prepararPan(){
    System.out.println("La telera se corta a la mitad, la tapa se embarra con mayonesa y frijoles.");
    ingredientes.add("telera");
    ingredientes.add("mayonesa");
    ingredientes.add("frijoles");
  }

  /**
  * Metodo que se encarga de agregar los complementos a la Tor
  */
  public void agregarComplementos(){
    System.out.println("Agregamos Jitomatito, Cebollita y Aguacatito");
    ingredientes.add("Aguacate");
    ingredientes.add("Jitomate");
    ingredientes.add("Cebolla");
  }

  /**
  * Metodo abstracto que se encarga de poner la Carne sobre el Pan
  */
  public abstract void ponerCarneSobrePan();

  /**
  * Metodo abstracto que se encarga de poner los extras sobre la Carne
  */
  public abstract  void ponerExtrasSobreCarne();

  /**
  * Metood que se encarga de poner la Tapa sobre la torta para terminar la Torta
  */
  public void ponerTapa(){
    System.out.println("Poniendo la tapa y la torta esta lista. :D");
  }

  /**
  * Metodo que devuelve el ID de la Torta
  * @return id El ID de la Torta
  */
  public int getID(){
    return id;
  }

  /**
  * Metodo que regresa el nombre de la Torta
  * @return Nombre El nombre de la Torta
  */
  public String getNombre(){
    return nombre;
  }
}
