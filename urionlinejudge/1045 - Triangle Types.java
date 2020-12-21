// Created by islam elhady on 6/12/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double A, B, C,maxB = 0, maxC = 0,maxA;
  Scanner input =new Scanner(System.in);
  A = input.nextDouble();
  B = input.nextDouble();
  C = input.nextDouble();
   maxA = Math.max(A, Math.max(B, C));

  if (maxA == A) {
   maxB =Math.max(B, C);
   maxC =Math.min(B, C);
  }
  if (maxA == B) {
   maxB =Math.max(A, C);
   maxC =Math.min(A, C);
  }
  if (maxA == C) {
   maxB =Math.max(B, A);
   maxC =Math.min(B, A);
  }
  //------------------------------
  if (maxA >= (maxB + maxC)) {
   System.out.print("NAO FORMA TRIANGULO\n");
   
  }else if (maxA*maxA > ((maxB*maxB)+(maxC*maxC))) {
   System.out.print("TRIANGULO OBTUSANGULO\n");
  }
  if (maxA*maxA == ((maxB*maxB)+(maxC*maxC))) {
   System.out.print("TRIANGULO RETANGULO\n");
  }

  if (maxA*maxA < ((maxB*maxB)+(maxC*maxC))) {
   System.out.print("TRIANGULO ACUTANGULO\n");
  }
  if ((maxA == maxB) &&(maxA == maxC)) {
   System.out.print("TRIANGULO EQUILATERO\n");
  }
  if (((maxA == maxB) &&(maxA != maxC)) || ((maxA == maxC) &&(maxA != maxB)) || ((maxB == maxC) &&(maxB != maxA)) ) {
   System.out.print("TRIANGULO ISOSCELES\n");
  }
 
    }
 
}