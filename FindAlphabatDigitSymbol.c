/*
String Find Alphabat digit Symbol Using c
-----------------------------------
*/
#include<stdio.h>
#include<string.h>
int main() {

    char ch[90];
    printf("Enter String :: ");
    gets(ch);

    int count=0;
    int alphacount=0;
    int digitcount=0;
    int symbolcount=0;
    while(ch[count]!='\0') {
        if(ch[count]>='a' && ch[count]<='z' || ch[count]>='A' && ch[count]<='Z') {
            ++alphacount;
        }else if(ch[count]>='0' && ch[count]<='9') {
            ++digitcount;
        }else{
            ++symbolcount;
        }
        count++;
    }
    printf("Alphabates :: %d",alphacount);
    printf("\nDigits :: %d",digitcount);
    printf("\nSymbols :: %d",symbolcount);
}