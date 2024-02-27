package com.osckorea.osms.nxrm.core.vo.ext.asset;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class AssetVo {
    private String id;
    private String name;
    private String format;
    private String contentType;
}

