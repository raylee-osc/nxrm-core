package com.osckorea.osms.nxrm.core.models.pub.repository;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

public abstract class AbstractGroupRepository {
    @Getter
    @SuperBuilder
    public abstract static class Create {
        private String name;
        private String online;
        private Storage storage;
        private Group group;
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public abstract static class Reponse {
        private String name;
        private String format;
        private String type;
        private String url;
        private Boolean online;
        private Storage storage;
        private Group group;
    }
}
