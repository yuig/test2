package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AFb1bSDK {
    public static Map<String, String> getRevenue(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                hashMap.put(URLEncoder.encode(entry.getKey(), "utf-8"), URLEncoder.encode(entry.getValue(), "utf-8"));
            } catch (UnsupportedEncodingException e13) {
                AFLogger.afErrorLogForExcManagerOnly("failed to encode map", e13);
            }
        }
        return hashMap;
    }
}
