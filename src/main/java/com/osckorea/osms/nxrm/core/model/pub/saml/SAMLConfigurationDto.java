package com.osckorea.osms.nxrm.core.model.pub.saml;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class SAMLConfigurationDto {
    private String entityId;
    private String idpMetadata;
    private String usernameAttribute;
    private String firstNameAttribute;
    private String lastNameAttribute;
    private String emailAttribute;
    private String groupsAttribute;
    private Boolean validateResponseSignature;
    private Boolean validateAssertionSignature;
}
