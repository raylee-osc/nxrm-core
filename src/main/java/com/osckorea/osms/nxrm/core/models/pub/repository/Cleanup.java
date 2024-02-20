package com.osckorea.osms.nxrm.core.models.pub.repository;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class Cleanup {
    @Singular("policyNames")
    private List<String> policyNames;
}
