package com.kataer.microservice.customer.controller;

import com.kataer.microservice.common.entity.Goods;
import com.kataer.microservice.customer.feign.GoodsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/microservice/customer")
public class CustomerController {
    @Autowired
    private GoodsInterface goodsInterface;

    @GetMapping("/viewgoods/{id}")
    public Goods viewGoods(@PathVariable("id") Integer goodsId) {
        return goodsInterface.getGoodsById(goodsId);
    }
}
