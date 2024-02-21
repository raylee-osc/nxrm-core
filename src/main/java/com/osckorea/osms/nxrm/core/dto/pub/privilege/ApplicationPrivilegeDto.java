package com.osckorea.osms.nxrm.core.dto.pub.privilege;

import java.util.List;
import com.osckorea.osms.nxrm.core.dto.pub.privilege.type.ApplicationPrivilegeActionType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ApplicationPrivilegeDto {
    private String name;

    private String description;

    private List<String> actions;

    private String domain;

    @Builder
    public ApplicationPrivilegeDto(
        String name, 
        String description,
        @Singular List<ApplicationPrivilegeActionType> actions, 
        String domain
    ) {
        this.name = name;
        this.description = description;
        this.actions = actions.stream().map(ApplicationPrivilegeActionType::getAction).toList();
        this.domain = domain;
    }
}
