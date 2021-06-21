import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("git");

        List<Integer> list = new ArrayList<>();
        list = IntStream.range(1, 10).boxed().collect(Collectors.toList());
        System.out.println(list);

        System.out.println(findLowestValue(list));
        System.out.println("Something");
    }

    public static Integer findLowestValue(List<Integer> list){
       return list.stream().min(Comparator.naturalOrder()).get();
    }
}
