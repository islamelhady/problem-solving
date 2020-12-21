// Created by islam elhady on 6/12/18.

import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
         int x, y , z , min1, min2=0, min3=0;
        Scanner s = new Scanner (System.in);
        
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        
        min1 = Math.min(x, Math.min(y, z));
        if (min1 == x){
            min2 = Math.min(y,z);
            min3 = Math.max(y,z);
        }
        if (min1 == y){
            min2 = Math.min(x,z);
            min3 = Math.max(x,z);
        }
        if (min1 == z){
            min2 = Math.min(y,x);
            min3 = Math.max(y,x);
        }
        System.out.println( min1 +"\n" + min2+ "\n" + min3+ "\n");
        System.out.print(x+"\n"+y+"\n"+z+"\n");
 
    }
 
}