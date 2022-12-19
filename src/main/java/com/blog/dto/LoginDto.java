package com.blog.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @className:LoginDto
 * @description: TODO类描述
 * @author:qxr
 * @date: 2022/12/19
 **/
@Data
public class LoginDto {
    @NotBlank(message = "昵称不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;
}
