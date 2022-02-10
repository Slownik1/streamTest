import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Supplier<Stream<String>> streamOfNames = () -> Stream.of("Adam", "Asia", "Kasia", "Dawid", "Mateusz", "Ola", "Przemek", "Michal");

        List<String> longerThanFive = streamOfNames.get()
                                            .filter(e -> e.length() <5)
                                            .collect(Collectors.toList());

        longerThanFive.forEach(System.out::println);

        System.out.println("---------------------------------");

        List<String> namesInOrder = streamOfNames.get()
                .sorted()
                .collect(Collectors.toList());

        namesInOrder.forEach(System.out::println);

        System.out.println("---------------------------------");

        List<String> subName = streamOfNames.get()
                .map(e->e.substring(0,1))
                .map(e->e.toLowerCase())
                .collect(Collectors.toList());

        subName.forEach(System.out::println);

    }

}
