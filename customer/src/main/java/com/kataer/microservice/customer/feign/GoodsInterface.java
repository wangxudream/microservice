package com.kataer.microservice.customer.feign;

import com.kataer.microservice.common.entity.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "microservice-goods")
@RequestMapping("/microservice/goods")
public interface GoodsInterface {

    @GetMapping(value = "/getGoodsById/{goodsId}")
    Goods getGoodsById(@PathVariable("goodsId") Integer goodsId);

}
