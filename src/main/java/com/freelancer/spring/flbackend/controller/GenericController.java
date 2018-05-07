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

    public ResponseEntity badRequest()
    {
        HashMap<String, Object> badReqRes = new HashMap<>();
        badReqRes.put("error", "Bad Request");
        return new ResponseEntity(badReqRes, HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity badRequestWithtMsg(String message)
    {
        HashMap<String, Object> badReqRes = new HashMap<>();
        badReqRes.put("error", message);
        return new ResponseEntity(badReqRes, HttpStatus.BAD_REQUEST);
    }

}
