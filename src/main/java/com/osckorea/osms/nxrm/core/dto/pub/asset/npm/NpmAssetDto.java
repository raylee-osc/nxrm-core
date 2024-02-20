package com.osckorea.osms.nxrm.core.dto.pub.asset.npm;

import com.osckorea.osms.nxrm.core.dto.pub.asset.npm.type.Npm;
import com.osckorea.osms.nxrm.core.models.pub.asset.AbstractAsset;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class NpmAssetDto extends AbstractAsset {
    private Npm npm;
}
