package com.yxc.common.aspect;

import com.yxc.common.annotations.MyAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author yangx
 */
@Aspect
@Component
@Slf4j
public class MyFirstAspect {
    /**
     * 定义切入点，可以直接写切入的注解
     * **切入的注解要写全路径
     */
    @Pointcut("@annotation(com.yxc.common.annotations.MyAnnotation)")
    public void annotationPointcut() {
    }

    @Before("annotationPointcut()")
    public void beforePointcut(JoinPoint joinPoint) {
        execute("开始",joinPoint);
    }
    @After("annotationPointcut()")
    public void afterPointcut(JoinPoint joinPoint) {
        execute("结束",joinPoint);
    }

    private void execute(String agre,JoinPoint joinPoint){
        MethodSignature methodSignature =  (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        String value = annotation.value();
        log.info(agre+":{}",value);
    }

}
