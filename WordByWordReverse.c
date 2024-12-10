/*Reverse Word By Word*/

#include<stdio.h>
#include<string.h>
int main() {
    
    char str[100];
    printf("Enter String :");
    gets(str);
    
    //length of string
    int length = strlen(str);

    printf("Before Reverse String :%s\n", str);

    int start = 0;
    int end;
    
    for(int i=0;i<=length;i++) {
        if(str[i]==' ' || str[i]=='\0') {
            end = i-1;
            while(start < end) {
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                end--;
                start++;
            }
            start = i+1;
        }
    }
    printf("After Reverse String :%s\n ", str);

}