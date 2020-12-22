// Created by islam elhady on 9/5/20.

import java.util.Scanner;
 

public class Main {
 
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = 0, position = 0;
        int n = sc.nextInt();
        if (1 < n && n < 1000) {
            int ars[] = new int[n];
            for (int i = 0; i < ars.length; i++) {
                ars[i] = sc.nextInt();
                if(value > ars[i]){
                    value = ars[i];
                    position = i;
                }
            }          
            System.out.println("Menor valor: "+value+"\n"+"Posicao: "+position);
        }
    }
 
}