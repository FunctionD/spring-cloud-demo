package com.fd.serviceconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FD
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${neo.hello}")
    private String hello;

    @GetMapping("/hello")
    public String form() {
        return this.hello;
    }

}
