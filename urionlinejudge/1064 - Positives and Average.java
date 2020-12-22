// Created by islam elhady on 6/13/18.

import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        float num , total = 0 , average = 0;
  int totalNumber = 0;
  Scanner sc =new Scanner(System.in);
  for (int i = 1; i <= 6; i++) {
   num =sc.nextFloat();
   if (num > 0) {
    totalNumber += 1;
    total += num;
   }
  }
  average = total / totalNumber;
  
  System.out.print(totalNumber+" valores positivos\n");
  System.out.printf("%.1f\n",average);
 
    }
 
    }