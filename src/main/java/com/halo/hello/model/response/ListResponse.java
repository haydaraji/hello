package com.halo.hello.model.response;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

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
