package com.osckorea.osms.nxrm.core.dto.pub.repository.maven;

import com.osckorea.osms.nxrm.core.models.pub.repository.AbstractGroupRepository;
import lombok.experimental.SuperBuilder;

public class MavenGroupRepositoryDto {
    @SuperBuilder
    public static class Create extends AbstractGroupRepository.Create {
        
    }

    public static class Response extends AbstractGroupRepository.Reponse { 

    }
}
