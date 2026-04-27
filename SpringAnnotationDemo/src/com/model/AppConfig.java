package com.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@configuration - it will allow u to configure the class& this xml file without using xml file, it wuill create xml file internally
//@componentScan - it will covert the pojo class inform of bean/annotation dont need xml file also scan all the pojo classes

@Configuration
@ComponentScan(basePackages = "com.model")
public class AppConfig {

}
