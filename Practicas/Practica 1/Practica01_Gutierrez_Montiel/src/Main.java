/**
*   @author: Gutiérrez Sánchez Claudia Itzel / Montiel Manriquez Ricardo.
*   @version 11 / 11 / 2020
*/

public class Main{

  public static void main(String[] args) {

    // Se crean todos los servicios con su respectivo nombre
    Servicio Netflis = new Servicio("Netflis");
    Servicio Twitsh = new Servicio("Twitsh");
    Servicio Spootify = new Servicio("Spootify");
    Servicio Hammazon = new Servicio("Hammazon");
    Servicio YuTube = new Servicio("YuTube");

    // A cada uno se le asigna el tipo de recomendacion correspondiente
    Netflis.setRecomendacionN();
    Spootify.setRecomendacionS();
    YuTube.setRecomendacionY();
    Hammazon.setRecomendacionH();
    Twitsh.setRecomendacionT();

    // Alicia
    Cliente alicia = new Cliente("Alicia", 500);
    // Contratos de alicia de Neflis
    Contrato aN = new Contrato(3, Netflis , alicia);
    // Contratos de alicia de Twitsh
    Contrato aT = new Contrato(2, Twitsh, alicia);
    // Contrato de alicia de Spootify
    Contrato aS = new Contrato(2, Spootify, alicia);
    // Contrato de alicia de Hammazon
    Contrato aH = new Contrato(2, Hammazon, alicia);
    // Contrato de alicia de Yutube
    Contrato aY = new Contrato(2, YuTube, alicia);

    // Bob
    Cliente bob = new Cliente("Bob", 70);
    // Contrato de bod de Netflis
    Contrato bN = new Contrato(3, Netflis, bob);
    // Contrato de bob de Twitsh
    Contrato bT = new Contrato(2, Twitsh, bob);
    // Contrato de bob de Spootify
    Contrato bS = new Contrato(2, Spootify, bob);
    // Contrato de bob de Hammazon
    Contrato bH = new Contrato(2, Hammazon, bob);
    // Contrato de bob de YuTube
    Contrato bY = new Contrato(2, YuTube, bob);

    // Cesar
    Cliente cesar = new Cliente("Cesar", 40);
    // Contrato de cesar de Spootify
    Contrato cS = new Contrato(2, Spootify, cesar);
    //Contrato de cesar de YuTube
    Contrato cY = new Contrato(1, YuTube, cesar);

    // Diego
    Cliente diego = new Cliente("Diego", 200);
    // Contrato de diego de Netflis
    Contrato dN = new Contrato(2, Netflis, diego);
    // Contrato de diego de Hammazon
    Contrato dH = new Contrato(2, Hammazon, diego);

    // Erika
    Cliente erika = new Cliente("Erika", 220);
    // Contrato erika de Netflis
    Contrato eN = new Contrato(3, Netflis, erika);
    // Contrato de erika de Twitsh
    Contrato eT = new Contrato(1, Twitsh, erika);
    // Contrato de erika de Spootify
    Contrato eS = new Contrato(1, Spootify, erika);
    // Contrato de erika de YuTube
    Contrato eY = new Contrato(1, YuTube, erika);

    // Simulacion Dia 1
    imprime("Dia uno:");
    imprime("\n");
    imprime("\n");
    Netflis.iniciarDia();
    Twitsh.iniciarDia();
    Spootify.iniciarDia();
    Hammazon.iniciarDia();
    YuTube.iniciarDia();

    imprime("\n");
    imprime("\n");

    // Simulacion Dia 2
    imprime("Dia dos:");
    imprime("\n");
    Contrato dT1 = new Contrato(1, Twitsh, diego);
    eS.subirDePlan();
    eY.subirDePlan();
    Netflis.iniciarDia();
    Twitsh.iniciarDia();
    Spootify.iniciarDia();
    Hammazon.iniciarDia();
    YuTube.iniciarDia();

    imprime("\n");
    imprime("\n");

    //Simulacion Dia 3
    imprime("Dia tres:");
    Contrato dS1 = new Contrato(1, Spootify, diego);
    dN.detenerContrato();
    eN.detenerContrato();
    Contrato eH = new Contrato(2, Hammazon, erika);
    eT.subirDePlan();
    Netflis.iniciarDia();
    Twitsh.iniciarDia();
    Spootify.iniciarDia();
    Hammazon.iniciarDia();
    YuTube.iniciarDia();

    imprime("\n");
    imprime("\n");

    // Simulacion Dia 4
    imprime("Dia cuatro:");
    imprime("\n");
    imprime("\n");
    dN.reiniciarContrato(3);
    Netflis.iniciarDia();
    Twitsh.iniciarDia();
    Spootify.iniciarDia();
    Hammazon.iniciarDia();
    YuTube.iniciarDia();

    imprime("\n");
    imprime("\n");

    //Simulacion Dia 5
    imprime("Dia cinco:");
    imprime("\n");
    imprime("\n");
    Netflis.iniciarDia();
    Twitsh.iniciarDia();
    Spootify.iniciarDia();
    Hammazon.iniciarDia();
    YuTube.iniciarDia();

  }

  // Metodo auxiliar para no escribir mucho
  public static void imprime(Object o){
    System.out.print(o);
  }
}
