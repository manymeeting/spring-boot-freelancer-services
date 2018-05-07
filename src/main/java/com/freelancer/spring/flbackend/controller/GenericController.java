package com.freelancer.spring.flbackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;

public class GenericController {

    public <T> ResponseEntity<T> success(T data)
    {
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    public ResponseEntity notFound()
    {
        HashMap<String, Object> notFoundRes = new HashMap<>();
        notFoundRes.put("error", "Not Found");
        return new ResponseEntity(notFoundRes, HttpStatus.NOT_FOUND);
    }

}
