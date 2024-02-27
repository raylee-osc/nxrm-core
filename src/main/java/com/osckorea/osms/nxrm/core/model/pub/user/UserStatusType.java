package com.osckorea.osms.nxrm.core.model.pub.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserStatusType {
    ACTIVE("active"),
    DISABLED("disabled"),
    ;

    private final String status;
}
