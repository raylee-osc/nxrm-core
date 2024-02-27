package com.osckorea.osms.nxrm.core.model.pub.privilege;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AllPrivilegeActionType {
    ADD("add"),
    CREATE("create"),
    BROWSE("browse"),
    READ("read"),
    EDIT("edit"),
    UPDATE("update"),
    DELETE("delete"),
    RUN("run"),
    ALL("*"),
    ;

    private final String action;
}