package com.osckorea.osms.nxrm.core.models.ext.asset;

import java.sql.Timestamp;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public abstract class AbstractAsset {
    private String id;
    private String name;
    private String format;
    private String contentType;
    private Long size;
    private String repositoryName;
    private String containingRepositoryName;
    private Timestamp blobCreated;
    private Timestamp blobUpdateed;
    private Timestamp lastDownloaded;
    private String blobRef;
    private String componentId;
    private String createdBy;
    private String createdByIp;
}
