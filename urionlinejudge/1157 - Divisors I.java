// Created by islam elhady on 1/26/19.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
       
        int N = s.nextInt();
        for (int i =1; i<=N; i++){
             if(N%i==0){
                 System.out.print( i + "\n");
             }
            
        }
 
    }
 
}