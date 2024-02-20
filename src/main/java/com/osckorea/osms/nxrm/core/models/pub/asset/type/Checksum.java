package com.osckorea.osms.nxrm.core.models.pub.asset.type;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class Checksum {
    private String sha1;
    private String sha256;
    private String sha512;
    private String md5;
}
