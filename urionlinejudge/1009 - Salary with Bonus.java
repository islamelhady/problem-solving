// Created by islam elhady on 1/20/18.

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        
         Scanner s = new Scanner(System.in);
        
               String name;
               double fSalary , tSell , bounse , tSalary;
               name = s.next();
               fSalary = s.nextDouble();
               tSell = s.nextDouble();               
               bounse = (tSell*15/100);
               tSalary = fSalary+bounse;
               System.out.printf("TOTAL = R$ %.2f\n", tSalary);
 
    }
 
}