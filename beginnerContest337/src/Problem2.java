import java.util.Optional;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Optional.ofNullable(sc).orElseThrow();

        String iString = sc.nextLine();

        if (iString.matches("A*B*C*")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}