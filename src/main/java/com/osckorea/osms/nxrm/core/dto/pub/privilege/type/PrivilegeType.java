package com.osckorea.osms.nxrm.core.dto.pub.privilege.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PrivilegeType {
    APPLICATION("application"),
    REPOSITORY_ADMIN("repository-admin"),
    REPOSITORY_CONTENT_SELECTOR("repository-content-selector"),
    REPOSITORY_VIEW("repository-view"),
    SCRIPT("script"),
    WILDCARD("*")
    ;

    private final String type;
}
