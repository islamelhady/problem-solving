// Created by islam elhady on 7/4/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 

    int x,y;
         Scanner s = new Scanner(System.in);

    
    x = s.nextInt();;
    y = s.nextInt();
    
    int n = 1;
    
    for(int i = 1; i <= y; i++){
            if(n == x) {
                 System.out.println(i);
                 n = 1;
            }
            else{
                
            System.out.print(i + " ");
            
            n++;
            }
    
    }
 
    }
 
}