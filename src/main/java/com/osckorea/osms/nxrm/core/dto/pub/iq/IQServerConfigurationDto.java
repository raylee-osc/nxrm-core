package com.osckorea.osms.nxrm.core.dto.pub.iq;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class IQServerConfigurationDto {
    private Boolean enabled;
    private Boolean showLink;
    private String url;
    private String authenticationType;
    private String username;
    private String password;
    private Boolean useTrustStoreForUrl;
    private Integer timeoutSeconds;
    private String properties;
    private Boolean failOpenModeEnabled;
}
