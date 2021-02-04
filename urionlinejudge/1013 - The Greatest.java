// Created by islam elhady on 1/21/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner (System.in);              
             
          int a,b ,c ;
          a = s.nextInt();
          b = s.nextInt();
          c = s.nextInt();
          if (a > b && a>c)
          System.out.println(a + " eh o maior");
          else if (b>a && b>c)
          System.out.println(b + " eh o maior");  
          else 
          System.out.println(c + " eh o maior"); 
 
    }
 
}