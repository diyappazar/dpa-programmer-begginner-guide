#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int main() {
	int x, y, z, s;
	printf("Enter four numbers: ");
	scanf("%d %d %d %d", &x, &y, &z, &s);
	printf("%d + %d + %d + %d = %d \n", x, y, z, s, x + y + s + z);
	return 0;
}





/*int main() {
	int x, y, z;
	printf("Please enter any operation between (+,-,\,*)");
	scanf("%d", &x);
	printf("Please enter two numbers");
	scanf("%d,%d", &y, &z);

	if (x = '+') {
		int total;
		total = y + z
			printf("The total is:", total);
	}
	else() {
		printf("Invalid Operator.");
	}
	
}