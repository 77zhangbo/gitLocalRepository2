package com.msb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @SpringBootApplication
 * 1. 表明当前项目为springboot工程，这是一个启动类，也是应用程序的入口类
 * 2. 启动类需要放在根包路径之下（com.msb），
 *      因为他会默认扫描controller和service以及mapper等一些相关的组件
 *      扫描完了之后，会放入到spring/springboot的容器中
 */
@SpringBootApplication
//@ComponentScan("com.msb.mapper")
public class Springboot03Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03Application.class, args);
    }

}
