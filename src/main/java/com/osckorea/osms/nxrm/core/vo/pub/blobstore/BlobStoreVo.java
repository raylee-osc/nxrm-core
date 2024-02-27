package com.osckorea.osms.nxrm.core.vo.pub.blobstore;

import com.osckorea.osms.nxrm.core.model.pub.blobstore.SoftQuota;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class BlobStoreVo {
    private SoftQuota softQuota;
    private String name;
    private String type;
    private Boolean unavailable;
    private Integer blobCount;
    private Long totalSizeInBytes;
    private Long availableSpaceInBytes;
}
