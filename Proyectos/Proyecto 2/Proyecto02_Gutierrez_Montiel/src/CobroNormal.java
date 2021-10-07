/**
*  Clase para calcular la cantidad que se debe cobrar en un dia Normal
*/
public class CobroNormal implements Cobro{

  /**
  * Metodo que calcula el precio que se debe cobrar por el pedido
  * @param pedido el pedido del que se va a calcular el precio
  * @return total El precio total del pedido
  */
  @Override public int cobrar(Pedido pedido){
    Tortas[] tortas = pedido.getOrden();
    int total = 0;
    int i = 0;
    do{
      total += tortas[i].getCosto();
      i++;
    } while(tortas[i] != null && i < 4);
    return total;
  }
}
