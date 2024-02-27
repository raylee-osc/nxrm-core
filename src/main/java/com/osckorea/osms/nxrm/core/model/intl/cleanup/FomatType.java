package com.osckorea.osms.nxrm.core.model.intl.cleanup;

import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum FomatType {
    ALL("*", List.of("lastDownloaded", "lastBlobUpdated")),
    APT("apt", List.of("regex", "lastDownloaded", "lastBlobUpdated")),
    BOWER("bower", List.of("regex", "lastDownloaded", "lastBlobUpdated")),
    COCOAPODS("cocoapods", List.of("regex", "lastDownloaded", "lastBlobUpdated")),
    CONAN("conan", List.of("regex", "lastDownloaded", "lastBlobUpdated")),
    CONDA("conda", List.of("regex", "lastDownloaded", "lastBlobUpdated")),
    DOCKER("docker", List.of("regex", "retain", "sortBy", "lastDownloaded", "lastBlobUpdated")),
    GITLFS("gitlfs", List.of("lastDownloaded", "lastBlobUpdated")),
    GO("go", List.of("regex", "lastDownloaded", "lastBlobUpdated")),
    HELM("helm", List.of("regex", "lastDownloaded", "lastBlobUpdated")),
    MAVEN2("maven2", List.of("regex", "isPrerelease", "retain", "sortBy", "lastDownloaded", "lastBlobUpdated")),
    NPM("npm", List.of("regex", "isPrerelease", "lastDownloaded", "lastBlobUpdated")),
    NUGET("nuget", List.of("regex", "lastDownloaded", "lastBlobUpdated")),
    P2("p2", List.of("regex", "lastDownloaded", "lastBlobUpdated")),
    PYPI("pypi", List.of("regex", "lastDownloaded", "lastBlobUpdated")),
    R("r", List.of("regex", "lastDownloaded", "lastBlobUpdated")),
    RAW("raw", List.of("regex", "lastDownloaded", "lastBlobUpdated")),
    RUBYGEMS("rubygems", List.of("regex", "lastDownloaded", "lastBlobUpdated")),
    YUM("yum", List.of("regex", "isPrerelease", "lastDownloaded", "lastBlobUpdated")),
    ;

    @Getter
    private final String format;
    private final List<String> availableCriteria;

    public List<String> getAvailableCriteria() {
        return this.availableCriteria;
    }
}
