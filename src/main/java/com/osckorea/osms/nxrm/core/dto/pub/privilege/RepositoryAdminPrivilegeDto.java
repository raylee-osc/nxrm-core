package com.osckorea.osms.nxrm.core.dto.pub.privilege;

import java.util.List;
import com.osckorea.osms.nxrm.core.model.pub.privilege.RepositoryAdminPrivilegeActionType;
import lombok.Getter;
import lombok.Singular;

@Getter
public final class RepositoryAdminPrivilegeDto {
    private String name;
    private String description;
    private List<String> actions;
    private String format;
    private String repository;

    public RepositoryAdminPrivilegeDto(
        final String name,
        final String description,
        final String format,
        final String repository,
        final @Singular List<RepositoryAdminPrivilegeActionType> actionTypes
    ) {
        this.name = name;
        this.description = description;
        this.format = format;
        this.repository = repository;
        this.actions = actionTypes.stream().map(RepositoryAdminPrivilegeActionType::getAction).toList();
    }
}
