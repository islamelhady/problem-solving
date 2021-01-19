// Created by islam elhady on 22/01/2018.

import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       
       float A,B,C,MED;
       Scanner s = new Scanner (System.in);
       A = s.nextFloat();
       B = s.nextFloat();
       C = s.nextFloat();
       MED = (A/10 * 2) + (B/10 * 3) + (C/10 * 5);
       System.out.printf("MEDIA = %.1f\n" , MED);
 
    }
 
}