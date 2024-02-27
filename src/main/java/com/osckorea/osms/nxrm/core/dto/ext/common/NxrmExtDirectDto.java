package com.osckorea.osms.nxrm.core.dto.ext.common;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

public final class NxrmExtDirectDto {
    @Getter
    @Builder
    public static class Request {
        private String action;

        private String method;

        @Singular("data")
        private List<Object> data;

        @Builder.Default
        private String type = "rpc";

        @Builder.Default
        private Short tid = 1;
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final static class Response<T> {
        private String action;

        private String method;
        
        private Result<T> result;

        private String type;
        
        private Short tid;
    }

    @Getter
    @Builder
    public static class Filter {
        private String property;
        private String value;
    }

    @Getter
    @Builder
    public static class Sort {
        private String property;
        private String direction;
    }

    @ToString
    @Getter
    public static class Option {
        private Integer page;
        private Integer start;
        private Integer limit;
        private List<Filter> filter;
        private List<Sort> sort;
        
        @Builder
        public Option(
            final Integer page,
            final Integer start,
            final Integer limit,
            final @Singular List<Filter> filters,
            final Sort sort
        ) {
            this.page = page;
            this.start = start;
            this.limit = limit;
            this.filter = !filter.isEmpty() ? filter : null;
            this.sort = sort != null ? List.of(sort) : null;
        }   
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final static class Result<T> {
        private String message;
        private Boolean authenticationRequired;
        private Boolean success;
        private Boolean timedOut;
        private Boolean limited;
        private Long unlimitedTotal;
        private Long total;
        private List<T> data;
    }
}
