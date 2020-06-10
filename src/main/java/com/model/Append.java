package com.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 活动追加费用
 * @author Clrvn
 */
@Data
public class Append implements Serializable{

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

    /**
     * 追加费用
     */
    private Integer appendFee;


}
