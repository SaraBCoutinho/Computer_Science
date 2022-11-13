//Algoritmo Dias de Aula 
import java.util.Scanner;
public class Switch {
 public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  System.out.println("Digite o numero do dia da semana, seguindo a seguinte sequência: 1-Domingo, 2-Segunda-feira, 3-Terça-feira, 4-Quarta-feira, 5-Quinta-feira, 6-Sexta-feira, 7-Sabado.");
  int numero = entrada.nextInt();
   switch (numero) {
     case 1:
       System.out.println("Domingo nao tem aula");
       break;
     case 2:
       System.out.println(" Aulas da segunda-feira: Logica de Programaçao e Algoritmos.");
       break;
     case 3:
       System.out.println("Aulas da terça-feira: Logica Matematica.");
       break;
     case 4:
       System.out.println("Aulas da quarta-feira: Interaçao Humano-Computador.");
       break;
     case 5:
       System.out.println("Aulas da quinta-feira: Introduçao à Programaçao Estruturada.");
       break;
     case 6:
       System.out.println("Aulas da sexta-feira: Programaçao de Dispositivos Moveis.");
       break;
     case 7:
       System.out.println("Aulas do Sabado: autoestudo.");
       break;
     default:
       System.out.println("O número escolhido para o Dia é inválido!");
   }
 }
}