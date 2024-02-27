package com.osckorea.osms.nxrm.core.vo.pub.ssl;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class SslCertificationVo {
    private Integer expiresOn;
    private String fingerprint;
    private String id;
    private Integer issuedOn;
    private String issuerCommonName;
    private String issuerOrganization;
    private String issuerOrganizationalUnit;
    private String pem;
    private String serialNumber;
    private String subjectCommonName;
    private String subjectOrganization;
    private String subjectOrganizationalUnit;
}
