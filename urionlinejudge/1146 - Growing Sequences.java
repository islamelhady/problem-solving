// Created by islam elhady on 7/4/18.

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
     Scanner s = new Scanner(System.in); 
        int x;
          
          while ((x = s.nextInt()) != 0) {
               for (int i = 1; i <= x; i++) {
                    if (i == x) {
                         System.out.print(i+"\n");
                    }else {
                         System.out.print(i+" ");
                    }
                    
               }
          }
 
    }
 
}