// Created by islam elhady on 9/5/20.

#include <iostream>
 
using namespace std;
 
int main() {
 
   int a,b,c,x,y,z,num;
   cin>>a>>b>>c;
   x = a ; y = b ; z = c ;
   if(a>b){
       num=a;a=b;b=num;
   }
   if(a>c){
       num=a;a=c;c=num;
   }
   if(b>c){
       num=b;b=c;c=num;
   }
   cout<<a<<endl<<b<<endl<<c<<endl;
   cout<<endl<<x<<endl<<y<<endl<<z<<endl;
 
   return 0;
}