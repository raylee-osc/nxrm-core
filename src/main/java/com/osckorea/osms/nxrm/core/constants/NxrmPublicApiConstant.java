package com.osckorea.osms.nxrm.core.constants;

import java.util.function.BiFunction;
import java.util.function.Function;
import com.osckorea.osms.nxrm.core.interfaces.TriFunction;

public class NxrmPublicApiConstant {
    // * Base Route Path
    public final static String BASE_URL = "/service/rest/v1";

    // * Route Path Paramter
    private final static String SECURITY_PATH = "/security";
    private final static String SUPPORT_PATH = "/support";

    // * Azure Blob Store
    public final static String VERIFY_AZURE_BLOBSTORE_CONNECTION = BASE_URL + "/azureblobstore/test-connection";

    // * Blob Store
    public final static String BLOBSTORE = BASE_URL + "/blobstores";

    public final static Function<String, String> BLOBSTORE_QUOTA_STATUS = (blobStoreName) -> new StringBuilder(BLOBSTORE).append("/").append(blobStoreName).append("/quota-status").toString();
    
    public final static String BLOBSTORE_FILE = BLOBSTORE + "/file";
    
    public final static String BLOBSTORE_S3 = BLOBSTORE + "/s3";
    
    public final static String BLOBSTORE_AZURE = BLOBSTORE + "/azure";
    
    // * Repository Management
    public final static String REPOSITORIES = BASE_URL + "/repositories";
    
    public final static String REPOSITORY_SETTINGS = BASE_URL + "/repositorySettings";
    
    public final static Function<String, String> REPOSITORY_DETAILS = (repository) -> new StringBuilder(REPOSITORIES).append("/").append(repository).toString();
    
    public final static TriFunction<String, String, String, String> REPOSITORY = (format, type, repository) -> new StringBuilder(REPOSITORIES)
                                                                                                                        .append("/").append(format.equals("maven2") ? "maven" : format)
                                                                                                                        .append("/").append(type)
                                                                                                                        .append("/").append(repository).toString();
    
    public final static Function<String, String> REPOSITORY_HEALTHCHECK = (repository) -> new StringBuilder(REPOSITORIES)
                                                                                                .append("/").append(repository)
                                                                                                .append("/health-check").toString();

    public final static Function<String, String> REPOSITORY_REBUILD_INDEX = (repository) -> new StringBuilder(REPOSITORIES)
                                                                                                    .append("/").append(repository)
                                                                                                    .append("/rebuild-index").toString();

    public final static Function<String, String> REPOSITORY_INVALID_CACHE = (repository) -> new StringBuilder(REPOSITORIES)
                                                                                                    .append("/").append(repository)
                                                                                                    .append("/invalidate-cache").toString();
    
    // * Assets
    public final static String ASSETS = BASE_URL + "/assets";
    
    // * Components
    public final static String COMPONENTS = BASE_URL + "/components";
    
    // * Search
    public final static String SEARCH_COMPONENT = BASE_URL + "/search";
    
    public final static String SEARCH_ASSETS = SEARCH_COMPONENT + "/assets";
    
    public final static String SEARCH_FOR_DOWNLOAD_ASSET = SEARCH_ASSETS + "/download";
    
    // * Content Selectors
    public final static String CONTENT_SELECTORS = BASE_URL + SECURITY_PATH + "/content-selectors";
    
    // * Routing Rules
    public final static String ROUTING_RULES = BASE_URL + "/routing-rules";
    
    // * Scripts
    public final static String SCRIPTS = BASE_URL + "/script";
    
    public final static Function<String, String> SCRIPT_RUN = (script) -> new StringBuilder(SCRIPTS)
                                                                                .append("/").append(script)
                                                                                .append("/run").toString();
    
    // * Email
    public final static String EMAIL_SERVER_CONFIG = BASE_URL + "/email";
    
    public final static String EMAIL_SERVER_VERIFY = EMAIL_SERVER_CONFIG + "/verify";
    
    // * Formats
    public final static String FORMAT_ALL_UPLOAD_SPEC = BASE_URL + "/formats/upload-specs";
    
    public final static Function<String, String> FORMAT_TARGET_UPLOAD_SPEC = (format) -> new StringBuilder(BASE_URL)
                                                                                                .append("/format")
                                                                                                .append("/").append(format)
                                                                                                .append("/upload-specs").toString();
    
    // * Read Only
    public final static String READ_ONLY_STATE = BASE_URL + "/read-only";
    
    public final static String READ_ONLY_STATE_SET_RELEASE = READ_ONLY_STATE + "/release";
    
    public final static String READ_ONLY_STATE_SET_FREEZE = READ_ONLY_STATE + "/freeze";
    
    public final static String READ_ONLY_STATE_SET_FORCIBLY_RELEASE = READ_ONLY_STATE + "/force-release";
    
    // * Anonoymouse Setting
    public final static String ANONYMOUS_SETTINGS = BASE_URL + SECURITY_PATH + "/anonymous";
    
    // * Security : Privileges
    public final static String PRIVILEGES = BASE_URL + SECURITY_PATH + "/privileges";
    
    public final static String PRIVILEGE_WILDCARD = PRIVILEGES + "/wildcard";
    
    public final static String PRIVILEGE_APPLICATION_ = PRIVILEGES + "/application";
    
    public final static String PRIVILEGE_REPOSITORY_CONTENT_SELECTOR =  PRIVILEGES + "/repository-content-selector";
    
    public final static String PRIVILEGE_REPOSITORY_VIEW = PRIVILEGES + "/repository-view";
    
    public final static String PRIVILEGE_REPOSITORY_ADMIN = PRIVILEGES + "/repository-admin";
    
    public final static String PRIVILEGE_SCRIPT = PRIVILEGES + "/script";
    
    // * Security: Realms
    public final static String REALM_ACTIVE = BASE_URL + SECURITY_PATH + "/realms/active";
    
    public final static String REALM_AVAILABLE = BASE_URL+ SECURITY_PATH + "/realms/available";
    
    // * Security : LDAP
    public final static String LDAP_SERVER = BASE_URL + SECURITY_PATH + "/ldap";
    
    public final static String LDAP_CHANGE_SERVER_ORDER = LDAP_SERVER + "/change-order";
    
    // * Security : Roles
    public final static String ROLES = BASE_URL + SECURITY_PATH + "/roles";
    
    public final static String ROLE_AVAILABLE_USER_SOURCES = BASE_URL + SECURITY_PATH + "/user-sources";
    
    // * Security : Users
    public final static String USERS = BASE_URL + SECURITY_PATH + "/users";
    
    public final static Function<String, String> USER_CHANGE_PASSWORD = (userId) -> new StringBuilder(USERS)
                                                                                            .append("/").append(userId)
                                                                                            .append("/change-password").toString();
    
    // * Security : Certificates
    public final static String SSL = BASE_URL + SECURITY_PATH + "/ssl";
    
    public final static String SSL_TRUSTSTORE = SSL + "/truststore";
    
    // * Product License
    public final static String PRODUCT_LICENSING = BASE_URL + "/system/license";

    // * Support Zip
    public final static String SUPPORT_ZIP = BASE_URL + SUPPORT_PATH + "/supportzip";
    
    public final static String SUPPORT_ZIP_PATH = BASE_URL + SUPPORT_PATH + "/supportzippath";
    
    // * System : Status
    public final static String SYSTEM_READ_STATUS = BASE_URL + "/status";
    
    public final static String SYSTEM_READ_AND_WRITE_STATUS = SYSTEM_READ_STATUS + "/writable";
    
    public final static String SYSTEM_STATUS_CHECK = SYSTEM_READ_STATUS + "/check";
    
    // * Tasks
    public final static String TASKS = BASE_URL + "/tasks";
    
    public final static Function<String, String> TASK_RUN = (taskId) -> new StringBuilder(TASKS)
                                                                                .append("/").append(taskId)
                                                                                .append("/run").toString();
    
    public final static Function<String, String> TASK_STOP = (taskId) -> new StringBuilder(TASKS)
                                                                                .append("/").append(taskId)
                                                                                .append("/stop").toString();
    
    // * LifeCycle
    public final static String LIFECYCLE_PHASE = BASE_URL + "/lifecycle/phase";
    
    
    public final static String LIFECYCLE_BOUNCE_PHASE = BASE_URL + "/lifecycle/bounce";

    // * IQ Server
    public final static String IQ_SERVER_CONFIG = BASE_URL + "/iq";
    
    public final static String IQ_SERVER_ENABLE_FIREWALL = IQ_SERVER_CONFIG + "/enable";
    
    public final static String IQ_SERVER_DISABLE_FIREWALL = IQ_SERVER_CONFIG + "/disable";
    
    public final static String IQ_SERVER_VERIFY_CONNECTION_FIREWALL = IQ_SERVER_CONFIG + "/verify-connection";
    
    public static class PRO {
        // * Blob Store
        public final static String BLOBSTORE_GROUP = BLOBSTORE + "/group";

        public final static String BLOBSTORE_CONVERT_GROUP_BLOBSTORE = BLOBSTORE_GROUP + "/convert";                

        // * Security : User Tokens
        public final static String USER_TOKENS = BASE_URL + SECURITY_PATH + "/user-tokens";

        // * Security : Users
        public final static BiFunction<String, String, String> USER_TOKEN_RESET = (userId, realm) -> new StringBuilder(USERS)
                                                                                                            .append("/").append(userId)
                                                                                                            .append("/").append(realm)
                                                                                                            .append("/user-token-reset").toString();

        // * SAML
        public final static String SAML = BASE_URL + "/saml";

        public final static String SAML_METADATA = SAML + "/metadata";

        public final static String SAML_PEM = SAML + "/pem";

        // * Security : Atlassian Crowd
        public final static String ATLASSIAN_CROWD = BASE_URL + SECURITY_PATH + "/atlassian-crowd";

        public final static String ATLASSIAN_CROWD_VERIFY_CONNECTION = ATLASSIAN_CROWD + "/verify-connection";

        public final static String ATLASSIAN_CROWD_DELETE_CACHE = ATLASSIAN_CROWD + "/clear-cache";

        // * Staging
        private final static String STAGING = BASE_URL + "/staging";

        public final static String STAGING_MOVE_COMPONENTS = STAGING + "/move";

        public final static String STAGING_DELETE_COMPONENTS = STAGING + "/delete";
        
        // * System : Nodes
        public final static String SYSTEM_NODE = BASE_URL + "/system/node";

        // * Tags
        public final static String TAGS = BASE_URL + "/tags";

        public final static String TAG_ASSOCIATE = TAGS + "/associate";
    }
}
