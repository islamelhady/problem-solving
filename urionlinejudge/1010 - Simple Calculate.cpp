// Created by islam elhady on 9/5/20.

#include <iostream>
 
using namespace std;
 
int main() {
 
    int x1, y1, x2, y2;
  double z1, z2;

  scanf("%d %d %lf %d %d %lf", &x1, &y1, &z1, &x2, &y2, &z2);

  printf("%s: R$ %.2f\n", "VALOR A PAGAR", (y1 * z1) + (y2 * z2));

  return 0;
}