package com.osckorea.osms.nxrm.core.vo.ext.privilege;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class PrivilegeDetailVo {
    private String id;
    private String version;
    private String name;
    private String description;
    private String type;
    private Boolean readOnly;
    private Properties properties;
    private String permission;

    @JsonInclude(Include.NON_ABSENT)
    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final static class Properties {
        private String actions;
        private String domain;
        private String format;
        private String repository;
        private String pattern;
    }
}
