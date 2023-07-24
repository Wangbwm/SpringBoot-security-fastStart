package com.morewen.projectcommonsecurity.controller;


import com.morewen.projectcommoncore.domain.model.RegisterBody;
import com.morewen.projectcommoncore.utils.AjaxResult;
import com.morewen.projectcommoncore.utils.StringUtils;
import com.morewen.projectcommonsecurity.service.SysRegisterService;
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
