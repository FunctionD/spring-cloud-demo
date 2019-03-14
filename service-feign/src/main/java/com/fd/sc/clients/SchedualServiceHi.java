package com.fd.sc.clients;

import com.fd.sc.hystrix.ServiceHiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = ServiceHiHystrix.class)
public interface SchedualServiceHi {

    @RequestMapping("/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
