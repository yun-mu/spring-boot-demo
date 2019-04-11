package com.example.learn.controller.exception;

public class APIException extends Exception {
    private int code;

    public APIException(String message) {
        super(message);
    }

    public APIException(int code, String message) {
        super(message);
        this.code = code;
    }

    public APIException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
