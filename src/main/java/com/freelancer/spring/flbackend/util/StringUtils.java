package com.freelancer.spring.flbackend.util;

public class StringUtils {

    public static boolean checkIfNullOrEmpty(String str)
    {
        return str == null || str.length() == 0;
    }
}
