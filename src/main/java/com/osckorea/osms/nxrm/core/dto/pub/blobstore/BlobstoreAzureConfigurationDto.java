package com.osckorea.osms.nxrm.core.dto.pub.blobstore;

import com.osckorea.osms.nxrm.core.model.pub.blobstore.AzureBucketConfiguration;
import com.osckorea.osms.nxrm.core.model.pub.blobstore.SoftQuota;
import com.osckorea.osms.nxrm.core.model.pub.blobstore.AzureBucketConfiguration.Authentication;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class BlobstoreAzureConfigurationDto {
    private String name;
    private SoftQuota softQuota;
    private AzureBucketConfiguration bucketConfiguration;

    @Builder
    public BlobstoreAzureConfigurationDto(
        final String name,
        final SoftQuota softQuota,
        final String accountName,
        final String containerName,
        final Authentication authentication
    ) {
        this.name = name;
        this.softQuota = softQuota;
        this.bucketConfiguration = AzureBucketConfiguration.builder()
                                                            .accountName(accountName)
                                                            .containerName(containerName)
                                                            .authentication(authentication)
                                                            .build();
    }
}
