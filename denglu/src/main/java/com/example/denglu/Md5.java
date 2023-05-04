package com.example.denglu;

import org.springframework.util.DigestUtils;

public class Md5 {
    public String md5(String password){
        String salt="sdafsf";
        password= DigestUtils.md5DigestAsHex((salt+salt+password+salt+salt).getBytes());
        return password;
    }
}
