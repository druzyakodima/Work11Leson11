import java.util.*;
import java.util.stream.Collectors;

public class TestDriveList {
    public static void main(String[] args) {

        String[] words = {"long", "int", "short", "byte", "int", "byte", "byte", "byte", "int", "int", "byte"};

        System.out.println(Arrays.toString(words));

        Arrays.stream(words).collect(Collectors.toSet()).forEach(s -> System.out.println(s + " - " + Collections.frequency(List.of(words), s)));


       /* ArrayList<String> list = new ArrayList<>(Arrays.asList("long", "int", "short", "byte", "int", "byte", "byte", "byte", "int", "int", "byte"));
        System.out.println(list);
        new HashSet<>(list).forEach(s -> System.out.println(s + " - " + Collections.frequency(list, s)));*/


        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

        telephoneDirectory.add("Поттер", "89103245678");
        telephoneDirectory.add("Грейнджер", "89104567122");
        telephoneDirectory.add("Уизли", "89109876543");
        telephoneDirectory.add("Малфой", "89101234567");
        telephoneDirectory.add("Долгопупс", "89104329876");
        telephoneDirectory.add("Уизли", "89100981265");
        telephoneDirectory.add("Поттер", "89101237301");

        System.out.println(telephoneDirectory.get("Уизли"));
    }
}