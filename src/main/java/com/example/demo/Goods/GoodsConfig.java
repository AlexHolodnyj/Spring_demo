package com.example.demo.Goods;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class GoodsConfig {
    @Bean
    CommandLineRunner commandLineRunner(GoodsRepository repository) {
        return args -> {
            Goods milk = new Goods(
                    "Milk",
                    3.39f,
                    LocalDate.of(2025, 1, 25),
                    3);
            Goods water = new Goods(
                    "Water",
                    2.29f,
                    LocalDate.of(2025, 12, 12),
                    2);
            repository.saveAll(List.of(milk, water));
        };
    }
}
