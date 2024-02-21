package com.osckorea.osms.nxrm.core.dto.ext.cleanup;

import com.osckorea.osms.nxrm.core.dto.ext.cleanup.type.CriteriaReleaseType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class CleanupPolicyDto {
    private String name;
    private String format;
    private String mode;
    private String notes;
    private Criteria criteria;
    private Integer sortOrder;

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class Criteria {
        private Integer lastBlobUpdated;
        private Integer lastDownloaded;
        private CriteriaReleaseType releaseType;
        private String regex;
    }
}
