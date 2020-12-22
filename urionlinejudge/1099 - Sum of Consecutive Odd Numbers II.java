// Created by islam elhady on 6/20/18.

import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int N;

        int interval_start,interval_end;

        Scanner input =new Scanner(System.in);

        N =input.nextInt();

        for (int i = 1; i <= N; i++) {

            int total_odd = 0;

            interval_start = input.nextInt();

            interval_end = input.nextInt();

            if (interval_start > interval_end) {

                for (int j = interval_start-1; j > interval_end; j--) {

                    if (j % 2 != 0) {

 

                        total_odd+=j;

                    }

                }

            }else if(interval_start < interval_end){

                for (int j = interval_start + 1; j < interval_end; j++) {

                    if (j % 2 != 0) {

 

                        total_odd+=j;

                    }

                    }


                }else {

                    total_odd = 0;

                }

 

            System.out.print(total_odd+"\n");

        }
 
    }
 
}