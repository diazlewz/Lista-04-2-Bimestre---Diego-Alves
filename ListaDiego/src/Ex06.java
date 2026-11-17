import java.util.Scanner;
public class Ex06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do empréstimo: ");
        double valor = sc.nextDouble();
        System.out.print("Taxa de juros mensal (%): ");
        double taxa = sc.nextDouble();

        double[] devido = new double[12];

        for (int i = 0; i < devido.length; i++) {
            int mes = i + 1;
            devido[i] = valor + valor * taxa / 100 * mes;
        }

        for (int i = 0; i < devido.length; i++) {
            System.out.printf("Mês %d: R$ %.2f%n", i + 1, devido[i]);
        }
    }
}












