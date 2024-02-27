package com.osckorea.osms.nxrm.core.dto.pub.blobstore;

import com.osckorea.osms.nxrm.core.model.pub.blobstore.S3BucketConfiguration;
import com.osckorea.osms.nxrm.core.model.pub.blobstore.SoftQuota;
import com.osckorea.osms.nxrm.core.model.pub.blobstore.S3BucketConfiguration.AdvancedBucketConnection;
import com.osckorea.osms.nxrm.core.model.pub.blobstore.S3BucketConfiguration.Bucket;
import com.osckorea.osms.nxrm.core.model.pub.blobstore.S3BucketConfiguration.BucketSecurity;
import com.osckorea.osms.nxrm.core.model.pub.blobstore.S3BucketConfiguration.Encryption;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class BlobstoreS3ConfigurationDto {
    private String name;
    private String type;
    private SoftQuota softQuota;
    private S3BucketConfiguration bucketConfiguration;

    @Builder
    public BlobstoreS3ConfigurationDto(
        final String name,
        final SoftQuota softQuota,
        final Bucket bucket,
        final Encryption encryption,
        final BucketSecurity bucketSecurity,
        final AdvancedBucketConnection advancedBucketConnection
    ) {
        this.name = name;
        this.softQuota = softQuota;
        this.bucketConfiguration = S3BucketConfiguration.builder()
                                                        .bucket(bucket)
                                                        .encryption(encryption)
                                                        .bucketSecurity(bucketSecurity)
                                                        .advancedBucketConnection(advancedBucketConnection)
                                                        .build();
    }
}