#include <stdio.h>
#include <stdlib.h>
#define buffer 1000

char arr[buffer];
int total = -1;
int is_empty()
{
    return total == -1;
}
void push(char val)
{
    arr[++total] = val;
}
char pop()
{
    return arr[total--];
}

int main()
{
    int control = 0;
    int wrong = 0;
    char str[buffer];
    gets(str);
    int loc = 0;
    while (str[loc] != '\0' && str[loc] != '*')
    {
        if (str[loc] == 'a' || str[loc] == 'b'|| str[loc] == 'c')
        {
            push(str[loc]);
            loc++;
        }
        else
        {
            wrong = 1;
            break;
        }
    }
    if (str[loc] == '*')
    {
        loc++;
        while (str[loc] != '\0' && !is_empty() && str[loc] == pop())
        {
            if (str[loc] == 'a' || str[loc] == 'b'|| str[loc] == 'c')
            {
                loc++;
            }
            else
            {
                wrong = 1;
                break;
            }
        }
        if (str[loc] == '\0' && is_empty())
        {
            control = 1;
        }
    }
    if (wrong)
    {
        printf("You have entered wrong character!\n");
    }
    else if (control)
    {
        printf("String is valid.\n");
    }
    else
    {
        printf("String is invalid.\n");
    }
}