package Unit_test_6.src;

public class ComparisonOfAverage {

    public static String moreLess(Integer sum1, Integer sum2){
        if (sum1 > sum2){
            return "Первый список имеет большее среднее значение";
        }
        if (sum2 > sum1){
            return  "Второй список имеет большее среднее значение";
        }
        return "Средние значения равны";
    }
}
