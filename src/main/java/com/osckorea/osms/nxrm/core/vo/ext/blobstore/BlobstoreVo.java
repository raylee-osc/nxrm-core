package com.osckorea.osms.nxrm.core.vo.ext.blobstore;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class BlobstoreVo {
    private String name;
    private String type;
    private String isQuotaEnabled;  // Boolean convert to String
    private String quotaType;
    private String quotaLimit;
    private Attributes attributes;
    private Long blobCount;
    private Long totalSize;
    private Long availableSpace;
    private Integer repositoryUseCount;
    private Boolean unlimited;
    private Boolean unavailable;
    private Integer blobStoreUseCount;
    private Boolean inUse;
    private Boolean convertable;
    private Integer taskUseCount;
    private String groupName;

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final class Attributes {
        private File file;
        private BlobStoreQuotaConfig blobStoreQuotaConfig;

        @Getter
        @NoArgsConstructor(access = AccessLevel.PROTECTED)
        @AllArgsConstructor
        public final static class File {
            private String path;
        }

        @Getter
        @NoArgsConstructor(access = AccessLevel.PROTECTED)
        // @AllArgsConstructor
        public final static class BlobStoreQuotaConfig {

        }
    }
}
