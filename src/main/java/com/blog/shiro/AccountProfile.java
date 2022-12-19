package com.blog.shiro;

import lombok.Data;

/**
 * @className:AccountProfile
 * @description: 登录成功之后返回用户信息
 * @author:qxr
 * @date: 2022/12/19
 **/
@Data
public class AccountProfile {
    private Long id;

    private String username;

    private String avatar;

    private String email;
}

