package com.zst.cloud.api.demoservice;

import com.zst.cloud.api.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "demo-service", contextId = "demoService")
@RequestMapping("/dev")
public interface DemoServiceApi {
    @GetMapping("/hello")
    Result<String> hello(@RequestParam("id") String id);
}
