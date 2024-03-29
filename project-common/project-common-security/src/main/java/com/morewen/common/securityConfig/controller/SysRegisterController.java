package com.morewen.common.securityConfig.controller;


import com.morewen.common.core.domain.model.RegisterBody;
import com.morewen.common.core.utils.AjaxResult;
import com.morewen.common.core.utils.StringUtils;
import com.morewen.common.securityConfig.service.SysRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注册验证
 * 
 * @author ruoyi
 */
@RestController
public class SysRegisterController
{
    @Autowired
    private SysRegisterService registerService;


    @PostMapping("/register")
    public AjaxResult register(@RequestBody RegisterBody user)
    {

        String msg = registerService.register(user);
        if (StringUtils.isEmpty(msg)) {
            return AjaxResult.error(msg);
        }
        return AjaxResult.success(msg);
    }
}
