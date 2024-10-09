
import java.util.*;

public class ExecutiveEileenEffectiveEmails {
    public static List<String> getEmail(List<String> nameList) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();
        for (String name : nameList) {
            String key;
            if (name.contains("’")) {
                key = (name.substring(0, name.indexOf("’"))).concat(name.substring(name.indexOf("’") + 1, name.length() - 1)).toLowerCase().replace(" ", ".").concat("@ucc.ie");
            } else {
                key = name.toLowerCase().replace(" ", ".").concat("@ucc.ie");
            }
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
                map.put(key.substring(0, key.length() - 7) + map.get(key) + key.substring(key.length() - 7), 1);
                result.add(key.substring(0, key.length() - 7) + map.get(key) + key.substring(key.length() - 7));
            } else {
                map.put(key, 1);
                result.add(key);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bastien Pietropaoli");
        list.add("Milan De Cauwer");
        list.add("Raffaele Baldassini");
        list.add("Eduardo Vyhmeister");
        list.add("Iarfhlaith O’Sullivan");
        list.add("Milan De Cauwer");
        System.out.println(getEmail(list));
    }

}
