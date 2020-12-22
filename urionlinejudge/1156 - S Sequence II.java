// Created by islam elhady on 1/26/19.

import java.io.IOException;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       float S = 1 ;
        for (float i=3, j=2 ; i <=39 ; i+=2, j*=2) {
            S += i / j;
        }
        System.out.printf("%.2f\n",S);
 
    }
 
}