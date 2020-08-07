package com.halo.hello.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListResponse {
    private Boolean success;
    private List<?> listdata;
    private List<?> listglhist;

    public ListResponse(Boolean success, List<?> listdata) {
        this.success = success;
        this.listdata = listdata;
    }
}
