package com.osckorea.osms.nxrm.core.dto.pub.repository.pypi;

import com.osckorea.osms.nxrm.core.models.pub.repository.AbstractHostedRepository;
import lombok.experimental.SuperBuilder;

public class PypiHostedRepositoryDto {
    @SuperBuilder
    public static class Create extends AbstractHostedRepository.Create {

    }

    public static class Response extends AbstractHostedRepository.Response {

    }
}
