/**
* Clase que define la primer forma de cobro de Spootify (Gratuita)
*/
public class CobroSpootifyGratis implements Cobro{

  /**
  * Metodo que realiza la primer forma de cobro de Spootify
  * @param contrato El contrato del cliente al que se le cobrara
  */
  @Override public void cobrar(Contrato c){
    String n = "";
    if(c.getStatus() == true){
      n = c.getCliente().getNombre() + " estas suscrito a Spootify gratis";
    }
    c.agregarNotificacion(n);
  }
}
