package com.morewen.models.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.morewen.common.core.domain.entity.SysRoleMenu;
import com.morewen.models.system.service.SysRoleMenuService;
import com.morewen.models.system.mapper.SysRoleMenuMapper;
import org.springframework.stereotype.Service;

/**
* @author Wangbw
* @description 针对表【sys_role_menu(角色和菜单关联表)】的数据库操作Service实现
* @createDate 2023-07-23 20:21:20
*/
@Service
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu>
    implements SysRoleMenuService{

}




