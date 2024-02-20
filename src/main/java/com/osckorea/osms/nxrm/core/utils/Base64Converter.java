package com.osckorea.osms.nxrm.core.utils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class Base64Converter {
    
    public static String encoder(String userId, String userPw) {
        return "Basic " + Base64.getEncoder().encodeToString(String.join(":", userId, userPw).getBytes()).toString();
    }

    public static String decoder(String str) {
        byte[] decoded = Base64.getDecoder().decode(str);
        
        String result = new String(decoded, StandardCharsets.UTF_8);
        
        return result;
    }
}
