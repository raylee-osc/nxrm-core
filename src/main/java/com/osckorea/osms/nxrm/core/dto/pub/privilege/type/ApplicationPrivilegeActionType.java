package com.osckorea.osms.nxrm.core.dto.pub.privilege.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ApplicationPrivilegeActionType {
    CREATE("create"),
    READ("read"),
    UPDATE("update"),
    DELETE("delete"),
    ALL("*"),
    ;

    private final String action;
}
