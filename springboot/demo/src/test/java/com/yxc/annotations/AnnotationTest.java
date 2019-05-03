package com.yxc.annotations;

import com.yxc.common.annotations.MyAnnotation;
import com.yxc.common.annotations.MyLog;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Component
@Slf4j
public class AnnotationTest {

    @Test
    @MyLog
    public void annotationValueTest(){
       log.info("测试注解的值:{}");
    }
}
