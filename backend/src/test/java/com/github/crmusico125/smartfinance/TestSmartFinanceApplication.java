package com.github.crmusico125.smartfinance;

import org.springframework.boot.SpringApplication;

public class TestSmartFinanceApplication {

    public static void main(String[] args) {
        SpringApplication.from(SmartFinanceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
