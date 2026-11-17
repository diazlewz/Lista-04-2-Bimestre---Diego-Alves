import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double acumulador = 0;
        double media;

        for (int i = 0; i <= 3; i++){
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            acumulador += notas[i];
        }

        media = acumulador / 4;

        if (media >= 6) {
            System.out.println("Você está aprovado! " + " Sua média é: " + media);
        }else {
            System.out.println("Você está reprovado!" + "Sua média é: " + media);
            }


        }
    }
