package com.ruoyi.result.patents.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 专利信息对象 result_patents
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public class ResultPatents extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键，自动递增的专利ID */
    private Long id;

    /** 专利名称 */
    @Excel(name = "专利名称")
    private String patentTitle;

    /** 专利类型 */
    @Excel(name = "专利类型")
    private String patentType;

    /** 专利状态 */
    @Excel(name = "专利状态")
    private String patentStatus;

    /** 专利编号 */
    @Excel(name = "专利编号")
    private String patentNumber;

    /** 专利权人 */
    @Excel(name = "专利权人")
    private String patentOwner;

    /** 授权公告日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "授权公告日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date authorizationDate;

    /** 申请编号 */
    @Excel(name = "申请编号")
    private String applicationNumber;

    /** 专利申请日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "专利申请日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applicationDate;

    /** 本人排名 */
    @Excel(name = "本人排名")
    private Long authorRank;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String remarks;

    /** 关联课题 */
    @Excel(name = "关联课题")
    private Long projectId;

    /** 作者信息 */
    @Excel(name = "作者信息")
    private String authorInfo;

    /** 成果同步 */
    @Excel(name = "成果同步")
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
    public void setPatentTitle(String patentTitle)
    {
        this.patentTitle = patentTitle;
    }

    public String getPatentTitle()
    {
        return patentTitle;
    }
    public void setPatentType(String patentType)
    {
        this.patentType = patentType;
    }

    public String getPatentType()
    {
        return patentType;
    }
    public void setPatentStatus(String patentStatus)
    {
        this.patentStatus = patentStatus;
    }

    public String getPatentStatus()
    {
        return patentStatus;
    }
    public void setPatentNumber(String patentNumber)
    {
        this.patentNumber = patentNumber;
    }

    public String getPatentNumber()
    {
        return patentNumber;
    }
    public void setPatentOwner(String patentOwner)
    {
        this.patentOwner = patentOwner;
    }

    public String getPatentOwner()
    {
        return patentOwner;
    }
    public void setAuthorizationDate(Date authorizationDate)
    {
        this.authorizationDate = authorizationDate;
    }

    public Date getAuthorizationDate()
    {
        return authorizationDate;
    }
    public void setApplicationNumber(String applicationNumber)
    {
        this.applicationNumber = applicationNumber;
    }

    public String getApplicationNumber()
    {
        return applicationNumber;
    }
    public void setApplicationDate(Date applicationDate)
    {
        this.applicationDate = applicationDate;
    }

    public Date getApplicationDate()
    {
        return applicationDate;
    }
    public void setAuthorRank(Long authorRank)
    {
        this.authorRank = authorRank;
    }

    public Long getAuthorRank()
    {
        return authorRank;
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
    public void setAuthorInfo(String authorInfo)
    {
        this.authorInfo = authorInfo;
    }

    public String getAuthorInfo()
    {
        return authorInfo;
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
            .append("patentTitle", getPatentTitle())
            .append("patentType", getPatentType())
            .append("patentStatus", getPatentStatus())
            .append("patentNumber", getPatentNumber())
            .append("patentOwner", getPatentOwner())
            .append("authorizationDate", getAuthorizationDate())
            .append("applicationNumber", getApplicationNumber())
            .append("applicationDate", getApplicationDate())
            .append("authorRank", getAuthorRank())
            .append("remarks", getRemarks())
            .append("projectId", getProjectId())
            .append("authorInfo", getAuthorInfo())
            .append("syncStatus", getSyncStatus())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .append("pdfUrl", getPdfUrl())
            .append("userId", getUserId())
            .toString();
    }
}
