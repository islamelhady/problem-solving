// Created by islam elhady on 1/21/18.

import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
     public static void main(String[] args) throws IOException {
              Scanner s = new Scanner (System.in);              
              double A,B,C;
              A = s.nextFloat();
              B = s.nextFloat();
              C = s.nextFloat();             
              System.out.printf("TRIANGULO: %.3f\n", (1.0/2.0)*A*C );
              System.out.printf("CIRCULO: %.3f\n",C*C*3.14159);
              System.out.printf("TRAPEZIO: %.3f\n",((A+B)/2)*C);
              System.out.printf("QUADRADO: %.3f\n",B*B);
              System.out.printf("RETANGULO: %.3f\n",A*B);
 
    }
 
}