import java.util.Scanner;
public class Act7{
  public static void main (String[]args){
    Scanner s = new Scanner (System.in);
    int x = 0000;
    int psw;
    int contador = 0;
    do{
      System.out.print("Introduce la contraseña de la caja fuerte:");
      psw = s.nextInt();
      contador++;
      if(psw != x){
        System.out.println("Contraseña incorrecta, prueba de nuevo");
        }else{
          System.out.println("Contraseña correcta, caja fuerte abierta.");
          contador=4;
          }
      }while(contador<4);
    }
  }

