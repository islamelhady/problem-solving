// Created by islam elhady on 9/5/20.

import java.util.*;

 

public class Main {
 
    public static void main(String[] args)  {
 
        Scanner keyboard = new Scanner(System.in);

        int startingSize = 0, numberOfDays = -1;
        double dailyIncrease = -1;
        double temp = 0;
        while (startingSize < 10)
        {

        System.out.println("Enter the starting size of the population");
        System.out.println("Starting size of the population should be greater than 9");
        
        startingSize = keyboard.nextInt();
        }
        while (dailyIncrease < 16){

        System.out.println("Enter the average daily PERCENTAGE increase");
        System.out.println("Average daily increase should be greater than 15");
        dailyIncrease = keyboard.nextInt();
        }
        while (numberOfDays < 3){
            
        System.out.println("Enter the number of days the population will multiply");
        System.out.println("Number of days should be 3, 4, or 5");
        numberOfDays = keyboard.nextInt();

        }
        temp = startingSize;
        dailyIncrease = dailyIncrease / 100;

        for(int i = 1; i < numberOfDays; i++)
        {
        System.out.println("The size of the population after day "+i+" is " + temp);
        temp = temp * dailyIncrease;
        }

 
    }
 
}