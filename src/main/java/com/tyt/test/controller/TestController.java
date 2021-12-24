package com.tyt.test.controller;

import com.tyt.test.param.ValidationParam;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhy
 * @date 2021/12/24 11:13
 * @Description
 */
@RestController
@RequestMapping("/test")
public class TestController {
    /**
     * 参数校验测试
     * @return
     */
    @PostMapping("/valid")
    public String validation(@RequestBody @Validated ValidationParam validationParam){
        return "校验通过";
    }
}
