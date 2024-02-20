package com.osckorea.osms.nxrm.core.dto.pub.asset.pypi;

import com.osckorea.osms.nxrm.core.dto.pub.asset.pypi.type.Pypi;
import com.osckorea.osms.nxrm.core.models.pub.asset.AbstractAsset;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class PypiAssetDto extends AbstractAsset {
    private Pypi pypi;
}
