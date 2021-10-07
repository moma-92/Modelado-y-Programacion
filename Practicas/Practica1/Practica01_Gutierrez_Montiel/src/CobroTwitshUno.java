/**
* Clase que define la primera forma de cobro de Twitsh
*/
public class CobroTwitshUno implements Cobro{

  /**
  * Metodo que realiza la primera forma de cobro de Twitsh
  * @param contrato El contrato del cliente al que se le cobrara
  */
  @Override public void cobrar(Contrato contrato){
    String n = "";
    if(contrato.getStatus() == true){
      if(contrato.getDia() > 0){
        if(contrato.getCliente().getSaldo()-6 >= 0){
          contrato.getCliente().setSaldo(contrato.getCliente().getSaldo()-6);
          n = contrato.getCliente().getNombre() + " paga $6 por el Twitsh versión normal";
        }else{
          n = contrato.getCliente().getNombre() + " tiene saldo insuficiente para el cobro del servicio de Twitsh";
          contrato.detenerContrato();
        }
      }
    }
    contrato.agregarNotificacion(n);
  }
}
