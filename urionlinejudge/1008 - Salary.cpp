// Created by islam elhady on 9/5/20.

#include <iostream>
 
using namespace std;
 
int main() {
 
   int employee, hours;
  double hourRate;

  scanf("%d\n%d", &employee, &hours);
  scanf("%lf", &hourRate);

  printf("%s = %d\n", "NUMBER", employee);
  printf("%s = U$ %.2lf\n", "SALARY", hours * hourRate);

  return 0;
}