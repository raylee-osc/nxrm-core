package com.osckorea.osms.nxrm.core.dto.pub.cleanup;

import com.osckorea.osms.nxrm.core.dto.ext.cleanup.type.CriteriaReleaseType;
import com.osckorea.osms.nxrm.core.dto.pub.cleanup.type.FormatType;
import lombok.Builder;
import lombok.Getter;

@Getter
public class CleanupPolicyDto {
    private String name;                // Cleanup Policy Name
    private String format;              // Target Format (Enum)
    private String notes;               // Description
    private Integer criteriaLastBlobUpdated;
    private Integer criteriaLastDownloaded;
    private Object sortBy;
    private Object retain;
    private String criteriaAssetRegex;
    private String criteriaReleaseType;
    private Integer inUseCount;

    @Builder
    public CleanupPolicyDto(
        String name,
        FormatType format,
        String description,
        String criteriaAssetRegex,
        CriteriaReleaseType criteriaReleaseType,
        Integer criteriaLastBlobUpdated,
        Integer criteriaLastDownloaded
    ) {
        this.name = name;
        this.notes = description;
        this.format = format.getFormat();
        this.criteriaAssetRegex = criteriaAssetRegex;
        this.criteriaReleaseType = criteriaReleaseType.name();
        this.criteriaLastBlobUpdated = criteriaLastBlobUpdated;
        this.criteriaLastDownloaded = criteriaLastDownloaded;
    }
}
