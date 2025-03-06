import java.util.ArrayList;
import java.util.List;

public class SumOfIntegers {
    
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static Integer parseStringToInteger(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(parseStringToInteger("10"));
        numbers.add(parseStringToInteger("20"));
        numbers.add(parseStringToInteger("30"));
        int sum = calculateSum(numbers);
        System.out.println("The sum of the list of integers is: " + sum);
    }
}
