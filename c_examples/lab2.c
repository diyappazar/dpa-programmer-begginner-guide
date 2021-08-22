#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
	struct numSalary
	{
		int month;
		long salary;
	};
	struct empcpunt
	{
		int emp;
		char name[12];
		struct numSalary sal[3];
		long total;
		float average;
	};
	struct empcpunt numberEmp[4];
	FILE* tr;
	tr = fopen("source.txt", "r");
	int a, b;
	if (tr == NULL)
	{
		printf("I cant read the source.txt");
	}
	else
	{
		char empty[13];
		char* l;
		for (a = 0; a < 4; ++a)
		{
			fscanf(tr, "%s", empty);
			numberEmp[a].emp = atoi(empty);
			fscanf(tr, "%s", numberEmp[a].name);
			for (b = 0; b < 3; ++b)
			{
				fscanf(tr, "%s", empty);
				numberEmp[a] sal[b].month = atoi(empty);
				fscanf(tr, "%s", empty);
				numberEmp[a] sal[b].salary = strtol(empty, &l, 10);
			}
		}
        for (a = 0; a < 4; ++a) {
            for (b = 0; b < 3; ++b) {
                numberEmp[a].total += numberEmp[a] sal[b].salary;
            }
            numberEmp[a].average = numberEmp[a].total / 3;
        }
        for (a = 0; a < 4; ++a) {
            printf("%d %s %d %ld %d %ld %d %ld %ld %.3f\n",
                numberEmp[a].emp, numberEmp[a].name, numberEmp[a] sal[0].month,
                numberEmp[a] sal[0].salary, numberEmp[a] sal[1].month, numberEmp[a] sal[1].salary,
                numberEmp[a] sal[2].month, numberEmp[a] sal[2].salary, numberEmp[a].total
                , numberEmp[a].average);
        }
	}
	return 0;
}