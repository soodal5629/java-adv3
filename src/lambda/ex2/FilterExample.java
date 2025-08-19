package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class FilterExample {
    // 고차 함수, 함수를 인자로 받아서 조건에 맞는 요소만 뽑아내는 filter
    public static List<Integer> filter(List<Integer> list, MyPredicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int val : list) {
            if (predicate.test(val)) {
                result.add(val);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);
        System.out.println("원본 리스트: " + numbers);
        // 1. 음수(negative)만 뽑아내기
        // 코드 작성
        MyPredicate negative = (value) -> value < 0;
        // 2. 짝수(even)만 뽑아내기
        MyPredicate even = (value) -> value % 2 == 0;
        // 코드 작성
        System.out.println(filter(numbers, negative));
        // filter(numbers, value -> value < 0);
        System.out.println(filter(numbers, even));
        // filter(numbers, value -> value % 2 == 0);
    }
}
