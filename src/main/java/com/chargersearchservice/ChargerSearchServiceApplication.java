package com.chargersearchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ChargerSearchServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ChargerSearchServiceApplication.class, args);
  }

}
