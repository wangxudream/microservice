package com.kataer.microservice.goods.controller;

import com.kataer.microservice.common.entity.Goods;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/microservice/goods")
public class GoodsRestController {
    @GetMapping("/getGoodsById/{goodsId}")
    public Goods getGoodsById(@PathVariable("goodsId") Integer goodsId) {
        Goods goods = new Goods();
        goods.setId(1);
        goods.setName("TV");
        goods.setPrice(5000.0);
        return goods;
    }
}
