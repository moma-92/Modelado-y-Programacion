import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
* Clase para la sucursal de Tortas
*/
public class SucursalTortas implements Sujeto{
  // La lista del personal de la Sucursal
  private List<Robot> personal;
  // La lista de los clientes de la Sucursal
  private ArrayList<Cliente> clientes;
  // La notificacion
  private String notificacion = "";
  // La caja
  private int caja;
  // La lista de las Tortas de la Sucursal
  private List<Tortas> menuTortas;
  // El contador de los pedidos
  private int contadorPedidos;
  // El dia
  private String dia = "";
  // El tipo de cobro dependiendo del dia
  private Cobro cobro;
  // Dispositivo de Cobro
  private DispositivoDeCobro dispositivoDeCobro;

  /**
  * Define la caja y el personal de la Sucursal
  * @param caja La caja de la Sucursal
  * @param personal La lista del personal de la Sucursal
  */
  public SucursalTortas(int caja, List<Robot> personal){
    this.personal = personal;
    this.clientes = new ArrayList<Cliente>();
    this.contadorPedidos = 0;
    this.caja = caja;
    Tortas cq = new CQ();
    Tortas hq = new HQ();
    Tortas jq = new JQ();
    Tortas mq = new MQ();
    Tortas pq = new PQ();
    Tortas prq = new PRQ();
    Tortas sq = new SQ();
    Tortas especial = new Especial();
    Tortas pachuquenia = new Pachuquenia();
    Tortas nortenia = new Nortenia();
    Tortas toluquenia = new Toluquenia();
    Tortas lambada = new Lambada();
    Tortas negra = new Negra();
    Tortas suiza = new Suiza();
    Tortas texana = new Texana();
    Tortas hawaiana = new Hawaiana();
    Tortas milchori = new Milchori();
    Tortas rusa = new Rusa();
    menuTortas = new ArrayList<Tortas>(Arrays.asList(cq, hq, jq, mq, pq, prq, sq, especial, pachuquenia, nortenia,
                                                     toluquenia, lambada, negra, suiza, texana, hawaiana, milchori, rusa));
  }

  /**
  * Metodo para agregar a un cliente
  * @param cliente El cliente que se va a agregar
  */
  public void registrarCliente(Cliente cliente){
    clientes.add(cliente);
  }

  /**
  * Metodo para quitar a un cliente
  * @param cliente El cliente a quitar
  */
  public void removeCliente(Cliente cliente){
    clientes.remove(cliente);
  }

  /**
  * Metodo para agregar notificaciones al cliente
  */
  public void notificar(){
    for(Cliente c : clientes){
      c.update();
    }
  }

  /**
  * Metodo para cobrarle a un cliente
  * @param pedido El pedido a cobrar
  * @param cliente El cliente al que se le va a cobrar
  */
  public boolean cobrar(Pedido pedido, Cliente cliente){
    int cantidadACobrar = this.cobro.cobrar(pedido);
    cliente.addNotificaciones(cliente.getNombre() + " has realizado un pedido \n" + pedido.info() + "\nEl precio total con descuento es: $" + cantidadACobrar);
    dispositivoDeCobro = new DispositivoDeCobro(cliente);
    return dispositivoDeCobro.cobrar(cantidadACobrar, this);
  }

  /**
  * Metodo para agregar a un robot nuevo al personal
  * @param robot El robot que se agregara
  */
  public void agregarPersonal(Robot robot){
    personal.add(robot);
}
  /**
  * Metodo que devuelve a un robot cocinero que no esta ocupado
  * @return robot el robot cocinero
  */
  public Robot getCocinero(){
    for(int i = 0; i < personal.size(); i++){
      if(personal.get(i).getTipo() == "cocinero"){
        return personal.get(i);
      }
    }
    return null;
  }

  /**
  * Metodo que nos devuelve a un cliente deprendiendo de su id
  * @param idCliente El id del Cliente que queremos buscar
  */
  public Cliente getCliente(int idCliente){
    for(int i = 0; i < clientes.size(); i++){
      if(clientes.get(i).getID() == idCliente){
        return clientes.get(i);
      }
    }
    return null;
  }

  /**
  * Metodo que devuelve a un robot repartidor que no esta ocupado
  * @return robot el robot repartidor
  */
  public Robot getRepartidor(){
    for(int i = 0; i < personal.size(); i++){
      if(personal.get(i).getTipo() == "repartidor"){
        return personal.get(i);
      }
    }
    return null;
  }

    /**
    * Metodo que asigna un tipo de cobro diferente dependiendo del dia
    */
    public void setCobro(){
      if(this.dia == "LUNES"){
        this.cobro = new CobroLunes();
      } else if(this.dia == "MIERCOLES"){
        this.cobro = new CobroMiercoles();
      } else if(this.dia == "VIERNES"){
        this.cobro = new CobroViernes();
      } else {
        this.cobro = new CobroNormal();
      }
    }
  /**
  * Metodo que procesa la orden y decide si se lleva a cabo o no la comica
  * @param pedido Arreglo de los id de las tortas que se quieren
  * @param idCliente ID del cliente que esta hacindo el pedido
  */
  public void procesarPedido(Integer[] pedidoT, int idCliente){
    Pedido pedido = new Pedido(pedidoT, contadorPedidos, getCliente(idCliente));
    System.out.println(pedido.info());
    setCobro();
    if(cobrar(pedido, getCliente(idCliente)) == true){
        getCocinero().procesarOrden(pedido);
        getRepartidor().procesarPedido(pedido);
        contadorPedidos++;
    } else {
      getCliente(idCliente).addNotificaciones("Debido a un fallo con el pago, su pedido sera cancelado");
      System.out.println("No se pudo llevar a cabo la orden");
    }
  }

  /**
  * Metodo que regresa un descuento distinto dependiendo del día
  */
  public String descuento(){
    if(this.dia == "LUNES"){
      return "Los lunes hay 10% de descuento en tortas sencillas(Jamon con Quesillo, Chorizo con Quesillo, Milanesa con Quesillo, etc.)";
    } else if(this.dia == "MIERCOLES"){
      return "Hoy hay 5x3 en todas nuestras tortas";
    } else if(this.dia == "VIERNES"){
      return "Los viernes hay 10% de descuento en todas nuestras especialidades (Rusa, Milchori, Hawaiana,etc.)";
    }
    return "";
  }


  /**
  * Metodo para hacer cambio de día
  * @param dia El dia en mayúsculas que es de la semana
  */
  public void setDia(String dia){
    this.dia = dia;
  }

  /**
  * Metodo para agregar dinero a la caja
  * @param monto El monto a agregar
  */
  public void agregarACaja(int monto){
    caja += monto;
  }
}
