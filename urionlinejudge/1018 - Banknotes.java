// Created by islam elhady on 1/22/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int notes, value ;

     Scanner s = new Scanner(System.in);
     
     notes = s.nextInt();
     System.out.printf("%d\n" ,notes);
     
     System.out.printf("%d nota(s) de R$ 100,00\n", notes/100);
     value = (notes%100);
     
     System.out.printf("%d nota(s) de R$ 50,00\n", value/50);
     value = (value%50);
     
     System.out.printf("%d nota(s) de R$ 20,00\n", value/20);
     value = (value%20);
     
     System.out.printf("%d nota(s) de R$ 10,00\n", value/10);
     value = (value%10);
     
     System.out.printf("%d nota(s) de R$ 5,00\n", value/5);
     value = (value%5);
     
     System.out.printf("%d nota(s) de R$ 2,00\n", value/2);
     value = (value%2);
     
     System.out.printf("%d nota(s) de R$ 1,00\n", value/1);
 
    }
 
}