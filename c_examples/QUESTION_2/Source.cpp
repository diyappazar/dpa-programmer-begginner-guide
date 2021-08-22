#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
/*PROGRAM THAT CALCULATES TOTAL NUMBER ENTERED*/
int main() {
	int x = 6;
	int z = 20;
	int s,y;
	printf("Enter two numbers: ");
	scanf("%d %d ", &y, &s);
	printf("%d * %d + %d * %d = %d \n", x, y, s ,z ,x*y+s*z);
	system("pause");
    return 0;
}
