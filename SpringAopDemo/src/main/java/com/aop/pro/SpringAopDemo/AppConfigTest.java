package com.aop.pro.SpringAopDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.aop.pro")
@EnableAspectJAutoProxy
public class AppConfigTest {

}
