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
public final class Proxy {
    private String remoteUrl;
    private Integer contentMaxAge;
    private Integer metadataMaxAge;
}
