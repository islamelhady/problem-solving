// Created by islam elhady on 1/22/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
           int days , value;
           
           days  = s.nextInt();
           
           System.out.printf("%d ano(s)\n", days/365);
           value = (days%365);
           System.out.printf("%d mes(es)\n",value/30);
           value = (value%30);
           System.out.printf("%d dia(s)\n", value);
 
    }
 
}