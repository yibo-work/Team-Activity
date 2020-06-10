package com.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 活动表
 * @author Clrvn
 */
@Data
public class Activity implements Serializable{

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
     * 活动名称
     */
    private String name;

    /**
     * 活动内容
     */
    private String content;

    /**
     * 活动开始时间
     */
    private String startTime;

    /**
     * 总预算
     */
    private Integer budget;

    /**
     * 个人预算
     */
    private Integer avgBudget;

    /**
     * 总费用
     */
    private Integer amount;

    /**
     * 分摊费用
     */
    private Integer avgFee;

    /**
     * 活动结束时间
     */
    private Date endTime;


}
