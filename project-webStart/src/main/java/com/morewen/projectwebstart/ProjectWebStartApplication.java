package com.morewen.projectwebstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Wangbw
 */
@SpringBootApplication
@ComponentScan("com.morewen")
@MapperScan("com.morewen.projectsystem.mapper")
public class ProjectWebStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectWebStartApplication.class, args);
    }

}
