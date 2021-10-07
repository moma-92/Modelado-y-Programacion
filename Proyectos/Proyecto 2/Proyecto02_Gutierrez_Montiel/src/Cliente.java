import java.util.ArrayList;
import java.lang.Exception;

/**
* Clase para guardar la informacion del cliente
*/
public class Cliente implements Observer{
  // La Sucursal a la que pide el cliente
  private SucursalTortas sucursal;
  // El nombre del cliente
  private String nombre = "";
  // El ID del cliente
  private int id;
  // La tarjeta del Cliente
  private Payment cuenta;
  // La lista de la notificaciones del Cliente
  private ArrayList<String> notificaciones;
  // El domicilio del Cliente
  private String domicilio = "";
  // Contador para el numero de pedidos realizados por el Cliente
  private int contadorPedido = 0;
  // Arreglo para los pedidos del Cliente
  private Integer[] pedido = new Integer[5];


  /**
  * Define al Cliente
  * @param id El ID del Cliente
  * @param cuenta La cuenta del Cliente
  * @param domicilio EL domicilio del Cliente
  */
  public Cliente(String nombre, int id, Payment cuenta, String domicilio, SucursalTortas sucursal){
    this.nombre = nombre;
    this.id = id;
    this.cuenta = cuenta;
    this.notificaciones = new ArrayList<String>();
    this.domicilio = domicilio;
    this.sucursal = sucursal;
  }

  /**
  * Metodo update del patron Observer, actualiza las notificaciones
  */
  public void update(){
      addNotificaciones(nombre + " " + this.sucursal.descuento());
      mostrarNotificaciones();
      notificaciones.clear();
  }

  /**
  * Metodo que regresa las notificaciones
  * @return String un string con las notificaciones;
  */
  public void mostrarNotificaciones(){
   System.out.println(notificaciones.toString());
  }

  /**
  * Metodo que agrega notificaciones a la lista de notificaciones del Cliente
  * @param noti La notificacion que se agrega
  */
  public void addNotificaciones(String noti){
    notificaciones.add(noti);
  }

  /**
  * Metodo que devuelve el id del Cliente
  * @return id El ID del Cliente
  */
  public int getID(){
    return id;
  }

  /**
  * Metodo que devuelve la cuenta del Cliente
  * @return cuenta La cuenta del Cliente
  */
  public Payment getTarjeta(){
    return cuenta;
  }

  /**
  * Metodo nque devuelve el domicilio del Cliente
  * @return domicilio El domicilio del Cliente
  */
  public String getDomicilio(){
    return domicilio;
  }

  /**
  * Metodo que devuelve las notificaciones en forma de ArrayList del Cliente
  * @return notificaciones Las notificaciones del Cliente
  */
  public ArrayList<String> getNotificaciones(){
    return notificaciones;
  }

  /**
  * Metodo que realiza un pedido con la lista de orden que ya hizo el cliente
  */
  public void hacerPedido(){
    this.sucursal.procesarPedido(this.pedido, this.id);
    this.pedido = new Integer[5];
    contadorPedido = 0;
  }

  /**
  * Metodo para asignarle su cuenta/tarjeta al cliente
  * @param cuenta La cuenta con la que pagara
  */
  public void setTarjeta(Payment cuenta){
    this.cuenta = cuenta;
  }

  /**
  * Metodo que devuelve el nombre del cliente
  * @return nombre El nombre del cliente
  */
  public String getNombre(){
    return nombre;
  }

  /**
  * Metodo que va agregando a su lista de pedidos tortas a traves de su identificador
  * @param idTorta El id de la tortta que se quiere agregar a la orden
  */
  public void pedir(int idTorta) throws Exception{
    if(contadorPedido == 5){
      throw new Exception("Pedido lleno");
    } else {
    this.pedido[contadorPedido] = idTorta;
    this.contadorPedido++;
    }
  }
}
