// Created by islam elhady on 6/12/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        float x,y;
        Scanner s = new Scanner(System.in);
        x = s.nextFloat();
        y = s.nextFloat();
        
        if(x == 0 && y ==0){
            System.out.println("Origem");
        }
        else if(x == 0){
            System.out.printf("Eixo Y\n");
        }    
        else if(y == 0){
            System.out.printf("Eixo X\n");
        }
        else if (x < 0 && y > 0){
           
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0){
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0 ){
            System.out.println("Q4");
        }
      
        else {
            System.out.println("Q1");
        }
        
 
    }
 
}