import java.util.Scanner;
public class Actividad28{
  public static void main (String [] args){
    System.out.println("Bienvenidos al juego de piedra papel o tijera");
    Scanner tec=new Scanner(System.in);
    System.out.println("Que va a elegir el primer jugador");
    String jug1 = tec.nextLine();
    System.out.println("Que va a elegir el segundo jugador");
    String jug2 = tec.nextLine();
    
    if(jug1.equals(jug2) ){
      System.out.println("Empate");
      }else if(jug1.equals("piedra")&&jug2.equals("tijera")){
        System.out.println("Gana jugador 1");
        }else if(jug1.equals("piedra")&&jug2.equals("papel")){
          System.out.println("Gana jugador 2");
          }else if(jug1.equals("tijera")&&jug2.equals("papel")){
            System.out.println("Gana jugador 1");
            }else if (jug1.equals("tijera")&&jug2.equals("piedra")){
              System.out.println("Gana jugador 2");
              }else if(jug1.equals("papel")&&jug2.equals("piedra")){
                System.out.println("Gana jugador 1");
                }else if(jug1.equals("papel")&&jug2.equals("tijera")){
                System.out.println("Gana jugador 2");
                }else{
                  System.out.println("Asegurate de que los datos introducidos son correctos");
                  }
        }
  }
