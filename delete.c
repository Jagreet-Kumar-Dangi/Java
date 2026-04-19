#include <stdio.h>
int main(){
    int arr[5];
    arr[0]=1;
    arr[1]=2;
    arr[2]=3;
    arr[3]=4;
    arr[4]=5;
    for(int n: arr)
    {
        printf(n);
    }
    return 0;
}