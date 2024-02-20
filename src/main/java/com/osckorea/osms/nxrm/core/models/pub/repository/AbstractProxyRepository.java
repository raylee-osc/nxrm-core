package com.osckorea.osms.nxrm.core.models.pub.repository;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

public abstract class AbstractProxyRepository {
    @Getter
    @SuperBuilder
    public abstract static class Create {
        private String name;
        private Boolean online;
        private Storage storage;
        private Cleanup cleanup;
        private Proxy proxy;
        private NegativeCache negativeCache;
        private HttpClient httpClient;
        private String routingRule;
        private Replication replication;
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public abstract static class Response {
        private String name;
        private String format;
        private String type;
        private String url;
        private Boolean online;
        private Storage storage;
        private Cleanup cleanup;
        private Proxy proxy;
        private NegativeCache negativeCache;
        private HttpClient httpClient;
        private String routingRuleName;
        private Replication replication;
    }
}
