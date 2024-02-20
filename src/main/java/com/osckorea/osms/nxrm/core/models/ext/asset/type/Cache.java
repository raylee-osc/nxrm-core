package com.osckorea.osms.nxrm.core.models.ext.asset.type;

import java.sql.Timestamp;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class Cache {
    private Timestamp last_verified;
}
