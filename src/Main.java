import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list = IntStream.range(1, 20).boxed().collect(Collectors.toList());

        System.out.println(findLowestValue(list));
        System.out.println("Something");
    }

    public static Integer findLowestValue(List<Integer> list){
       return list.stream().min(Comparator.naturalOrder()).get();
    }

    public static Integer findMaxValue(List<Integer> list){
        return list.stream().max(Comparator.naturalOrder()).get();
    }
}
