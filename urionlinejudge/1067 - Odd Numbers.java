// Created by islam elhady on 6/13/18.

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        System.out.print(1+"\n");
        for (int i = 1; i < num-1; i+=2) {
           int oddNumber = i + 2;
            System.out.print(oddNumber+"\n");
        }
 
    }
 
}