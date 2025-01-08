package com.youcode.sudest_market.exception;

public class AlreadyExistException extends RuntimeException {
    public AlreadyExistException(String field, String value) {
        super(String.format("%s with value '%s' already exists", field, value));
    }
}