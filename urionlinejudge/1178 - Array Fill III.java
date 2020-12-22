// Created by islam elhady on 1/29/19.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        float N[] = new float [100];
        float T = s.nextFloat();
            for(int i = 0 , j = 0 ; i<100 ; j++ , T / = 2 , i++){
    
                 N[j]= T;
        
                System.out.print("N["+i+"] = ");
                System.out.printf("%.4f\n" , N[j]);
        
    }
 
    }
 
}