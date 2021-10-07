/**
* Clase que define la segunda forma de cobro de Twitsh
*/
public class CobroTwitshDos implements Cobro{

  /**
  * Metodo que realiza la segunda forma de cobro de Twitsh
  * @param contrato El contrato del cliente al que se le cobrara
  */
  @Override public void cobrar(Contrato contrato){
    String n = "";
    if(contrato.getStatus() == true){
      if(contrato.getDia() > 0){
        if(contrato.getCliente().getSaldo()-10 >= 0){
          contrato.getCliente().setSaldo(contrato.getCliente().getSaldo() -10);
          n = contrato.getCliente().getNombre() + " paga $10 por Twitsh versión premium";
        } else {
          n = contrato.getCliente().getNombre() + " tiene saldo insuficiente para el cobro del servicio de Twitsh";
          contrato.detenerContrato();
        }
      }
    }
    contrato.agregarNotificacion(n);
  }
}
