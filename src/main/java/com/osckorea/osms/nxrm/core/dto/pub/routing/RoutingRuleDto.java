package com.osckorea.osms.nxrm.core.dto.pub.routing;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class RoutingRuleDto {
    private String name;
    private String description;
    private String mode;
    private List<String> matchers;

    @Builder
    public RoutingRuleDto(
        final String name, 
        final String description, 
        final Mode mode, 
        @Singular final List<String> matchers
    ) {
        this.name = name;
        this.description = description;
        this.mode = mode.name();
        this.matchers = matchers;
    }

    public enum Mode { ALLOW, BLOCK }
}