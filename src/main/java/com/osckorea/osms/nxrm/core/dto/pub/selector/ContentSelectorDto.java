package com.osckorea.osms.nxrm.core.dto.pub.selector;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ContentSelectorDto {
    private String name;
    private String type;
    private String description;
    private String expression;

    @Builder
    public ContentSelectorDto(
        final String name,
        final String description,
        final String expression
    ) {
        this.name = name;
        this.description = description;
        this.expression = expression;
    }
}
