package com.osckorea.osms.nxrm.core.model.pub.privilege;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AllPrivilegeType {
    APPLICATION("application"),
    REPOSITORY_ADMIN("repository-admin"),
    REPOSITORY_CONTENT_SELECTOR("repository-content-selector"),
    REPOSITORY_VIEW("repository-view"),
    SCRIPT("script"),
    WILDCARD("*")
    ;

    private final String type;
}
