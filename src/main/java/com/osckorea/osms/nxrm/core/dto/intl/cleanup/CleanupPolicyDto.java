package com.osckorea.osms.nxrm.core.dto.intl.cleanup;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@JsonInclude(Include.NON_ABSENT)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class CleanupPolicyDto {
    private String name;
    private String format;
    private String notes;
    private String criteriaAssetRegex;
    private String criteriaLastBlobUpdated;
    private String criteriaLastDownloaded;
    private String criteriaReleaseType;
    private Integer inUseCount;
    
    public CleanupPolicyDto(
        final String name,
        final Format format,
        final String description,
        final String criteriaAssetRegex,
        final String criteriaLastBlobUpdated,
        final String criteriaLastDownloaded,
        final CriteriaReleaseType criteriaReleaseType
    ) {
        this.name = name;
        this.format = format.getFormat();
        this.notes = description;
        this.criteriaAssetRegex = criteriaAssetRegex;
        this.criteriaLastBlobUpdated = criteriaLastBlobUpdated;
        this.criteriaLastDownloaded = criteriaLastDownloaded;
        this.criteriaReleaseType = criteriaReleaseType.name();
    }

    public enum CriteriaReleaseType { RELEASES, PRERELEASES }

    @Getter
    @RequiredArgsConstructor
    public enum Format {
        ALL("*"),
        APT("apt"),
        BOWER("bower"),
        COCOAPODS("cocoapods"),
        CONAN("conan"),
        CONDA("conda"),
        DOCKER("docker"),
        GITLFS("gitlfs"),
        GO("go"),
        HELM("helm"),
        MAVEN2("maven2"),
        NPM("npm"),
        NUGET("nuget"),
        P2("p2"),
        PYPI("pypi"),
        R("r"),
        RAW("raw"),
        RUBYGEMS("rubygems"),
        YUM("yum"),
        ;

        private final String format;
    }
}
