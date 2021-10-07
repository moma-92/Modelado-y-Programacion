/**
* Clase que define la forma de cobro de Spootify Premium
*/
public class CobroSpootifyPremium implements Cobro{

  /**
  * Metodo que realiza el cobro premium de Spootify
  * @param contrato El contrato del cliente al que se le cobrara
  */
  @Override public void cobrar(Contrato contrato){
    String n = "";
    if(contrato.getStatus() == true){
      if(contrato.getDia() > 0){
        if(contrato.getCliente().getSaldo()-4 >= 0){
          contrato.getCliente().setSaldo(contrato.getCliente().getSaldo()-4);
          n = contrato.getCliente().getNombre() + " paga $4 por el Spootify versión premium";
        }else{
          n = contrato.getCliente().getNombre() + " tiene saldo insuficiente para el cobro del servicio de Spootify";
          contrato.detenerContrato();
        }
      }
    }
    contrato.agregarNotificacion(n);
  }
}
