// Created by islam elhady on 6/12/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double n;
     int tmp = 0, i;
     Scanner sc = new Scanner(System.in);
    
     for (i = 0; i < 6; ++i)
     {
      n = sc.nextDouble();
      if(n > 0){
       tmp++;
      }
     }
        
     System.out.printf("%d valores positivos\n", tmp);
    }
 
    }