package com.osckorea.osms.nxrm.core.model.pub.repository;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonInclude(Include.NON_ABSENT)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class Storage {
    private String blobStoreName;
    private Boolean strictContentTypeValidation;
    private String writePolicy;

    @Builder
    public Storage(final String blobStoreName, final Boolean strictContentTypeValidation) {
        this.blobStoreName = blobStoreName;
        this.strictContentTypeValidation = strictContentTypeValidation;
    }
}
