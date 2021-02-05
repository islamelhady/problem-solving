// Created by islam elhady on 1/21/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner (System.in);              
             
         int sTime,aSpeed ,distance  ;
         float liters;
          sTime = s.nextInt();
          aSpeed = s.nextInt();
          distance = sTime*aSpeed;
          liters = distance/12f;
          System.out.printf("%.3f\n",liters);
 
    }
 
}