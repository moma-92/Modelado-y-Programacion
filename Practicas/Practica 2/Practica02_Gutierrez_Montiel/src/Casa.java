/**
* Clase abstracta que contiene todos los metodos necesarios para la construccion de la casa, junto con su tipo y costo
*/
public abstract class Casa{

  // costo de la casa
  private int costo = 1000000; 

  /**
  * Metodo que devuelve el costo de la Casa
  * @return costo el costo de la casa
  */
  public int getCosto(){
    return costo;
  }

  /**
  * Metodo que le asigna un nuevo costo a la Casa
  * @param nCosto el nuevo costo de la casa
  */
  public void asignarCosto(int nCosto){
    costo = nCosto;
  }

  /**
  * Metodo que se encarga de la preparacion del terreno
  */
  public void preparacionDelTerreno(){
    System.out.println("Estoy preparando el terreno de la casa.");
  }

  /**
  * Metodo que se encarga de la colocacion de cimientos
  */
  public void colocacionDeCimientos(){
    System.out.println("Estoy colocando los cimientos para la casa.");
  }

  /**
  * Metodo abstracto de construccion del esqueleto de la casa
  */
  public abstract void construccionDelEsqueletoDeLaCasa();

  /**
  * Metodo que se encarga de la instalacion electrica y plomeria
  */
  public void instalacionElectricaYPlomeria(){
    System.out.println("Estoy haciendo la instalacion electrica y plomeria de la casa.");
  }

  /**
  * Metodo abstracto del aislamiento de la Casa
  */
  public abstract void aislamientoDeLaCasa();

  /**
  * Metodo que se encarga de los acabados de la Casa
  */
  public void acabados(){
    System.out.println("Ya estoy por terminar la casa, solo faltan los acabados finales.");
  }

}
