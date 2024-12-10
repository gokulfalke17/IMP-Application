
/*
Fibonacci Serice Using c
------------------------
*//*
#include<stdio.h>
int fibonocii(int num);
int f1=0,f2=1,fib=0;
int main() {
    int num;
    printf("Enter Number :: ");
    scanf("%d",&num);

    for(int i=0;i<num;i++) {
        printf("%d\t",fibonocii(i));
    }
}
int fibonocii(int num) {
    if(num==0) {
        return f1;
    }else if(num==1) {
        return f2;
    }else {
        f1 = f2;
        f2 = fib;
        fib = f1+f2;
        return fib;
    }
}

*/

/*using recursion fibbonacci series */


#include<stdio.h>
void fibonacci(int); 
int f1=0,f2=1,fib=0;
