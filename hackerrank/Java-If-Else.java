// Created by islam elhady on 25/01/2018.

	import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {

           Scanner s = new Scanner(System.in); 
         float n;
         n= s.nextFloat();
        
        if(n%2==1 || (n>=6 && n <= 20)){
            System.out.println("Weird") ;
        }
        else{
            System.out.println("Not Weird") ;
        }
            
            
        
    }
}
