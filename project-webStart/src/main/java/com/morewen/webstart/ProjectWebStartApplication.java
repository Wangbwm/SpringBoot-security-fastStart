package com.morewen.webstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Wangbw
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.morewen.common.core", "com.morewen.common.securityConfig", "com.morewen.models.system", "com.morewen.models.test"})
@MapperScan("com.morewen.models.system.mapper")
public class ProjectWebStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectWebStartApplication.class, args);
    }

}
