package com.osckorea.osms.nxrm.core.model.ext.asset;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonInclude(Include.NON_ABSENT)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Attributes {
    private Checksum checksum;
    private Provenance provenance;
    private Cache cache;
    private Firewall firewall;
    private Content content;

    @JsonInclude(Include.NON_ABSENT)
    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final static class Checksum {
        private String sha1;
        private String sha256;
        private String sha512;
        private String md5;
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final static class Cache {
        private Timestamp last_verified;
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final static class Content {
        private String etag;
        private Timestamp last_modified;
    }

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final static class Provenance {
        private Boolean hashed_not_verified;
    }

    /*
     * Only Pro
     */
    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public final static class Firewall {
        @JsonProperty("evaluated-hash")
        private String evaluatedHash;
        
        private String auditAssetTimestamp;
    }
}
