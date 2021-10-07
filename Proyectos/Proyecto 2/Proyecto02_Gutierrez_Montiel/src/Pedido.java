/**
* Clase que ayuda a guardar y procesar pedidos
*/
public class Pedido{

  // Arreglo de tortas
  Tortas[] tortas = new Tortas[5];
  // Numero de pedido
  int pedido;
  // Cliente que realizo el pedido
  Cliente cliente;

  /**
  * Constructor de la clase pedido
  * @param tortas Arreglo de int de los identificadores de las tortas
  * @param numPedido El numero de pedido
  * @param cliente El cliente que hizo el pedido
  */
  public Pedido(Integer[] tortasP, int numPedido, Cliente cliente){
    this.pedido = numPedido;
    this.cliente = cliente;
    Tortas torta;
    for(int i = 0; i < 5; i++){
      if(tortasP[i] == null){
        break;
      } else{
        if(tortasP[i] == 1){
          torta = new CQ();
        }else if(tortasP[i] == 2){
          torta = new HQ();
        }else if(tortasP[i] == 3){
          torta = new JQ();
        }else if(tortasP[i] == 4){
          torta = new MQ();
        }else if(tortasP[i] == 5){
          torta = new PQ();
        }else if(tortasP[i] == 6){
          torta = new PRQ();
        }else if(tortasP[i] == 7){
          torta = new SQ();
        }else if(tortasP[i] == 8){
          torta = new Especial();
        }else if(tortasP[i] == 9){
          torta = new Pachuquenia();
        }else if(tortasP[i] == 10){
          torta = new Nortenia();
        }else if(tortasP[i] == 11){
          torta = new Toluquenia();
        }else if(tortasP[i] == 12){
          torta = new Lambada();
        }else if(tortasP[i] == 13){
          torta = new Negra();
        }else if(tortasP[i] == 14){
          torta = new Suiza();
        }else if(tortasP[i] == 15){
          torta = new Texana();
        }else if(tortasP[i] == 16){
          torta = new Hawaiana();
        }else if(tortasP[i] == 17){
          torta = new Milchori();
        }else{
          torta = new Rusa();
        }
        this.tortas[i] = torta;
      }
    }
  }

  /**
  * Metodo que te devuelve el arreglo de tortas que se pidieron
  * @return tortas El arreglo de tortas que se pidieron
  */
  public Tortas[] getOrden(){
    return tortas;
  }

  /**
  * Metodo que te devuelve la informacion del cliente que hizo este pedido
  * @param cliente El cliente que hizo el pedido
  */
  public Cliente getCliente(){
    return cliente;
  }

  /**
  * Metodo que devuelve toda la informacion del pedido
  * @return info La informacion del pedido
  */
  public String info(){
    String info = "El pedido es: ";
    for(int i = 0; i < 5; i++){
      if(tortas[i] == null){
        break;
      } else {
        info = info + "\n" + tortas[i].getNombre() + " con un precio de: " + tortas[i].getCosto();
      }
    }
    return info;
  }
}
