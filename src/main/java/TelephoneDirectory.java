import java.util.*;

public class TelephoneDirectory {

    ArrayList<String> numberPhoneList = new ArrayList<>();
    Map<String, ArrayList<String>> map = new HashMap<>();

    public void add(String surName, String numberPhone) {

        if (map.containsKey(surName)) {
            numberPhoneList = map.get(surName);
        } else {
            numberPhoneList = new ArrayList<>();
        }
        numberPhoneList.add(numberPhone);
        map.put(surName, numberPhoneList);
    }

    public String get(String surName) {
        return surName +" = "+ map.get(surName);
    }

}