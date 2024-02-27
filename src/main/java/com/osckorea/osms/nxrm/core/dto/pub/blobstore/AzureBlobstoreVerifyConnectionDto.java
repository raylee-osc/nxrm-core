package com.osckorea.osms.nxrm.core.dto.pub.blobstore;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AzureBlobstoreVerifyConnectionDto {
    private String accountName;
    private String accountKey;
    private String containerName;
    private String authenticationMethod;
}
