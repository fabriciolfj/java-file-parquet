package com.github.fabriciolfj.bigdata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class RestExample {

    @GetMapping
    public Customer find() {
        var customer = new Customer("Fabricio", UUID.randomUUID().toString());

        return customer;
    }
}
