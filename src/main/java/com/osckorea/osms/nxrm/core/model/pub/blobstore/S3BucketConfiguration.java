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
public final class S3BucketConfiguration {
    private Bucket bucket;
    private Encryption encryption;
    private BucketSecurity bucketSecurity;
    private AdvancedBucketConnection advancedBucketConnection;

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final static class Bucket {
        private String region;
        private String name;
        private String prefix;
        private String expiration;
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final static class Encryption {
        private String encryptionType;
        private String encryptionKey;
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final static class BucketSecurity {
        private String accessKeyId;
        private String secretAccessKey;
        private String role;
        private String sessionToken;
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class AdvancedBucketConnection {
        private String endpoint;
        private String signerType;
        private Boolean forcePathStyle;
        private Integer maxConnectionPoolSize;
    }
}
