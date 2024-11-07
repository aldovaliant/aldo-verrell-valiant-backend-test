import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int maxNumberInput = 5000;
        findSelfNumbers(maxNumberInput);
    }

    private static void findSelfNumbers(int maxNumberInput) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 1; i < maxNumberInput; i++) {
            if (isSelfNumber(i)) resultList.add(i);
        }
        System.out.println(resultList);
    }

    private static boolean isSelfNumber(int num) {
        // 87 -> 75, 75 % 10 = 5, 75 / 10 = 7,
        boolean result = true;
        for (int i = 1; i < num; i++) {
            int temp = i;
            int count = 0;
            while (temp > 0) {
                count += temp % 10;
                temp /= 10;
            }
            if (i + count == num) {
                result = false;
                break;
            }
        }
        return result;
    }
}