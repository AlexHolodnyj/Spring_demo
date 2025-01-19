package com.example.demo.Goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/goods")
public class GoodsController {
    private final GoodsService goodsService;

    @Autowired
    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @GetMapping
    public List<Goods> getGoods(){
        return goodsService.getGoods();
    }

    @PostMapping
    public void addNewGoods(@RequestBody Goods goods) {
        goodsService.addNewGoods(goods);
    }
}
