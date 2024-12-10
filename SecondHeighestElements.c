/*
Second Heighest Element Using c
-------------------------------
*/
#include<stdio.h>
int main() {
    int arr[10];
    int size;
    printf("Enter Array Size :: ");
    scanf("%d",&size);

    printf("Enter Array Values :: ");
    for(int i=0;i<size;i++) {
        scanf("%d",&arr[i]);
    }

    for(int i=0;i<size;i++) {
        for(int j=i+1;j<size;j++) {
            if(arr[i]>arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j]; 
                arr[j] = temp;
            }
        }
    }
    printf("Sorted Array Values :: ");
    for(int i=0;i<size;i++) {
        printf("%d ",arr[i]);
    }
    int highest = 0;
    int second = 0;

    for(int i=0;i<size;i++){
        if(highest<arr[i]) {
            second = highest;
            highest = arr[i];
        }else if(highest>arr[i] && second<arr[i]) {
            second = arr[i];
        }
    }
    printf("\nHighest Element ::%d ",highest);
    printf("\nSecond Highest Element ::%d ",second);
}