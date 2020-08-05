package hw7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phone {

        private Map<String, List<String>> map = new HashMap<>();

        public void add(String name, String phone) {
            if (!map.containsKey(name)) {
                map.put(name, new ArrayList<>());
            }
            map.get(name).add(phone);
        }

        public void get(String name) {
            System.out.println(name + " " + map.get(name));
        }
}
