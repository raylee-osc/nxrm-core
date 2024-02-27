package com.osckorea.osms.nxrm.core.vo.ext.component;

import java.sql.Timestamp;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class ComponentVo {
    private String id;
    private String repositoryName;
    private String format;
    private String group;
    private String name;
    private String version;
    private Timestamp lastBlobUpdated;
}
