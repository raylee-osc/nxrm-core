package com.osckorea.osms.nxrm.core.dto.pub.repository.common;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class RepositoryDto {
    private String name;
    private String format;
    private String type;
    private String url;
}
