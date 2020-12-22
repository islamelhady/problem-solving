// Created by islam elhady on 6/13/18.

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        float num ;
  int totalNumber = 0;
  Scanner sc =new Scanner(System.in);
  for (int i = 1; i <= 5; i++) {
   num =sc.nextFloat();
   if (num % 2==0) {
    totalNumber += 1;
   }
  }
  System.out.print(totalNumber+" valores pares\n");
    }
    }