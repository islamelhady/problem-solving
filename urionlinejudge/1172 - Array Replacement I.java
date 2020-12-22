// Created by islam elhady on 1/26/19.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner (System.in);
      
      int x[] = new int[10];
      for (int i=0; i<x.length; i++){
      
           x[i]=s.nextInt();
           int arr=i;
      
        if(x[i]<=0){
        x[i]=1;
        }
        System.out.println("X[" + arr + "]" + " " + "=" + " " + x[i]);
        
      }
 
    }
 
}