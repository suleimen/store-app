package com.store.app;

import com.store.model.ProductModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.store.persistence"})
@EntityScan(basePackages = {"com.store.model"})
@ComponentScan(basePackages = {"com.store.web.*","com.store.admin.*", "com.store.services"})
public class StoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class);
    }
}
