// Created by islam elhady on 9/5/20.

#include <iostream>
 
using namespace std;
 
int main() {
 
  double r, pi = 3.14159;
  scanf("%lf", &r);

  r *= 4 * pi * r * r;
  r /= 3;

  printf("%s = %.3lf\n", "VOLUME", r);

  return 0;
}