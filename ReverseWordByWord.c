/*
Write a c program to reverse word of given string 
     Ex.   Input string =” India is my country” 
             Output string= “ aidnI si ym yrtnuoc”
*/

#include<stdio.h>
#include<string.h>

int main() {

    char ch[100];
    printf("Enter String :: ");
    gets(ch);

    //length of string 
    int length = strlen(ch);

    printf("Before Reverse String :%s\n",ch);

    int start = 0;
    int end;
    char temp;

    for(int i=0;i<=length;i++){
        if(ch[i]==' ' || ch[i]=='\0') {
            end = i-1;
            while(start < end) {
                temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
            start = i+1;
        }
    }
    printf("After Reverse String ::%s\n",ch);
}