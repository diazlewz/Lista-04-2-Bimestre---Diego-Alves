public class Ex01 {
    public static void main(String[] args) {

        double[] notas = {7.5, 6.0, 8.0, 5.5};
        int acumulador = 0;
        for (int i = 1; i <= notas.length; i++) {
            acumulador++;

        }
        System.out.println("A quantia de notas é: " + acumulador + "." + " A primeira nota é: " + notas[0]);
        System.out.println("A última nota é " +  notas[notas.length - 1]);
    }
    }
