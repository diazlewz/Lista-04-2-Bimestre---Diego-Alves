import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] precos = new double[5];
        double[] comDesconto = new double[5];

        for (int i = 0; i < precos.length; i++) {
            System.out.print("Preço do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            comDesconto[i] = precos[i] * 0.90;
        }

        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Produto %d: originalmente R$ %.2f | COM desconto R$ %.2f%n",
                    i + 1, precos[i], comDesconto[i]);
        }
    }
}

