package com.osckorea.osms.nxrm.core.dto.pub.anonymous;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class AnonymousSettingDto {
    private Boolean enabled;
    private String userId;
    private String realmName;
}
