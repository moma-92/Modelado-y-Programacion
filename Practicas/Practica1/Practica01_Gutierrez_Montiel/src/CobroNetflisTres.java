/**
* Clase que define la tercera forma de cobro de Neflis
*/
public class CobroNetflisTres implements Cobro{

  /**
  * Metodo que realiza la tercera forma de cobro de Netflis
  * @param contrato El contrato del cliente al que se le cobrara
  */
  @Override public void cobrar(Contrato contrato){
    String n = "";
    if(contrato.getStatus() == true){
      if(contrato.getDia() > 0){
        if(contrato.getCliente().getSaldo()-15 >= 0){
          contrato.getCliente().setSaldo(contrato.getCliente().getSaldo()-15);
          n = contrato.getCliente().getNombre() + " paga $15 por el Netflis para 4 diapositivo";
        } else {
          n = contrato.getCliente().getNombre() + " tiene saldo insuficiente para el cobro del servicio de Netflis";
          contrato.detenerContrato();
        }
      }
    }
    contrato.agregarNotificacion(n);
    }
}
