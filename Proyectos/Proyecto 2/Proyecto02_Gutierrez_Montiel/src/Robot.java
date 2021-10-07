/**
* Clase para el comportamiento del robot
*/
public class Robot{

  // El pedido del robot
  private Pedido pedido;
  // El tipo de robot
  private String tipo = "";
  // El estado actual del robot
  private EstadoRobot estadoActual;
  // El estado cocinando del robot
  private EstadoRobot cocinando;
  // El estado entregando del robot
  private EstadoRobot entregando;
  // El estado transportandose del robot
  private EstadoRobot transportandose;
  // El estado empaquetando del robot
  private EstadoRobot empaquetando;
  // El estado suspendido del robot
  private EstadoRobot suspendido;
  // Las llantas del robot
  private Llantas llantas;
  // Las herramientas con las que cuenta el robot
  private Herramientas herramientas;
  // La bateria del robot
  private Bateria bateria;

  /**
  * Constructor de la clase Robot, comienza en el estado suspendido
  * @param llantas Las llantas del Robot
  * @param herramientas Las herramientas del Robot
  * @param bateria La bateria del Robot
  */
  public Robot(RobotFabrica fabrica){
    llantas = fabrica.crearLlantas();
    herramientas = fabrica.crearHerramientas();
    bateria = fabrica.crearBateria();
    if(herramientas.tipo().equalsIgnoreCase("gps")){
      tipo = "repartidor";
    } else {
      tipo = "cocinero";
    }
    this.cocinando = new Cocinando(this);
    this.entregando = new Entregando(this);
    this.transportandose = new Transportandose(this);
    this.empaquetando = new Empaquetando(this);
    this.suspendido = new Suspendido(this);
    this.llantas = llantas;
    this.herramientas = herramientas;
    this.bateria = bateria;
    this.estadoActual = suspendido;
  }

  /**
  * Metodo para asignarle un pedido al robot
  * @param pedido El pedido que se asigna
  */
  public void setPedido(Pedido pedido){
    this.pedido = pedido;
  }

  /**
  * Metodo que devuelve el objeto Pedido
  * @return pedido El objeto Pedido
  */
  public Pedido getPedido(){
    return pedido;
  }

  /**
  * Metodo para activar al robot
  */
  public void activar(){
    estadoActual.activar();
  }

  /**
  * Metodo para que el robot cocine
  */
  public void cocinar(){
    Tortas[] tortas = pedido.getOrden();
    for(int i = 0; i < 5; i++){
      if(tortas[i] == null){
        break;
      } else {
        tortas[i].cocinarCarne();
        tortas[i].prepararPan();
        tortas[i].agregarComplementos();
        tortas[i].ponerCarneSobrePan();
        tortas[i].ponerExtrasSobreCarne();
        tortas[i].ponerTapa();
      }
    }
  }

  /**
  * Metodo para que empaque la comida
  */
  public void empaquetar(){
    this.estadoActual.empaquetar();
  }

  /**
  * Metodo para suspender al robot
  */
  public void suspender(){
    this.estadoActual.suspender();
  }

  /**
  * Metodo para transportarse
  */
  public void transportar(){
    this.estadoActual.transportar();
  }

  /**
  * Metodo para entregar la comida
  */
  public void entregar(){
    this.estadoActual.entregar();
    this.pedido.getCliente().addNotificaciones("Su pedido ya ha sido entregado");
    this.pedido = null;
  }

  /**
  * Metodo para asignar un nuevo estado actual
  * @param nuevoEstado El nuevo estado actual
  */
  public void setEstadoActual(EstadoRobot nuevoEstado){
    estadoActual = nuevoEstado;
  }

  /**
  * Metodo que devuelve el estado cocinando del Robot
  * @return cocinando El estado cocinando del Robot
  */
  public EstadoRobot getEstadoCocinando(){
    return cocinando;
  }

  /**
  * Metodo que devuelve el estado entregando del Robot
  * @return entregando El estado entregando del Robot
  */
  public EstadoRobot getEstadoEntregando(){
    return entregando;
  }

  /**
  * Metodo que devuelve el estado transportandose del Robot
  * @return transportandose El estado transportandose del Robot
  */
  public EstadoRobot getEstadoTransportandose(){
    return transportandose;
  }

  /**
  * Metodo que devuelve el estado empaquetando del Robot
  * @return empaquetando El estado empaquetandodel Robot
  */
  public EstadoRobot getEstadoEmpaquetando(){
    return  empaquetando;
  }

  /**
  * Metodo que devuelve el estado suspendido del Robot
  * @return suspendido El estado suspendido del Robot
  */
  public EstadoRobot getEstadoSuspendido(){
    return suspendido;
  }

  /**
  * Metodo que procesa la orden
  * @param pedido El pedido a cocinar
  */
  public void procesarOrden(Pedido pedido){
    setPedido(pedido);
    activar();
    empaquetar();
    this.pedido = null;
    suspender();
  }

  /**
  * Metodo que procesa el pedido
  * @param pedido El pedido a entregar
  */
  public void procesarPedido(Pedido pedido){
    setPedido(pedido);
    activar();
    transportar();
    entregar();
    transportar();
    suspender();
  }

  /**
  * Metodo que devuelve el tipo del Robot
  * @return tipo El tipo del Robot
  */
  public String getTipo(){
    return tipo;
  }
}
