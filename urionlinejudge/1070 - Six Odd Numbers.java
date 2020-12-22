// Created by islam elhady on 6/13/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
         int x ,howManyOdd = 6;
        Scanner s =new Scanner(System.in);
      
        x = s.nextInt();
       
            for(int i = x; i<(x+(howManyOdd*2)); i+=2){
                if ( x%2 == 0){
                   System.out.println(i+1);
                }
                else System.out.println(i);
                
            }
 
    }
 
}