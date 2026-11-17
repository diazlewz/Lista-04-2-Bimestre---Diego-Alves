import java.util.Scanner;
public class Ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] preco = new double[5];
        double total = 0;

        for (int i = 0; i < preco.length; i++) {
            System.out.print("Preço do Produto " + (i + 1) + ": ");
            preco[i] = sc.nextDouble();
            total += preco[i];
        }

        System.out.println("Preços lidos: ");
        for (int i = 0; i < preco.length; i++) {
            System.out.printf("Produto %d: R$ %.2f%n", i + 1, preco[i]);
        }
        System.out.printf("Total da compra: R$ %.2f%n", total);




    } }