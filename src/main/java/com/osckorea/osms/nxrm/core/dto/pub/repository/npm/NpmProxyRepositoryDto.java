package com.osckorea.osms.nxrm.core.dto.pub.repository.npm;

import com.osckorea.osms.nxrm.core.dto.pub.repository.npm.type.Npm;
import com.osckorea.osms.nxrm.core.models.pub.repository.AbstractProxyRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

public class NpmProxyRepositoryDto {
    @Getter
    @SuperBuilder
    public static class Create extends AbstractProxyRepository.Create {
        private Npm npm;
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class Response extends AbstractProxyRepository.Response {
        private Npm npm;
    }
}
