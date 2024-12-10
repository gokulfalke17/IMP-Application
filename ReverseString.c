/*
Reverse String Using c
----------------------
*/
#include<stdio.h>
#include<string.h>

int main(){

    char name[90];

    printf("Enter String :: ");
    gets(name);
    int length = strlen(name);
    printf("Before Reverse String :: %s",name);

    // int mid = length/2;
    // int end = length-1;

    // for(int i=0;i<mid;i++) {
    //     char temp = name[i];
    //     name[i] = name[end];
    //     name[end] = temp;
    //     end--;
    // }

    strrev(name);
    printf("\nAfter Reverse String :: %s",name);


}