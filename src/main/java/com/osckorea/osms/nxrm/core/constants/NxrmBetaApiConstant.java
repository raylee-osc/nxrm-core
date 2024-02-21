package com.osckorea.osms.nxrm.core.constants;

import java.util.function.Function;

public final class NxrmBetaApiConstant {
    // * Base Route Path
    public final static String BASE_URL = "/service/rest/beta";

    // * System : Information
    public final static String SYSTEM_INFORMATION = BASE_URL + "/system/information";

    // * System : Status
    public final static String STATUS_CHECK = BASE_URL + "/status/check";

    public final static String STATUS_CHECK_CLUSTER = BASE_URL + "/status/check/cluster";

    // * Replication
    public final static Function<String, String> REPLICATION_URL = (name) -> new StringBuilder(BASE_URL)
                                                                                    .append("/replication")
                                                                                    .append("/connection")
                                                                                    .append("/").append(name).toString();
}
