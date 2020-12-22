// Created by islam elhady on 6/13/18.

import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
         int X, Y, total = 0;
  Scanner input =new Scanner(System.in);
  X = input.nextInt();
  Y = input.nextInt();

  if (X > Y) {
   for (int i = X - 1; i > Y; i--) {
    if (i % 2 != 0) {
     total += i;
    }
   }
  }else {
   for (int i = Y - 1; i > X; i--) {
    if (i % 2 != 0) {
     total += i;
    }
   }
  }

  System.out.print(total+"\n");
 
    }
 
}