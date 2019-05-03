package com.yxc;

import com.yxc.common.annotations.MyAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com.yxc.common.*")
@MapperScan("com.yxc.dao")
@Slf4j
@EnableAspectJAutoProxy
public class DemoApplication {

    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        SpringApplication.run(DemoApplication.class, args);
        long endTime = System.currentTimeMillis();
        log.info("=========项目启动完毕共耗时:{}",((endTime-beginTime)/1000)+"秒");

    }

}
