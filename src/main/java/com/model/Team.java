package com.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 团队
 *
 * @author Clrvn
 */
@Data
public class Team implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键自增id
     */
    private Integer id;

    /**
     * 团队名
     */
    private String name;

    /**
     * 团长id
     */
    private Integer teamUserId;

    /**
     * 团长姓名
     */
    private String teamUserName;

    /**
     * 团队创建时间
     */
    private Date createTime;

    /**
     * 团费
     */
    private Integer teamFee;

    /**
     *
     */
    private List<User> userList;


}
