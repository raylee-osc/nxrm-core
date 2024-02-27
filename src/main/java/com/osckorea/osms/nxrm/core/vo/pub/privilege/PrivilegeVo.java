package com.osckorea.osms.nxrm.core.vo.pub.privilege;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonInclude(Include.NON_ABSENT)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class PrivilegeVo {
    private String type;
    
    private String name;

    private String description;

    private Boolean readOnly;

    //
    
    private List<String> actions;
    
    private String pattern;
    
    private String domain;
    
    private String format;
    
    private String repository;
    
    private String scriptName;
    
    private String contentSelector;
}
