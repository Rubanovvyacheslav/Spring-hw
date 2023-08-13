package sky.prospringhw.services;


import org.springframework.stereotype.Service;
import sky.prospringhw.model.Basket;

import java.util.List;
import java.util.Map;

@Service
public class BasketService {

    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }


    public List<Integer> add(List<Integer> id) {
        return basket.add(id);
    }

    public Map<Integer, Integer> get() {
        return basket.get();
    }
}
