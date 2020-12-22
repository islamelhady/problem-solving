// Created by islam elhady on 9/5/20.

#include <iostream>
 
using namespace std;
 
int main() {
 
    double N, X, Y;
  scanf("%lf", &N);

  while (N--) {
    scanf("%lf %lf", &X, &Y);

    if (Y == 0) {
      printf("%s\n", "divisao impossivel");
      continue;
    } else {
      printf("%.1lf\n", X / Y);
    }
}
 
    return 0;
}