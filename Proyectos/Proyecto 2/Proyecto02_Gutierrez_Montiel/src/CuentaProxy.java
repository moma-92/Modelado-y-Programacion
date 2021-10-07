import java.lang.Exception;

/**
* Clase proxy que protege la cuenta del usuario y solo otorga ciertos permisos a la sucursal a la que el cliente el esta suscrito
*/
public class CuentaProxy implements Payment{

  // La cuenta que protege
  private Payment cuenta;
  // El booleano que nos dice si es el usuario el que quiere ocuparla
  private boolean autenticar = false;

  public CuentaProxy(Payment cuenta){
    this.cuenta = cuenta;
  }

  /**
  * Metodo para obtener el saldo
  * @return saldo El saldo de la cuenta
  * @throws Exception En caso de que no seas un usario con permiso para depositar en la cuenta
  */
  @Override public int getSaldo() throws Exception{
    if(autenticar == false)
      throw new Exception("No tienes los permisos necesarios para ver el saldo de la cuenta");
    return cuenta.getSaldo();
  }

  /**
  * Metodo para depositar a la Cuenta
  * @param monto El monto a depositar
  * @throws Exception En caso de que no seas un usario con permiso para depositar en la cuenta
  */
  @Override public void depositar(int monto) throws Exception{
    if(autenticar == false)
      throw new Exception("No tienes los permisos necesarios para depositar a esta cuenta");
    cuenta.depositar(monto);
  }

  /**
  *
  */
  @Override public int getNIP() throws Exception{
    if(autenticar == false)
      throw new Exception("No tienes los permisos necesarios para conseguir el NIP de la cuenta");
    return cuenta.getNIP();
  }

  /**
  * Metodo para retirar dinero de la Cuenta
  * @param monto El monto a retirar
  * @throws Exception En caso de que no seas un usaurio con permiso para retirar dinero de la cuenta
  */
  @Override public void retirar(int monto) throws Exception{
    if(autenticar == false)
      throw new Exception("No tienes los permisos necesarios para retirar dinero de esta cuenta");
    cuenta.retirar(monto);
  }

  /**
  * Metodo para pagar
  * @param monto El monto a pagar
  * @param destinoPago La sucursal a la que se va a pagar
  */
  @Override public void pay(int monto, SucursalTortas destinoPago) throws Exception{
    cuenta.pay(monto, destinoPago);
  }

  /**
  * Metodo que autentica al usuario
  * @param nip El nip del Usuario
  * @throws Exception En cso de que el NIP sea incorrecto
  */
  @Override public void autenticar(int nip) throws Exception{
    if(nip != cuenta.getNIP())
      throw new Exception("NIP incorrecto, fallo la autenticacion");
    autenticar = true;
  }
}
