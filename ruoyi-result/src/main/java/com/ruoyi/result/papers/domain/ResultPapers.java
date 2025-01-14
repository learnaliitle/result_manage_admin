package com.ruoyi.result.papers.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 论文对象 result_papers
 *
 * @author ruoyi
 * @date 2025-01-13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("result_papers")
@ApiModel("论文管理")
public class ResultPapers extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键，自增 */
    private Long id;

    /** 论文标题 */
    @Excel(name = "论文标题")
    private String title;

    /** 论文类型 */
    @Excel(name = "论文类型")
    private String paperType;

    /** 论文领域 */
    @Excel(name = "论文领域")
    private String researchField;

    /** 位序 */
    @Excel(name = "位序")
    private Long authorRank;

    /** 是否为通讯作者（是/否） */
    @Excel(name = "是否为通讯作者", readConverterExp = "是=/否")
    private Integer correspondingAuthor;

    /** 刊物名称 */
    @Excel(name = "刊物名称")
    private String journalName;

    /** 收录检索 */
    @Excel(name = "收录检索")
    private String indexing;

    /** 发表时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发表时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publishDate;

    /** DOI号 */
    @Excel(name = "DOI号")
    private String doi;

    /** 引用次数 */
    @Excel(name = "引用次数")
    private Long citationCount;

    /** 关键词 */
    @Excel(name = "关键词")
    private String keywords;

    /** 起止页码 */
    @Excel(name = "起止页码")
    private String pageRange;

    /** 关联课题 */
    @Excel(name = "关联课题")
    private Long projectId;

    /** 作者信息（存储作者信息及单位） */
    @Excel(name = "作者信息", readConverterExp = "存=储作者信息及单位")
    private String authorInfo;

    /** 影响因子 */
    @Excel(name = "影响因子")
    private BigDecimal impactFactor;

    /** 卷号 */
    @Excel(name = "卷号")
    private Long volumeNumber;

    /** 期号 */
    @Excel(name = "期号")
    private Long issueNumber;

    /** ISSN号 */
    @Excel(name = "ISSN号")
    private String issn;

    /** CN号 */
    @ApiModelProperty("CN号")
    @TableField("cn_number")
    @Excel(name = "CN号")
    private String cnNumber;

    /** 摘要 */
    @ApiModelProperty("摘要")
    @TableField("abstract_content")
    @Excel(name = "摘要")
    private String abstractContent;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarks;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pdfPath;

    /** 成功同步 */
    @Excel(name = "成功同步")
    private String syncStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date createdAt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date updatedAt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userId;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("paperType", getPaperType())
            .append("researchField", getResearchField())
            .append("authorRank", getAuthorRank())
            .append("correspondingAuthor", getCorrespondingAuthor())
            .append("journalName", getJournalName())
            .append("indexing", getIndexing())
            .append("publishDate", getPublishDate())
            .append("doi", getDoi())
            .append("citationCount", getCitationCount())
            .append("keywords", getKeywords())
            .append("pageRange", getPageRange())
            .append("projectId", getProjectId())
            .append("authorInfo", getAuthorInfo())
            .append("impactFactor", getImpactFactor())
            .append("volumeNumber", getVolumeNumber())
            .append("issueNumber", getIssueNumber())
            .append("issn", getIssn())
            .append("cnNumber", getCnNumber())
            .append("abstract", getAbstractContent())
            .append("remarks", getRemarks())
            .append("pdfPath", getPdfPath())
            .append("syncStatus", getSyncStatus())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .append("userId", getUserId())
            .toString();
    }
}
