package com.example.learn.controller.exception;

import lombok.Data;

@Data
public class APIErrorInfo {
    private int code;
    private String message;
    private Object data;

    public APIErrorInfo(String message) {
        this.message = message;
    }

    public APIErrorInfo(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public APIErrorInfo(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
