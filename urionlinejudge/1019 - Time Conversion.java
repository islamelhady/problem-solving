// Created by islam elhady on 1/22/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
           int duration , value;
           
           duration  = s.nextInt();
           
           System.out.printf("%d:", duration/3600);
           value = (duration%3600);
           System.out.printf("%d:",value/60);
           value = (value%60);
           System.out.printf("%d\n", value);
 
    }
 
}