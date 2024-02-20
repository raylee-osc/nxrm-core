package com.osckorea.osms.nxrm.core.api;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class NxrmPaginationApiResponse<T> {
    private List<T> items;
    private String continuationToken;
}
