/**
* Clase que define el estado Caminando del Robot
*/
public class Caminando implements EstadoRobot{

  //El Robot
  Robot robot;

  /**
  * Define el estado Caminando del  Robot
  * @param robot el robot
  */
  public Caminando(Robot robot){
    this.robot = robot;
  }

  /**
  * Metodo activar en este estado
  */
  public void activar(){
    if(robot.getOrden() == true && robot.getTrabajo() == false){
      System.out.println("El robot ya esta activo.");
      System.out.println("Termine de caminar");
      System.out.println("Comenzare a reabastecerme");
      robot.asignarNuevoEstado(robot.getEstadoReabastecerse());
    } else if(robot.getTrabajo() == true){
      System.out.println("El robot ya esta activo");
      System.out.println("Termine de caminar");
      System.out.println("Comenzare a trabajar");
      robot.asignarNuevoEstado(robot.getEstadoTrabajar());
    }else{
      System.out.println("El robot ya esta activo");
      System.out.println("Termine de caminar");
      System.out.println("Me voy a suspender");
      robot.asignarNuevoEstado(robot.getEstadoSuspender());
    }
  }

  /**
  * Metodo caminar en este estado
  */
  public void caminar(){
    if(robot.getOrden() == true && robot.getTrabajo() == false){
      System.out.println("El robot ya esta caminando.");
      System.out.println("Termine de caminar");
      System.out.println("Comenzare a reabastecerme");
      robot.asignarNuevoEstado(robot.getEstadoReabastecerse());
    } else if(robot.getTrabajo() == true){
      System.out.println("El robot ya esta caminando");
      System.out.println("Termine de caminar");
      System.out.println("Comenzare a trabajar");
      robot.asignarNuevoEstado(robot.getEstadoTrabajar());
    }else{
      System.out.println("El robot ya esta caminando");
      System.out.println("Termine de caminar");
      System.out.println("Me voy a suspender");
      robot.asignarNuevoEstado(robot.getEstadoSuspender());
    }

  }

  /**
  * Metodo reabastecer en este estado
  */
  public void reabastecer(){
    if(robot.getOrden() == true && robot.getTrabajo() == false){
      System.out.println("Cuando termine de caminar comenzare a reabastecerme");
      System.out.println("Termine de caminar");
      System.out.println("Comenzare a reabastecerme");
      robot.asignarNuevoEstado(robot.getEstadoReabastecerse());
    } else if(robot.getTrabajo() == true){
      System.out.println("El robot no se puede reabastecer mientras camina.");
      System.out.println("Termine de caminar");
      System.out.println("Comenzare a trabajar");
      robot.asignarNuevoEstado(robot.getEstadoTrabajar());
    } else {
      System.out.println("El robot no se puede reabastecer mientras camina.");
      System.out.println("Termine de caminar");
      System.out.println("Me voy a suspender");
      robot.asignarNuevoEstado(robot.getEstadoSuspender());
    }
  }

  /**
  * Metodo recibir orden en este estado
  */
  public void recibirOrden(){
    if(robot.getOrden() == true && robot.getTrabajo() == false){
    System.out.println("El robot no puede recibir una orden mientras camina.");
    System.out.println("Termine de caminar");
    System.out.println("Comenzare a reabastecerme");
    robot.asignarNuevoEstado(robot.getEstadoReabastecerse());
    } else if(robot.getTrabajo() == true){
      System.out.println("El robot no puede recibir una orden mientras camina.");
      System.out.println("Termine de caminar");
      System.out.println("Comenzare a trabajar");
      robot.asignarNuevoEstado(robot.getEstadoTrabajar());
    } else {
      System.out.println("El robot no puede recibir una orden mientras camina.");
      System.out.println("Termine de caminar");
      System.out.println("Me voy a suspender");
      robot.asignarNuevoEstado(robot.getEstadoSuspender());
    }
  }

  /**
  * Metodo trabajar en este estado
  */
  public void trabajar(){
    if(robot.getTrabajo() == true){
      System.out.println("Cuando termine de caminar comenzare a trabajar");
      System.out.println("Termine de caminar");
      System.out.println("Comenzare a trabajar");
      robot.asignarNuevoEstado(robot.getEstadoTrabajar());

    } else if(robot.getOrden()== true){
      System.out.println("El robot no puede trabajar mientras camina.");
      System.out.println("Termine de caminar");
      System.out.println("Comenzare a reabastecerme");
      robot.asignarNuevoEstado(robot.getEstadoReabastecerse());
    } else {
      System.out.println("El robot no puede trabajar mientras camina.");
      System.out.println("Termine de caminar");
      System.out.println("Me voy a suspender");
      robot.asignarNuevoEstado(robot.getEstadoSuspender());
    }
  }

  /**
  * Metodo suspender en este estado
  */
  public void suspender(){
    System.out.println("El robot se suspendera");
    robot.asignarNuevoEstado(robot.getEstadoSuspender());

  }
}
