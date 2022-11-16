import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tabuada de multiplicação. Escreva o número de 1 a 10:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("Tabuada de multiplicação. Escreva o número de inicial:");
        Scanner in = new Scanner(System.in);
        int inicio = in.nextInt();
        System.out.println("Tabuada de multiplicação. Escreva o número final:");
        Scanner fm = new Scanner(System.in);
        int fim = fm.nextInt();
        for(int i = inicio; i <= fim; ++i) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}
