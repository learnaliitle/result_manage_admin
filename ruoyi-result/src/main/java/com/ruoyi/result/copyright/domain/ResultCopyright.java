package com.ruoyi.result.copyright.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 软件著作权对象 result_copyright
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public class ResultCopyright extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 著作权ID */
    private Long id;

    /** 著作权名称 */
    @Excel(name = "著作权名称")
    private String title;

    /** 证书号 */
    @Excel(name = "证书号")
    private String certificateNo;

    /** 本人排名 */
    @Excel(name = "本人排名")
    private Long authorRank;

    /** 开发完成时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开发完成时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date finishTime;

    /** 获得时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "获得时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date puttime;

    /** 登记号 */
    @Excel(name = "登记号")
    private String registerNo;

    /** 著作权类型 */
    @Excel(name = "著作权类型")
    private String copyrightType;

    /** 著作权人 */
    @Excel(name = "著作权人")
    private String copyrightOwner;

    /** 备注信息 */
    @Excel(name = "备注信息")
    private String description;

    /** 成果同步 */
    @Excel(name = "成果同步")
    private String syncStatus;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date created;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updated;

    /** 作者信息（存储作者信息及单位） */
    @Excel(name = "作者信息", readConverterExp = "存=储作者信息及单位")
    private String authorInfo;

    /** 关联课题ID */
    @Excel(name = "关联课题ID")
    private Long projectId;

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
    public void setCertificateNo(String certificateNo)
    {
        this.certificateNo = certificateNo;
    }

    public String getCertificateNo()
    {
        return certificateNo;
    }
    public void setAuthorRank(Long authorRank)
    {
        this.authorRank = authorRank;
    }

    public Long getAuthorRank()
    {
        return authorRank;
    }
    public void setFinishTime(Date finishTime)
    {
        this.finishTime = finishTime;
    }

    public Date getFinishTime()
    {
        return finishTime;
    }
    public void setPuttime(Date puttime)
    {
        this.puttime = puttime;
    }

    public Date getPuttime()
    {
        return puttime;
    }
    public void setRegisterNo(String registerNo)
    {
        this.registerNo = registerNo;
    }

    public String getRegisterNo()
    {
        return registerNo;
    }
    public void setCopyrightType(String copyrightType)
    {
        this.copyrightType = copyrightType;
    }

    public String getCopyrightType()
    {
        return copyrightType;
    }
    public void setCopyrightOwner(String copyrightOwner)
    {
        this.copyrightOwner = copyrightOwner;
    }

    public String getCopyrightOwner()
    {
        return copyrightOwner;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
    public void setSyncStatus(String syncStatus)
    {
        this.syncStatus = syncStatus;
    }

    public String getSyncStatus()
    {
        return syncStatus;
    }
    public void setCreated(Date created)
    {
        this.created = created;
    }

    public Date getCreated()
    {
        return created;
    }
    public void setUpdated(Date updated)
    {
        this.updated = updated;
    }

    public Date getUpdated()
    {
        return updated;
    }
    public void setAuthorInfo(String authorInfo)
    {
        this.authorInfo = authorInfo;
    }

    public String getAuthorInfo()
    {
        return authorInfo;
    }
    public void setProjectId(Long projectId)
    {
        this.projectId = projectId;
    }

    public Long getProjectId()
    {
        return projectId;
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
            .append("certificateNo", getCertificateNo())
            .append("authorRank", getAuthorRank())
            .append("finishTime", getFinishTime())
            .append("puttime", getPuttime())
            .append("registerNo", getRegisterNo())
            .append("copyrightType", getCopyrightType())
            .append("copyrightOwner", getCopyrightOwner())
            .append("description", getDescription())
            .append("syncStatus", getSyncStatus())
            .append("created", getCreated())
            .append("updated", getUpdated())
            .append("authorInfo", getAuthorInfo())
            .append("projectId", getProjectId())
            .append("updatedAt", getUpdatedAt())
            .append("pdfUrl", getPdfUrl())
            .append("userId", getUserId())
            .toString();
    }
}
