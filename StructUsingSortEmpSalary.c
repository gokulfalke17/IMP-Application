/*
Write a c program to store the data (id, name, salary) of n employee and sort data by 
salary in descending order. (n- take from user at run time/ dynamic)
*/

struct employee {
    int id;
    char name[90];
    int salary;
};

#include<stdio.h>
#include<string.h>
int main() {
    int size;
    printf("Enter How Many Employee You Have to Add ");
    scanf("%d",&size);
    struct employee emp[size];
    for(int i=0; i<size; i++) {
        printf("Enter %d : Employee Details\n ",i+1);
         printf("Employee Id :");
        scanf("%d",&emp[i].id);

        printf("Employee Name :");
        scanf("%s",&emp[i].name);

        printf("Employee Salary :");
        scanf("%d",&emp[i].salary);
    }
    printf("\n------------Before Sort------------\n");
    for(int i = 0;i<size; i++) {
        printf("%d %s %d\n",emp[i].id,emp[i].name,emp[i].salary);
    }

    //sort by salary wise
    for(int i=0;i<size;i++) {
        for(int j=i+1;j<size;j++) {
            if(emp[i].salary < emp[j].salary) {
                struct employee temp = emp[i];
                emp[i] = emp[j];
                emp[j] = temp;
            }
        }
    }
     printf("\n------------After Sort------------\n");
    for(int i = 0;i<size; i++) {
        printf("%d %s %d\n",emp[i].id,emp[i].name,emp[i].salary);
    }

}
