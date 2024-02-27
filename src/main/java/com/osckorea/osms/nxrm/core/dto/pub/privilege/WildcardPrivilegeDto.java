package com.osckorea.osms.nxrm.core.dto.pub.privilege;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class WildcardPrivilegeDto {
    private String name;
    private String description;
    private String pattern;
}
