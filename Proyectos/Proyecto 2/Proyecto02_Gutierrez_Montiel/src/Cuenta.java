import java.lang.Exception;

/**
* Clase que define la Cuenta del Cliente
*/
public class Cuenta implements Payment{

  // El saldo de la Cuenta
  private int saldo;
  //  El NIP de la Cuenta
  private int nip;
  //  El dueño de la Cuenta
  private String duenio = "";

  /**
  * Constructor de la Cuenta
  * @param saldo El saldo de la Cuenta
  * @param nip EL NIP de la Cuenta
  * @param duenio El dueño de la Cuenta
  */
  public Cuenta(int saldo, int nip, String duenio){
    this.saldo = saldo;
    this.nip = nip;
    this.duenio = duenio;
  }

  /**
  * Metodo que regresa el el Saldo de la Cuenta
  * @return saldo El saldo de la Cuenta
  */
  @Override public int getSaldo(){
    return saldo;
  }

  /**
  * Metodo que devuelve el nip de la cuenta
  * @return nip El nip de la cuenta
  */
  public int getNIP(){
    return nip;
  }

  /**
  * Metodo para que le puedan depositar mas dinero a la Cuenta
  * @param monto El monto que se agrega a el saldo de la Cuenta
  */
  @Override public void depositar(int monto){
    saldo += monto;
  }

  /**
  * Metodo para retirar dinero de la Cuenta
  * @param monto El monto que se va a retirar
  * @throws Exception En caso de que el saldo sea insuficiente
  */
  @Override public void retirar(int monto) throws Exception{
    if(saldo - monto < 0)
      throw new Exception("Saldo insuficiente");
    saldo -= monto;
  }

  /**
  * Metodo para pagar de la Cuenta
  * @param monto El monto que se a pagar
  * @param destinoPago El destino del pago
  * @throws Exception En caso de que el saldo sea insuficiente
  */
  @Override public void pay(int monto, SucursalTortas destinoPago) throws Exception{
    if(saldo - monto < 0)
      throw new Exception("Saldo insuficiente");
    saldo -= monto;
    destinoPago.agregarACaja(monto);
  }
  /**
  * Metodo para autenticar al usuario
  * @param nip El nip de la cuenta
  */
  @Override public void autenticar(int nip){

  }
}
