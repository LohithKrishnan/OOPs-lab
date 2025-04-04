import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class Package3 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 25, 30, 45, 60);
        Predicate<Integer> isEven = x -> x % 2 == 0;

        List<Integer> evenNums = nums.stream().filter(isEven).collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNums);
    }
}
