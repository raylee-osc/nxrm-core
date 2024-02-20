package com.osckorea.osms.nxrm.core.dto.pub.tag.maven;

import com.osckorea.osms.nxrm.core.models.pub.tag.AbstractTagAssoicateQueryParam;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class MavenTagAssociateQueryParamDto extends AbstractTagAssoicateQueryParam {
    private Maven maven;
    
    private String gavec;

    @Getter
    @Setter
    @Builder
    public static class Maven {
        private String groupId;
        private String artifactId;
        private String baseVersion;
        private String extension;
        private String classifier;
    }
}
