package com.example.learn.controller;

import com.example.learn.controller.exception.APIException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import com.example.learn.util.JWTUtil;

@RequestMapping
@RestController
public class IndexController {

    @Value("${app.secret}")
    private String secret;

    @PostMapping("/login")
    @ResponseBody
    public Map<String, Object> login(@RequestBody Map<String, String> params)  throws APIException {
        String userId = params.get("user_id");
        Map<String, Object> resultMap = new HashMap<>();
        if (userId != null) {
            resultMap.put("token", JWTUtil.getToken(secret, userId));
        } else {
            throw new APIException(400, "user_id is empty");
        }
        return resultMap;
    }

    @GetMapping("/qiniu/image/token")
    @ResponseBody
    public Map<String, Object> getQiniuImageToken() {
        Map<String, Object> resultMap = new HashMap<>();
        return resultMap;
    }
}
