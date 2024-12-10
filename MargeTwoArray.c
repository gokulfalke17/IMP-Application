/*
Marge Two Array using c
-----------------------
*/
#include<stdio.h>
int main(){

    int arr[5],brr[5],crr[10];
    int size1,size2;

    printf("\nFirst Array Values :: ");
    for(int i=0;i<5;i++) {
        scanf("%d",&arr[i]);
    }

    printf("\nSecond Array Values :: ");
    for(int i=0;i<5;i++) {
        scanf("%d",&brr[i]);
    }
    
    //marge array logic
    for(int i=0;i<10;i++) {
        if(i<5){
            crr[i] = arr[i];
        }else{
            crr[i] = brr[i-5];
        }
    }
    printf("\nMarge Two Array Values :: ");
    for(int i=0;i<10;i++) {
        printf("%d ",crr[i]);
    }
    //sort array values
    for(int i=0;i<10;i++) {
        for(int j=i+1;j<10;j++) {
            if(crr[i]>crr[j]) {
                int temp = crr[i];
                crr[i] = crr[j];
                crr[j] = temp;
            }
        }
    }
    printf("\nSorted Array Values :: ");
    for(int i=0;i<10;i++) {
        printf("%d ",crr[i]);
    }

}