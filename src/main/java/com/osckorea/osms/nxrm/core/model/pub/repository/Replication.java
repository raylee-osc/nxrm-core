package com.osckorea.osms.nxrm.core.model.pub.repository;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class Replication {
    private Boolean preemptivePullEnabled;
    private String assetPathRegex;
}
