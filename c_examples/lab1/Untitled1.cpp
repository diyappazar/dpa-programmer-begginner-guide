#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    printf("\nENTER 4 LINES:\n");
    char chr[600];
    char line[200];
    for(int i=0 ; i < 4 ; i++)
    {
        gets(line);
        strcat(chr,line);
    }
    int a = 0, e=0, i= 0, o= 0, u = 0;
    for( int i = 0 ; chr[i] != '\0' ; i++ )
    {
        if( chr[i] == 'a' )
        a++;
        else if( chr[i] == 'e' )
        e++;
        else if( chr[i] == 'i' )
        i++;
        else if( chr[i] == 'o' )
        o++;
        else if( chr[i] == 'u' )
        u++;
    }
    printf("\nVowel\tOccurrences");
    printf("\n a\t %d" , a);
    printf("\n e\t %d" , e);
    printf("\n i\t %d" , i);
    printf("\n o\t %d" , o);
    printf("\n u\t %d" , u);
    printf("\n\n");
}

