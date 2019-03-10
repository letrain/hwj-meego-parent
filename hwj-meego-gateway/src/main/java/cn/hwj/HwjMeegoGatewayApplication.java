package cn.hwj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableDiscoveryClient
public class HwjMeegoGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HwjMeegoGatewayApplication.class, args);
    }
}
