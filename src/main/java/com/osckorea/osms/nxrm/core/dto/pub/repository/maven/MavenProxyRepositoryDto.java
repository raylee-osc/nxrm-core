package com.osckorea.osms.nxrm.core.dto.pub.repository.maven;

import com.osckorea.osms.nxrm.core.model.pub.repository.AbstractProxyRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

public final class MavenProxyRepositoryDto {
    @Getter
    @SuperBuilder
    public static class Create extends AbstractProxyRepository.Create {
        private Maven maven;
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class Read extends AbstractProxyRepository.Read {
        private Maven maven;
    }
}
