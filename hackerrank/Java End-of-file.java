// Created by islam elhady on 02/02/2018.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
          Scanner userInput = new Scanner(System.in);
    int lineNum = 1;    
    
    while (userInput.hasNextLine() == true) {
    if (userInput.hasNext() == true) {
        System.out.println(lineNum + " " + userInput.nextLine());
        lineNum++;
      }
    }
    
  }
        
}