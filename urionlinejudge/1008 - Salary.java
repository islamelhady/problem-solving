// Created by islam elhady on 1/20/18.

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        
       int numberEmployee, hourWeek;
       float amount;
       Scanner s = new Scanner (System.in);
       
       numberEmployee = s.nextInt();
       hourWeek = s.nextInt();
       amount = s.nextFloat();
       float sal = amount * hourWeek;
       System.out.println("NUMBER = "+ numberEmployee);
       System.out.printf("SALARY = U$ %.2f\n" , sal );
 
    }
 
}