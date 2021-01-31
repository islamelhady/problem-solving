// Created by islam elhady on 1/21/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    
          Scanner s = new Scanner (System.in);
              
              int A , B ; ;
              float C , value ;
              
              A = s.nextInt();
              B = s.nextInt();
              C = s.nextFloat();
              
              value = B * C ;
              
              A = s.nextInt();
              B = s.nextInt();
              C = s.nextFloat();
              
              value += B * C ;
              System.out.printf("VALOR A PAGAR: R$ %.2f\n", value);
 
    }
 
}