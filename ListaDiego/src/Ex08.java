import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            if (notas[i] >= 6) {
                aprovados++;
            } else if (notas[i] >= 4) {
                recuperacao++;
            } else {
                reprovados++;
            }
        }

        System.out.println("Aprovados: " + aprovados);
        System.out.println("De recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);
    }
}

