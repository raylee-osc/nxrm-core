package com.osckorea.osms.nxrm.core.models.ext.asset;

import com.osckorea.osms.nxrm.core.models.ext.asset.type.Cache;
import com.osckorea.osms.nxrm.core.models.ext.asset.type.Checksum;
import com.osckorea.osms.nxrm.core.models.ext.asset.type.Content;
import com.osckorea.osms.nxrm.core.models.ext.asset.type.Firewall;
import com.osckorea.osms.nxrm.core.models.ext.asset.type.Provenance;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Attributes {
    private Checksum checksum;
    private Provenance provenance;
    private Cache cache;
    private Firewall firewall;
    private Content content;
}
