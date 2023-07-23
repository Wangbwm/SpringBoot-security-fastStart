package com.morewen.projectsystem.mapper;

import com.morewen.projectcommoncore.domain.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Wangbw
* @description 针对表【sys_user(用户信息表)】的数据库操作Mapper
* @createDate 2023-07-23 20:19:31
* @Entity generator.domain.SysUser
*/
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    SysUser checkUserNameUnique(String userName);
}




