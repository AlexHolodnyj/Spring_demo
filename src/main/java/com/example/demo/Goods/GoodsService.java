package com.example.demo.Goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {

    private final GoodsRepository goodsRepository;

    @Autowired
    public GoodsService(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }


    public List<Goods> getGoods() {
        return goodsRepository.findAll();
    }

    public void addNewGoods(Goods goods) {
        goodsRepository.save(goods);
    }

    public void deleteGoodsById(Long goodsId) {
        boolean exists = goodsRepository.existsById(goodsId);
        if (!exists) {
            throw new IllegalStateException("Goods with ID: " + goodsId + " not found");
        }
        goodsRepository.deleteById(goodsId);
    }
}
