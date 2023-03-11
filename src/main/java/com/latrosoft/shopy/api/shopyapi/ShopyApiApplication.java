package com.latrosoft.shopy.api.shopyapi;

import com.latrosoft.shopy.api.shopyapi.Dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopyApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopyApiApplication.class, args);
    }

}
