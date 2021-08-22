#define  _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
/*PROGRAM THAT SHOWS YOUR NAME NEAR A MESSAGE FIRST C PRACTICE*/
int main() {
	char x[20];
	printf("Enter a value: ");
	scanf("%s", &x);
	printf("Hello!\n\nWelcome to the class: %s\n",x);
	return 0;
	}