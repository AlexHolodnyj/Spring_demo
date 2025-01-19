package com.example.demo;

import com.example.demo.Goods.Goods;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
//@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        //http://localhost:8080/api/v1/goods
    }

//    @GetMapping
//    public List<Goods> checkList() {
//        return List.of(
//                new Goods(
//                        "Milk",
//                        3.39f,
//                        LocalDate.of(2025, 1, 15),
//                        3),
//                new Goods(
//                        "Water",
//                        2.29f,
//                        LocalDate.of(2025, 12, 12),
//                        2));
//    }


}
