#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 
#include <stdlib.h>
#include <math.h>
#define PI 3.14

double calc_vol(double a, double b) {
	double calc1;
	calc1 = PI * b * a * a;
	return(calc1);
}
double calc_tsa(double a, double b) { 
	double calc2;
	calc2 = 2*PI * b * a + 2*PI *a*a;
	return(calc2);
}

double main() {

		double height, radius;
			printf("Please, enter your cylinders height:  ");
			scanf("%lf", &height);
			printf("Please, enter your cylinders radius:  ");
			scanf("%lf", &radius);
			printf("//////////////////////////////////////////////////\n");
		double V;
			V = calc_vol(height, radius);
		printf("\nVolume of your cylinder is: %0.2lf\n", V);
		double S;
			S = calc_tsa(height, radius);
		printf("\nTotal Surface Area of your cylinder is: %0.2lf\n\n", S);
		printf("//////////////////////////////////////////////////");
		return 0;
}
