#include <stdio.h>
#include <stdlib.h>

int main(){
int x1;

 

printf("Enter two-digit number:");
scanf("%d", &x1);
 
int a = x1%10;
int b = x1/10;
printf("number reversed = %d%d", a,b);
}

