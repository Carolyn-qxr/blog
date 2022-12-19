package com.blog.util;

import com.blog.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @className:ShiroUtil
 * @description: TODO类描述
 * @author:qxr
 * @date: 2022/12/19
 **/
public class ShiroUtil {
    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}
