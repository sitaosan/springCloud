package com.yxc.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.yxc.common.utils.SpringBeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Component
@Slf4j
public class DataSourceConfigTest {

    @Test
    public void aboutDataSourceTest(){
        DruidDataSource dataSource = (DruidDataSource) SpringBeanUtil.getBean("duridDataSource");
        log.info("==DataSource--Filter--====:{}",dataSource.getFilterClassNames().toString());
        //druid的过滤器跟web的Filter
        List<String> list = dataSource.getFilterClassNames();
        for (int i = 0; i < list.size(); i++) {
            log.info("===druid的过滤器跟Filter==:{},",list.get(i));
        }
        log.info("==DataSource====:{}",dataSource.toString());
        log.info("=======BeanUtilsTest=======");
        FilterRegistrationBean filterRegistrationBean = (FilterRegistrationBean)SpringBeanUtil.getBean("webStatFilterRegistrationBean");
        log.info("=====Filter Name=====:{}", filterRegistrationBean.getFilter().getClass().getName());
    }
}
