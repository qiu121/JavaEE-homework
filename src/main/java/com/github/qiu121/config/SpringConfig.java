package com.github.qiu121.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author qiu121
 * @version 1.0
 * @date 2023/11/19
 * Spring配置类
 */
@Configuration
@ComponentScan({"com.github.qiu121.service"})
@MapperScan({"com.github.qiu121.mapper"})
@PropertySource({"classpath:jdbc.properties"})
@Import({MybatisConfig.class})
public class SpringConfig {
}
