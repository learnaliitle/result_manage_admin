package com.ruoyi.system.domain.result_entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("result_personal_award")
@ApiModel("个人获奖")
public class PersonalAward {
    @ApiModelProperty("唯一标识符")
    @TableField("id")
    private Integer id;

    @ApiModelProperty("荣誉名称")
    @TableField("title")
    private String title;

    @ApiModelProperty("本人排名")
    @TableField("author_rank")
    private Integer authorRank;

    @ApiModelProperty("获奖名次")
    @TableField("award_level")
    private String awardLevel;

    @ApiModelProperty("级别")
    @TableField("level")
    private String level;

    @ApiModelProperty("授予单位")
    @TableField("granting_unit")
    private String grantingUnit;

    @ApiModelProperty("获奖时间")
    @TableField("award_time")
    private Timestamp awardTime;

    @ApiModelProperty("备注信息")
    @TableField("remarks")
    private String remarks;

    @ApiModelProperty("关联课题ID")
    @TableField("project_id")
    private String projectId;

    @ApiModelProperty("作者")
    @TableField("author_info")
    private String authorInfo;

    @ApiModelProperty("成果同步")
    @TableField("sync_status")
    private String syncStatus;

    @ApiModelProperty("创建时间")
    @TableField("created_at")
    private Timestamp createdAt;

    @ApiModelProperty("更新时间")
    @TableField("updated_at")
    private Timestamp updatedAt;

    @ApiModelProperty("PDF URL")
    @TableField("pdf_url")
    private String pdfUrl;

    @ApiModelProperty("关联用户id")
    @TableField("user_id")
    private Long userId;
}

