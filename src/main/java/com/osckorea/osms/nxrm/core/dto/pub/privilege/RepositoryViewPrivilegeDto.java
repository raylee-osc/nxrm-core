package com.osckorea.osms.nxrm.core.dto.pub.privilege;

import java.util.List;
import com.osckorea.osms.nxrm.core.model.pub.privilege.RepositoryViewPrivilegeActionType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RepositoryViewPrivilegeDto {
    private String name;
    private String description;
    private List<String> actions;
    private String format;
    private String repository;

    @Builder
    public RepositoryViewPrivilegeDto(
        final String name,
        final String description,
        @Singular final List<RepositoryViewPrivilegeActionType> actionTypes,
        final String format,
        final String repository
    ) {
        this.name = name;
        this.description = description;
        this.actions = actionTypes.stream().map(RepositoryViewPrivilegeActionType::getAction).toList();
        this.format = format;
        this.repository = repository;
    }
}
