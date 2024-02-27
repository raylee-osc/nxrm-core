package com.osckorea.osms.nxrm.core.vo.pub.spec;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class UploadSpecVo {
    private String format;
    private Boolean multipleUpload;
    private List<ComponentField> componentFields;
    private List<AssetField> assetFields;

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class AssetField {
        private String name;
        private String type;
        private String description;
        private Boolean optional;
        private String group;
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class ComponentField {
        private String name;
        private String type;
        private String description;
        private Boolean optional;
        private String group;
    }
}
