package com.osckorea.osms.nxrm.core.vo.ext.repository;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @field id : 저장소 이름 e.g.) maven-central
 * @field name : 저장소 유형 e.g.) maven2 (proxy)
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class RepositoryRecipeVo {
    private String id;
    private String name;
}
