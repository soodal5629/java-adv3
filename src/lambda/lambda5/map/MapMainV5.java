package lambda.lambda5.map;

import java.util.List;

public class MapMainV5 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234", "45678");

        // 문자열을 숫자로 변환
        List<Integer> numbers = GenericMapper.map(list, s -> Integer.valueOf(s));
        System.out.println("numbers = " + numbers);

        // 문자열의 길이를 반환
        List<Integer> lengths = GenericMapper.map(list, s -> s.length());
        System.out.println("lengths = " + lengths);

        List<String> fruits = List.of("apple", "banana", "orange");
        List<String> upperFruits = GenericMapper.map(fruits, s -> s.toUpperCase());
        System.out.println("upperFruits = " + upperFruits);
    }


}
