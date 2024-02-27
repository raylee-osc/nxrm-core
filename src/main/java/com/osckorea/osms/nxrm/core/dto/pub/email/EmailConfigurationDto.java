package com.osckorea.osms.nxrm.core.dto.pub.email;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class EmailConfigurationDto {
    private Boolean enabled;
    private String host;
    private Integer port;
    private String username;
    private String password;
    private String fromAddress;
    private String subjectPrefix;
    private Boolean startTlsEnabled;
    private Boolean startTlsRequired;
    private Boolean sslOnConnectEnabled;
    private Boolean sslServerIdentityCheckEnabled;
    private Boolean nexusTrustStoreEnabled;
}
