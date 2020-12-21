// Created by islam elhady on 9/5/20.

#include <iostream>
 
using namespace std;
 
int main() {
 
    float a,b,c;
    float num1, num2, num3;
    
    cin >> a >> b >> c;
    
    if(b - c < 0)
         num1 = c - b;
    else
        num1 = b - c;
        
    if(b - a < 0)
         num2 = a - b;
    else
        num2 = b - a;
        
    if(a - c < 0)
         num3 = c - a;
    else
        num3 = a - c;
    
    if(num1 < a && a < (b + c) && num2 < c && c < (a+b) && num3 < b && b < (a+c))
            printf("Perimetro = %.1f\n", a+b+c);
    else
            printf("Area = %.1f\n", ((a+b)*c)/2.0);
            
    return 0;
}