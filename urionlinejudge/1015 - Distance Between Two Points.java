// Created by islam elhady on 1/21/18.

import java.io.IOException;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner (System.in);              
             
         double x1,y1,x2,y2 ;
          x1 = s.nextDouble();
          y1 = s.nextDouble();
          x2 = s.nextDouble();
          y2 = s.nextDouble();
           x1= x2-x1;
           y2= y2-y1;
          
           x2=x1*x1;
           y1=y2*y2;
          System.out.printf( "%.4f\n",    sqrt(x2+y1) );
 
    }
 
}