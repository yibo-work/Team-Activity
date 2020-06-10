package com.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 用户
 * @author Clrvn
 */
@Data
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键自增id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 角色编号，1、男 0、女
     */
    private Integer gender;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 密码
     */
    private String password;

    /**
     * 电话
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 角色编号，1、管理员 2、会员
     */
    private Integer roleId;


}
