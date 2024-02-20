package com.osckorea.osms.nxrm.core.dto.pub.repository.pypi;

import com.osckorea.osms.nxrm.core.dto.pub.repository.pypi.type.Pypi;
import com.osckorea.osms.nxrm.core.models.pub.repository.AbstractProxyRepository;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

public class PypiProxyRepositoryDto {
    @Getter
    @SuperBuilder
    public static class Create extends AbstractProxyRepository.Create {
        private Pypi pypi;
    }

    public static class Response extends AbstractProxyRepository.Response {
        
    }
}
