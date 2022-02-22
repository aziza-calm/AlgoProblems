import java.util.*;
import java.util.stream.Collectors;

public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Integer> n = new ArrayList<>();
        List<List<Integer>> sets = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            in.nextLine();
            n.add(in.nextInt());
            in.nextLine();
            List<Integer> b = new ArrayList<>();
            for (int j = 0; j < n.get(i); j++) {
                b.add(in.nextInt());
            }
            sets.add(b);
        }
        for (List<Integer> a : sets) {
            List<Integer> remaining = new ArrayList<>(a);
            Integer currentGcd = Collections.max(a);
            List<Integer> target = new ArrayList<>();
            target.add(currentGcd);
            remaining.remove(currentGcd);

            while (remaining.size() > 0) {
                List<Integer> gcds = new ArrayList<>();
                for (Integer x : remaining) {
                    gcds.add(gcd(currentGcd, x));
                }
                Integer maxGcd = Collections.max(gcds);
                Integer nextElement = remaining.get(gcds.indexOf(maxGcd));
                target.add(nextElement);
                remaining.remove(nextElement);
                currentGcd = maxGcd;
            }
            System.out.println(target.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" ")));

        }
    };

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
