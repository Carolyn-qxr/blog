package com.blog.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @className:JwtToken
 * @description: TODO类描述
 * @author:qxr
 * @date: 2022/12/19
 **/
public class JwtToken implements AuthenticationToken {
    private String token;

    public JwtToken(String jwt) {
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
