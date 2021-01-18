// Created by islam elhady on 20/01/2018.

#include <iostream>
 
using namespace std;
 
int main() {
 
    double A, B, total;
    scanf("%lf %lf", &A, &B);

    total = (A * 3.5) + (B * 7.5);
    total /= 11;

    printf("%s = %.5lf\n", "MEDIA", total);
 
    return 0;
}