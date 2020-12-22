// Created by islam elhady on 1/27/19.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 Scanner s = new Scanner(System.in);
    int N[] = new int [1000];
    int num = s.nextInt();
    for ( int i=0 , j=0; i<N.length; i++,j++){
        
        N[j]=j;
        
        if(N[j] == num){
        j=0;
        }
        System.out.print("N["+i+"] = "+N[j]+"\n");
        
    }
 
    }
 
}