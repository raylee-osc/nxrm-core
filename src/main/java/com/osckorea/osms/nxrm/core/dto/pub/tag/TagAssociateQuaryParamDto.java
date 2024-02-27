package com.osckorea.osms.nxrm.core.dto.pub.tag;

import com.osckorea.osms.nxrm.core.model.pub.tag.AbstractTagAssociateCommonQueryParam;
import feign.Param;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * Only PRO Version
 */
@Getter
@SuperBuilder
public class TagAssociateQuaryParamDto extends AbstractTagAssociateCommonQueryParam {
        // ----- Conan -----
    @Param("conan.baseVersion")
    private String conanBaseVersion;

    @Param("conan.channel")
    private String conanChannel;

    @Param("conan.revision")
    private String conanRevision;

    @Param("conan.packageId")
    private String conanPackageId;

    @Param("conan.packageRevision")
    private String conanPackageRevision;

    // ----- Docker -----
    @Param("docker.imageName")
    private String dockerImageName;

    @Param("docker.imageTag")
    private String dockerImageTag;

    @Param("docker.layerId")
    private String dockerlayerId;

    @Param("docker.contentDigest")
    private String dockerContentDigest;

    // ----- Maven2 -----
    @Param("maven.groupId")
    private String mavenGroupId;

    @Param("maven.artifactId")
    private String mavenArtifactId;

    @Param("maven.baseVersion")
    private String mavenBaseVersion;

    @Param("maven.extension")
    private String mavenExtension;

    @Param("maven.classifier")
    private String mavenClassifier;

    private String gavec;

    // ----- NPM -----
    @Param("npm.scope")
    private String npmScope;

    @Param("npm.author")
    private String npmAuthor;

    @Param("npm.description")
    private String npmDescription;
    
    @Param("npm.keywords")
    private String npmKeywords;
    
    @Param("npm.license")
    private String npmLicense;

    @Param("npm.tagged_is")
    private String npmTaggedIs;

    @Param("npm.tagged_not")
    private String npmTaggedNot;

    // ----- Nuget -----
    @Param("nuget.id")
    private String nugetId;

    @Param("nuget.tags")
    private String nugetTags;

    @Param("nuget.title")
    private String nugetTitle;

    @Param("nuget.authors")
    private String nugetAuthors;

    @Param("nuget.description")
    private String nugetDescription;

    @Param("nuget.summary")
    private String nugetSummary;

    // ----- P2 -----
    @Param("p2.pluginName")
    private String p2PluginName;

    // ----- Pypi -----
    @Param("pypi.classifiers")
    private String pypiClassifiers;

    @Param("pypi.description")
    private String pypiDescription;

    @Param("pypi.keywords")
    private String pypiKeywords;

    @Param("pypi.summary")
    private String pypiSummary;

    // ----- RubyGem -----
    @Param("rubygems.description")
    private String rubygemsDescription;

    @Param("rubygems.platform")
    private String rubygemsPlatform;

    @Param("rubygems.summary")
    private String rubygemsSummary;

    // ----- Yum -----
    @Param("yum.architecture")
    private String yumArchitecture;

    @Param("yum.name")
    private String yumName;
}
