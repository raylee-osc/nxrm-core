package com.osckorea.osms.nxrm.core.model.pub.blobstore;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class SoftQuota {
    private String type;
    private Long limit;
}
