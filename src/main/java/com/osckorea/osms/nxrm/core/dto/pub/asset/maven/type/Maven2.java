package com.osckorea.osms.nxrm.core.dto.pub.asset.maven.type;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class Maven2 {
    private String groupId;
    private String artifactId;
    private String version;
    private String extension;
}
