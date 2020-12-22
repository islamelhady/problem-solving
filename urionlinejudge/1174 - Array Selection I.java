// Created by islam elhady on 1/27/19.

import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
         Scanner sc = new Scanner(System.in);
        double a[] = new double [100];
        for(int i =0; i<a.length; i++){
            a[i] = sc.nextDouble();
            
        }
        for(int i =0; i<a.length; i++){
            if(a[i]<=10){
                System.out.println("A["+i+"] = "+a[i]);
            }
        }
 
    }
 
}