package com.halo.hello.controller;

import com.halo.hello.constant.SpringDataJPAMultitenantConstants;
import com.halo.hello.context.TenantContext;
import com.halo.hello.exception.DatasourceNotFoundException;
import com.halo.hello.model.UsersPolls;
import com.halo.hello.service.UserPollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckExpired {

    @Autowired
    private
    UserPollService usersPollsService;

    public void check(String jwt){

        UsersPolls user = usersPollsService.findUserByLastJwt(jwt.replaceAll("Bearer ",""));
        if(user==null)
            throw new DatasourceNotFoundException("Token expired");
    }

    public void check(String jwt, String tenant){
        TenantContext.setCurrentTenant(SpringDataJPAMultitenantConstants.DEFAULT_TENANT_ID);
        UsersPolls user = usersPollsService.findUserByLastJwt(jwt.replaceAll("Bearer ",""));
        TenantContext.setCurrentTenant(tenant);
        if(user==null)
            throw new DatasourceNotFoundException("Token expired");
    }

    public boolean checkBool(String jwt){
        TenantContext.setCurrentTenant(SpringDataJPAMultitenantConstants.DEFAULT_TENANT_ID);
        UsersPolls user = usersPollsService.findUserByLastJwt(jwt.replaceAll("Bearer ",""));
        return user != null;
    }
}
