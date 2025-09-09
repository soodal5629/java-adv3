package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GenericFilter {
    // 어떤 타입이든 쓸 수 있는 제네릭 유틸리티성 메서드
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T t : list) {
            if(predicate.test(t)) {
                filtered.add(t);
            }
        }
        return filtered;
    }
}
