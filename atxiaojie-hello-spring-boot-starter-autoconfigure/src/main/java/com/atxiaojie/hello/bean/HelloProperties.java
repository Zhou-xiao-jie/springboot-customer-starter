package com.atxiaojie.hello.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName: HelloProperties
 * @Description: 配置属性类
 * @author: zhouxiaojie
 * @date: 2021/11/20 16:44
 * @Version: V1.0.0
 */
@ConfigurationProperties("atxiaojie.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
