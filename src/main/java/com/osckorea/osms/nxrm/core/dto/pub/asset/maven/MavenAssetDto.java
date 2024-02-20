package com.osckorea.osms.nxrm.core.dto.pub.asset.maven;

import com.osckorea.osms.nxrm.core.dto.pub.asset.maven.type.Maven2;
import com.osckorea.osms.nxrm.core.models.pub.asset.AbstractAsset;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class MavenAssetDto extends AbstractAsset {
    private Maven2 maven2;
}
