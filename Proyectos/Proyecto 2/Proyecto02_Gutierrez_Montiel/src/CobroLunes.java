/**
* Clase para calcular la cantiadad que se debe cobrar los lunes
*/
public class CobroLunes implements Cobro{

  /**
  * Metodo que calcula la cantidad que se debe de cobrar tomando en cuenta el descuento
  * @param pedido el pedido
  * @return total El precio total del pedido
  */
  @Override public int cobrar(Pedido pedido){
    Tortas[] tortas = pedido.getOrden();
    int total = 0;
    for(int i = 0; i < 5; i++){
      if(tortas[i] == null){
        break;
      } else {
        if(tortas[i].getID() < 8){
          total += tortas[i].getCosto()*.9;
        } else {
          total += tortas[i].getCosto();
        }
      }
    }
    return total;
  }
}
