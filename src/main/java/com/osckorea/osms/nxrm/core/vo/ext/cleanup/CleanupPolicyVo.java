package com.osckorea.osms.nxrm.core.vo.ext.cleanup;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class CleanupPolicyVo {
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

    public enum CriteriaReleaseType { RELEASES, PRERELEASES }
}
