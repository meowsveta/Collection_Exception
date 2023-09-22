import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    //Поменять местами ключи и значения в HashMap.

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<Integer, String> newMap;

        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        System.out.println(hashMap);
        newMap = hashMap.entrySet().stream().collect(Collectors.toMap(HashMap.Entry::getValue, HashMap.Entry::getKey));
        System.out.println(newMap);

    }



}
