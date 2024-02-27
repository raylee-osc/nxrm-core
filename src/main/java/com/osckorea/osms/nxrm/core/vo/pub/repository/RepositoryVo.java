package com.osckorea.osms.nxrm.core.vo.pub.repository;

import com.osckorea.osms.nxrm.core.model.pub.repository.Attributes;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class RepositoryVo {
    private String name;
    private String format;
    private String type;
    private String url;
    private Attributes attributes;
}
