// Created by islam elhady on 6/13/18.

import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       int X, even = 0,odd = 0,positive = 0,negative = 0;
  Scanner input =new Scanner(System.in);
  for (int i = 1; i <= 5; i++) {
   X = input.nextInt();
   if (X % 2 == 0) {
    even += 1;
   }
   if (X % 2 != 0) {
    odd += 1;
   }
   if (X > 0) {
    positive += 1;
   }
   if (X < 0) {
    negative += 1;
   }
   
  }
  System.out.print(even+" valor(es) par(es)\n");
  System.out.print(odd+" valor(es) impar(es)\n");
  System.out.print(positive+" valor(es) positivo(s)\n");
  System.out.print(negative+" valor(es) negativo(s)\n");
 
 
    }
 
}