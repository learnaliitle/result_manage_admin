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
@TableName("result_report")
@ApiModel("新闻报道")
public class Report {
    @ApiModelProperty("唯一标识符")
    @TableField("id")
    private Integer id;

    @ApiModelProperty("新闻事件标题")
    @TableField("title")
    private String title;

    @ApiModelProperty("媒体名称")
    @TableField("media_name")
    private String mediaName;

    @ApiModelProperty("媒体级别")
    @TableField("media_level")
    private String mediaLevel;

    @ApiModelProperty("报道时间")
    @TableField("report_time")
    private Date reportTime;

    @ApiModelProperty("栏目/版面")
    @TableField("column_section")
    private String columnSection;

    @ApiModelProperty("在线链接")
    @TableField("online_link")
    private String onlineLink;

    @ApiModelProperty("备注信息")
    @TableField("remarks")
    private String remarks;

    @ApiModelProperty("关联课题")
    @TableField("project_id")
    private Integer projectId;

    @ApiModelProperty("成果同步状态")
    @TableField("sync_status")
    private String syncStatus;

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
