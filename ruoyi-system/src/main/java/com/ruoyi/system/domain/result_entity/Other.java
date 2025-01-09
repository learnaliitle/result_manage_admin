package com.ruoyi.system.domain.result_entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("result_other")
@ApiModel("其他")
public class Other {
    @ApiModelProperty("唯一标识符")
    @TableField("id")
    private Integer id;

    @ApiModelProperty("成果名称")
    @TableField("achievement_name")
    private String achievementName;

    @ApiModelProperty("本人排名")
    @TableField("author_rank")
    private Integer authorRank;

    @ApiModelProperty("获得时间")
    @TableField("obtain_time")
    private Date obtainTime;

    @ApiModelProperty("备注信息")
    @TableField("remarks")
    private String remarks;

    @ApiModelProperty("关联课题")
    @TableField("project_id")
    private Integer projectId;

    @ApiModelProperty("成果同步状态")
    @TableField("sync_status")
    private String syncStatus;

    @ApiModelProperty("作者信息")
    @TableField("author_info")
    private String authorInfo;

    @ApiModelProperty("创建时间")
    @TableField("created_at")
    private Date createdAt;

    @ApiModelProperty("更新时间")
    @TableField("updated_at")
    private Date updatedAt;

    @ApiModelProperty("PDF URL")
    @TableField("pdf_url")
    private String pdfUrl;

    @ApiModelProperty("关联用户id")
    @TableField("user_id")
    private Long userId;
}
