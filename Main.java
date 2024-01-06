import java.util.Scanner;
/*******************************************************************************
 * 16) Escreva um programa que leia dois números e exiba mensagem informando o
 * valor do maior número e o valor do menor número. Se os dois números forem
 * iguais, o programa deve exibir mensagem informando este fato.
 *******************************************************************************/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número:  ");
         int PrimeiroNumero = sc.nextInt();

        System.out.print("Digite o segundo número:  ");
        int SegundoNumero = sc.nextInt();
        if(PrimeiroNumero > SegundoNumero){
            System.out.println("O " + PrimeiroNumero + " é maior que o " + SegundoNumero);//teste feito
        }else if(SegundoNumero > PrimeiroNumero) {
            System.out.println("O " + SegundoNumero + " é maior que o " + PrimeiroNumero);//teste feito
        }else{
            System.out.println("Os numeros são iguais!");//teste feito!!
        }
    }
}