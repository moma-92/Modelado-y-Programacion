import java.util.Hashtable;
import java.util.Iterator;

/**
* Clase que para guardar el menu de Burritos en una Hashtable y los metodos que se pueden realizar sobre el Hashtable
*/
public class HashtableBurritos{

  // Hashtable con los burritos
  public Hashtable menuBurritos = new Hashtable();

  /**
  * Constuctor de la clase HashtableBurritos
  */
  public HashtableBurritos(){
    MenuItem menuItem1 = new Comida("Burrito Vegetariano.", "Tortilla gigante con una embarrada de frijoles, Queso Mozzarella, Pimiento Verde, Amarilo y Rojo, junto con Champiñones.", true, 60);
    menuBurritos.put(menuItem1.getNombre(), menuItem1);

    MenuItem menuItem2 = new Comida("Burrito de Pollo.", "Tortilla gigante con una embarrada de frijoles, Queso Mozzarella y deliciosa Carne de Pollo al comal, junto con Aguacate y Pico de Gallo.", false, 70);
    menuBurritos.put(menuItem2.getNombre(), menuItem2);

    MenuItem menuItem3 = new Comida("Burrito al Pastor.", "Tortilla gigante con una embarrada de frijoles, Queso Mozzarella y deliciosa Carne al Pastor al comal, junto Aguacate y Pico de Gallo.",false, 80);
    menuBurritos.put(menuItem3.getNombre(), menuItem3);

    MenuItem menuItem4 = new Comida("Burrito de Arrachera.", "Tortilla gigante con una embarrada de frijoles, Queso Mozzarella y deliciosa Carne Arrachera al comal, junto con Aguacate y Pico de Gallo.", false, 90);
    menuBurritos.put(menuItem4.getNombre(), menuItem4);
  }

  /**
  * Metodo para agregar un nuevo elemento en el Hashtable de Burritos
  * @param nuevoItem el elemento a agregar
  */
  public void agregaItem(MenuItem nuevoItem){
    menuBurritos.put(nuevoItem.getNombre(), nuevoItem);
  }

  /**
  * Metodo para quitar un item
  * @param item el elemento a quitar
  */
  public void quitarItem(MenuItem item){
    menuBurritos.remove(item.getNombre());
  }

  /**
  * Metodo que regresa el Hashtable de Burritos
  * @return menuBurritos el Hashtable con los objetos de MenuItem
  */
  public Hashtable getMenu(){
    return menuBurritos;
  }

  /**
  * Metodo para crear un iterador sobre el Hashtable de Burritos
  * @return itb el iterador para el Hashtable de MenuItem
  */
  public Iterador createIterator(){
  Iterador itb = new IteradorBurritos(this);
  return itb;
  }
}
