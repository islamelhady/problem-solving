// Created by islam elhady on 6/12/18.

import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
      int A, B;
  Scanner input =new Scanner(System.in);
  A = input.nextInt();
  B = input.nextInt();
  if (B % A == 0 || A % B == 0) {
   System.out.print("Sao Multiplos\n");
  }else {
   System.out.print("Nao sao Multiplos\n");
  }
 
    }
 
}