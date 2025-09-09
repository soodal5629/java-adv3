package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV3 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        // 문자열을 숫자로 변환
        List<Integer> numbers = mapStringToInteger(list, s -> Integer.valueOf(s));
        System.out.println("numbers = " + numbers);

        // 문자열의 길이를 반환
        List<Integer> lengths = mapStringToInteger(list, s -> s.length());
        System.out.println("lengths = " + lengths);
    }

    private static List<Integer> mapStringToInteger(List<String> list, Function<String, Integer> mapper) {
        List<Integer> res = new ArrayList<>();
        for (String s : list) {
            res.add(mapper.apply(s));
        }
        return res;
    }
}
