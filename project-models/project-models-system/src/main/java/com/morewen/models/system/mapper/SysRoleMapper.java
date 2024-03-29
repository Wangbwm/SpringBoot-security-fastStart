package com.morewen.models.system.mapper;

import com.morewen.common.core.domain.entity.SysRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author Wangbw
* @description 针对表【sys_role(角色信息表)】的数据库操作Mapper
* @createDate 2023-07-23 20:20:42
* @Entity generator.domain.SysRole
*/
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {

    List<SysRole> selectRolePermissionByUserId(Long userId);
}




