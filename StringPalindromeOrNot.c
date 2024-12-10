/*
String Palindrom or Not Using c
--------------------------------
*/

#include<stdio.h>
#include<string.h>
int main() {

    char ch1[90];
    char ch2[90];

    printf("Enter String :: ");
    gets(ch1);
    int length1 = strlen(ch1);

    strcpy(ch2, ch1);

    int length2 = strlen(ch2);
    printf("Before Reverse String :: %s",ch1);
    int mid = length1/2;
    int end = length1-1;

    for(int i=0;i<mid;i++) {
        int temp = ch1[i];
        ch1[i] = ch1[end];
        ch1[end] = temp;
        end--;
    }
    printf("\nAfter Reverse String :: %s",ch1);

    int count=0;
    for(int i=0;i<length1;i++) {
        if(ch2[i]==ch1[i]) {
            count++;
        }else {
            count=0;
        }
    }
    if(count==length2){
        printf("\nString is Palindrome");
    }else {
        printf("\nString is Not Palindrome");
    }

}