import Unit_test_6.src.ComparisonOfAverage;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TestComparisonOfAverage {
    @Test
    void moreLessPTestMoreTwo(){
        int sum1 = 2;
        int sum2 = 3;

        assertThat(ComparisonOfAverage.moreLess(sum1,sum2)).
                isEqualTo("Второй список имеет большее среднее значение");
    }

    @Test
    void moreLessPTestMoreOne(){
        int sum1 = 2;
        int sum2 = 1;

        assertThat(ComparisonOfAverage.moreLess(sum1,sum2)).
                isEqualTo("Первый список имеет большее среднее значение");
    }
    @Test
    void moreLessPTestEqual(){
        int sum1 = 2;
        int sum2 = 2;

        assertThat(ComparisonOfAverage.moreLess(sum1,sum2)).
                isEqualTo("Средние значения равны");
    }

}
