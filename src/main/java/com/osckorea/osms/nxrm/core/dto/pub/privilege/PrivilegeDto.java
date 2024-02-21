package com.osckorea.osms.nxrm.core.dto.pub.privilege;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class PrivilegeDto {
    private String name;
    private String description;
    private List<String> actions;
    private Boolean readOnly;
    private String pattern;
    private String domain;
}
