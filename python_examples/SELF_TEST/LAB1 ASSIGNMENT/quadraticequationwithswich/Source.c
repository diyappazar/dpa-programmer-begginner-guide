#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 
#include <stdlib.h>
#include<math.h>

void main() {
	int A, B, C;
	double X1,X2,r1,r2,r3;
	printf("Please, enter A: ");
	scanf_s("%d", &A);
	printf("Please, enter B: ");
	scanf_s("%d", &B);
	printf("Please, enter C: ");
	scanf_s("%d", &C);
	int Disc,sol;
	Disc = ((B * B) - (4 * A * C));
	if (Disc > 0) {
		sol = 1;
	}
	else if(Disc == 0){
		sol = 2;
	}else if (Disc < 0) {
		sol = 3;
	} 
	switch (sol) {
	case 1:
			X1 = (-B + sqrt(C)) / (2 * A);
				X2 = (-B - sqrt(C)) / (2 * A);
					printf("The roots are different: X1=%.2lf X2=%.2lf", X1, X2);
						break;
	case 2:
			X1 = (-B + sqrt(C)) / (2 * A);
				X2 = (-B - sqrt(C)) / (2 * A);
					printf("The roots are equal: X1 X1=%.2lf X2=%.2lf", X1, X2);
						break;
	case 3:
			X1 = (-B + sqrt(C)) / (2 * A);
				X2 = (-B - sqrt(C)) / (2 * A);
					printf("The roots are imaginary");
						break;
	default:
		printf("\nWrong Entry\n");
			break;
	}
}