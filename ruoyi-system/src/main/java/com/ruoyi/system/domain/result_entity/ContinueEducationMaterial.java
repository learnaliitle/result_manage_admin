package com.ruoyi.system.domain.result_entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("result_continuing_education_material")
@ApiModel("继续教育材料")
public class ContinueEducationMaterial {
    @ApiModelProperty("唯一标识符")
    @TableField("id")
    private Integer id;

    @ApiModelProperty("材料标题")
    @TableField("title")
    private String title;

    @ApiModelProperty("培训单位")
    @TableField("training_unit")
    private String trainingUnit;

    @ApiModelProperty("课时")
    @TableField("hours")
    private BigDecimal hours;

    @ApiModelProperty("评分/等级")
    @TableField("score")
    private String score;

    @ApiModelProperty("获得时间")
    @TableField("obtain_time")
    private Timestamp obtainTime;

    @ApiModelProperty("备注信息")
    @TableField("remarks")
    private String remarks;

    @ApiModelProperty("关联课题ID")
    @TableField("project_id")
    private String projectId;

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
