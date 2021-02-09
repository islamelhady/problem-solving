// Created by islam elhady on 1/23/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        double a,b,c,r1,r2 , q;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        q = Math.sqrt((b*b) -(4*a*c)) ;
        r1 =  ( -b + q )/ (2*a) ;
        r2 =  ( -b - q) / (2*a) ;
        
        if ( (4*a*c)>(b*b) || a==0)
        {
            System.out.println("Impossivel calcular"); 
           
        }
        else
        {
             System.out.printf("R1 = %.5f\nR2 = %.5f\n", r1 ,r2); 
             
        }
 
    }
 
}