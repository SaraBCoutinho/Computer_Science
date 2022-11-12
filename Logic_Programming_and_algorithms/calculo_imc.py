#Estrutura de decisao encadeada 

#Objetivo: Calculo do IMC 

#entradas
altura = float(input("Digite a altura: "))
massa = float(input("Digite a massa: "))
#altura, massa = input("Digite a altura e massa: ").split()

print("Altura : ", altura)
print("Peso : ", massa)

#processamento
imc = massa / ( altura * altura )

#saida

if (imc < 17): 
    print("Muito abaixo do peso")
else:
    if (imc >= 17) and (imc <= 18,5):
        print("Abaixo do peso")
    else:
        if (imc > 18,5) and (imc < 25):
            print("Peso normal")
        else:
            if (imc >= 25) and (imc <=30):
                print("Acima do peso")
            else: 
                if (imc > 30) and (imc < 35):
                    print("Obesidade I")
                else:
                    if (imc >= 35) and (imc <= 40):
                        print("Obesidade II")
                    else:
                        print("Obesidade III")
                        
