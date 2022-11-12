import java.util.Scanner;
public class Switch {
 public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  System.out.println("Digite a terminaçao da placa do veiculo");
  int numero = entrada.nextInt();
   switch (numero) {
     case 1:
       System.out.println("Dia do rodizio: segunda-feira.");
       break;
     case 2:
       System.out.println("Dia do rodizio: segunda-feira.");
       break;
     case 3:
       System.out.println("Dia do rodizio: terça-feira.");
       break;
     case 4:
       System.out.println("Dia do rodizio: terça-feira.");
       break;
     case 5:
       System.out.println("Dia do rodizio: quarta-feira.");
       break;
     case 6:
       System.out.println("Dia do rodizio: quarta-feira.");
       break;
     case 7:
       System.out.println("Dia do rodizio: quinta-feira.");
       break;
     case 8:
       System.out.println("Dia do rodizio: quinta-feira.");
       break;
     case 9:
       System.out.println("Dia do rodizio: sexta-feira.");
       break;
     case 10:
       System.out.println("Dia do rodizio: sexta-feira.");
       break;
     default:
       System.out.println("O número escolhido é inválido! Digite um número entre 1 a 10.");
   }
 }
}