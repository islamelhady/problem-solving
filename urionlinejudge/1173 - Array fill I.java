// Created by islam elhady on 1/26/19.

import java.io.IOException;
 import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        if(N>=50)
            return;
        else{
         
            System.out.println("N[0] = " + N);
            
            for(int i=1 ; i<10 ; i++){
              N*=2;
              System.out.println("N[" + i + "] = " + N);
            }
      
        }
 
    }
 
}