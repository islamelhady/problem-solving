// Created by islam elhady on 6/13/18.

import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int N =100, X, highest = 0,position = 0;
        Scanner input =new Scanner(System.in);
        for (int i = 1; i <= N; i++)
        {
            X =input.nextInt();

            if (highest > X)
            {
                highest = highest;
                position = position;
            }
            else
            {
                highest = X;
                position = i;
            }

        }
        System.out.print(highest+"\n"+position+"\n");
 
    }
 
}