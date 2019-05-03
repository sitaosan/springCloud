package com.yxc.common.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @Package: com.example.config
 * @Description: 定制一个接口
 * @author: Ciwei
 * @date: 17/2/23 下午4:20
 */
@Documented
@Retention(RUNTIME)
@Target(METHOD)
public @interface MyLog {
    String value() default "日志注解";
}
