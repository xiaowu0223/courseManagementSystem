package com.CMS.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("cms_t_user")
public class User {
    private Integer userId;
    private String userName;
    private Integer userAge;
}
