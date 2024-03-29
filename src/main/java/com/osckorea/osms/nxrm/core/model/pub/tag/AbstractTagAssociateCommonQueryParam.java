package com.osckorea.osms.nxrm.core.model.pub.tag;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class AbstractTagAssociateCommonQueryParam {
    @Builder.Default
    private Boolean wait = true;
    
    private String q;

    private String repository;

    private String format;

    private String group;

    private String name;

    private String version;

    private String prereleases;
    
    private String md5;

    private String sha1;

    private String sha256;

    private String sha512;
}
