package com.osckorea.osms.nxrm.core.model.ext.blobstore;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
