package com.osckorea.osms.nxrm.core.constants;

import java.util.function.Function;

public final class NxrmInternalApiConstant {
    // * Base Route Path
    public final static String BASE_URL = "/service/rest/internal";

    // * Repository Management
    public final static String REPOSITORIES = BASE_URL + "/repositories";

    public final static String REPOSITORIES_DETAIL = REPOSITORIES + "/details";

    public final static String REPOSITORY = REPOSITORIES + "/repository";

    // * Security : User
    public final static String USERS_CURRENT_USER = BASE_URL + "/user";

    // * Security : User Token
    public final static String USER_TOKEN = BASE_URL + "/current-user/user-token";

    // * Security : Nuget API Token
    public final static String NUGET_API_KEY = BASE_URL + "/nuget-api-key";

    // * Support Zip
    public final static String SUPPORT_ZIP = BASE_URL + "/supportzip";

    public final static String SUPPORT_ZIP_ACTIVE_NODES = SUPPORT_ZIP + "/activenodes";

    public final static String SUPPORT_ZIP_STATUS = SUPPORT_ZIP + "/status";

    public final static String SUPPORT_ZIP_HISTORY = SUPPORT_ZIP + "/clear";

    // * Cleanup Policy
    public final static String CLEANUP_POLICIES = BASE_URL + "/cleanup-policies";

    public final static String CLEANUP_POLICY_CRITERIA_FORMATS = CLEANUP_POLICIES + "/criteria/formats";

    public final static String CLEANUP_POLICY_PREVIEW_COMPONENTS = CLEANUP_POLICIES + "/preview/components";

    // * Components
    public final static String COMPONENT_UPLOAD = BASE_URL + "/upload";

    // * System : Status
    public final static String CURRENT_STATUS = BASE_URL + "/status-check";

    // * Blob Store
    public final static String BLOBSTORE_TYPES = BASE_URL + "/blobstores/types";

    public final static String BLOBSTORE_QUOTA_TYPES = BASE_URL + "/blobstores/quotaTypes";

    public final static String BLOBSTORE_USAGES = BASE_URL + "/blobstores/usage";

    // * Realms
    public final static String REALM_TYPES = BASE_URL + "/realms/types";

    // * Anonymous Setting
    public final static String ANONYMOUS_SETTINGS = BASE_URL + "/anonymous-settings";

    // * Saml
    public final static String SAML = BASE_URL + "/saml";

    // * Logging
    public final static String LOGGING_LOG_LIST = BASE_URL + "/logging/logs";

    public final static String LOGGING_INSERT_MARK = BASE_URL + "/logging/log/mark";

    public final static class UI {
        public final static String BASE_URL = NxrmInternalApiConstant.BASE_URL + "/ui";

        // * Repository Management
        public final static String REPOSITORY_RECIPES = BASE_URL + "/repositories/recipes";

        public final static String USERS = BASE_URL + "/user";

        // * Security : User
        public final static Function<String, String> USER_CHANAGE_PASSWORD = (userId) -> new StringBuilder(USERS)
                                                                                                .append("/").append(userId)
                                                                                                .append("/password").toString();


        // * Routing Rules
        public final static String ROUTING_RULES = BASE_URL + "/routing-rules";

        public final static String ROUTING_RULE_TEST = ROUTING_RULES + "/test";

        public final static String ROUTING_RULE_GLOBAL_PREVIEW = ROUTING_RULES + "/preview";

        // * BLOB Store
        public final static String BLOBSTORE = BASE_URL + "/blobstores";

        // * Azure BLOB Store
        public final static String VERIFY_AZURE_BLOBSTORE_CONNECTION = BASE_URL + "/azureblobstore/test-connection";

        // * IQ Server
        public final static String IQ_SERVER_VERIFY_CONNECTION_FIREWALL = BASE_URL + "/iq/verify-connection";

        // * Logging
        public final static String LOGGING_CONFIGURATION = BASE_URL + "/loggingConfiguration";

        public final static String LOGGING_CONFIGURATION_RESET = BASE_URL + "/loggingConfiguration/reset";

        // * Analysis : Application
        public final static String ANALYSIS_APLICATION_HEALTHCHECK = BASE_URL + "/ahc";

        public final static class PRO {
            // * Data Store
            public final static String DATASTORE = BASE_URL + "/datastore";

            // * Replication
            public final static String REPLICATION_VERIFY_CONNECTION = BASE_URL + "/replication/test-connection/";

            public final static String REPLICATION_HOSTED_REPOSITORIES = BASE_URL + "/replication/repositories";
        }
    }
}
