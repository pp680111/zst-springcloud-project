package com.zst.cloud.demoservice;

import com.zst.cloud.api.Result;
import com.zst.cloud.api.demoservice.DemoServiceApi;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoServiceApiProvider implements DemoServiceApi {
    @Override
    public Result<String> hello(@RequestParam("id") String id) {
        return Result.success("hello " + id);
    }
}
