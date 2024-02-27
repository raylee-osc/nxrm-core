package com.osckorea.osms.nxrm.core.model.pub.repository;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonInclude(Include.NON_ABSENT)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class Attributes {
    private Proxy proxy;

    @Getter
    @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final static class Proxy {
        private String remoteUrl;
    }

    @Builder
    public Attributes(final String remoteUrl) {
        this.proxy = Proxy.builder().remoteUrl(remoteUrl).build();
    }
}