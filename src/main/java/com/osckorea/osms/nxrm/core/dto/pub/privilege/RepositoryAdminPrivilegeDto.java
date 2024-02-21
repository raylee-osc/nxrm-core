package com.osckorea.osms.nxrm.core.dto.pub.privilege;

import java.util.List;
import com.osckorea.osms.nxrm.core.dto.pub.privilege.type.RepositoryAdminPrivilegeActionType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RepositoryAdminPrivilegeDto {
    private String name;
    private String description;
    private List<String> actions;
    private String format;
    private String repository;

    public RepositoryAdminPrivilegeDto(
        String name,
        String description,
        @Singular List<RepositoryAdminPrivilegeActionType> actions,
        String format,
        String repository
    ) {
        this.name = name;
        this.description = description;
        this.actions = actions.stream().map(RepositoryAdminPrivilegeActionType::getAction).toList();
        this.format = format;
        this.repository = repository;
    }
}
