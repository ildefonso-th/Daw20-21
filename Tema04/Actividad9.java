import java.util.Scanner;
public class Actividad9{
  public static void main (String [] args){
    Scanner tec = new Scanner (System.in);
    double x1, x2;
    System.out.println("Este programa resuelve ecuaciones de segundo grado");
    System.out.println("ax2 + bx + c = 0");
    
    System.out.println("Introduce el valor de a");
    double a = tec.nextInt();
    System.out.println("Introduce el valor de b");
    double b = tec.nextInt();
    System.out.println("Introduce el valor de c");
    double c = tec.nextInt();
    
    if((a==0)&&(b==0)&&(c==0)){
      System.out.println("La ecuación no tiene solución");
      }
      if((a==0)&&(b==0)&&(c !=0)){
      System.out.println("La ecuación no tiene solución");
      }
      if((a !=0)&&(b !=0)&&(c==0)){
      System.out.println("x1 = 0");
      System.out.println("x2= "+(-b/a));
      }
      if((a==0)&&(b !=0)&&(c !=0)){
      System.out.println("x1=x2= "+(-c/b));
      }
      if((a==0)&&(b==0)&&(c==0)){
      System.out.println("La ecuación no tiene solución");
      }
      if((a !=0)&&(b !=0)&&(c !=0)){
        double raiz = b*b -(4*a*c);
        if (raiz<0){
          System.out.println("La ecuación no tiene soluciones, ya que la raíz es negativa ");
          } else {
            System.out.println("x1 = " + (-b + Math.sqrt(raiz))/(2 * a));
            System.out.println("x2 = " + (-b - Math.sqrt(raiz))/(2 * a));
            }
                    
        }
      
      }
    }
    
