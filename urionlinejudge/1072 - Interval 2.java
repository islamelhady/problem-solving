// Created by islam elhady on 6/13/18.

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
          int x,n, in=0 , out=0 ; 
    Scanner s= new Scanner (System.in);
    
    x= s.nextInt();
    
    for(int i =0; i<x; i ++){
        n= s.nextInt();
        if (n>=10 && n<=20){
             in +=1;
        }
        else{
            out +=1;}
    }
    System.out.print ( in +" in\n"+out+" out\n");

 
    }
 
}