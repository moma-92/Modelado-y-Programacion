/**
* Clase que define la primera forma de cobro de Hammazon
*/
public class CobroHammazonUno implements Cobro{

  /**
  * Metodo que realiza la primera forma de cobro de Hammazon
  * @param contrato El contrato del cliente al que se le cobrara
  */
  @Override public void cobrar(Contrato contrato){
    String n = "";
    if(contrato.getStatus() == true){
      if(contrato.getDia() > 0){
        if(contrato.getCliente().getSaldo()-7 >= 0){
          contrato.getCliente().setSaldo(contrato.getCliente().getSaldo()-7);
          n = contrato.getCliente().getNombre() + " paga $7 por el Hammazon versión de usuario normal";
        }else{
          n = contrato.getCliente().getNombre() + " tiene saldo insuficiente para el cobro del servicio de Hammazon";
          contrato.detenerContrato();
        }
      }
    }
    contrato.agregarNotificacion(n);
  }
}
