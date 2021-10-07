import java.util.ArrayList;

/**
* Clase que guarda la informacion de los clientes
*/
public class Cliente{

  // El nombre del usuario
  private String nombre;
  // La cantidad de saldo del cliente
  private int saldo;
  //Lista de los contratos del cliente
  private ArrayList<Contrato> contratos;

  /**
  * Metodo que define el estado inicial del cliente con los valores recibidos
  * @param nombre El nombre del cliente
  * @param saldo El saldo inicial del cliente
  */
  public Cliente(String nombre, int saldo){
    this.nombre = nombre;
    this.saldo = saldo;
    this.contratos = new ArrayList<Contrato>();
  }

  /**
  * Metodo que define el nombre del cliente
  * @param nombre El nombre del cliente
  */
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  /**
  * Metodo que define el saldo del cliente
  * @param saldo El saldo del cliente
  */
  public void setSaldo(int saldo){
    this.saldo = saldo;
  }

  /**
  * Metodo para gregar un contrato a la lista de contratos del cliente
  * @param contrato El contrato que se agregara
  */
  public void agregarContrato(Contrato contrato){
    contratos.add(contrato);
  }

  /**
  * Metodo que regresa el nombre del cliente
  * @return nombre El nombre del cliente
  */
  public String getNombre(){
    return nombre;
  }

  /**
  * Metodo que regresa el saldo del cliente
  * @return saldo El saldo del cliente
  */
  public int getSaldo(){
    return saldo;
  }

}
