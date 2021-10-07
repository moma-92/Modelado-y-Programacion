/**
* Interfaz Sujeto para el patrón Observer
*/
public interface Sujeto{

  /**
  * Metodo para quitar contratos de la lista contratos de los Servicio
  * @param contrato El contrato que se va a eliminar
  */
  public void removeContrato(Contrato contrato);

  /**
  * Metodo para registrar un contrato a la lista de contratos de Servicio
  * @param contrato El contrato que se va a registrar en la lista
  */
  public void registrarContrato(Contrato contrato);

  /**
  * Metodo para notificar observador del patrón Observer
  */
  public void notificar();
}
