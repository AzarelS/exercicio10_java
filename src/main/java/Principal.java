
import java.util.Scanner;

/**
 *
 * @author 10725213830
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, SOMA;
        System.out.println("Escreva o primeiro numero:");
        A = sc.nextInt();
        System.out.println("Escreva o segundo numero:");
        B = sc.nextInt();
        SOMA = A + B;

        if (SOMA > 10) {
            System.out.println("A soma dos dois numeros e: " + SOMA);
        } else {
            System.out.println("A soma dos dois numero e menor ou igual a 10");
        }
    }
}
