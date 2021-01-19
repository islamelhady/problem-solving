// Created by islam elhady on 20/01/2018.

#include <iostream>
 
using namespace std;
 
int main() {
 
     double A, B, C, total;

      scanf("%lf %lf %lf", &A, &B, &C);

      total = (A * 2.0) + (B * 3.0) + (C * 5.0);
      total /= 10;

       printf("%s = %.1lf\n", "MEDIA", total);
 
    return 0;
}