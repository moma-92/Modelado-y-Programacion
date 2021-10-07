/**
* Clase que define la primer forma de cobro de Netflis
*/
public class CobroNetflisUno implements Cobro{

  /**
  * Metodo que realiza la primera forma de cobro de Netflis
  * @param contrato El contrato del cliente al que se le cobrara
  */
  @Override public void cobrar(Contrato contrato){
    String n = "";
    if(contrato.getStatus() == true){
      if(contrato.getDia() > 0){
        if(contrato.getCliente().getSaldo()-7 >= 0){
          contrato.getCliente().setSaldo(contrato.getCliente().getSaldo()-7);
          n = contrato.getCliente().getNombre() + " paga $7 por el Netflis para 1 diapositivo";
        } else {
          n = contrato.getCliente().getNombre() + " tiene saldo insuficiente para el cobro del servicio de Netflis";
          contrato.detenerContrato();
        }
      }
    }
    contrato.agregarNotificacion(n);
    }
}
