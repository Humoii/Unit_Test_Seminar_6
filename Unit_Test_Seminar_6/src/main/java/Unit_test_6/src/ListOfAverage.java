package Unit_test_6.src;

import java.util.List;
import java.util.stream.IntStream;

public class ListOfAverage {

    public static Integer averageValue(List<Integer> list){
        int sum = 0;
        for (int a:list) {
            sum += a;
        }
        return sum/list.size();
    }
}
