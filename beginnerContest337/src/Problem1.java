import java.util.Optional;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Optional.ofNullable(sc).orElseThrow();

        int N = sc.nextInt();

        int intTakahashi = 0;
        int intAoki = 0;

        for (int i = 0; i < N; i++) {
            intTakahashi += sc.nextInt();
            intAoki += sc.nextInt();
        }

        if (intTakahashi > intAoki) {
            System.out.println("Takahashi");
        } else if (intTakahashi == intAoki) {
            System.out.println("Draw");
        } else {
            System.out.println("Aoki");
        }
    }
}