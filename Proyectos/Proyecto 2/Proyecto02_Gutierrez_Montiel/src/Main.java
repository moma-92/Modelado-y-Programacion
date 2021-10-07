import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main{

  //Robots
  public static FactoryProducer factoryProducer = new FactoryProducer();
  public static Robot robotC1 = factoryProducer.setFabrica("cocinero");
  public static Robot robotR1 = factoryProducer.setFabrica("repartidor");
  //Sucursal
  public static List<Robot> personal = new ArrayList<Robot>() {{add(robotC1); add(robotR1); }};
  public static SucursalTortas sucursal = new SucursalTortas(10000, personal);
  //Cliente y cuenta 1
  public static Payment cuenta1 = new Cuenta(380, 123456, "Clara Gonzalez");
  public static Cliente cliente1 = new Cliente("Clara Gonzalez", 1, cuenta1, "Fuente de la vida #32", sucursal);
  //Cliente y cuenta 2
  public static Payment cuenta2 = new Cuenta(69, 654321, "Miguel Garcia");
  public static Cliente cliente2 = new Cliente("Miguel Garcia", 2, cuenta2, "Corunia #10", sucursal);
  //Cliente y cuenta 3
  public static Payment cuenta3 = new Cuenta(753, 569119, "Carlos Martinez");
  public static Cliente cliente3 = new Cliente("Carlos Martinez", 3, cuenta3, "Acequia #75", sucursal);
  //Cliente y cuenta 4
  public static Payment cuenta4 = new Cuenta(224, 954831, "Regina Garcia");
  public static Cliente cliente4 = new Cliente("Regina Garcia", 4, cuenta4, "Tetzontlate #1", sucursal);
  //Cliente y cuenta 5
  public  static Payment cuenta5 = new Cuenta(794, 408241, "Luis Heragui");
  public static Cliente cliente5 = new Cliente("Luis Heragui", 5, cuenta5, "La otra banda #123", sucursal);
  //Cliente y cuenta 6
  public static Payment cuenta6 = new Cuenta(895, 453822, "Diego Rios");
  public static Cliente cliente6 = new Cliente("Diego Rios", 6, cuenta6, "Piedra del Comal, #26", sucursal);
  //Cliente y cuenta 7
  public static Payment cuenta7 = new Cuenta(563, 571693, "Ricardo Montiel");
  public static Cliente cliente7 = new Cliente("Ricardo Montiel", 7, cuenta7, "Balcon de los edecanes #47", sucursal);
  //Cliente y cuenta 8
  public static Payment cuenta8 = new Cuenta(799, 697968, "Ricardo Salvador");
  public static Cliente cliente8 = new Cliente("Ricardo Slavador", 8, cuenta8, "Rayando el Sol #80", sucursal);
  //Cliente y cuenta 9
  public static Payment cuenta9 = new Cuenta(696, 158642, "Rosa Victoria");
  public static Cliente cliente9 = new Cliente("Rosa Victoria", 9, cuenta9, "Maremoto #66", sucursal);
  //Cliente y cuenta 10
  public static Payment cuenta10 = new Cuenta(116, 536058, "Arturo Lemus");
  public static Cliente cliente10 = new Cliente("Arturo Lemus", 10, cuenta10, "Barranca del Muerto #66", sucursal);
  //Cliente y cuenta 11
  public static Payment cuenta11 = new Cuenta(686, 540401, "Fernando Altamirano");
  public static Cliente cliente11 = new Cliente("Fernando Altamirano", 11, cuenta11, "Salsipuedes #33", sucursal);
  //Cliente y cuenta 12
  public static Payment cuenta12 = new Cuenta(133, 681041, "Zaide Aguilar");
  public static Cliente cliente12 = new Cliente("Zaide Aguilar", 12, cuenta12, "Mar de la Crisis #75", sucursal);
  //Cliente y cuenta 13
  public static Payment cuenta13 = new Cuenta(947, 222204, "Dapfne Miranda");
  public static Cliente cliente13 = new Cliente("Dapfne Miranda", 13, cuenta13, "Lago de la Muerte #13", sucursal);
  //Cliente y cuenta 14
  public static Payment cuenta14 = new Cuenta(823, 863056, "Alejandra Mercader");
  public static Cliente cliente14 = new Cliente("Alejandra Mercader", 14, cuenta14, "Goma #5", sucursal);
  //Cliente y cuenta 15
  public static Payment cuenta15 = new Cuenta(501, 985459, "Eric Sanchez");
  public static Cliente cliente15 = new Cliente("Eric Sanchez", 15, cuenta15, "Diablotitla #50", sucursal);
  //Cliente y cuenta 16
  public static Payment cuenta16 = new Cuenta(420, 884967, "Melisa Martinez");
  public static Cliente cliente16 = new Cliente("Melisa Martinez", 16, cuenta16, "Zopiloe Mojado #58", sucursal);
  //Cliente y cuenta 17
  public static Payment cuenta17 = new Cuenta(414, 540605, "Sharon Rondero");
  public static Cliente cliente17 = new Cliente("Sharon Rondero", 17, cuenta17, "Cerveza Nochebuena #27", sucursal);
  //Cliente y cuenta 18
  public static Payment cuenta18 = new Cuenta(399, 667517, "Yosafat Hernandez");
  public static Cliente cliente18 = new Cliente("Yosafat Hernandez", 18, cuenta18, "Tiro al pichon #9", sucursal);
  //Cliente y cuenta 19
  public static Payment cuenta19 = new Cuenta(493, 777153, "Claudia Gutierrez");
  public static Cliente cliente19 = new Cliente("Claudia Gutierrez", 19, cuenta19, "Brandy Cheverny #3", sucursal);
  //Cliente y cuenta 20
  public static Payment cuenta20 = new Cuenta(913, 349727, "Ariana Fernandez");
  public static Cliente cliente20 = new Cliente("Ariana Fernandez", 20, cuenta20, "Calle de la Amargura #100", sucursal);

  //Lista de dias
  public static String[] dias = {"LUNES","MARTES","MIERCOLES", "JUEVES", "VIERNES"};
  //Contador de dias
  public static int contador = 0;
  public static Cobro cobro = new CobroNormal();
  /**
  * Metodo para imprimir rapido
  */
  public static void imprime(Object o){
    System.out.println(o);
  }

  /**
  * Metodo para limpiar la pantalla de la terminal
  */
  public static void limpiaPantalla(){
    System.out.println("\033[H\033[2J");
    System.out.flush();
  }

  /**
  * Metodo para cambiar dia
  */
  public static void cambiarDia(){
    sucursal.setDia(dias[contador]);
    contador++;
  }


  public static void main(String[] args) throws Exception{

    // Creamos el Scanner
    Scanner sc = new Scanner(System.in);

    // Registramos los cuentes en la sucursal
    sucursal.registrarCliente(cliente1);
    sucursal.registrarCliente(cliente2);
    sucursal.registrarCliente(cliente3);
    sucursal.registrarCliente(cliente4);
    sucursal.registrarCliente(cliente5);
    sucursal.registrarCliente(cliente6);
    sucursal.registrarCliente(cliente7);
    sucursal.registrarCliente(cliente8);
    sucursal.registrarCliente(cliente9);
    sucursal.registrarCliente(cliente10);
    sucursal.registrarCliente(cliente11);
    sucursal.registrarCliente(cliente12);
    sucursal.registrarCliente(cliente13);
    sucursal.registrarCliente(cliente14);
    sucursal.registrarCliente(cliente15);
    sucursal.registrarCliente(cliente16);
    sucursal.registrarCliente(cliente17);
    sucursal.registrarCliente(cliente18);
    sucursal.registrarCliente(cliente19);
    sucursal.registrarCliente(cliente20);

    //Temporal

    limpiaPantalla();
    //Simulacion dia 1
    imprime("Da enter para comenzar la simulacion del Dia 1");
      if(sc.hasNextLine()){
        cambiarDia();
        imprime("Dia: LUNES");
        imprime("");
        imprime("╞═════𖠁 𐂃 Pedido 1 del dia 1: 𐂃 𖠁═════╡");
        imprime("");

        String cliente1d1 = "Nombre del cliente: " + cliente13.getNombre() + "\n" + "Saldo inicial: " + cliente13.getTarjeta().getSaldo();
        cliente13.pedir(4);
        cliente13.pedir(7);
        cliente13.pedir(12);
        cliente13.pedir(1);
        cliente13.pedir(15);
        cliente13.hacerPedido();
        cliente1d1 = cliente1d1 + "\n" + "Saldo final: " + cliente13.getTarjeta().getSaldo();
        imprime("");
        imprime("╞═════𖠁 𐂃 Pedido 2 del dia 1: 𐂃 𖠁═════╡");
        imprime("");
        cliente11.pedir(16);
        cliente11.pedir(17);
        cliente11.pedir(18);
        String cliente2d1 = "Nombre del cliente: " + cliente11.getNombre() + "\n" + "Saldo inicial: " + cliente11.getTarjeta().getSaldo();
        cliente11.hacerPedido();
        cliente2d1 = cliente2d1 + "\n" + "Saldo final: " + cliente11.getTarjeta().getSaldo();
        imprime("");
        imprime("╞═════𖠁 𐂃 Pedido 3 del dia 1: 𐂃 𖠁═════╡");
        imprime("");
        cliente1.pedir(1);
        cliente1.pedir(2);
        cliente1.pedir(3);
        String cliente3d1 = "Nombre del cliente: " + cliente1.getNombre() + "\n" + "Saldo inicial: " + cliente1.getTarjeta().getSaldo();
        cliente1.hacerPedido();
        cliente3d1 = cliente3d1 + "\n" + "Saldo final: " + cliente1.getTarjeta().getSaldo();
        imprime("");
        imprime("╞═════𖠁 𐂃 Pedido 4 del dia 1: 𐂃 𖠁═════╡");
        imprime("");
        cliente10.pedir(10);
        cliente10.pedir(11);
        String cliente4d1 = "Nombre del cliente: " + cliente10.getNombre() + "\n" + "Saldo inicial: " + cliente10.getTarjeta().getSaldo();
        cliente10.hacerPedido();
        cliente4d1 = cliente4d1 + "\n" + "Saldo final: " + cliente10.getTarjeta().getSaldo();
        imprime("");
        imprime("╞═════𖠁 𐂃 Pedido 5 del dia 1: 𐂃 𖠁═════╡");
        imprime("");
        cliente6.pedir(6);
        String cliente5d1 = "Nombre del cliente: " + cliente6.getNombre() + "\n" + "Saldo inicial: " + cliente6.getTarjeta().getSaldo();
        cliente6.hacerPedido();
        cliente5d1 = cliente5d1 + "\n" + "Saldo final: " + cliente6.getTarjeta().getSaldo();
        imprime("");
        imprime("");
        imprime("——— ☆ • ♧ • NOTIFICACIONES DEL DIA: • ♧ • ☆ ———");

        sucursal.notificar();
        String infoClientes1 =  cliente1d1 + "\n" + cliente2d1 + "\n" + cliente3d1 + "\n" + cliente4d1 + "\n" + cliente5d1;
        try{
          File file = new File("ClientesDia1.txt");
          if(!file.exists()){
              file.createNewFile();
          }
          FileWriter fw = new FileWriter(file);
          BufferedWriter bw = new BufferedWriter(fw);
          bw.write(infoClientes1);
          bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc = new Scanner(System.in);
        imprime("");
        imprime("");
        //Simulacion dia 2
        imprime("Da enter para comenzar la simulacion del Dia 2");
          if(sc.hasNextLine()){
            limpiaPantalla();
            cambiarDia();
            imprime("Dia: MARTES");
            imprime("");
            imprime("╞═════𖠁 𐂃 Pedido 1 del dia 2: 𐂃 𖠁═════╡");
            imprime("");
            String cliente1d2 = "Nombre del cliente: " + cliente9.getNombre() + "\n" + "Saldo inicial: " + cliente9.getTarjeta().getSaldo();
            cliente9.pedir(9);
            cliente9.pedir(11);
            cliente9.hacerPedido();
            cliente1d2 = cliente1d2 + "\n" + "Saldo final: " + cliente9.getTarjeta().getSaldo();
            imprime("");
            imprime("╞═════𖠁 𐂃 Pedido 2 del dia 2: 𐂃 𖠁═════╡");
            imprime("");
            cliente5.pedir(9);
            cliente5.pedir(10);
            cliente5.pedir(13);
            cliente5.pedir(2);
            String cliente2d2 = "Nombre del cliente: " + cliente5.getNombre() + "\n" + "Saldo inicial: " + cliente5.getTarjeta().getSaldo();
            cliente5.hacerPedido();
            cliente2d2 = cliente2d2 + "\n" + "Saldo final: " + cliente5.getTarjeta().getSaldo();
            imprime("");
            imprime("╞═════𖠁 𐂃 Pedido 3 del dia 2: 𐂃 𖠁═════╡");
            imprime("");
            cliente3.pedir(15);
            cliente3.pedir(6);
            String cliente3d2 = "Nombre del cliente: " + cliente3.getNombre() + "\n" + "Saldo inicial: " + cliente3.getTarjeta().getSaldo();
            cliente3.hacerPedido();
            cliente3d2 = cliente3d2 + "\n" + "Saldo final: " + cliente3.getTarjeta().getSaldo();
            imprime("");
            imprime("╞═════𖠁 𐂃 Pedido 4 del dia 2: 𐂃 𖠁═════╡");
            imprime("");
            cliente7.pedir(4);
            cliente7.pedir(7);
            cliente7.pedir(11);
            cliente7.pedir(12);
            String cliente4d2 = "Nombre del cliente: " + cliente7.getNombre() + "\n" + "Saldo inicial: " + cliente7.getTarjeta().getSaldo();
            cliente7.hacerPedido();
            cliente4d2 = cliente4d2 + "\n" + "Saldo final: " + cliente7.getTarjeta().getSaldo();
            imprime("");
            imprime("╞═════𖠁 𐂃 Pedido 5 del dia 2: 𐂃 𖠁═════╡");
            imprime("");
            cliente19.pedir(3);
            String cliente5d2 = "Nombre del cliente: " + cliente19.getNombre() + "\n" + "Saldo inicial: " + cliente19.getTarjeta().getSaldo();
            cliente19.hacerPedido();
            cliente5d2 = cliente5d2 + "\n" + "Saldo final: " + cliente19.getTarjeta().getSaldo();
            imprime("");
            imprime("");
            imprime("——— ☆ • ♧ • NOTIFICACIONES DEL DIA: • ♧ • ☆ ———");
            sucursal.notificar();
            String infoClientes2 =  cliente1d2 + "\n" + cliente2d2 + "\n" + cliente3d2 + "\n" + cliente4d2 + "\n" + cliente5d2;
            try{
              File file = new File("ClientesDia2.txt");
              if(!file.exists()){
                  file.createNewFile();
              }
              FileWriter fw = new FileWriter(file);
              BufferedWriter bw = new BufferedWriter(fw);
              bw.write(infoClientes2);
              bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            imprime("");
            imprime("");
            sc = new Scanner(System.in);
            //Simulacion dia 3
            imprime("Da enter para comenzar la simulacion del Dia 3");
              if(sc.hasNextLine()){
                limpiaPantalla();
                cambiarDia();
                imprime("Dia: MIERCOLES");
                imprime("");
                imprime("╞═════𖠁 𐂃 Pedido 1 del dia 3: 𐂃 𖠁═════╡");
                imprime("");
                String cliente1d3 = "Nombre del cliente: " + cliente20.getNombre() + "\n" + "Saldo inicial: " + cliente20.getTarjeta().getSaldo();
                cliente20.pedir(4);
                cliente20.pedir(7);
                cliente20.pedir(12);
                cliente20.hacerPedido();
                cliente1d3 = cliente1d3 + "\n" + "Saldo final: " + cliente20.getTarjeta().getSaldo();
                imprime("");
                imprime("╞═════𖠁 𐂃 Pedido 2 del dia 3: 𐂃 𖠁═════╡");
                imprime("");
                cliente2.pedir(10);
                cliente2.pedir(5);
                String cliente2d3 = "Nombre del cliente: " + cliente2.getNombre() + "\n" + "Saldo inicial: " + cliente2.getTarjeta().getSaldo();
                cliente2.hacerPedido();
                cliente2d3 = cliente2d3 + "\n" + "Saldo final: " + cliente2.getTarjeta().getSaldo();
                imprime("");
                imprime("╞═════𖠁 𐂃 Pedido 3 del dia 3: 𐂃 𖠁═════╡");
                imprime("");
                cliente15.pedir(13);
                cliente15.pedir(8);
                cliente15.pedir(9);
                String cliente3d3 = "Nombre del cliente: " + cliente15.getNombre() + "\n" + "Saldo inicial: " + cliente15.getTarjeta().getSaldo();
                cliente15.hacerPedido();
                cliente3d3 = cliente3d3 + "\n" + "Saldo final: " + cliente15.getTarjeta().getSaldo();
                imprime("");
                imprime("╞═════𖠁 𐂃 Pedido 4 del dia 3: 𐂃 𖠁═════╡");
                imprime("");
                cliente4.pedir(5);
                cliente4.pedir(7);
                String cliente4d3 = "Nombre del cliente: " + cliente4.getNombre() + "\n" + "Saldo inicial: " + cliente4.getTarjeta().getSaldo();
                cliente4.hacerPedido();
                cliente4d3 = cliente4d3 + "\n" + "Saldo final: " + cliente4.getTarjeta().getSaldo();
                imprime("");
                imprime("╞═════𖠁 𐂃 Pedido 5 del dia 3: 𐂃 𖠁═════╡");
                cliente8.pedir(14);
                cliente8.pedir(12);
                cliente8.pedir(10);
                cliente8.pedir(8);
                cliente8.pedir(4);
                String cliente5d3 = "Nombre del cliente: " + cliente8.getNombre() + "\n" + "Saldo inicial: " + cliente8.getTarjeta().getSaldo();
                cliente8.hacerPedido();
                cliente5d3 = cliente5d3 + "\n" + "Saldo final: " + cliente8.getTarjeta().getSaldo();
                String infoClientes3 =  cliente1d3 + "\n" + cliente2d3 + "\n" + cliente3d3 + "\n" + cliente4d3 + "\n" + cliente5d3;
                imprime("");
                imprime("");
                imprime("——— ☆ • ♧ • NOTIFICACIONES DEL DIA: • ♧ • ☆ ———");
                sucursal.notificar();
                try{
                  File file = new File("ClientesDia3.txt");
                  if(!file.exists()){
                      file.createNewFile();
                  }
                  FileWriter fw = new FileWriter(file);
                  BufferedWriter bw = new BufferedWriter(fw);
                  bw.write(infoClientes3);
                  bw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                imprime("");
                imprime("");
                sc = new Scanner(System.in);
                //Simulacion dia 4
                imprime("Da enter para comenzar la simulacion del Dia 4");
                  if(sc.hasNextLine()){
                    limpiaPantalla();
                    cambiarDia();
                    imprime("Dia: JUEVES");
                    imprime("");
                    imprime("╞═════𖠁 𐂃 Pedido 1 del dia 4: 𐂃 𖠁═════╡");
                    imprime("");
                    String cliente1d4 = "Nombre del cliente: " + cliente12.getNombre() + "\n" + "Saldo inicial: " + cliente12.getTarjeta().getSaldo();
                    cliente12.pedir(1);
                    cliente12.pedir(3);
                    cliente12.pedir(5);
                    cliente12.pedir(7);
                    cliente12.pedir(9);
                    cliente12.hacerPedido();
                    cliente1d4 = cliente1d4 + "\n" + "Saldo final: " + cliente12.getTarjeta().getSaldo();
                    imprime("");
                    imprime("╞═════𖠁 𐂃 Pedido 2 del dia 4: 𐂃 𖠁═════╡");
                    imprime("");
                    String cliente2d4 = "Nombre del cliente: " + cliente14.getNombre() + "\n" + "Saldo inicial: " + cliente14.getTarjeta().getSaldo();
                    cliente14.pedir(2);
                    cliente14.pedir(8);
                    cliente14.hacerPedido();
                    cliente2d4 = cliente2d4 + "\n" + "Saldo final: " + cliente14.getTarjeta().getSaldo();
                    imprime("");
                    imprime("╞═════𖠁 𐂃 Pedido 3 del dia 4: 𐂃 𖠁═════╡");
                    imprime("");
                    String cliente3d4 = "Nombre del cliente: " + cliente16.getNombre() + "\n" + "Saldo inicial: " + cliente16.getTarjeta().getSaldo();
                    cliente16.pedir(4);
                    cliente16.pedir(12);
                    cliente16.pedir(16);
                    cliente16.hacerPedido();
                    cliente3d4 = cliente3d4 + "\n" + "Saldo final: " + cliente16.getTarjeta().getSaldo();
                    imprime("");
                    imprime("╞═════𖠁 𐂃 Pedido 4 del dia 4: 𐂃 𖠁═════╡");
                    imprime("");
                    cliente17.pedir(16);
                    cliente17.pedir(8);
                    cliente17.pedir(14);
                    String cliente4d4 = "Nombre del cliente: " + cliente17.getNombre() + "\n" + "Saldo inicial: " + cliente17.getTarjeta().getSaldo();
                    cliente17.hacerPedido();
                    cliente4d4 = cliente4d4 + "\n" + "Saldo final: " + cliente17.getTarjeta().getSaldo();
                    imprime("");
                    imprime("╞═════𖠁 𐂃 Pedido 5 del dia 4: 𐂃 𖠁═════╡");
                    imprime("");
                    cliente18.pedir(10);
                    cliente18.pedir(18);
                    String cliente5d4 = "Nombre del cliente: " + cliente18.getNombre() + "\n" + "Saldo inicial: " + cliente18.getTarjeta().getSaldo();
                    cliente18.hacerPedido();
                    cliente5d4 = cliente5d4 + "\n" + "Saldo final: " + cliente18.getTarjeta().getSaldo();
                    imprime("");
                    imprime("");
                    imprime("——— ☆ • ♧ • NOTIFICACIONES DEL DIA: • ♧ • ☆ ———");
                    sucursal.notificar();
                    String infoClientes4 =  cliente1d4 + "\n" + cliente2d4 + "\n" + cliente3d4 + "\n" + cliente4d4 + "\n" + cliente5d4;
                    try{
                      File file = new File("ClientesDia4.txt");
                      if(!file.exists()){
                          file.createNewFile();
                      }
                      FileWriter fw = new FileWriter(file);
                      BufferedWriter bw = new BufferedWriter(fw);
                      bw.write(infoClientes4);
                      bw.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    imprime("");
                    imprime("");
                    sc = new Scanner(System.in);
                    //Simulacion dia 5
                    imprime("Da enter para comenzar la simulacion del Dia 5");
                      if(sc.hasNextLine()){
                        limpiaPantalla();
                        cambiarDia();;
                        imprime("Dia: VIERNES");
                        imprime("");
                        imprime("╞═════ 𖠁 𐂃 Pedido 1 del dia 5: 𐂃 𖠁═════╡");
                        imprime("");
                        String cliente1d5 = "Nombre del cliente: " + cliente1.getNombre() + "\n" + "Saldo inicial: " + cliente1.getTarjeta().getSaldo();
                        cliente1.pedir(18);
                        cliente1.pedir(1);
                        cliente1.hacerPedido();
                        cliente1d5 = cliente1d5 + "\n" + "Saldo final: " + cliente1.getTarjeta().getSaldo();

                        imprime("");
                        imprime("╞═════ 𖠁 𐂃 Pedido 2 del dia 5: 𐂃 𖠁═════╡");
                        imprime("");
                        cliente10.pedir(2);
                        cliente10.pedir(17);
                        cliente10.pedir(3);
                        cliente10.pedir(16);
                        String cliente2d5 = "Nombre del cliente: " + cliente10.getNombre() + "\n" + "Saldo inicial: " + cliente10.getTarjeta().getSaldo();
                        cliente10.hacerPedido();
                        cliente2d5 = cliente2d5 + "\n" + "Saldo final: " + cliente10.getTarjeta().getSaldo();

                        imprime("");
                        imprime("╞═════ 𐂃 Pedido 3 del dia 5: 𐂃 𖠁═════╡");
                        imprime("");
                        cliente11.pedir(4);
                        cliente11.pedir(15);
                        cliente11.pedir(5);
                        String cliente3d5 = "Nombre del cliente: " + cliente11.getNombre() + "\n" + "Saldo inicial: " + cliente11.getTarjeta().getSaldo();
                        cliente11.hacerPedido();
                        cliente3d5 = cliente3d5 + "\n" + "Saldo final: " + cliente11.getTarjeta().getSaldo();

                        imprime("");
                        imprime("╞═════𖠁 𐂃 Pedido 4 del dia 5: 𐂃 𖠁═════╡");
                        imprime("");
                        cliente20.pedir(14);
                        cliente20.pedir(6);
                        cliente20.pedir(13);
                        String cliente4d5 = "Nombre del cliente: " + cliente20.getNombre() + "\n" + "Saldo inicial: " + cliente20.getTarjeta().getSaldo();
                        cliente20.hacerPedido();
                        cliente4d5 = cliente4d5 + "\n" + "Saldo final: " + cliente20.getTarjeta().getSaldo();

                        imprime("");
                        imprime("╞═════𖠁 𐂃 Pedido 5 del dia 5: 𐂃 𖠁═════╡");
                        imprime("");
                        cliente15.pedir(7);
                        cliente15.pedir(12);
                        cliente15.pedir(8);
                        cliente15.pedir(11);
                        cliente15.pedir(9);
                        String cliente5d5 = "Nombre del cliente: " + cliente15.getNombre() + "\n" + "Saldo inicial: " + cliente15.getTarjeta().getSaldo();
                        cliente15.hacerPedido();
                        cliente5d5 = cliente5d5 + "\n" + "Saldo final: " + cliente15.getTarjeta().getSaldo();
                        imprime("");
                        imprime("");
                        imprime("——— ☆ • ♧ • NOTIFICACIONES DEL DIA: • ♧ • ☆ ———");
                        sucursal.notificar();
                        String infoClientes5 =  cliente1d5 + "\n" + cliente2d5 + "\n" + cliente3d5 + "\n" + cliente4d5 + "\n" + cliente5d5;
                        try{
                          File file = new File("ClientesDia5.txt");
                          if(!file.exists()){
                              file.createNewFile();
                          }
                          FileWriter fw = new FileWriter(file);
                          BufferedWriter bw = new BufferedWriter(fw);
                          bw.write(infoClientes5);
                          bw.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
  }
}
