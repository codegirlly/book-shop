package com.ly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/4/4
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    /**
     * 生成订单
     */
    @RequestMapping("/")
    String makeOrder(Integer carId){


        return null;
    }
}
