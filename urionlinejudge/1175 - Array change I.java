// Created by islam elhady on 1/27/19.

import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        int n[] = new int[20];
        
        for (int i = 0; i < n.length; i++) {
            n[i] = s.nextInt();
        }
        
        int indexFinal = n.length -1;
        for (int i = 0; i < n.length / 2; i++) {
            int indexFirst = n[i];
            n[i] = n[indexFinal];
            n[indexFinal] = indexFirst;
            indexFinal--;
        }
               
        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i + "]" + " = " + n[i]);
        }
        
 
    }
 
}