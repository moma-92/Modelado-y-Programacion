/**
* Clase que define la segunda forma de cobro de Hammazon
*/
public class CobroHammazonDos implements Cobro{

  /**
  * Metodo que realiza la segunda forma de cobro de Hammazon
  * @param contrato El contrato del cliente al que se le cobrara
  */
  @Override public void cobrar(Contrato contrato){
    String n = "";
    if(contrato.getStatus() == true){
      if(contrato.getDia() > 0){
        if(contrato.getCliente().getSaldo()-13 >= 0){
          contrato.getCliente().setSaldo(contrato.getCliente().getSaldo()-13);
          n = contrato.getCliente().getNombre() + " paga $13 por el Hammazon versión premium";
        } else {
          n = contrato.getCliente().getNombre() + " tiene saldo insuficiente para el cobro del servicio de Hammazon";
          contrato.detenerContrato();
        }
      }
    }
    contrato.agregarNotificacion(n);
  }
}
