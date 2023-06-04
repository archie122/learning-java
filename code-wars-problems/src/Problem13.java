import java.util.*;
public class Problem13 {
    public int romanToInt(String s) {
        int result = 0;
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        for (int i = 0; i < s.length(); i++){
            result += map.get(s.substring(i, i+1));
        }




        return result;
    }
}
