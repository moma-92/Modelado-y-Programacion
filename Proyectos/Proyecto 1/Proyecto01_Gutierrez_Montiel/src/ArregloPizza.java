import java.util.Arrays;

/**
* Clase para guardar el arreglo de menu pizza y lo metodos que se pueden realizar sobre el
*/
public class ArregloPizza{

  // Arreglo de Pizzas
  private MenuItem[] arrayPizzas = new MenuItem[4];
  private int indice = 0;
  private int maximo = 3;

  /**
  * Constructor que define el estado inicial del arreglo de pizzas.
  */
  public ArregloPizza(){
    arrayPizzas[0] = new Comida("Cuatro quesos.", "Pizza con Queso Crema, Queso Mozzarella, Queso Parmesano y Queso Cheddar.", true, 120);

    arrayPizzas[1] = new Comida("Pepperoni.", "La clasica pizza con delicioso Queso Mozzarella y Pepperoni doradito encima.", false, 150);

    arrayPizzas[2] = new Comida("Hawaiana.", "Pizza con delicioso Queso Mozzarella, Piña fresca y Jamon del barato.", false, 150);

    arrayPizzas[3] = new Comida("Carnes Frias.", "Pizza con delicioso Extra Queso Mozzarella, Pepperoni, Salami, Jamon Serrano, Carne Molida, Jamón, Chorizo, Pimiento, Cebolla, Champiñones Frescos y Aceitunas.", false, 280);
  }

  /**
  * Metodo que devuelve el arreglo de pizzas que contiene el objeto.
  * @return arrayPizzas el arreglo de objetos MenuItem
  */
  public MenuItem[] getMenu(){
    return arrayPizzas;
  }

  /**
  * Metodo que te regresa un iterador que itera sobre este arreglo.
  * @return itp el objeto de clase IteradorPizzas para iterar sobre este arreglo.
  */
  public Iterador createIterator(){
    Iterador itp = new IteradorPizzas(this);
    return itp;
  }
}
