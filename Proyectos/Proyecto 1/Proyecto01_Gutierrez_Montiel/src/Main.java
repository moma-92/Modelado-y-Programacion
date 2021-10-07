import java.util.Scanner;
import java.util.InputMismatchException;

 public class Main{

   // Objeto de la clase ArregloPizza
   public static ArregloPizza pizzas = new ArregloPizza();
   // Objecto de la clase ListaHamburguesas
   public static ListaHamburguesa hamburguesas = new ListaHamburguesa();
   // Objecto de la lcase HastableBurritos
   public static HashtableBurritos burritos = new HashtableBurritos();

   // Creacion de la Mercancia
   public static Mercancia item1 = new Mercancia("Playera McBurger.", "Playera para Hombre.","Azul.","Algodon.", 50);
   public static Mercancia item2 = new Mercancia("Playera McBurger.", "Playera para Mujer.","Negro.","Algodon.", 50);
   public static Mercancia item3 = new Mercancia("Playera McBurger.", "Playera para Escuincle.","Blanco.","Algodon.", 50);
   public static Mercancia item4 = new Mercancia("Tarro de Cerveza McBurger.", "Tarro de Cerveza.","Cafe.", "Madera.", 75);
   public static Mercancia item5 = new Mercancia("Tarro de Cerveza McBurger.", "Tarro de Cerveza.","Sin Color.", "Vidrio.", 65);
   public static Mercancia item6 = new Mercancia("Llavero McBurger.", "Llavero.","Plateado.","Metal", 15);
   public static Mercancia item7 = new Mercancia("Juguete McBurger.", "Carro.", "Rojo.","Plastico.", 15);
   public static Mercancia item8 = new Mercancia("Peluche McBurger.", "Hamburguesa de Peluche.", "Multicolor.", "Poliester.", 40);
   public static Mercancia item9 = new Mercancia("Muñecos Pop.", "Hombre Hamburguesa.", "Multicolor.", "Plastico.", 150);
   public static Mercancia item10 = new Mercancia("Alcancia McBurger.", "Alcancia de hamburguesa.", "Multicolor.", "Ceramica.", 40);

   // Creacion de los adaptadores de la Mercancia
   public static MenuItem menuItem1 = new MercanciaAdapter(item1);
   public static MenuItem menuItem2 = new MercanciaAdapter(item2);
   public static MenuItem menuItem3 = new MercanciaAdapter(item3);
   public static MenuItem menuItem4 = new MercanciaAdapter(item4);
   public static MenuItem menuItem5 = new MercanciaAdapter(item5);
   public static MenuItem menuItem6 = new MercanciaAdapter(item6);
   public static MenuItem menuItem7 = new MercanciaAdapter(item7);
   public static MenuItem menuItem8 = new MercanciaAdapter(item8);
   public static MenuItem menuItem9 = new MercanciaAdapter(item9);
   public static MenuItem menuItem10 = new MercanciaAdapter(item10);

   // Agregamos la Mercancia al Menu Hamburguesa


   // Creamos el Robot con los Menus correspondientes.
   public static Robot robot = new Robot(pizzas, hamburguesas, burritos);
   // Variable para manejar los while
   public static int opcion = -1;

   public static boolean correr = true;

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

   public static void main(String[] args) {

     //
     hamburguesas.agregaItem(menuItem1);
     hamburguesas.agregaItem(menuItem2);
     hamburguesas.agregaItem(menuItem3);
     hamburguesas.agregaItem(menuItem4);
     hamburguesas.agregaItem(menuItem5);
     hamburguesas.agregaItem(menuItem6);
     hamburguesas.agregaItem(menuItem7);
     hamburguesas.agregaItem(menuItem8);
     hamburguesas.agregaItem(menuItem9);
     hamburguesas.agregaItem(menuItem10);

     // Creamos el Scanner
     Scanner sc = new Scanner(System.in);

     //
     do{
       if(opcion == -1)
         robot.menuGeneral();
       try{
         opcion = sc.nextInt();
       }
       catch(InputMismatchException e){
         limpiaPantalla();
         imprime("Favor de ingresar un valor válido");
         sc = new Scanner(System.in);
       }
       if(opcion < 1 || opcion > 2){
         limpiaPantalla();
         imprime("Opcion no valida");
         opcion = -1;
       }
     }while(opcion == -1);

     //
     if(opcion == 1){
       limpiaPantalla();
       robot.activar();
     } else {
       System.exit(0);
     }
     opcion = -1;
     sc = new Scanner(System.in);

     //
     do{
       //
       do{
         if(opcion == -1)
          robot.imprimirMenu();
         try{
           opcion = sc.nextInt();
         }
         catch(InputMismatchException e){
           limpiaPantalla();
           imprime("Favor de ingresar un valor válido");
           sc = new Scanner(System.in);
         }
         if(opcion < 1 || opcion > 23){
           limpiaPantalla();
           imprime("Opcion no valida");
           opcion = -1;
         }
       }while(opcion == -1);

       limpiaPantalla();
       //
       if(opcion < 15){
         robot.recibirOrden(opcion);
         robot.caminar();
         robot.cocinar();
         robot.caminar();
         robot.atender();
         robot.suspender();
       } else{
         robot.recibirOrden(opcion);
         robot.imprimirTicket();
         robot.suspender();
       }

       opcion = -1;
       sc = new Scanner(System.in);
       robot.reiniciar();
       //
       do{
         if(opcion == -1)
          robot.menuGeneral();
         try{
           opcion = sc.nextInt();
         }
         catch(InputMismatchException e){
           limpiaPantalla();
           imprime("Favor de ingresar un valor válido");
           sc = new Scanner(System.in);
         }
         if(opcion < 1 || opcion > 2){
           limpiaPantalla();
           imprime("Opcion no valida");
           opcion = -1;
         }
       }while(opcion == -1);

       //
       if(opcion == 1){
         limpiaPantalla();
         robot.activar();;
       } else {
         System.exit(0);
       }
       opcion = -1;
       sc = new Scanner(System.in);

     }while(correr == true);
   }
 }
