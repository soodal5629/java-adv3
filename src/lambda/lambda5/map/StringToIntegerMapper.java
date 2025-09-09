package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * 유틸리티성 메서드
 */
public class StringToIntegerMapper {
    public static List<Integer> map(List<String> list, Function<String, Integer> mapper) {
        List<Integer> res = new ArrayList<>();
        for (String s : list) {
            res.add(mapper.apply(s));
        }
        return res;
    }
}
