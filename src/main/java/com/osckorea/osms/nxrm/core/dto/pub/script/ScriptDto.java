package com.osckorea.osms.nxrm.core.dto.pub.script;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class ScriptDto {
    private String name;
    private String content;
    private String type;
}
