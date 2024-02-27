package com.osckorea.osms.nxrm.core.dto.pub.privilege;

import java.util.List;
import com.osckorea.osms.nxrm.core.model.pub.privilege.ScriptPrivilegeActionType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ScriptPrivilegeDto {
    private String name;
    private String description;
    private List<String> actions;
    private String scriptName;

    @Builder
    public ScriptPrivilegeDto(
        final String name,
        final String description,
        @Singular final List<ScriptPrivilegeActionType> actionTypes,
        final String scriptName
    ) {
        this.name = name;
        this.description = description;
        this.actions = actionTypes.stream().map(ScriptPrivilegeActionType::getAction).toList();
        this.scriptName = scriptName;
    }
}
