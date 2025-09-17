package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 필터와 맵을 모두 가진 스트림 클래스 버전  - static factory 추가
 */
public class MyStreamV2 {
    private List<Integer> internalList;

    // 외부에서 static factory만 사용하도록 private으로 막기
    private MyStreamV2(List<Integer> internalList) {
        this.internalList = internalList;
    }

    // 직접 생성자를 쓰는 것이 아니고 객체를 생성해주는 정적 메서드 생성 - 이것이 static factory
    public static MyStreamV2 of(List<Integer> integerList) {
        return new MyStreamV2(integerList);
    }

    public MyStreamV2 filter(Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer element : internalList) {
            if(predicate.test(element)) {
                filtered.add(element);
            }
        }
        return new MyStreamV2(filtered);
    }

    public MyStreamV2 map(Function<Integer, Integer> mapper) {
        List<Integer> mapped = new ArrayList<>();
        for (Integer element : internalList) {
            mapped.add(mapper.apply(element));
        }
        return new MyStreamV2(mapped);
    }

    public List<Integer> toList() {
        return internalList;
    }
}
