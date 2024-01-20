import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Optional.ofNullable(sc).orElseThrow();

        int N = sc.nextInt();

        int locate = 1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < N; i++) {
            map.put(sc.nextInt(), locate);
            locate++;
        }

        StringBuilder builder = new StringBuilder();
        int currentTarget = map.get(-1);
        builder.append(currentTarget);

        for (int i = 0; i < N - 1; i++) {
            builder.append(" ");
            currentTarget = map.get(currentTarget);
            builder.append(currentTarget);

        }

        System.out.println(builder.toString());

    }
}