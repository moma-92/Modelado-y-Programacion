import java.util.Hashtable;
import java.util.Iterator;
import java.util.Collection;

/**
 * Clase que asigna el comportamiento del iterador al HastableBurritos
 */
public class IteradorBurritos implements Iterador{

  // La coleccion que se creara a partir del hashtable
  public Collection<MenuItem> coleccion;
  // El Iterador
  public Iterator it;

  /**
  * Constructor del objeto de la clase IteradorBurritos
  * @param burritos objeto de la clase HastableBurritos sobre el que crearemos un iterador
  */
  public IteradorBurritos(HashtableBurritos burritos){
    this.coleccion = burritos.getMenu().values();
    it = coleccion.iterator();
  }

  /**
  * Metodo que nos dice si quedan elementos por recorrer
  * @param true si hay un elemento siguiente, false en otro caso.
  */
  @Override public boolean hasNext(){
      return it.hasNext();
  }

  /**
  * Metodo que nos da el elemento siguiente.
  * @return el elemento siguiente.
  */
  @Override public MenuItem next(){
    return (MenuItem)it.next();
  }


}
