package com.osckorea.osms.nxrm.core.vo.ext.repository;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.osckorea.osms.nxrm.core.model.pub.repository.Storage;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class RepositoryVo {
    private String name;
    private String type;
    private String format;
    private String recipe;
    private Boolean online;
    private String routingRuleId;
    private String url;
    private Status status;
    private Attributes attributes;

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class Status {
        private String repositoryName;
        private Boolean online;
        private String description;
        private String reason;
    }

    @JsonInclude(Include.NON_ABSENT)
    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class Attributes {
        private Storage storage;
    }
}
