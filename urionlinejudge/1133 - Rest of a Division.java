// Created by islam elhady on 7/03/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int X, Y;

        Scanner input =new Scanner(System.in);

        X = input.nextInt();

        Y = input.nextInt();

         

        if (X > Y) {

             

            for (int i = Y+1 ; i < X; i++) {

                if (i % 5 == 2 || i % 5 == 3) {

                    System.out.print(i+"\n");

                }

            }

        }else if(Y > X){

            for (int i = X+1 ; i < Y; i++) {

                if (i % 5 == 2 || i % 5 == 3) {

                    System.out.print(i+"\n");

                }

            }

        }

 
    }
 
}