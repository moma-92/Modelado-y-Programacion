/**
* Clase que se encarga de crear robots ocupando distintas fabricas
*/
public class FactoryProducer{

  /**
  * Metodo que devuelve un robot dependiendo del tipo que se le pida y la fabrica que se use
  * @param tipo El tipo de robot que se quiere crear
  * @return robot El robot que se creo con la fabrica correspondiente
  */
  public Robot setFabrica(String tipo){
    RobotFabrica fabrica;
    if(tipo.equalsIgnoreCase("cocinero")){
      fabrica  = new RobotCocineroFabrica();
      return new Robot(fabrica);
    } else if(tipo.equalsIgnoreCase("repartidor")){
      fabrica =  new RobotRepartidorFabrica();
      return new Robot(fabrica);
    }
    return null;
  }
}
