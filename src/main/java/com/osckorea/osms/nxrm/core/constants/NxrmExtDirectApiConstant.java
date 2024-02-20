package com.osckorea.osms.nxrm.core.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

interface NxrmExtDirectRequestType {
    String getAction();

    String getMethod();
}

public final class NxrmExtDirectApiConstant {
    // * Base Route Path
    public final static String BASE_URL = "/service/extdirect";

    // * Polling Status Provider
    private final static String POLLING_URL = BASE_URL + "/poll";

    public final static String POLLING_STATE = POLLING_URL + "/rapture_State_get";

    public final static String POLLING_REPOSITORY_READ_STATUS = POLLING_URL + "/coreui_Repository_readStatus";

    // * Blob Store
    @Getter
    @RequiredArgsConstructor
    public enum BlobStore implements NxrmExtDirectRequestType {
        FILL_POLICIES("fillPolicies"),
        DEFAULT_WORK_DIRECTORY("defaultWorkDirectory"),
        CREATE("create"),
        READ("read"),
        READ_NAMES("readNames"),
        READ_TYPES("readTypes"),
        READ_QUOTA_TYPES("readQuotaTypes"),
        READ_GROUPS("readGroups"),
        READ_GROUPABLE("readGroupable"),
        UPDATE("update"),
        REMOVE("remove"),
        ;

        private final String action = "coreui_Blobstore";

        private final String method;
    }

    // * S3
    @Getter
    @RequiredArgsConstructor
    public enum S3 implements NxrmExtDirectRequestType {
        REGIONS("regions"),
        SIGNER_TYPES("signertypes"),
        ENCRYPTION_TYPES("encryptionTypes"),
        ;

        private final String action = "s3_S3";

        private final String method;
    }

    // * Components
    @Getter
    @RequiredArgsConstructor
    public enum Component implements NxrmExtDirectRequestType {
        CAN_DELETE_ASSET("canDeleteAsset"),
        CAN_DELETE_COMPONENT("canDeleteComponent"),
        CAN_DELETE_FOLDER("canDeleteFolder"),
        READ_ASSET("readAsset"),
        READ_COMPONENT("readComponent"),
        READ_COMPONENT_ASSETS("readComponentAssets"),
        DELETE_ASSET("deleteAsset"),
        DELETE_COMPONENT("deleteComponent"),
        DELETE_FOLDER("deleteFolder"),
        PREVIEW_ASSETS("previewAssets"),
        ;
    
        private final String action = "coreui_Component";
    
        private final String method;
    }

    // * Component Upload
    @Getter
    @RequiredArgsConstructor
    public enum ComponentUpload implements NxrmExtDirectRequestType {
        GET_UPLOAD_DEFINITIONS("getUploadDefinitions"),
        ;

        private final String action = "coreui_Upload";
        private final String method;
    }

    // * Browse
    @Getter
    @RequiredArgsConstructor
    public enum Browse implements NxrmExtDirectRequestType {
        READ("read"),
        ;
        private final String action = "coreui_Browse";
    
        private final String method;
    }
    
    /**
     * Search Component API
     * 
     * @param Boolean formatSearch   : 유형 별 검색
     * 
     * @param Integer page          : 페이지 번호 (1 ~)
     * @param Integer start         : offset 번호
     * @param Integer limit         : 페이지 크기
     * 
     * @param OptionFilter(keyword) 
     * @param Filter(repository_name)
     * 
     * @apiNote
     * Example 1)
     * 
     * <pre>
     * Options options = [
     *      {
     *          page: 1,
     *          start: 0,
     *          limit: 20,
     *          
     *      }
     * ]
     * </pre>
     */
    // * Search
    @Getter
    @RequiredArgsConstructor
    public enum Search {
        READ("read"),
        ;
    
        private final String action = "coreui_Search";
    
        private final String method;
    }

    // * Vulnerability
    @Getter
    @RequiredArgsConstructor
    public enum Vulnerability {
        READ("read"),
        ;
        private final String action = "coreui_Vulnerability";
    
        private final String method;
    }

    // * Content Selector
    @Getter
    @RequiredArgsConstructor
    public enum Selector implements NxrmExtDirectRequestType {
        CREATE("create"),
        READ("read"),
        READ_REFERENCES("readReferences"),
        UPDATE("update"),
        REMOVE("remove")
        ;

        private final String action = "coreui_Selector";
        private final String method;
    }

    // * Repository : Proprietary 
    @Getter
    @RequiredArgsConstructor
    public enum ProprietaryRepository implements NxrmExtDirectRequestType {
        READ("read"),
        READ_POSSIBLE_REPOSITORIES("readPossibleRepos"),
        UPDATE("update"),
        ;

        private final String action = "coreui_ProprietaryRepositories";
        private final String method;
    }
    
    // * Repository : Management
    @Getter
    @RequiredArgsConstructor
    public enum Repository implements NxrmExtDirectRequestType {
        REBUILD_INDEX("rebuildIndex"),
        INVALIDATE_CACHE("invalidateCache"),
        GET_BROWSEABLE_FORMATS("getBrowseableFormats"),
        CREATE("create"),
        READ("read"),
        READ_FORMATS("readFormats"),
        READ_RECIPES("readRecipes"),
        READ_REFERENCES("readReferences"),
        READ_REFERENCES_ADDING_ENTRY_FOR_ALL("readReferencesAddingEntryForAll"),
        READ_REFERENCES_ADDING_ENTRIES_FOR_ALL_FORMATS("readReferencesAddingEntriesForAllFormats"),
        UPDATE("update"),
        REMOVE("remove"),
        ;
    
        private final String action = "coreui_Repository";
    
        private final String method;
    }

    // * Setting : Cleanup Policy
    @Getter
    @RequiredArgsConstructor
    public enum CleanupPolicy implements NxrmExtDirectRequestType {
        READ_BY_FORMAT("readByFormat"),
        ;

        private final String action = "cleanup_CleanupPolicy";

        private final String method;
    }

    // * Setting : Http Settings
    @Getter
    @RequiredArgsConstructor
    public enum HttpSetting implements NxrmExtDirectRequestType {
        READ("read"),
        UPDATE("update"),
        ;

        private final String action = "coreui_HttpSettings";

        private final String method;
    }

    // * Firewall : Repository Status
    @Getter
    @RequiredArgsConstructor
    public enum FirewallRepositoryStatus {
        READ("read"),
        READ_CAPABILITIES_STATUS("readCapabilitiesStatus"),
        ;
        private final String action = "firewall_RepositoryStatus";
    
        private final String method;
    }

    // * LifeCycle : Component LifeCycle Management
    @Getter
    @RequiredArgsConstructor
    public enum CLM implements NxrmExtDirectRequestType {
        VERIFY_CONNECTION("verifyConnection"),
        AUTH_TYPES("authTypes"),
        READ("read"),
        READ_APPLICATIONS("readApplications"),
        UPDATE("update"),
        ;

        private final String action = "clm_CLM";

        private final String method;
    }

    // * HealthCheck : Info
    @Getter
    @RequiredArgsConstructor
    public enum HealthcheckInfo {
        READ("read"),
        ;
    
        private final String action = "healthcheck_Info";
    
        private final String method;
    }
    
    // * HealthCheck : Application Health Check (AHC) Components
    @Getter
    @RequiredArgsConstructor
    public enum AhcComponent {
        CONTAINS_APPLICATION("containsApplication"),
        ;
    
        private final String action = "ahc_Component";
    
        private final String method;
    }


    // * HealthCheck : Asset Detail
    @Getter
    @RequiredArgsConstructor
    public enum HealthCheckAssetDetail {
        IDENTIFY("identify"),
        ;

        private final String action = "healthcheck_AssetDetail";
        
        private final String method;
    }

    // * HealthCheck : Basic Configuration
    @Getter
    @RequiredArgsConstructor
    public enum HealthCheck implements NxrmExtDirectRequestType {
        ENABLE_ALL("enableAll"),
        READ("read"),
        READ_FOR_REPOSITORY("readForRepository"),
        UPDATE("update"),
        ;

        private final String action = "healthcheck_Status";

        private final String method;
    }

    // * Data Store
    @Getter
    @RequiredArgsConstructor
    public enum DataStore implements NxrmExtDirectRequestType {
        READ("read"),
        READ_H2("readH2"),
        ;

        private final String action = "coreui_Datastore";
        private final String method;
    }

    // * Email
    @Getter
    @RequiredArgsConstructor
    public enum Email implements NxrmExtDirectRequestType {
        SEND_VERIFYCATION("sendVerification"),
        READ("read"),
        UPDATE("update"),
        ;

        private final String action = "coreui_Email";

        private final String method;
    }

    // * Security : SSL - Certificate
    @Getter
    @RequiredArgsConstructor
    public enum SSLCertificate {
        DETAILS("details"),
        RETRIEVE_FROM_HOST("retrieveFromHost")
        ;

        private final String action = "ssl_Certificate";
        
        private final String method;
    }

    // * Security : SSL - Trust Store
    @Getter
    @RequiredArgsConstructor
    public enum SSLTrustStore {
        CREATE("create"),
        READ("read"),
        REMOVE("remove"),
        ;

        private final String action = "ssl_TrustStore";

        private final String method;
    }

    // * Security : User
    @Getter
    @RequiredArgsConstructor
    public enum User {
        GET("get"),
        CREATE("create"),
        READ("read"),
        READ_SOURCES("readSources"),
        UPDATE("update"),
        UPDATE_ROLE_MAPPINGS("updateRoleMappings"),
        REMOVE("remove"),
        CHANGE_PASSWORD("changePassword"),
        ;
    
        private final String action = "coreui_User";
    
        private final String method;
    }

    // * Security : User Token
    @Getter
    @RequiredArgsConstructor
    public enum UserToken implements NxrmExtDirectRequestType {
        STATUS("status"),
        RESET("reset"),
        RESET_ALL("resetAll"),
        READ("read"),
        UPDATE("update"),
        ;

        private final String action = "usertoken_UserToken";
        private final String method;
    }

    // * Security : LDAP
    @Getter
    @RequiredArgsConstructor
    public enum Ldap {
        VERIFY_LOGIN("verifyLogin"),
        VERIFY_CONNECTION("verifyConnection"),
        VERIFY_USER_MAPPING("verifyUserMapping"),
        CLEAR_CACHE("clearCache"),
        CHANGE_ORDER("changeOrder"),
        CREATE("create"),
        READ("read"),
        READ_TEMPLATES("readTemplates"),
        READ_REFERENCES("readReferences"),
        UPDATE("update"),
        REMOVE("remove"),
        ;
    
        private final String action = "ldap_LdapServer";
    
        private final String method;
    }

    // * Security : Role
    @Getter
    @RequiredArgsConstructor
    public enum Role {
        CREATE("create"),
        READ("read"),
        READ_FROM_SOURCE("readFromSource"),
        READ_REFERENCES("readReferences"),
        READ_SOURCES("readSources"),
        UPDATE("update"),
        REMOVE("remove"),
        ;
    
        private final String action = "coreui_Role";
    
        private final String method;
    }
    
    // * Security : Realms
    @Getter
    @RequiredArgsConstructor
    public enum Realm implements NxrmExtDirectRequestType {
        READ("read"),
        UPDATE("update"),
        READ_REALM_TYPES("readRealmTypes"),
        ;

        private final String action = "coreui_RealmSettings";
    
        private final String method;
    }

    // * Security : Privilege
    @Getter
    @RequiredArgsConstructor
    public enum Privilege implements NxrmExtDirectRequestType {
        CREATE("create"),
        READ("read"),
        READ_REFERENCES("readReferences"),
        READ_TYPES("readTypes"),
        UPDATE("update"),
        REMOVE("remove")
        ;

        private final String action = "coreui_Privilege";
        
        private final String method;
    }

    // * Security
    @Getter
    @RequiredArgsConstructor
    public enum Security implements NxrmExtDirectRequestType {
        AUTHENTICATE("authenticate"),
        GET_PERMISSIONS("getPermissions"),
        GET_USER("getUser"),
        AUTHENTICATION_TOKEN("authenticationToken")
        ;
    
        private final String action = "rapture_Security";
    
        private final String method;
    }

    // * Security : Remote User Token (RUT) Auth
    @Getter
    @RequiredArgsConstructor
    public enum Auth implements NxrmExtDirectRequestType {
        AUTHENTICATE("authenticate"),
        AUTH_TOKEN("authToken"),
        ;

        private final String action = "rut_Auth";

        private final String method;
    }

    // * Event : Log
    @Getter
    @RequiredArgsConstructor
    public enum EventLog implements NxrmExtDirectRequestType {
        RECORD_EVENT("recordEvent"),
        ;

        private final String action = "rapture_LogEvent";

        private final String method;
    }

    // * Migration : Repository
    @Getter
    @RequiredArgsConstructor
    public enum MigrationRepository implements NxrmExtDirectRequestType {
        READ("read"),
        DEFAULTS("defaults"),
        ;
        
        private final String action = "migration_Repository";
        
        private final String method;
    }
    
    // * Migration : Progress
    @Getter
    @RequiredArgsConstructor
    public enum MigrationProgress implements NxrmExtDirectRequestType {
        READ("read"),
        DETAIL("detail"),
        ;

        private final String action = "migration_Progress";
        
        private final String method;
    }

    // * Migration : Atlassian
    @Getter
    @RequiredArgsConstructor
    public enum Atlassian {
        CONFIGURE("configure"),
        PREPARE("prepare"),
        CONNECT("connect"),
        STOP_WAITING("stopWaiting"),
        FINISH("finish"),
        DONE("done"),
        ABORT("abort"),
        CANCEL("cancel"),
        STATUS("status"),
        SYNC("sync"),
        SYNC_STATUS("syncStatus"),
        ;

        private final String action = "migration_Assistant";

        private final String method;
    }

    // * System : Product License
    @Getter
    @RequiredArgsConstructor
    public enum ProductLicensing implements NxrmExtDirectRequestType {
        READ("read"),
        INSTALL("install"),
        UNINSTALL("uninstall"),
        ;

        private final String action = "licensing_Licensing";

        private final String method;
    }

    // * System : Anonymous Settings
    @Getter
    @RequiredArgsConstructor
    public enum AnonymousSettings implements NxrmExtDirectRequestType {
        READ("read"),
        UPDATE("update")
        ;

        private final String action = "coreui_AnonymousSettings";

        private final String method;
    }

    // * System : Bundle
    @Getter
    @RequiredArgsConstructor
    public enum Bundle implements NxrmExtDirectRequestType {
        READ("read");
        ;
        
        private final String action = "coreui_Bundle";

        private final String method;
    }

    // * System : Node Access
    @Getter
    @RequiredArgsConstructor
    public enum NodeAccess implements NxrmExtDirectRequestType {
        NODES("nodes")
        ;

        private final String action = "node_NodeAccess";

        private final String method;
    }
    
    // * System : Atlas System Information
    @Getter
    @RequiredArgsConstructor
    public enum AtlasSystemInformation implements NxrmExtDirectRequestType {
        READ("read"),
        ;
    
        private final String action = "atlas_SystemInformation";
    
        private final String method;
    }

    // * System : Capability
    @Getter
    @RequiredArgsConstructor
    public enum Capability {
        ENABLE("enable"),
        DISABLE("disable"),
        CREATE("create"),
        READ("read"),
        READ_TYPES("readTypes"),
        UPDATE("update"),
        UPDATE_NOTES("updateNotes"),
        REMOVE("remove"),
        ;

        private final String action = "capability_Capability";

        private final String method;
    }

    // * System : Freeze
    @Getter
    @RequiredArgsConstructor
    public enum Freeze implements NxrmExtDirectRequestType {
        FORCE_RELEASE("forceRelease"),
        READ("read"),
        UPDATE("update"),
        ;

        private final String action = "coreui_Freeze";

        private final String method;
    }
    // * System : Webhook
    @Getter
    @RequiredArgsConstructor
    public enum Webhook {
        LIST_WITH_TYPE_REPOSITORY("listWithTypeRepository"),
        LIST_WITH_TYPE_GLOBAL("listWithTypeGlobal"),
        ;

        private final String action = "coreui_Webhook";

        private final String method;
    }

    // * System : Task
    @Getter
    @RequiredArgsConstructor
    public enum Task implements NxrmExtDirectRequestType {
        STOP("stop"),
        RUN("run"),
        CREATE("create"),
        READ("read"),
        READ_TYPES("readTypes"),
        UPDATE("update"),
        REMOVE("remove"),
        ;

        private final String action = "coreui_Task";

        private final String method;
    }

    // * System : Outreach
    @Getter
    @RequiredArgsConstructor
    public enum Outreach {
        READ_STATUS("readStatus"),
        GET_PROXY_DOWNLOAD_NUMBERS("getProxyDownloadNumbers"),
        SHOW_FIREWALL_ALERT("showFirewallAlert"),
        SET_LOG4J_VISUALIZER_ENABLED("setLog4JVisualizerEnabled"),
        ;

        private final String action = "outreach_Outreach";

        private final String method;
    }

    // * (PRO Ver.) Tag List
    @Getter
    @RequiredArgsConstructor
    public enum TagList implements NxrmExtDirectRequestType {
        READ_TAGS("readTags"),
        READ_TAG("getTag"),
        READ_TAG_DETAILS("readTagListDetails"),
        ;

        private final String action = "proui_TagList";

        private final String method;
    }
}
