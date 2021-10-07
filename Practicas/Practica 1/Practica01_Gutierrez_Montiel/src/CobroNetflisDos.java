/**
* Clase que define la segunda forma de cobro de Netflis
*/
public class CobroNetflisDos implements Cobro{

  /**
  * Metodo que realiza la segunda forma de cobro de Neflis
  * @param contrato El contrato del cliente al que se le cobrara
  */
  @Override public void cobrar(Contrato contrato){
    String n = "";
    if(contrato.getStatus() == true){
      if(contrato.getDia() > 0){
        if(contrato.getCliente().getSaldo()-10 >= 0){
          contrato.getCliente().setSaldo(contrato.getCliente().getSaldo()-10);
          n = contrato.getCliente().getNombre() + " paga $10 por el Netflis para 2 diapositivo";
        } else {
          n = contrato.getCliente().getNombre() + " tiene saldo insuficiente para el cobro del servicio de Netflis";
          contrato.detenerContrato();
        }
      }
    }
    contrato.agregarNotificacion(n);
  }
}
