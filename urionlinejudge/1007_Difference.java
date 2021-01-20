// Created by islam elhady on 20/01/2018.

import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       
       int A,B,C,D, dif;
       Scanner s = new Scanner (System.in);
       A = s.nextInt();
       B = s.nextInt();
       C = s.nextInt();
       D = s.nextInt();
       dif = (A*B)-(C*D);
       System.out.println("DIFERENCA = "+ dif);
 
    }
 
}