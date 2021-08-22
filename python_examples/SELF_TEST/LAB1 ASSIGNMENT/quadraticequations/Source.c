#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 
#include <stdlib.h>
#include<math.h>

double rtdiff(double a, double b, double c) {
	double X1,X2;
	X1 = (-b + sqrt(c)) / (2 * a);
	X2 = (-b - sqrt(c)) / (2 * a);
	printf("The roots are different: X1=%.2lf X2=%.2lf", X1, X2);
}
double rtdiff1(double a, double b, double c) {
	double X1, X2;
	X1 = (-b + sqrt(c)) / (2 * a);
	X2 = (-b - sqrt(c)) / (2 * a);
	printf("The roots are equal: X1 X1=%.2lf X2=%.2lf", X1, X2);;
}
double rtdiff2(double a, double b, double c) {
	double X1, X2;
	X1 = (-b + sqrt(c)) / (2 * a);
	X2 = (-b - sqrt(c)) / (2 * a);
	printf("The roots are imaginary");
}
void main() {
	double A, B, C;
	printf("Please, enter A: ");
		scanf_s("%lf", &A);
	printf("Please, enter B: ");
		scanf_s("%lf", &B);
	printf("Please, enter C: ");
		scanf_s("%lf", &C);
		double Disc;
		Disc = ((B*B) - (4 * A * C));
		if(Disc > 0){
		double pr1;
			pr1 = rtdiff(A, B, Disc);
			printf("%lf", pr1);
		}else if (Disc == 0) {
				double pr2;
					pr2 = rtdiff1(A, B, Disc);
					printf("%lf", pr2);
		}else if(Disc < 0){
					double pr3;
						pr3= rtdiff2(A, B, Disc);
						printf("%lf", pr3);
		}else {
			printf("Something seems like broken.");
		}
}