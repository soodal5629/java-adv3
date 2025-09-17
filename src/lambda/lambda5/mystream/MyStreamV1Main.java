package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV1Main {
    public static void main(String[] args) {
        // 짝수만 남기고 남은 값의 2배를 반환
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        returnValue(numbers);
        methodChain(numbers);
    }

    private static void returnValue(List<Integer> numbers) {
        MyStreamV1 stream = new MyStreamV1(numbers);
        MyStreamV1 filteredStream = stream.filter(n -> n % 2 == 0);
        System.out.println("filteredStream.toList() = " + filteredStream.toList());
        MyStreamV1 mapped = filteredStream.map(n -> n * 2);
        System.out.println("mapped.toList() = " + mapped.toList());
    }

    // 체인 형식
    private static void methodChain(List<Integer> numbers) {
        MyStreamV1 stream = new MyStreamV1(numbers);
        List<Integer> res = stream.filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();
        System.out.println("res = " + res);
    }
}
