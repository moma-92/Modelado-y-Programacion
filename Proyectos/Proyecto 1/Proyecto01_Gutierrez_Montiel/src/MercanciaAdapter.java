/**
* Clase que adapta un objeto de tipo Mercancia para que funcione como uno de MenuItem
*/
public class MercanciaAdapter implements MenuItem{

  //El objeto de tipo mercancia que vamos a adaptar
  public Mercancia mercancia;

  /**
  * Constructor de MercanciaAdapter
  * @param mercancia la mercancia a adaptar
  */
  public MercanciaAdapter(Mercancia mercancia){
    this.mercancia = mercancia;
  }

  /**
  * Metodo que devuelve el nombre de la mercancia
  * @return String el nombre de la mercancia
  */
  public String getNombre(){
    return this.mercancia.getNombre();
  }

  /**
  * Metodo que devuelve el tipo, color y material de la mercancia como un String unificado
  * @return s El tipo, color y material de la mercancia
  */
  public String getDescripcion(){
    String s = "Tipo: " + this.mercancia.getTipo() + "\n" + "Material: " +
               this.mercancia.getMaterial() + "\n" + "Color: " + this.mercancia.getColor();
    return s;
  }

  /**
  * Metodo que devuelve que si es Vegetariano
  * @return true porque la mercancia es vegetariana
  */
  public boolean getEsVegetariano(){
    return true;
  }

  /**
  * Metodo que devuelve el precio
  * @return int el precio de la mercancia
  */
  public int getPrecio(){
    int n = this.mercancia.getPrecio();
    return n;
  }

  /**
  * Metodo para cambiar el precio de la mercancia
  * @param precio el nuevo precio de la mercancia
  */
  public void setPrecio(int precio){
    this.mercancia.setPrecio(precio);
  }

  /**
  * Metodo que imprime la informacion de la mercancia
  */
  public void aString(){
    mercancia.aString();
  }

}
