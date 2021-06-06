package com.dawson.srs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * 项目入口启动文件
 *
 */
@SpringBootApplication
@EnableJpaAuditing
@ServletComponentScan
public class SrsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrsApplication.class, args);
    }

}
