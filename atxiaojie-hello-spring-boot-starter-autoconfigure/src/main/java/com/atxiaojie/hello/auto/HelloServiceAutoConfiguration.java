package com.atxiaojie.hello.auto;

import com.atxiaojie.hello.bean.HelloProperties;
import com.atxiaojie.hello.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: HelloServiceAutoConfigure
 * @Description: 配置类
 * @author: zhouxiaojie
 * @date: 2021/11/20 16:50
 * @Version: V1.0.0
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class)//两个功能第一是跟配置绑定，第二是把HelloProperties放到容器中
public class HelloServiceAutoConfiguration {

    @ConditionalOnMissingBean(HelloService.class)
    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        return helloService;
    }
}
