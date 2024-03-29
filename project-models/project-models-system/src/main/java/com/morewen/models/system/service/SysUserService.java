package com.morewen.models.system.service;

import com.morewen.common.core.domain.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Wangbw
* @description 针对表【sys_user(用户信息表)】的数据库操作Service
* @createDate 2023-07-23 20:19:31
*/
public interface SysUserService extends IService<SysUser> {

    boolean checkUserNameUnique(SysUser sysUser);

    boolean registerUser(SysUser sysUser);

    SysUser getUserByUserName(String username);
}
