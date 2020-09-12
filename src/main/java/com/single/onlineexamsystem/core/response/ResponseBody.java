package com.single.onlineexamsystem.core.response;

/**
 * 响应返回参数
 *
 * @author: 1999single
 * @date: 2020/9/12 9:52
 */
public class ResponseBody<T> {

    private Integer code;

    private String message;

    private T data;

    private ResponseBody() {

    }




}
