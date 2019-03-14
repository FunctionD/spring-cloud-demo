package com.fd.sc.hystrix;

import com.fd.sc.clients.SchedualServiceHi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author FD
 */
@Component
public class ServiceHiHystrix implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "service-hi调用失败，这是熔断器返回。";
    }
}
