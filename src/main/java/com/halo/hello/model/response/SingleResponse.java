package com.halo.hello.model.response;

import lombok.Data;

@Data
public class SingleResponse<T> {
    private String message;
    private Boolean success;
    private T data;
}
