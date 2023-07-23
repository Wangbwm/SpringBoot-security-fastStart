package com.morewen.projectsystem.service;

import com.morewen.projectcommoncore.domain.entity.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
* @author Wangbw
* @description 针对表【sys_role(角色信息表)】的数据库操作Service
* @createDate 2023-07-23 20:20:42
*/
public interface SysRoleService extends IService<SysRole> {

    Set<String> selectRolePermissionByUserId(Long userId);
}
