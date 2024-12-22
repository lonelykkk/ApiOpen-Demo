package com.kkk.domain.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 
* @TableName ai_chat
*/
@Data
public class AiChat implements Serializable {

    /**
    * 主键id
    */
    @ApiModelProperty("主键id")
    private Long id;
    /**
    * 问题
    */
    @ApiModelProperty("问题")
    private String question;
    /**
    * 回答
    */
    @ApiModelProperty("回答")
    private String answer;
    /**
    * 用户id
    */
    @ApiModelProperty("用户id")
    private Long userId;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("列表id")
    private Long listId;

}
