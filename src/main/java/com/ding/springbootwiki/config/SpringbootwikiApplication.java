package com.ding.springbootwiki.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.ding.springbootwiki.mapper")
@ComponentScan("com.ding")
@SpringBootApplication
@EnableScheduling
@EnableAsync
public class SpringbootwikiApplication {

    private static final Logger LOG = LoggerFactory.getLogger(SpringbootwikiApplication.class);
    public static void main(String[] args) {
        //SpringApplication.run(SpringbootwikiApplication.class, args);
        SpringApplication app = new SpringApplication(SpringbootwikiApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("地址: \thttp://localhost:{}", env.getProperty("server.port"));
    }

}
