package com.halo.hello.payload;
import lombok.Data;

import javax.validation.constraints.*;

@Data
public class SignUpRequest {
    private String name;
    private String username;
    @Email
    private String email;
    private String password;
}
