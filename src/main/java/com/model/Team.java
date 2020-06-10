package com.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 团队
 * @author Clrvn
 */
@Data
public class Team implements Serializable{

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
     * 团队创建时间
     */
    private Date createTime;

    /**
     * 团费
     */
    private Integer teamFee;


}
