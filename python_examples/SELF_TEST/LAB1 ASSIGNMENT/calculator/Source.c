#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 
#include <stdlib.h>

void main() {
	float a, b, total;
	char chc;
	printf("\nEnter two numbers: ");
		scanf("%f %c %f", &a, &chc, &b);
		switch (chc) {
			case '+':
				total = a + b;
				printf("\nResult of %0.2f + %0.2f: %0.2f\n", a, b, total);
				break;
			case '-':
				total = a - b;
				printf("\nResult of %0.2f - %f: %0.2f\n", a, b, total);
				break;
			case '/':
				total = a / b;
				printf("\nResult of %0.2f / %0.2f: %0.2f\n", a, b, total);
				break;
			case '*':
				total = a * b;
				printf("\nResult of %0.2f * %0.2f: %0.2f\n", a, b, total);
				break;
			default:
				printf("\nWrong Entry\n");
				break;
		}	
}