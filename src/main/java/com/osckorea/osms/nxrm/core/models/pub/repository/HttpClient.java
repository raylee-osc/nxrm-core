package com.osckorea.osms.nxrm.core.models.pub.repository;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class HttpClient {
    private Boolean blocked;
    private Boolean autoBlock;
    private Connection connection;
    private Authentication authentication;

    @Getter
    @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final static class Connection {
        private Integer retries;
        private String userAgentSuffix;
        private Integer timeout;
        private Boolean enableCircularRedirects;
        private Boolean enableCookies;
        private Boolean useTrustStore;
    }

    @Getter
    @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final static class Authentication {
        private String type;
        private String username;
        private String password;
        private String ntlmHost;
        private String ntlmDomain;
        private Boolean preemptive;
    }
}
