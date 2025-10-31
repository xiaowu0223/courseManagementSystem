package com.CMS.mapper;

import com.CMS.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
//    @Insert("insert into cms_t_user(user_name,user_age) values(#{userName},#{userAge})")
//    void add(User user);
}
