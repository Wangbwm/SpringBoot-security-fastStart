package com.morewen.projectsystem.service;

import com.morewen.projectcommoncore.domain.entity.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Collection;
import java.util.Set;

/**
* @author Wangbw
* @description 针对表【sys_menu(菜单权限表)】的数据库操作Service
* @createDate 2023-07-23 20:21:12
*/
public interface SysMenuService extends IService<SysMenu> {

    Set<String> selectMenuPermsByRoleId(Long roleId);

    Set<String> selectMenuPermsByUserId(Long userId);
}
