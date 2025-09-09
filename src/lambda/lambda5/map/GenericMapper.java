package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * 제네릭을 이용한 유틸리티성 메서드
 */
public class GenericMapper {
    public static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
        List<R> res = new ArrayList<>();
        for (T t : list) {
            res.add(mapper.apply(t));
        }
        return res;
    }
}
