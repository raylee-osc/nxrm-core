package com.osckorea.osms.nxrm.core.model.pub.asset;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonInclude(Include.NON_ABSENT)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public abstract class AbstractAsset {
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

    @JsonInclude(Include.NON_ABSENT)
    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final static class Checksum {
        private String sha1;
        private String sha256;
        private String sha512;
        private String md5;
    }
}
