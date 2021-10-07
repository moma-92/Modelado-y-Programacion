/*
* Interfaz que define la cantidad que se debe cobrar dependiendo de lo que haya en el pedido
*/
public interface Cobro{

  /**
  * Metodo para calcular el precio del pedido cuando es 5x3
  * @param pedido el pedido
  * @return total El precio total del pedido
  */
  public int cobrar(Pedido pedido);
}
