package com.ruoyi.result.report.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 新闻报道上传对象 result_report
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public class ResultReport extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 唯一标识 */
    private Long id;

    /** 新闻事件标题 */
    @Excel(name = "新闻事件标题")
    private String title;

    /** 媒体名称 */
    @Excel(name = "媒体名称")
    private String mediaName;

    /** 媒体级别 */
    @Excel(name = "媒体级别")
    private String mediaLevel;

    /** 报道时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "报道时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date reportTime;

    /** 栏目/版面 */
    @Excel(name = "栏目/版面")
    private String columnSection;

    /** 在线链接 */
    @Excel(name = "在线链接")
    private String onlineLink;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarks;

    /** 关联课题 */
    @Excel(name = "关联课题")
    private Long projectId;

    /** 成果同步状态 */
    @Excel(name = "成果同步状态")
    private String syncStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date createdAt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date updatedAt;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pdfUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long userId;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
    public void setMediaName(String mediaName)
    {
        this.mediaName = mediaName;
    }

    public String getMediaName()
    {
        return mediaName;
    }
    public void setMediaLevel(String mediaLevel)
    {
        this.mediaLevel = mediaLevel;
    }

    public String getMediaLevel()
    {
        return mediaLevel;
    }
    public void setReportTime(Date reportTime)
    {
        this.reportTime = reportTime;
    }

    public Date getReportTime()
    {
        return reportTime;
    }
    public void setColumnSection(String columnSection)
    {
        this.columnSection = columnSection;
    }

    public String getColumnSection()
    {
        return columnSection;
    }
    public void setOnlineLink(String onlineLink)
    {
        this.onlineLink = onlineLink;
    }

    public String getOnlineLink()
    {
        return onlineLink;
    }
    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

    public String getRemarks()
    {
        return remarks;
    }
    public void setProjectId(Long projectId)
    {
        this.projectId = projectId;
    }

    public Long getProjectId()
    {
        return projectId;
    }
    public void setSyncStatus(String syncStatus)
    {
        this.syncStatus = syncStatus;
    }

    public String getSyncStatus()
    {
        return syncStatus;
    }
    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }
    public void setUpdatedAt(Date updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt()
    {
        return updatedAt;
    }
    public void setPdfUrl(String pdfUrl)
    {
        this.pdfUrl = pdfUrl;
    }

    public String getPdfUrl()
    {
        return pdfUrl;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("mediaName", getMediaName())
            .append("mediaLevel", getMediaLevel())
            .append("reportTime", getReportTime())
            .append("columnSection", getColumnSection())
            .append("onlineLink", getOnlineLink())
            .append("remarks", getRemarks())
            .append("projectId", getProjectId())
            .append("syncStatus", getSyncStatus())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .append("pdfUrl", getPdfUrl())
            .append("userId", getUserId())
            .toString();
    }
}
