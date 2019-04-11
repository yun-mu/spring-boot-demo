package com.example.learn.controller.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class APIExceptionHandler {

    @ExceptionHandler(APIException.class)
    @ResponseBody
    public APIErrorInfo jsonErrorHandler(HttpServletRequest req, APIException e) {
        return new APIErrorInfo(e.getCode(), e.getMessage());
    }
}
