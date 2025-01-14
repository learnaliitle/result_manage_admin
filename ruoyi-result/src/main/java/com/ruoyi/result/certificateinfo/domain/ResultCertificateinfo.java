package com.ruoyi.result.certificateinfo.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 档案资料上传对象 result_certificateinfo
 *
 * @author ruoyi
 * @date 2025-01-14
 */
public class ResultCertificateinfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 唯一标识 */
    private Long id;

    /** 档案标题 */
    @Excel(name = "档案标题")
    private String title;

    /** 证书类型 */
    @Excel(name = "证书类型")
    private String certificateType;

    /** 获得时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "获得时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date obtainTime;

    /** 证书编号 */
    @Excel(name = "证书编号")
    private String certificateNumber;

    /** 授予机构 */
    @Excel(name = "授予机构")
    private String issuingInstitution;

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
    public void setCertificateType(String certificateType)
    {
        this.certificateType = certificateType;
    }

    public String getCertificateType()
    {
        return certificateType;
    }
    public void setObtainTime(Date obtainTime)
    {
        this.obtainTime = obtainTime;
    }

    public Date getObtainTime()
    {
        return obtainTime;
    }
    public void setCertificateNumber(String certificateNumber)
    {
        this.certificateNumber = certificateNumber;
    }

    public String getCertificateNumber()
    {
        return certificateNumber;
    }
    public void setIssuingInstitution(String issuingInstitution)
    {
        this.issuingInstitution = issuingInstitution;
    }

    public String getIssuingInstitution()
    {
        return issuingInstitution;
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
            .append("certificateType", getCertificateType())
            .append("obtainTime", getObtainTime())
            .append("certificateNumber", getCertificateNumber())
            .append("issuingInstitution", getIssuingInstitution())
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
