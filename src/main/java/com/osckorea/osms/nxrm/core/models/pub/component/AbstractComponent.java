package com.osckorea.osms.nxrm.core.models.pub.component;

import java.util.List;
import com.osckorea.osms.nxrm.core.models.pub.asset.AbstractAsset;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public abstract class AbstractComponent<T extends AbstractAsset> {
    private String id;
    private String repository;
    private String format;
    private String group;
    private String name;
    private String version;
    private List<T> assets;
}
