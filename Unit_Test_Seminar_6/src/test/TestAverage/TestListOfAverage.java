import Unit_test_6.src.ListOfAverage;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class TestListOfAverage {
    @Test
    void averageValueTest(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertThat(ListOfAverage.averageValue(list)).isEqualTo(2);
    }
}
