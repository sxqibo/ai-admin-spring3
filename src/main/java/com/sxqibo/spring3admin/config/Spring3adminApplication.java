package com.sxqibo.spring3admin.config;


import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@ComponentScan("com.sxqibo")
@SpringBootApplication
@MapperScan(basePackages = "com.sxqibo.spring3admin.mapper")
public class Spring3adminApplication {

    private static final Logger LOG = LoggerFactory.getLogger(Spring3adminApplication.class);
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Spring3adminApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}