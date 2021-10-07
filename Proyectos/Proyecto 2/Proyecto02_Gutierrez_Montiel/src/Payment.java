/**
* Interfaz para la forma de pago
*/
public interface Payment{

  /**
  * Metodo que te devuelve el saldo
  */
  public int getSaldo() throws Exception;

  /**
  * Metodo que devuelve el NIP de la Cuenta
  */
  public int getNIP() throws Exception;

  /**
  * Metodo para depositar
  */
  public void depositar(int monto) throws Exception;

  /**
  * Metodo para retirar
  */
  public void retirar(int monto) throws Exception;

  /**
  * Metodo para pagar
  */
  public void pay(int monto, SucursalTortas destinoPago) throws Exception;

  /**
  * Metodo para autenticar al duenio
  */
  public void autenticar(int NIP) throws Exception;

}
