#include <stdio.h>
#include <stdlib.h>

int main(){

int x1, x2, y1, y2;


 
printf("Enter two values for X and two values for Y:");
scanf("%d%d%d%d", &x1, &x2, &y1, &y2);
 
int A = (y2-y1)/(x2-x1);
int B = y2-x2 * A;
printf("y=%dx + %d", A,B);
}

