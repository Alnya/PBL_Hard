import java.util.Scanner;

public class Perceptron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, N = scanner.nextInt(), frag = 0;
        double B = scanner.nextDouble(), a, w, tmp = 0;
        for (i = 0; i < N; i++) {
            a = scanner.nextDouble();
            w = scanner.nextDouble();
            tmp += a * w;
        }
        if (0 < tmp + B) {
            frag = 1;
        }
        System.out.println(frag);
    }
}
