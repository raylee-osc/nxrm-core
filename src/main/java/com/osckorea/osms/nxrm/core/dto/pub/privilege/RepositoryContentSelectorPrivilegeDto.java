package com.osckorea.osms.nxrm.core.dto.pub.privilege;

import com.osckorea.osms.nxrm.core.model.pub.privilege.RepositoryContentSelectorPrivilegeActionType;
import java.util.List;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public final class RepositoryContentSelectorPrivilegeDto {
    private String name;
    private String description;
    private List<String> actions;
    private String format;
    private String repository;
    private String contentSelector;

    @Builder
    public RepositoryContentSelectorPrivilegeDto(
        final String name,
        final String description,
        @Singular final List<RepositoryContentSelectorPrivilegeActionType> actionTypes,
        final String format,
        final String repository,
        final String contentSelector
    ) {
        this.name = name;
        this.description = description;
        this.actions = actionTypes.stream().map(RepositoryContentSelectorPrivilegeActionType::getAction).toList();
        this.format = format;
        this.repository = repository;
        this.contentSelector = contentSelector;
    }
}
