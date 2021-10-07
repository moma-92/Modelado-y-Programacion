/**
* Clase que define la forma de cobro de YuTube Premium
*/
public class CobroYuTubePremium implements Cobro{

  /**
  * Metodo que realiza el cobro premium de YuTube
  * @param contrato El contrato del cliente al que se le cobrara
  */
  @Override public void cobrar(Contrato contrato){
    String n = "";
    if(contrato.getStatus() == true){
      if(contrato.getDia() > 0){
        if(contrato.getCliente().getSaldo()-6 >= 0){
          contrato.getCliente().setSaldo(contrato.getCliente().getSaldo()-6);
          n = contrato.getCliente().getNombre() + " paga $6 por el YuTube versión premium";
        }else{
          n = contrato.getCliente().getNombre() + " tiene saldo insuficiente para el cobro del servicio de YuTube";
          contrato.detenerContrato();
        }
      }
    }
    contrato.agregarNotificacion(n);
  }
}
