package com.osckorea.osms.nxrm.core.dto.pub.privilege.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ActionType {
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