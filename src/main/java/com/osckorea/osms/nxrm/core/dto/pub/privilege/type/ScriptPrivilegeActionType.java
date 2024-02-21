package com.osckorea.osms.nxrm.core.dto.pub.privilege.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ScriptPrivilegeActionType {
    BROWSE("browse"),
    READ("read"),
    EDIT("edit"),
    ADD("add"),
    DELETE("delete"),
    RUN("run"),
    ALL("*")
    ;
    
    private final String action;
}
