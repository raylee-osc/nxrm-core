package com.osckorea.osms.nxrm.core.dto.pub.blobstore;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.osckorea.osms.nxrm.core.model.pub.blobstore.SoftQuota;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonInclude(Include.NON_ABSENT)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BlobstoreFileConfigurationDto {
    private SoftQuota softQuota;
    private String path;
    private String name;

    @Builder
    public BlobstoreFileConfigurationDto(
        final SoftQuota softQuota,
        final String path,
        final String name
    ) {
        this.softQuota = softQuota;
        this.path = path;
        this.name = name;
    }
}
