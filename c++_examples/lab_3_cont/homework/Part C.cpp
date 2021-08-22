#include <stdio.h>
#include <stdlib.h>

int main(){
	int  x = 2, j = 8, m = 2, n = 1;
	j = 1 + (m %= 1 + (n/=-1+x));
	printf("m = %d and n = %d and j = %d and x = %d\n",m,n,j,x);
}
