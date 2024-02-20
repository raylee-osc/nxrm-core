package com.osckorea.osms.nxrm.core.enums;

import java.util.Collections;
import java.util.List;

public enum NxrmAssetFileTypeEnum {
    MAVEN2(List.of(".pom", ".jar", ".zip"), false),
    NPM(List.of(".tgz"), true), 
    PYPI(List.of(".tar.gz"), true),
    APT(List.of(".deb", ".udeb"), true),
    HELM(List.of(".tgz", ".tgz.prov"), true),
    NUGET(List.of(".nupkg"), true),
    RUBYGEMS(List.of(".gem"),true),
    YUM(List.of(".rpm", ".drpm"), true),
    R(List.of(".tar.gz", ".tgz"), true),
    RAW(false),
    ;

    protected List<String> fileTypes;
    protected final Boolean restriction;

    NxrmAssetFileTypeEnum(Boolean restrction) {
        this.restriction = restrction;
    }

    NxrmAssetFileTypeEnum(List<String> fileTypes, Boolean restrction) {
        this.fileTypes = fileTypes;
        this.restriction = restrction;
    }

    public List<String> getFileTypes() {
        return this.fileTypes != null ? this.fileTypes : Collections.emptyList();
    }

    public Boolean getRestriction() {
        return this.restriction;
    }

    public Boolean validateFileExtension(String fileName) {
        if (restriction) {
            Boolean flag = false;
            
            for (String extension : fileTypes) {
                if (fileName.endsWith(extension)) {
                    flag = true;
                }
            }
    
            return flag;
        } else {
            return true;
        }
    };
}
