package com.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 团队成员
 *
 * @author Clrvn
 */
@Data
public class TeamUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键自增id
     */
    private Integer id;

    /**
     * 团队id
     */
    private Integer teamId;

    /**
     * 队员id
     */
    private Integer userId;

    /**
     * 队员名称
     */
    private String userName;

}
