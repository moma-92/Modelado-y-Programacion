import java.util.List;
import java.util.Iterator;
/**
 * Clase que asigna el comportamiento del iterador a ListaHamburguesas
 */
public class IteradorHamburguesa implements Iterador{

  // La lista sobre la que se va a iterar
  public List<MenuItem> lista;
  // El Iterador
  public Iterator it;

  /**
  * Constructor de el objeto de la clase IteradorHamburguesas
  * @param hamburguesas objeto de la clase ListaHamburguesa que contiene a la lista sobre la que vamos a iterar
  */
  public IteradorHamburguesa(ListaHamburguesa hamburguesas){
    this.lista = hamburguesas.getMenu();
    this.it = lista.iterator();
  }

  /**
  * Nos dice si quedan elementos por recorrer
  * @param true si hay un elemento siguiente, false en otro caso.
  */
  @Override public boolean hasNext(){
      return it.hasNext();
  }

  /**
  * Nos da el elemento siguiente.
  * @return el elemento siguiente.
  */
  @Override public MenuItem next(){
    return (MenuItem)it.next();
  }


}
