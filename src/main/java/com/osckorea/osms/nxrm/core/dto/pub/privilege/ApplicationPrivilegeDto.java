package com.osckorea.osms.nxrm.core.dto.pub.privilege;

import java.util.List;
import com.osckorea.osms.nxrm.core.model.pub.privilege.ApplicationPrivilegeActionType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public final class ApplicationPrivilegeDto {
    private String name;

    private String description;

    private List<String> actions;

    private String domain;

    @Builder
    public ApplicationPrivilegeDto(
        final String name,
        final String description,
        @Singular final List<ApplicationPrivilegeActionType> actionTypes,
        final String domain
    ) {
        this.name = name;
        this.description = description;
        this.actions = actionTypes.stream().map(ApplicationPrivilegeActionType::getAction).toList();
        this.domain = domain;
    }
}
