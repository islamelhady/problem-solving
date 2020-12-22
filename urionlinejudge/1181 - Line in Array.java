// Created by islam elhady on 9/5/20.

import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ars[][] = new double[12][12];
        int l = sc.nextInt();
        String s = sc.next();
        double sum = 0;
        if (l >= 0 && l <= 11) {
            for (int i = 0; i < ars.length; i++) {
                for (int j = 0; j < ars.length; j++) {
                    ars[i][j] = sc.nextDouble();
                    if (l == i) {
                        sum += ars[i][j];
                    }
                }
            }
            if("S".equals(s)){
                System.out.printf("%.1f\n",sum);
            }else if("M".equals(s)){
                System.out.printf("%.1f\n",(sum/12));
            }
        }
    }
 
}