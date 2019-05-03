package com.yxc.common.aspect;

import com.yxc.common.annotations.MyLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LogAspect {
    @Pointcut("@annotation(com.yxc.common.annotations.MyLog)")
    private void cut() { }

    /**
     * 定制一个环绕通知
     * @param joinPoint
     */
    @Around("cut()")
    public void advice(ProceedingJoinPoint joinPoint){
        System.out.println("环绕通知之开始");
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("环绕通知之结束");
    }

    //当想获得注解里面的属性，可以直接注入改注解
    @Before("cut()&&@annotation(myLog)")
    public void record(JoinPoint joinPoint, MyLog myLog) {
        System.out.println(myLog.value());
    }
}
