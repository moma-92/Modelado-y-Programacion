/**
* Interfaz sujeto del patron Observer
*/
public interface Sujeto{

  /**
  * Metodo para registrar un nuevo cliente
  */
  public void registrarCliente(Cliente cliente);

  /**
  * Metodo para quitar un cliente
  */
  public void removeCliente(Cliente cliente);

  /**
  * Metodo que hace el update de cada cliente
  */
  public void notificar();

}
