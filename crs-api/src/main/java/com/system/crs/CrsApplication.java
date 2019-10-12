package com.system.crs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * 程序启动入口
 *
 * @author yingmuhuadao
 * @date 2019/10/12
 */
@RestController
@SpringBootApplication
public class CrsApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrsApplication.class,args);
    }
}
