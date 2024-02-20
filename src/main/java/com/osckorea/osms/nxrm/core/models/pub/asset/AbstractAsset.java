package com.osckorea.osms.nxrm.core.models.pub.asset;

import java.sql.Timestamp;
import com.osckorea.osms.nxrm.core.models.pub.asset.type.Checksum;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class AbstractAsset {
    private String downloadUrl;
    private String path;
    private String id;
    private String repository;
    private String format;
    private Checksum checksum;
    private String contentType;
    private Timestamp lastModified;
    private Timestamp lastDownloaded;
    private String uploader;
    private String uploaderIp;
    private Long fileSize;
    private Timestamp blobCreated;
}
