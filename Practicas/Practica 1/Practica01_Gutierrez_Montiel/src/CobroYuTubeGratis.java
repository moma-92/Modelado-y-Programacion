/**
* Clase para la primer forma de cobro de Youtube (Gratuita)
*/
public class CobroYuTubeGratis implements Cobro{

 /**
 * Metodo que hace un "cobro" al contrato
 * @param c El contrato del cliente al que se le cobrara
 */
  @Override public void cobrar(Contrato c){
    String n = "";
    if(c.getStatus() == true){
      n = c.getCliente().getNombre() + " estas suscrito a YuTube gratis";
    }
    c.agregarNotificacion(n);
  }
}
