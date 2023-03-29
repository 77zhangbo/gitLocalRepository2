package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @ResponseBody   /*将Java对象转化为json格式的数据*/
    @RequestMapping("thirdController") /* 映射 */
    public String thirdController(){return "hello springboot03";}
}
