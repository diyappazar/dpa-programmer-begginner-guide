#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h> 
#include <stdlib.h>
#include <math.h>
#define PI 3.1416

double calcradius(double a) {
	double calc1;
	calc1 = 2 * PI * a;
	return(calc1);
}
double calcareacircle(double c) {
	double calc2;
	calc2 = PI * c * c;
	return(calc2);
}
double calcareaboth(double b, double d) {
	double calc3;
	calc3 = (b*b)*4-d;
	return(calc3);
}
double main() {
			double radiusval;
		printf("Enter the value of the radius:  ");
		scanf("%lf", &radiusval);
			double R;
		R = calcradius(radiusval);
		printf("\nRadius of your circle is: %0.2lf\n", R);
			double AC;
		AC = calcareacircle(radiusval);
		printf("\nThe red area is: %0.2lf\n", AC);
			double AS, side;
			side = R * R;
		AS = calcareaboth(radiusval, AC);
		printf("\nThe yellow area is: %0.2lf\n", AS);
		return 0;
	}