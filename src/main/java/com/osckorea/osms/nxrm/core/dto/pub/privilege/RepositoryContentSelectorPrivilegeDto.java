package com.osckorea.osms.nxrm.core.dto.pub.privilege;

import java.util.List;
import com.osckorea.osms.nxrm.core.dto.pub.privilege.type.RepositoryContentSelectorPrivilegeActionType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RepositoryContentSelectorPrivilegeDto {
    private String name;
    private String description;
    private List<String> actions;
    private String format;
    private String repository;
    private String contentSelector;

    @Builder
    public RepositoryContentSelectorPrivilegeDto(
        String name,
        String description,
        @Singular List<RepositoryContentSelectorPrivilegeActionType> actions,
        String format,
        String repository,
        String contentSelector
    ) {
        this.name = name;
        this.description = description;
        this.actions = actions.stream().map(RepositoryContentSelectorPrivilegeActionType::getAction).toList();
        this.format = format;
        this.repository = repository;
        this.contentSelector = contentSelector;
    }
}
