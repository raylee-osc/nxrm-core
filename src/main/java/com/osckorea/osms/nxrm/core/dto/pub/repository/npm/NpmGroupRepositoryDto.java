package com.osckorea.osms.nxrm.core.dto.pub.repository.npm;

import com.osckorea.osms.nxrm.core.model.pub.repository.AbstractGroupRepository;
import lombok.experimental.SuperBuilder;

public final class NpmGroupRepositoryDto {
    @SuperBuilder
    public static class Create extends AbstractGroupRepository.Create {
    }

    public static class Read extends AbstractGroupRepository.Read {
    }
}
