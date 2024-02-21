package com.osckorea.osms.nxrm.core.dto.pub.privilege;

import java.util.List;
import com.osckorea.osms.nxrm.core.dto.pub.privilege.type.RepositoryViewPrivilegeActionType;
import lombok.Getter;
import lombok.Singular;

@Getter
public class RepositoryViewPrivilegeDto {
    private String name;
    private String description;
    private List<String> actions;
    private String format;
    private String repository;

    public RepositoryViewPrivilegeDto(
        String name,
        String description,
        @Singular List<RepositoryViewPrivilegeActionType> actions,
        String format,
        String repository
    ) {
        this.name = name;
        this.description = description;
        this.actions = actions.stream().map(RepositoryViewPrivilegeActionType::getAction).toList();
        this.format = format;
        this.repository = repository;
    }
}
