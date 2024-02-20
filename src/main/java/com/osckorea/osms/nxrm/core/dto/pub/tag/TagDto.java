package com.osckorea.osms.nxrm.core.dto.pub.tag;

import java.sql.Timestamp;
import java.util.Map;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class TagDto {
    private String name;
    private Map<String, Object> attributes;
    private Timestamp firstCreated;
    private Timestamp lastUpdated;
}
