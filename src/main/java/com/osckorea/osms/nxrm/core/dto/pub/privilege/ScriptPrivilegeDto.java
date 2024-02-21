package com.osckorea.osms.nxrm.core.dto.pub.privilege;

import java.util.List;
import com.osckorea.osms.nxrm.core.dto.pub.privilege.type.ScriptPrivilegeActionType;
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
        String name,
        String description,
        @Singular List<ScriptPrivilegeActionType> actions,
        String scriptName
    ) {
        this.name = name;
        this.description = description;
        this.actions = actions.stream().map(ScriptPrivilegeActionType::getAction).toList();
        this.scriptName = scriptName;
    }
}
