// Created by islam elhady on 6/13/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int N;
  Scanner input =new Scanner(System.in);
  N =input.nextInt();
  
  
  for (int i = 2; i <= N; i+= 2) {
   System.out.print(i+"^2 = "+(i*i)+"\n");
  }
 
    }
 
}