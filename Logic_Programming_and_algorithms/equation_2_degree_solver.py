#Logica de Programaçao e Algoritmos

"""Estrutura de decisao simples é Se...Entao (if) e toma a atitude mediante
a uma opçao verdadeira. Ja a composta é Se...Entao...Senao...Entao (if, else) e toma 
a decisao de acordo com 2 opçoes alternativas."""

#Task: Solver equation (2° degree)
#link de apoio: https://www.facom.ufu.br/~crlopes/IC/8-C-Condicionais.pdf
#link com exemplos de equaçoes : https://brasilescola.uol.com.br/matematica/raiz-uma-equacao-2-grau-1.htm#:~:text=As%20equa%C3%A7%C3%B5es%20do%20tipo%20ax%C2%B2,um%20conjunto%20solu%C3%A7%C3%A3o%20denominado%20raiz. 
import math 

a=int(input())
b=int(input())
c=int(input())

delta = b*b - 4*a*c 

try:
    if delta >=0:
        x1=(-1 * b + math.sqrt(delta))/(2 * a)
        x2=(-1 * b - math.sqrt(delta))/(2 * a)
        print("A raiz 1 é ",x1, "e a raiz 2 é", x2)
    else: 
        print("Nao existem raizes reais")
except ZeroDivisionError:
    print("Erro nos calculos pois ocorre divisao por zero.")
#teste com 1, -3, -10 -> raizes 5 e -2 
#teste com 1, 0, 0 -> raizes 0 e 0 
#exceçao é a divisao por zero, por isso o try/except