package com.osckorea.osms.nxrm.core.dto.pub.role;

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
public final class RoleDto {
    private String id;
    private String source;
    private String name;
    private String description;
    private Boolean readOnly;
    private List<String> privileges;
    private List<String> roles;

    @Builder
    public RoleDto(
        final String id,
        final String name,
        final String description,
        @Singular final List<String> privileges,
        @Singular final List<String> roles
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.privileges = privileges;
        this.roles = roles;
    }
}
