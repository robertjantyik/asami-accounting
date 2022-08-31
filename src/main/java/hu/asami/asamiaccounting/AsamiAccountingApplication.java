package hu.asami.asamiaccounting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "hu.asami" })
public class AsamiAccountingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsamiAccountingApplication.class, args);
    }

}
