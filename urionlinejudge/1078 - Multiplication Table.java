// Created by islam elhady on 6/13/18.

import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
            int N;
  Scanner input=new Scanner(System.in);
  N =input.nextInt();
  for (int i = 1; i <= 10; i++)
    {
      System.out.print(i+" x "+N+" = "+(i*N)+"\n");
     }
 
    }
 
}