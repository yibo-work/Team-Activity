package com.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 活动成员
 * @author Clrvn
 */
@Data
public class ActivityUser implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键自增id
     */
    private Integer id;

    /**
     * 活动id
     */
    private Integer activityId;

    /**
     * 会员id
     */
    private Integer userId;


}
