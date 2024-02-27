package com.osckorea.osms.nxrm.core.vo.ext.healthcheck;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class HealthCheckStatusVo {
    private String repositoryName;
    private Boolean enabled;
    private Boolean eulaAccepted;
    private Boolean analyzing;
    private Boolean detailedReportSupported;
    private Integer iframeHeight;
    private Integer iframeWidth;
    private Integer securityIssueCount;
    private Integer licenseIssueCount;
    private String summaryUrl;
    private String detailUrl;
    private Long totalCounts;
    private Long vulnerableCounts;
}
