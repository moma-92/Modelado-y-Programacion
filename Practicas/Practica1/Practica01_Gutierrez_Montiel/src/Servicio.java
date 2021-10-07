import java.util.ArrayList;

/**
* Clase que define al servicio
*/
public class Servicio implements Sujeto{

  // EL nombre del servicio
  private String nombre;
  // Lista de contratos de ese servicio
  private ArrayList<Contrato> contratos;
  // Recomendacion del servicio
  private Recomendacion recomendacion;
  // Tipo de cobro del servicio
  private Cobro cobro;

/**
* Constructor del objeto Servicio
* @param nombre El nombre del servicio
*/
  public Servicio(String nombre){
    this.nombre = nombre;
    this.contratos = new ArrayList<Contrato>();
  }

  /**
  * Metodo que define el nombre del servicio
  * @param nombre El nombre del servicio
  */
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  /**
  * Metodo que regresa el nombre del servicio
  * @return nombre El nombre del servicio
  */
  public String getNombre(){
    return nombre;
  }

  /**
  * Metodo que define la lista de contratos del servicio
  * @param contratos La lista de contratos
  */
  public void setContratos(ArrayList<Contrato> contratos){
    this.contratos = contratos;
  }

  /**
  * Metodo que regresa la lista de contratos de los clientes
  * @return contratos La lista de contratos del servicio
  */
  public ArrayList<Contrato> getContratos(){
    return this.contratos;
  }

  /**
  * Metodo que define la recomendacion del servicio Neflis
  */
  public void setRecomendacionN(){
    recomendacion = new R_Netflis();
  }

  /**
  * Metodo que define la recomendacion del servicio Spootify
  */
  public void setRecomendacionS(){
    recomendacion = new R_Spootify();
  }

  /**
  * Metodo que define la recomendacion del servicio YuTube
  */
  public void setRecomendacionY(){
    recomendacion = new R_YuTube();
  }

  /**
  * Metodo que define la recomendacion del servicio Hammazon
  */
  public void setRecomendacionH(){
    recomendacion = new R_Hammazon();
  }

  /**
  * Metodo que define la recomendacion del servicio Twitsh
  */
  public void setRecomendacionT(){
    recomendacion = new R_Twitsh();
  }

  /**
  * Metodo que regresa el tipo de Recomendación
  * @return recomendacion el tipo de Recomendacion
  */
  public Recomendacion getRecomendacion(){
    return recomendacion;
  }

  /**
  * Metodo que define el cobro al cliente
  * @param cobro El cobro al cliente
  */
  public void setCobro(Cobro cobro){
    this.cobro = cobro;
  }

  /**
  * Metodo que asigna el cobro 1 a Netflis
  */
  public void asignarCobroN1(){
    this.cobro = new CobroNetflisUno();
  }

  /**
  * Metodo que asigna el cobro 2 a Netflis
  */
  public void asignarCobroN2(){
    this.cobro = new CobroNetflisDos();
  }

  /**
  * Metodo que asigna el cobro 3 a Netflis
  */
  public void asignarCobroN3(){
    this.cobro = new CobroNetflisTres();
  }

  /**
  * Metodo que asigna el cobro 1 a Hammazon
  */
  public void asignarCobroH1(){
    this.cobro = new CobroHammazonUno();
  }

  /**
  * Metodo que asigna el cobro 2 a Hammazon
  */
  public void asignarCobroH2(){
    this.cobro = new CobroHammazonDos();
  }

  /**
  * Metodo que define el cobro 1 a Spootify
  */
  public void asignarCobroS1(){
    this.cobro = new CobroSpootifyGratis();
  }

  /**
  * Metodo que define el cobro 2 a Spootify
  */
  public void asignarCobroS2(){
    this.cobro = new CobroSpootifyPremium();
  }

  /**
  * Metodo que define el cobro  1 a Twitsh
  */
  public void asignarCobroT1(){
    this.cobro = new CobroTwitshUno();
  }

  /**
  * Metodo que define el cobro 2 a Twitsh
  */
  public void asignarCobroT2(){
    this.cobro = new CobroTwitshDos();
  }

  /**
  * Metodo que define el cobro 2 a YuTube
  */
  public void asignarCobroY1(){
    this.cobro = new CobroYuTubeGratis();
  }

  /**
  * Metodo que define el cobro 1 a YuTube
  */
  public void asignarCobroY2(){
    this.cobro = new CobroYuTubePremium();
  }

  /**
  * Metodo para iniciar la ejecucion de los cobros y recomendaciones del dia
  */
  public void iniciarDia(){
    for(Contrato c : contratos){
      if(getNombre() == "Netflis"){
        if(c.getPlan() == 1){
          asignarCobroN1();
        } else if(c.getPlan() == 2){
          asignarCobroN2();
        } else {
          asignarCobroN3();
        }
      } else if(getNombre() == "Hammazon"){
        if(c.getPlan() == 1){
          asignarCobroH1();
        } else {
          asignarCobroH2();
        }
      } else if(getNombre() == "Spootify"){
        if(c.getPlan() == 2){
          asignarCobroS2();
        } else{
          asignarCobroS1();
        }
      } else if(getNombre() == "YuTube"){
        if(c.getPlan() == 2){
          asignarCobroY2();
        } else {
          asignarCobroY1();
        }
      } else if(getNombre() == "Twitsh"){
        if(c.getPlan() == 1){
          asignarCobroT1();
        } else {
          asignarCobroT2();
        }
      }
      cobrar(c);
      c.agregarDia();
    }
    notificar();
  }

  /**
  * Metodo que registra un contrato nuevo o incluso un contrato reiniciado
  * @param contrato El contrato a registrar
  */
  public void registrarContrato(Contrato contrato){
    this.contratos.add(contrato);
  }

  /**
  * Metodo que elimina un contrato de la lista contratos
  * @param contrato El contrato a eliminar
  */
  public void removeContrato(Contrato contrato){
    this.contratos.remove(contrato);
  }

  /**
  * Metodo que devuelve una recomendacion
  * @param dia el dia con el que se hara la recomendacion
  * @return String Mensaje con la recomendacion del dia
  */
  public String recomendar(int dia){
    return this.recomendacion.recomendar(dia);
  }

  /**
  * Metodo que realiza el cobro
  * @param c Contrato al que se le cobrara
  */
  public void cobrar(Contrato c){
    cobro.cobrar(c);
  }

  /**
  * Metodo que hace el update de cada contrato
  */
  public void notificar(){
    for(Contrato c : contratos){
      c.update();
    }
  }
}
