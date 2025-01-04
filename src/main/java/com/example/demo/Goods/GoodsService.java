package com.example.demo.Goods;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class GoodsService {

    public List<Goods> getGoods() {
        return List.of(
                new Goods(
                        "Milk",
                        3.39f,
                        LocalDate.of(2025, 1, 15),
                        3),
                new Goods(
                        "Water",
                        2.29f,
                        LocalDate.of(2025, 12, 12),
                        2));
    }
}
