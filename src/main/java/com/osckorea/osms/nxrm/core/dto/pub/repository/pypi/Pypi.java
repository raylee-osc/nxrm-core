package com.osckorea.osms.nxrm.core.dto.pub.repository.pypi;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class Pypi {
    private Boolean removeQuarantined;
}
