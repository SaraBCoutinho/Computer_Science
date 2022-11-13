//Algoritmo de Seleçao das Regioes do Brasil 

//Objetivo é selecionar a regiao de acordo com o Estado (UF)

//Algoritmo de Seleçao das Regioes do Brasil 

//Objetivo é selecionar a regiao de acordo com o Estado (UF)

#include<stdio.h>

int main() {
    char UF[2];
    printf("\n Digite a UF: ");
    scanf("%s", &UF);
    
    if ( UF == "RS" || UF == "SC" || UF == "PR"){ 
        printf("\n Regiao Sul");
    } else if ( UF=="SP" || UF == "RJ" || UF == "MG" || UF == "ES"){ 
        printf("\n Regiao Sudeste");
    } else if ( UF == "MT" || UF == "MS" || UF == "GO"){ 
        printf("\n Regiao Centro-Oeste");
    } else if ( UF == "AM" || UF == "RR" || UF == "AP" || UF == "PA" || UF == "TO" || UF == "RO" || UF == "AC"){ 
        printf("\n Regiao Norte");
    } else {
        printf("\n Nordeste");
        
    } return 0;
    
}


//REVER SAIDA DO CODIGO 