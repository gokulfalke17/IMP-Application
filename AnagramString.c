/*
Anagram String Are Not Check Using c
------------------------------------
*/
#include<stdio.h>
#include<string.h>
int main(){
	char ch1[90];
    char ch2[90];
    printf("Enter First String :: ");
    gets(ch1);
    printf("Enter Second String :: ");
    gets(ch2);

    int length1 = strlen(ch1);
    int length2 = strlen(ch2);

    //sort first string
    for(int i=0;i<length1;i++) {
        for(int j=i+1;j<length1;j++) {
            if(ch1[i]>ch1[j]) {
                char temp = ch1[i];
                ch1[i] = ch1[j];
                ch1[j] = temp; 
            }
        }
    }
    //sort second string
    for(int i=0;i<length2;i++) {
        for(int j=i+1;j<length2;j++) {
            if(ch2[i]>ch2[j]) {
                char temp = ch2[i];
                ch2[i] = ch2[j];
                ch2[j] = temp;
            }
        }
    }
    //print sorted all strings
    printf("Sorted String :: %s",ch1);
    printf("\nSorted String :: %s",ch2);

    //string anagram logic
    int count=0;
    if(length1==length2) {
        for(int i=0;i<length1;i++) {
            if(ch1[i]!=ch2[i]) {
                count=1;
            }
        }
        if(count==1){
            printf("\nString is Not Anagram...Becase String Character Not Match...");
        }else{
            printf("\nString is Anagram!!!");
        }
    }else{
        printf("\nString is Not Anagram...Because Length Not Match...");
    }
}