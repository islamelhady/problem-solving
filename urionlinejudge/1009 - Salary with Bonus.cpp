// Created by islam elhady on 9/5/20.

#include <iostream>
 
using namespace std;
 
int main() {
 
   string name;
  double fixedSalary, totalSold;

  cin >> name;
  scanf("%lf\n%lf", &fixedSalary, &totalSold);

  printf("%s = R$ %.2lf\n", "TOTAL", fixedSalary + (totalSold * 0.15));

  return 0;
}