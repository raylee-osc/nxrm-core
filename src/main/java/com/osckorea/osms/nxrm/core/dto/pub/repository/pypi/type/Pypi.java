package com.osckorea.osms.nxrm.core.dto.pub.repository.pypi.type;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class Pypi {
    private Boolean removeQuarantined;
}
