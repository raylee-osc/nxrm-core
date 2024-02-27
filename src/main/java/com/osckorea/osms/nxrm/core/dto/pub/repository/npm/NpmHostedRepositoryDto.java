package com.osckorea.osms.nxrm.core.dto.pub.repository.npm;

import com.osckorea.osms.nxrm.core.model.pub.repository.AbstractHostedRepository;
import lombok.experimental.SuperBuilder;

public final class NpmHostedRepositoryDto extends AbstractHostedRepository {
    @SuperBuilder
    public static class Create extends AbstractHostedRepository.Create {
    }

    public static class Read extends AbstractHostedRepository.Read {
    }
}
