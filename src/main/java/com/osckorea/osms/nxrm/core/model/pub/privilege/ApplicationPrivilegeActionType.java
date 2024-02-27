package com.osckorea.osms.nxrm.core.model.pub.privilege;

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
