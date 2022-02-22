import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaTest {
    public static void main(String[] args) {
//        List list = new ArrayList(10);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        System.out.println(list.size());

//        int i1 = Integer.MAX_VALUE;
//        int i2 = Integer.MAX_VALUE;
//        System.out.println(i1 + i2);

        List<String> numbers = new ArrayList(Arrays.asList("first", "second", "third"));
        for (String number : numbers) {
            if ("third".equals(number)) {
                numbers.add("fourth");
            }
        }
        System.out.println(numbers.size());
    }
}
