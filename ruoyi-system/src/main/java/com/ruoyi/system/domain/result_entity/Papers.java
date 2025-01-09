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
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("result_papers")
@ApiModel("论文")
public class Papers {
    @ApiModelProperty("唯一标识符")
    @TableField("id")
    private Integer id;

    @ApiModelProperty("关联用户id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("论文标题")
    @TableField("title")
    private String title;

    @ApiModelProperty("PDF文件路径")
    @TableField("pdf_path")
    private String pdfPath;

    @ApiModelProperty("论文类型")
    @TableField("paper_type")
    private String paperType;

    @ApiModelProperty("论文领域")
    @TableField("research_field")
    private String researchField;

    @ApiModelProperty("本人排名")
    @TableField("author_rank")
    private Integer authorRank;

    @ApiModelProperty("是否为通讯作者")
    @TableField("corresponding_author")
    private Boolean correspondingAuthor;

    @ApiModelProperty("刊物名称")
    @TableField("journal_name")
    private String journalName;

    @ApiModelProperty("收录检索")
    @TableField("indexing")
    private List<String> indexing;

    @ApiModelProperty("发表时间")
    @TableField("publish_date")
    private Date publishDate;

    @ApiModelProperty("DOI号")
    @TableField("doi")
    private String doi;

    @ApiModelProperty("引用次数")
    @TableField("citation_count")
    private Integer citationCount;

    @ApiModelProperty("关键词")
    @TableField("keywords")
    private String keywords;

    @ApiModelProperty("起止页码")
    @TableField("page_range")
    private String pageRange;

    @ApiModelProperty("关联课题")
    @TableField("project_id")
    private String projectId;

    @ApiModelProperty("影响因子")
    @TableField("impact_factor")
    private BigDecimal impactFactor;

    @ApiModelProperty("卷号")
    @TableField("volume_number")
    private Integer volumeNumber;

    @ApiModelProperty("期号")
    @TableField("issue_number")
    private Integer issueNumber;

    @ApiModelProperty("ISSN号")
    @TableField("issn")
    private String issn;

    @ApiModelProperty("CN号")
    @TableField("cn_number")
    private String cnNumber;

    @ApiModelProperty("摘要")
    @TableField("abstract")
    private String abstractContent;

    @ApiModelProperty("备注信息")
    @TableField("remarks")
    private String remarks;

    @ApiModelProperty("作者信息")
    @TableField("author_info")
    private List<Author> authorInfo;

}