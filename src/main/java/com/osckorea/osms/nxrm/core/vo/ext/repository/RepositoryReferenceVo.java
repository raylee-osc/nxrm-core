package com.osckorea.osms.nxrm.core.vo.ext.repository;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class RepositoryReferenceVo {
    private String id;
    private String name;
    private String type;
    private String format;
    private String versionPolicy;
    private String url;
    private Status status;
    private Integer sortOrder;

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class Status {
        private String repositoryName;
        private Boolean online;
        private String description;
        private String reason;
    }
}
