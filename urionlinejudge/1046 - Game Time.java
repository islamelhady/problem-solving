// Created by islam elhady on 6/12/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int strtTime, endTime, durationTime;

  Scanner s = new Scanner(System.in);
  strtTime = s.nextInt();
  endTime = s.nextInt();

     durationTime = endTime - strtTime;

     if (durationTime < 0)
     {
         durationTime = 24 + (endTime - strtTime);
     }

     if (strtTime == endTime)
     {
      System.out.printf("O JOGO DUROU 24 HORA(S)\n");
     }

     else System.out.printf("O JOGO DUROU %d HORA(S)\n", durationTime);
  
 
    }
 
}