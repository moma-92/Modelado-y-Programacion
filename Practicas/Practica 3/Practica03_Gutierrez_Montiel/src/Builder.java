/**
* Clase Builder responsable de crear los autos.
*/
public class Builder{

  /**
  * Metodo que crea el auto default 1
  */
  public Auto autodefault1(){
    Auto auto = new Auto();
    auto.addComponente(new LlantasSimples());
    auto.addComponente(new CarroceriaCasual());
    auto.addComponente(new MotorDiesel());
    auto.addComponente(new BlindajeSimple());
    auto.addComponente(new ArmasSierra());
    return auto;
  }

  /**
  * Metodo que crea el auto default 2
  */
  public Auto autodefault2(){
    Auto auto = new Auto();
    auto.addComponente(new LlantasDeportivas());
    auto.addComponente(new CarroceriaDeportiva());
    auto.addComponente(new MotorDeportivo());
    auto.addComponente(new BlindajeReforzado());
    auto.addComponente(new ArmasMetralleta());
    return auto;
  }

  /**
  * Metodo que crea el auto default 3
  */
  public Auto autodefault3(){
    Auto auto = new Auto();
    auto.addComponente(new LlantasOrugaDeTanque());
    auto.addComponente(new CarroceriaCamion());
    auto.addComponente(new MotorTurbo());
    auto.addComponente(new BlindajeTanque());
    auto.addComponente(new ArmasCaniones());
    return auto;
  }

  /**
  * Metodo que se encarga de construir un auto personalizado y recibe como parametros los numeros de las elecciones por componente
  * @param l cada numero corresponde a un tipo de llantas 1 simples, 2 deportivas, 3 off-road, 4 oruga de tanque
  * @param c cada numero corresponde a un tipo de carroceria 1 casual, 2 camion, 3 deportiva
  * @param m cada numero corresponde a un tipo de motor 1 diesel, 2 deportivo, 3 turbo
  * @param b cada numero corresponde a un tipo de blindaje 1 simple, 2 reforzado, 3 tanque
  * @param a cada numero corresponde a un tipo de arma 1 sierra, 2 arpones, 3 lanzallamas, 4 metralleta, 5 caniones
  */
  public Auto crearAuto(int l, int c, int m, int b, int a){
    Auto auto = new Auto();
    if(l == 1){
      auto.addComponente(new LlantasSimples());
    } else if(l == 2){
      auto.addComponente(new LlantasDeportivas());
    } else if(l == 3){
      auto.addComponente(new LlantasOffRoad());
    } else {
      auto.addComponente(new LlantasOrugaDeTanque());
    }
    if(c == 1){
      auto.addComponente(new CarroceriaCasual());
    } else if(c == 2){
      auto.addComponente(new CarroceriaCamion());
    } else {
      auto.addComponente(new CarroceriaDeportiva());
    }
    if(m == 1){
      auto.addComponente(new MotorDiesel());
    } else if(m == 2){
      auto.addComponente(new MotorDeportivo());
    } else {
      auto.addComponente(new MotorTurbo());
    }
    if(b == 1){
      auto.addComponente(new BlindajeSimple());
    } else if(b == 2){
      auto.addComponente(new BlindajeReforzado());
    } else {
      auto.addComponente(new BlindajeTanque());
    }
    if(a == 1){
      auto.addComponente(new ArmasSierra());
    } else if(a == 2){
      auto.addComponente(new ArmasArpones());
    } else if(a == 3){
      auto.addComponente(new ArmasLanzallamas());
    } else if(a == 4){
      auto.addComponente(new ArmasMetralleta());
    } else {
      auto.addComponente(new ArmasCaniones());
    }
    return auto;
  }
}
