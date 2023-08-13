package sky.prospringhw.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@SessionScope
public class Basket {

    private final Map<Integer, Integer> orders = new HashMap<>();

    public List<Integer> add(List<Integer> id) {
        for (Integer i : id) {
            if (orders.containsKey(i)) {
                orders.put(i, orders.get(i) + 1);
            } else {
                orders.put(i, 1);
            }
        }
        return id;
    }

    public Map<Integer, Integer> get() {
        return orders;
    }
}
