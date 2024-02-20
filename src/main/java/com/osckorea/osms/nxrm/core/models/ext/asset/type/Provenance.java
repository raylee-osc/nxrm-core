package com.osckorea.osms.nxrm.core.models.ext.asset.type;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class Provenance {
    private Boolean hashed_not_verified;
}
