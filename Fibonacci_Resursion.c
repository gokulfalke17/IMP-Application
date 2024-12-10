/*
fibonacci serice using c and use recursiong
*/

#include<stdio.h>
//void fibonacci();
int f1=0,f2=1,fib=0;
void fibonacci(int limit) {
    if(limit!=0) {
        printf("%d ",fib);
        fib = f1+f2;
        f2=f1;
        f1=fib;
        limit--;
        fibonacci(limit);
    }
}
int main() {
    int limit;
    printf("Enter Limit :: ");
    scanf("%d",&limit);
    printf("Fibonacci Serice :: ");
    fibonacci(limit);
}