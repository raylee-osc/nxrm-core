package com.osckorea.osms.nxrm.core.vo.intl.repository;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class RepositoryVo {
    private String id;
    private String name;
}
