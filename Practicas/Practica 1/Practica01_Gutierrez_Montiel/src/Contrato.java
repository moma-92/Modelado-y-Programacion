import java.util.ArrayList;
import java.util.List;
import java.lang.RuntimeException;

/**
* Clase que define el contrato del cliente
*/
public class Contrato implements Observador{

  // El tipo de servicio
  private Servicio servicio;
  // El dia del contrato
  private int dia;
  // El status del contrato
  private boolean status;
  // El plan del cliente
  private int plan;
  // El cliente
  private Cliente cliente;
  // La lista de las notificaciones del cliente
  private ArrayList<String> notificaciones;

  /**
  * Define el estado inicial del contrato del cliente
  * @param plan El plan de el contrato
  * @param servicio El servicio de el contrato
  * @param cliente El cliente de el contrato
  */
  public Contrato(int plan, Servicio servicio, Cliente cliente){
    this.servicio = servicio;
    this.dia = 0;
    this.status = true;
    this.plan = plan;
    this.cliente = cliente;
    this.servicio.registrarContrato(this);
    this.cliente.agregarContrato(this);
    this.notificaciones = new ArrayList<String>();
    notificaciones.add("Bienvenido a " + servicio.getNombre() + " " + cliente.getNombre());
    System.out.println();
  }

  /**
  * Metodo que reinicia el contrato
  * @throws RuntimeException cuando el contrato sigue vigente
  * @param plan El tipo del plan con el que se reinicia el contrato
  */
  public void reiniciarContrato(int plan){
    if(this.status == true)
          throw new RuntimeException("Su contrato sigue vigente");
    this.status = true;
    this.dia = 1;
    this.plan = plan;
    notificaciones.add("Bienvenido de vuelta " + cliente.getNombre() + " a " + servicio.getNombre());

  }

  /**
  * Metodo que reinicia el contrato (version sin parametros necesarios)
  * @throws RuntimeException cuando el contrato a reiniciar sigue vigente
  */
  public void reiniciarContrato(){
    if(this.status == true)
          throw new RuntimeException("Su contrato sigue vigente");
    this.status = true;
    this.dia = 1;
    notificaciones.add("Bienvenido de vuelta " + cliente.getNombre() + " a " + servicio.getNombre());
  }
  /**
  * Metodo que detiene el contrato
  * @throws RuntimeException cuando el contrato sigue vigente
  */
  public void detenerContrato(){
    if(this.status == false)
          throw new RuntimeException("Su contrato ya no esta vigente");
    this.status = false;
    notificaciones.add("Lamentamos que dejes el servicio de "+ servicio.getNombre() +" "+ cliente.getNombre());
  }

  /**
  * Metodo para definir el servicio del cliente
  * @param servicio El servicio otorgado al cliente
  */
  public void setServicio(Servicio servicio){
    this.servicio = servicio;
  }

  /**
  * Metodo para agregar un dia al contrato
  */
  public void agregarDia(){
    this.dia = dia+1;
  }

  /**
  * Metodo que define el dia del contrato del cliente
  * @param dia El numero del dia del contrato del Cliente
  */
  public void setDia(int dia){
    this.dia = dia;
  }

  /**
  * Metodo que define el status del servicio del cliente, true si esta vigente, false si no lo esta
  * @param status El status que se definira
  */
  public void setStatus(boolean status){
    this.status = status;
  }

  /**
  * Metodo que define la lista de notificaciones
  * @param n La lista con la que se definira
  */
  public void setNotificaciones(ArrayList<String> n){
    notificaciones =  new ArrayList<String>(n);
  }

  /**
  * Metodo que define el plan del cliente
  * @param plan El plan a definir
  */
  public void setPlan(int plan){
    this.plan = plan;
  }

  /**
  * Metodo que define el cliente
  * @param cliente El cliente del servicio
  */
  public void setCliente(Cliente cliente){
    this.cliente = cliente;
  }

  /**
  * Metodo que regresa el servicio del contrato
  * @return servicio El servicio de este contrato
  */
  public Servicio getServicio(){
    return servicio;
  }

  /**
  * Metodo que regresa el dia del contrato del cliente
  * @return dia El dia del contrato del cliente
  */
  public int getDia(){
    return dia;
  }

  /**
  * Metodo que regresa el status del contrato del cliente
  * @return status El status del contrato
  */
  public boolean getStatus(){
    return status;
  }

  /**
  * Metodo que regresa el plan del contrato del cliente
  * @return plan El plan del contrato del cliente
  */
  public int getPlan(){
    return plan;
  }

  /**
  * Metodo que regresa el cliente del contrato
  * @return cliente El cliente del contrato
  */
  public Cliente getCliente(){
    return cliente;
  }

  /**
  * Metodo que regresa las notificaciones al cliente
  * @return notificaciones La lista de las notificaciones al cliente
  */
  public ArrayList<String> getNotificaciones(){
    return notificaciones;
  }

  /**
  * Metodo que agrega notificaciones a la lista de notificaciones del cliente
  * @param n La notificacion que se agregara a la lista
  */
  public void agregarNotificacion(String n){
    notificaciones.add(n);
  }


  /**
  * Metodo para bajar de plan
  * @throws RuntimeException cuando ya se esta en el plan mas bajo
  */
  public void bajarDePlan(){
    if(plan == 1)
          throw new RuntimeException("Se encuentra en el plan mas bajo");
    this.plan = 1;
  }

  /***
  * Metodo para subir de plan
  * @throws RuntimeException cuando ya se esta en el plan mas alto
  */
  public void subirDePlan(){
    if(this.servicio.getNombre()== "Netflis"){
      if(plan == 3)
          throw new RuntimeException("Se encuentra en el plan mas alto");
      this.plan = plan + 1;
    }else{
      if(plan == 2)
          throw new RuntimeException("Se encuentra en el plan mas alto");
      this.plan = 2;
    }
  }

  /**
  * Metodo para imprimir las notificaciones en la pantalla
  */
  public void mostrarNotificaciones(){
  System.out.println(notificaciones.toString());
  }

  /**
  * Metodo update del patron Observer, actualiza las notificaciones y las muestra
  */
  @Override public void update(){
    if(status == true)
      notificaciones.add(this.servicio.recomendar(this.dia)+ " " + cliente.getNombre());
    mostrarNotificaciones();
    notificaciones.clear();
  }
}
