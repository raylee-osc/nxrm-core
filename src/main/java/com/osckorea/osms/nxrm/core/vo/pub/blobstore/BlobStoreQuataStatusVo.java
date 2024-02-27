package com.osckorea.osms.nxrm.core.vo.pub.blobstore;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class BlobStoreQuataStatusVo {
    private Boolean isViolation;
    private String message;
    private String blobStoreName;
}
