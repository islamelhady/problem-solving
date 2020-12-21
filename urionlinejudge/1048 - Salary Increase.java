// Created by islam elhady on 6/12/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
  float salary ,newSalary;
        Scanner s = new Scanner (System.in);
        salary = s.nextFloat();
        
        if (salary >= 0 && salary <= 400.00){
            newSalary = (salary*15)/100;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 15 %%\n", newSalary+salary , newSalary);  
            
        }
        else if (salary >= 400.01 && salary <=800.00){
            newSalary = (salary*12)/100;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 12 %%\n", newSalary+salary , newSalary);  
                              
             
        }
       else if (salary >= 1200.01 && salary <=2000.00){
            newSalary = (salary*7)/100;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 7 %%\n", newSalary+salary , newSalary);  
            
        }
       else if (salary >= 800.01 && salary <=1200.00){
            newSalary = (salary*10)/100;
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 10 %%\n", newSalary+salary , newSalary);  
            
        }
        else
        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 4 %%\n", salary * 1.04, salary * 0.04);
        
 
}}