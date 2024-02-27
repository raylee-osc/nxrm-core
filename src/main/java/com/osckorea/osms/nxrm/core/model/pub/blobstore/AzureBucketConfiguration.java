package com.osckorea.osms.nxrm.core.model.pub.blobstore;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class AzureBucketConfiguration {
    private String accountName;
    private String containerName;
    private Authentication authentication;

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final static class Authentication {
        private String authenticationMethod;
        private String accountKey;
    }
}
