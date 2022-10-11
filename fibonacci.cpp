#include<iostream>
using namespace std;

int fib(int num){

    int a=0;
    int b=1;

    cout<<a<<" ";
    cout<<b<<" ";
    
    for(int i=1;i<=num;i++){
        int nextNumber=a+b;
        cout<<nextNumber<<" ";
        a=b;
        b=nextNumber;
    }
}

int main(){
    int num;
    cin>>num;
    
    //fibonacci 
    fib(num);

    return 0;

}