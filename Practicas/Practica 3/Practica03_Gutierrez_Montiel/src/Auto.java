import java.util.ArrayList;
/**
* Clase que guarda toda la información sobre el auto que se crea
*/
public class Auto{

  // Lista de los componentes del auto
  private ArrayList<Componente> partes = new ArrayList<Componente>();

  /**
  * Metodo para agregar un componente al Auto
  * @param componente el componente a agregar
  */
  public void addComponente(Componente componente){
    this.partes.add(componente);
  }

  /**
  * Metodo que calcula y devuelve el costo total de Auto
  * @return costo el costo total del Auto
  */
  public int getCosto(){
    int costo = 0;
    for(Componente c : partes){
      costo += c.costo();
    }
    return costo;
  }

  /**
  * Metodo que calcula y devuelve la velocidad total del Auto
  * @return velocidad la velocidad total del Auto
  */
  public int getVelocidad(){
    int velocidad = 0;
    for(Componente c : partes){
      velocidad += c.velocidad();
    }
    return velocidad;
  }

  /**
  * Metodo que calcula y devuelve la defensa total del Auto
  * @return defensa la defensa total del Auto
  */
  public int getDefensa(){
    int defensa = 0;
    for(Componente c : partes){
      defensa += c.defensa();
    }
    return defensa;
  }

  /**
  * Metodo que calcula y devuelve el ataque total del Auto
  * @return ataque el ataque total del Auto
  */
  public int getAtaque(){
    int ataque = 0;
    for(Componente c : partes){
      ataque += c.ataque();
    }
    return ataque;
  }

  /**
  * Metodo que imprime la informacion del componente
  */
  public void imprimirInfo(){
    for(Componente c : partes){
      System.out.println(c.tipo());
    }
    System.out.println("Costo: " + getCosto());
    System.out.println("Velocidad: " + getVelocidad());
    System.out.println("Defensa: " + getDefensa());
    System.out.println("Ataque: " + getAtaque());
  }
}
