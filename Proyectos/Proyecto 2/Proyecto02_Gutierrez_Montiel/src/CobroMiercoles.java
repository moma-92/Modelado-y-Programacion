/**
*  Clase para calcular la cantidad que se debe cobrar en un dia Miercoles
*/
public class CobroMiercoles implements Cobro{

  /**
  * Metodo para calcular el precio del pedido cuando es 5x3
  * @param pedido el pedido del que se va a calcular el precio
  * @return total El precio total del pedido
  */
  @Override public int cobrar(Pedido pedido){
    Tortas[] tortas = pedido.getOrden();
    int total = 0;
    boolean lleno = false;
    for(int i = 0; i < 5; i++){
      if(tortas[i] == null){
        break;
      } else {
        total += tortas[i].getCosto();
        if(i == 4){
          lleno = true;
        }
      }
    }
    if(lleno == true)
      total = tortas[2].getCosto() + tortas[3].getCosto() + tortas[4].getCosto();
    return total;
  }
}
