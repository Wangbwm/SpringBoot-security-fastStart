package com.morewen.projectcommonsecurity.security.handle;

import com.alibaba.fastjson2.JSON;
import com.morewen.projectcommoncore.constants.Constants;
import com.morewen.projectcommoncore.domain.model.LoginUser;
import com.morewen.projectcommoncore.utils.AjaxResult;
import com.morewen.projectcommoncore.utils.ServletUtils;
import com.morewen.projectcommoncore.utils.StringUtils;
import com.morewen.projectcommonsecurity.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义退出处理类 返回成功
 * 
 * @author ruoyi
 */
@Configuration
public class LogoutSuccessHandlerImpl implements LogoutSuccessHandler
{
    @Autowired
    private TokenService tokenService;

    /**
     * 退出处理
     * 
     * @return
     */
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException
    {
        LoginUser loginUser = tokenService.getLoginUser(request);
        if (StringUtils.isNotNull(loginUser))
        {
            String userName = loginUser.getUsername();
            // 删除用户缓存记录
            tokenService.delLoginUser(loginUser.getToken());
            ServletUtils.renderString(response, JSON.toJSONString(AjaxResult.success("退出成功")));
        } else {
            ServletUtils.renderString(response, JSON.toJSONString(AjaxResult.error("退出失败")));
        }

    }
}
