import java.util.List;
import java.util.ArrayList;
/**
* Clase que tiene el menu de las hamburguesas en forma de la lista
*/
public class ListaHamburguesa{

  //La lista de el menu de las Hamburguesas
   public List<MenuItem> menuHamburguesas = new ArrayList<MenuItem>();

   /**
   * Constructor de un objeto de lalista de menu hamburguesas
   */
   public ListaHamburguesa(){
     MenuItem menuItem1 = new Comida("Hamburguesa Vegetariana.", "Delicioso Pan con deliciosa Carne de Soya a la plancha, junto con Cebolla Morada, Jitomate y Lechuga fresca.", true, 80);
     menuHamburguesas.add(menuItem1);
     MenuItem menuItem2 = new Comida("Hamburguesa Sencilla.", "Delicioso Pan con jugosa Carne de Res a la plancha con Queso Amarilo, junto con Cebolla Morada, Jitomate y Lechuga fresca.", false, 80);
     menuHamburguesas.add(menuItem2);
     MenuItem menuItem3 = new Comida("Hamburguesa con Tocino.", "Delicioso Pan con jugosa Carne de Res a la plancha con Queso Amarilo y Crujiente Tocino, junto con Cebolla Morada, Jitomate y Lechuga fresca.", false, 90);
     menuHamburguesas.add(menuItem3);
     MenuItem menuItem4 = new Comida("Hamburguesa Doble.", "Delicioso Pan con dos jugosas Carnes de Res a la placha con Queso Amarilo c/u, junto con Cebolla Morada, Jitomate y Lechuga fresca.", false, 100);
     menuHamburguesas.add(menuItem4);
     MenuItem menuItem5 = new Comida("La Monstruosa.", "Delicioso Pan con dos jugosas Carnes de Res a la plancha, un Huevo Estrellado, con doble Crujiente Tocino y doble Queso Amarilo, junto con Cebolla Morada, Jitomate y Lechuga fresca.", false, 140);
     menuHamburguesas.add(menuItem5);
   }

   /**
   * Metodo para agregar un nuevo elemento a la lista de hamburguesas
   * @param nuevoItem el elemento agregar a la lista
   */
   public void agregaItem(MenuItem nuevoItem){
     menuHamburguesas.add(nuevoItem);
   }

   /**
   * Metodo para eliminar el item de la lista de Hamburguesas
   * @param item el elemento a eliminar
   */
   public void quitarItem(MenuItem item){
     menuHamburguesas.remove(item);
   }

   /**
   * Menu que devuelve la lista de menuItem
   * @return menuHamburguesas la lista de MenuItem
   */
   public List<MenuItem> getMenu(){
     return menuHamburguesas;
   }

   /**
   * Metodo para crear un iterador sobre la lista
   * @return ith el iterador para la lista de MenuItem
   */
   public Iterador createIterator(){
     Iterador ith = new IteradorHamburguesa(this);
     return ith;
   }

}
