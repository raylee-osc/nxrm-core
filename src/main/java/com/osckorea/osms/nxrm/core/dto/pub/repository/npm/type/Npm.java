package com.osckorea.osms.nxrm.core.dto.pub.repository.npm.type;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class Npm {
    private Boolean removeNonCataloged;
    private Boolean removeQuarantined;
}
