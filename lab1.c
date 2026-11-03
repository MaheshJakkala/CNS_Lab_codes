#include<stdio.h>
int main()
{
    char str[]="Hello World";
    int i;
    printf("Original String:%s\n",str);
    printf("After xor with 0:");
    for(i=0;str[i]!='\0';i++)
    {
        printf("%c",str[i]^0);
    }
    printf("\n");
}