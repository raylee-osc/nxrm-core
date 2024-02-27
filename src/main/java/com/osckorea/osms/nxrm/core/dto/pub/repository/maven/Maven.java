package com.osckorea.osms.nxrm.core.dto.pub.repository.maven;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class Maven {
    private String versionPolicy;
    private String layoutPolicy;
    private String contentDisposition;
}
