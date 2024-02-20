package com.osckorea.osms.nxrm.core.dto.pub.asset.pypi.type;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class Pypi {
    private String name;
    private String version;
}
