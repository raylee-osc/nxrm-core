package com.osckorea.osms.nxrm.core.vo.pub.realm;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class AvailableRealmVo {
    private String id;
    private String name;
}
