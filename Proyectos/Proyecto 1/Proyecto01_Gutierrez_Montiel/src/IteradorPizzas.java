/**
* Clase que asigna el comportamiento del iterador a IteradorPizzas.
*/
public class IteradorPizzas implements Iterador{

  //El indice en el que nos encontramos en el Arreglo.
  public int indice;
  //El arreglo sobre el que iteramos de menu pizza.
	public MenuItem[] pizza;

  /**
  * Constructor de el objeto de la clase IteradorPizza.
  * @param menuPizza objeto de la clase ArregloPizza que contiene al arreglo de menu pizza.
  */
	public IteradorPizzas(ArregloPizza pizzas){
		this.pizza = pizzas.getMenu();
	}

  /**
  * Metodo para saber si el arreglo no se ha terminado.
  * @return boolean true si tiene siguiente, false si ya se termino
  */
	@Override public boolean hasNext(){
		if(indice < pizza.length){
			return true;
		}
		return false;
	}

  /**
  * Metodo que devuelve el siguiente elemento del arreglo.
  * @return menuItem el item de el menu que esta en esa posicion del arregle.
  */
	@Override public MenuItem next(){
		if(this.hasNext()){
			return pizza[indice++];
		}
		return null;
	}
}
