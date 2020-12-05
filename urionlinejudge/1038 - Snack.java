// Created by islam elhady on 1/23/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        int  x,y;
        x =  s.nextInt();
        y =  s.nextInt();
          
        switch (x) {
            case 1:
                System.out.printf("Total: R$ %.2f\n" ,  y*4.00 );
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n" ,  y*4.50 );
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n" ,  y*5.00 );
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n" ,  y*2.00 );
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n" ,  y*1.50 );    
            
                break;
        }
 
    }
 
}