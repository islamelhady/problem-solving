// Created by islam elhady on 1/26/19.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int N;
        Scanner input = new Scanner(System.in);
        while ((N =input.nextInt()) != 0) {
            int sum = 0;
            for (int i = N,k = 1; k<= 5; i++) {
                if (i % 2 == 0) {
                    sum += i;
                    k += 1;
                }
            }
            System.out.print(sum+"\n");
        }
    }
 
}