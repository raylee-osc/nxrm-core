package com.osckorea.osms.nxrm.core.vo.pub.asset.maven;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.osckorea.osms.nxrm.core.model.pub.asset.AbstractAsset;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonInclude(Include.NON_ABSENT)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class MavenAssetVo extends AbstractAsset {
    private Maven2 maven2;
}
