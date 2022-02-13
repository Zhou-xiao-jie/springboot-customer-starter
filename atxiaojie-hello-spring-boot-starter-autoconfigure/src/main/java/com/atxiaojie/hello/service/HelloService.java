package com.atxiaojie.hello.service;

import com.atxiaojie.hello.bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: HelloService
 * @Description: HelloService不要放在容器中
 * @author: zhouxiaojie
 * @date: 2021/11/20 16:40
 * @Version: V1.0.0
 */
public class HelloService {

    @Autowired
    private HelloProperties helloProperties;

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String sayHello(String userName){
        return helloProperties.getPrefix() + ": " + userName + "(" + age + ")" + "-->" + helloProperties.getSuffix();
    }
}
