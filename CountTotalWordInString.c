/*
Count Total Word in Given String
--------------------------------
*/
#include<stdio.h>
#include<string.h>

int main() {

    char ch[90];
    printf("Enter String :: ");
    gets(ch);

    int count=0;
    while(ch[count]!='\0') {
        if(ch[count]!=0) {
            count++;
        }
    }
    printf("Total Word In String ::%d ",count);
}