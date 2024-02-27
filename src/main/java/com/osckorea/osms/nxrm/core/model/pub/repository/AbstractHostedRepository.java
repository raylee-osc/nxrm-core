package com.osckorea.osms.nxrm.core.model.pub.repository;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

public abstract class AbstractHostedRepository {
    @Getter
    @SuperBuilder
    public abstract static class Create {
        private String name;
        private Boolean online;
        private Storage storage;
        private Cleanup cleanup;
        private Component component;
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public abstract static class Read {
        private String name;
        private String format;
        private String type;
        private Boolean online;
        private Storage storage;
        private Cleanup cleanup;
        private Component component;
    }
}
