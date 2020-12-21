// Created by islam elhady on 6/12/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
         float A,B,C, perimeterTriangle ,areaTraphisium;
        
         Scanner input =new Scanner(System.in);
         A = input.nextFloat();
         B = input.nextFloat();
         C = input.nextFloat();
  
         if ((A < (B+C)) && (B < (A+C)) && (C < (B+A))) {
           
            perimeterTriangle = A + B + C;
            System.out.printf("Perimetro = %.1f\n",perimeterTriangle);
         }
   
         else {
            
            areaTraphisium = ((A + B) * C) /2;
            System.out.printf("Area = %.1f\n",areaTraphisium);
        }
 
    }
 
}