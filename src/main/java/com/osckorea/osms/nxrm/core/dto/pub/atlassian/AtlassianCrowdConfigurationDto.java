package com.osckorea.osms.nxrm.core.dto.pub.atlassian;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Only PRO Version
 */
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class AtlassianCrowdConfigurationDto {
    private Boolean enabled;
    private Boolean realmActive;
    private String applicationName;
    private String applicationPassword;
    private String url;
    private Boolean useTrustStoreForUrl;
    private Integer timeout;
}
