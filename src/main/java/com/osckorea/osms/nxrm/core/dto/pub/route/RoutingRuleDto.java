package com.osckorea.osms.nxrm.core.dto.pub.route;

import java.util.List;
import com.osckorea.osms.nxrm.core.dto.pub.route.type.ModeType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class RoutingRuleDto {
    private String name;
    private String description;
    private String mode;
    private List<String> matchers;

    @Builder
    public RoutingRuleDto(
        String name,
        String description,
        ModeType mode,
        @Singular List<String> matchers
    ) {
        this.name = name;
        this.description = description;
        this.mode = mode.name();
        this.matchers = matchers;
    }
}
