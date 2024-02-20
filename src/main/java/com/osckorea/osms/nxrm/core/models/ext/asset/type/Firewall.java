package com.osckorea.osms.nxrm.core.models.ext.asset.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/*
 * Only Pro
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class Firewall {
    @JsonProperty("evaluated-hash")
    private String evaluatedHash;
    
    private String auditAssetTimestamp;
}
