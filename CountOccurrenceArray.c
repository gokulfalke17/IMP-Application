/*
Occurence Array using c
------------------------
*/

#include<stdio.h>
int main(){

    int arr[100];
    int size;
    printf("Enter Size of Array :\n");
    scanf("%d",&size);

    printf("Enter Values in Array :\n");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }

    //sort array values
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

    //count occurrence
    printf("\nEach Array Occurrence :: ");
    int count=1;
    for(int i=0;i<size;i++) {
        if(arr[i] == arr[i+1]) {
            count++;
        }else {
            printf("\n%d--->%d times ",arr[i],count);
            count=1;
        }
    }
}