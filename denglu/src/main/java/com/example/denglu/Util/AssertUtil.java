package com.example.denglu.Util;

import com.example.denglu.execptions.ParamsException;


//断言
public class AssertUtil {
    public static void isTrue(Boolean flag,String msg){
        //抛出参数异常
        if(flag){
            throw new ParamsException(msg);
        }
    }
}
