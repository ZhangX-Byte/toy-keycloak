package com.toy.keycloak.webapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhang_Xiang
 * @since 2021/5/11 16:56:57
 */
@RestController
@RequestMapping("temp")
public class TempController {

    @GetMapping("weather")
    public String weather(){
        return "晴天☀️";
    }

}
