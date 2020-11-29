package main.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Customer_Web_Service_App {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext ctx =
                SpringApplication.run(Customer_Web_Service_App.class, args);
        Thread.sleep(1000000000000000000L);
        ctx.close();


    }
}
