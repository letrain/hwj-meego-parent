package cn.hwj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HwjMeegoEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HwjMeegoEurekaApplication.class, args);
    }
}
