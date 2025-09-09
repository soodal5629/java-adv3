package lambda.lambda5.filter;

import java.util.List;

/**
 * 제네릭 필터 이용해서 다양한 데이터 타입 필터링 가능
 */
public class FilterMainV5 {
    public static void main(String[] args) {
        // 1. 숫자 사용 필터
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6,7,8,9,10);
        // 짝수만 거르기
        List<Integer> numberResult = GenericFilter.filter(numbers, x -> x % 2 == 0);
        System.out.println("numberResult = " + numberResult);

        // 2. 문자 사용 필터
        List<String> strings = List.of("A", "BB", "CCC");
        List<String> stringResult = GenericFilter.filter(strings, s -> s.length() >= 2);
        System.out.println("stringResult = " + stringResult);
    }


}
