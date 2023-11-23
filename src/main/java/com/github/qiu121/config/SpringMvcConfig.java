package com.github.qiu121.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author qiu121
 * @version 1.0
 * @date 2023/11/19
 */
@Configuration
@ComponentScan({"com.github.qiu121.controller"})
@EnableWebMvc
public class SpringMvcConfig {
}


