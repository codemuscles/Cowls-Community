#include<iostream>
using namespace std;

int pivot(int arr[],int n){
    int s=0;
    int e=n-1;
    int mid=s+(e-s)/2;

    while(s<e){
        if(arr[mid]>=arr[0]){
            s=mid+1;
        }
        else{
            e=mid;
        }
        mid=s+(e-s)/2;
    }
    return s;
}

int binarySearch(int arr[],int n,int key){
    int s=0;
    int e=n-1;
    int mid=s+(e-s)/2;

    while(s<=e){
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]<key){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
        mid=s+(e-s)/2;
    }
    return -1;
}


int main(){
    int arr[5]={7,9,1,2,3};
    int target=10;

    int temp=pivot(arr,5);

    if(target>=arr[temp] && target<=arr[4]){
        cout<<"Element found at index : "<<binarySearch(arr,5,target)<<endl;
    }
    else{
        cout<<"Element not found at index :"<<binarySearch(arr,5,target)<<endl;
    }
     
}
