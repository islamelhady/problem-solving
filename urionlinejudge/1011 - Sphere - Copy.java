// Created by islam elhady on 1/21/18.

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       
              Scanner s = new Scanner (System.in);              
              double R , volume;
              R = s.nextDouble();
              volume = 3.14159*(4.0/3)*R*R*R;
              System.out.printf("VOLUME = %.3f\n", volume  );
 
    }
 
}