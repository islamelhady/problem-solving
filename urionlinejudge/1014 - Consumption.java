// Created by islam elhady on 1/21/18.

import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner (System.in);              
             
          int a ;
          float b;
          a = s.nextInt();
          b = s.nextFloat();
          System.out.printf("%.3f km/l\n",a/b );
 
    }
 
}