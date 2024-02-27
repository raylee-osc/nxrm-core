package com.osckorea.osms.nxrm.core.model.pub.repository;

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
        private String url;
        private Boolean online;
        private Storage storage;
        private Group group;
    }
    
    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public abstract static class Read {
        private String name;
        private String type;
        private String format;
        private String url;
        private Boolean online;
        private Storage storage;
        private Group group;
    }
}
