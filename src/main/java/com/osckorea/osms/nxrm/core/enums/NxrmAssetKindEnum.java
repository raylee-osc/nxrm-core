package com.osckorea.osms.nxrm.core.enums;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum NxrmAssetKindEnum {
    MAVEN2("maven2", "ARTIFACT"),
    PYPI("pypi", "PACKAGE"),
    NPM("npm", "TARBALL"),
    R("r", "ARCHIVE"),
    APT("apt", "DEV"),
    RUBYGEMS("rubygems", "GEM"),
    YUM("yum", "RPM"),
    HELM("helm", "HELM_PACKAGE"),
    BOWER ("bower", "TARBALL"),
    DOCKER("docker", "MANIFEST"),
    GO("go"),
    NUGET("nuget"),
    RAW("raw"),
    CONAN("conan"),
    COCOAPODS("cocoapods"),
    ;

    private final String format;
    private String assetKind;

    NxrmAssetKindEnum(String format) {
        this.format = format;
    }

    NxrmAssetKindEnum(String format, String assetKind) {
        this.format = format;
        this.assetKind = assetKind;
    }

    public String getFormat() {
        return this.format;
    }

    public String getAssetKind() {
        return this.assetKind != null ? this.assetKind : "";
    }

    public static NxrmAssetKindEnum findByFormat(String format) {
        return Stream.of(values())
                        .filter(val -> val.getFormat().equals(format))
                        .findFirst()
                        .get();
    }

    public static List<String> findAllFormat() {
        return Stream.of(values())
                        .map(val -> val.getFormat())
                        .collect(Collectors.toList());
    }
}
