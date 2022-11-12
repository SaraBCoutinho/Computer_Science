//Calculus of Student Media using a C language 
#include<stdio.h>

int main() 
{
    float a, b, m;
    printf("\n Digite duas notas : ");
    scanf("%f %f", &a, &b);
    m = (a+b)/2;
    if( m >= 7.0 ) printf("\n Aprovado");
    else printf("\n Reprovado");
    return 0;
}