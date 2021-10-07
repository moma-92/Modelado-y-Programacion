/**
* Clase que define el  Dispositivo de cobro
*/
public class DispositivoDeCobro{

  // El proxy
  private Payment proxy;

  /**
  * Metodo que define al Dispositivo de Cobro
  * @param cliente El cliente a cobrar
  */
  public DispositivoDeCobro(Cliente cliente){
    proxy = new CuentaProxy(cliente.getTarjeta());
  }

  /**
  * Metodo realiza el Cobro
  * @param monto El monto a cobrar
  * @param sucursal La sucursal a la que se le cobrara
  */
  public boolean cobrar(int monto, SucursalTortas sucursal){
    try{
      proxy.pay(monto, sucursal);
    } catch (Exception e){
      return false;
    }
    return true;
  }
}
