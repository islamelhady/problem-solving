// Created by islam elhady on 1/26/19.

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner s = new Scanner(System.in);
        int age , totalAge=0 , totalNum=0 ;
        float aveAge;
        
        
        while ( (age = s.nextInt()) >= 0){
        totalAge +=age;
        totalNum +=1;
       
        }
        
        aveAge = ((float)((float)totalAge / totalNum));
        System.out.printf("%.2f\n",   aveAge);
 
    }
 
}