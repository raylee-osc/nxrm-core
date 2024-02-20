package com.osckorea.osms.nxrm.core.constants;

public final class NxrmInternalApiConstant {
    // * Base Route Path
    public final static String BASE_URL = "/service/rest/internal";

    // * Repository Management
    public final static String REPOSITORIES = BASE_URL + "/repositories";

    public final static String REPOSITORIES_DETAIL = REPOSITORIES + "/details";

    public final static String REPOSITORY = REPOSITORIES + "/repository";

    // * User
    public final static String CURRENT_USER = BASE_URL + "/user";

    // * Support Zip
    public final static String SUPPORT_ZIP = BASE_URL + "/supportzip";

    public final static String SUPPORT_ZIP_ACTIVE_NODES = SUPPORT_ZIP + "/activenodes";

    public final static String SUPPORT_ZIP_STATUS = SUPPORT_ZIP + "/status";

    public final static String SUPPORT_ZIP_HISTORY = SUPPORT_ZIP + "/clear";

    // * Components
    public final static String COMPONENT_UPLOAD = BASE_URL + "/upload";

    // * System : Status
    public final static String CURRENT_STATUS = BASE_URL + "/status-check";

    // * Blob Store
    public final static String BLOB_STORE_TYPES = BASE_URL + "/blobstores/types";

    public final static String BLOB_STORE_QUOTA_TYPES = BASE_URL + "/blobstores/quotaTypes";

    public final static String BLOB_STORE_USAGES = BASE_URL + "/blobstores/usage";

    // * Realms
    public final static String REALM_TYPES = BASE_URL + "/realms/types";

    // * Anonymous Setting
    public final static String ANONYMOUS_SETTINGS = BASE_URL + "/anonymous-settings";

    // * Saml
    public final static String SAML = BASE_URL + "/saml";
}
