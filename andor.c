#include<stdio.h>
#include<string.h>
int main()
{
    char str[]="Hello World";
    int i,len;
    len=strlen(str);
    printf("AND Operation:\n");
    for(i=0;i<len;i++)
    {
        printf("%c",str[i]&127);
    }
    printf("\n");
    printf("XOR Operation:");
    for(int i=0;i<len;i++)
    {
        printf("%c",str[i]^127);
    }
    printf("\n");
}
