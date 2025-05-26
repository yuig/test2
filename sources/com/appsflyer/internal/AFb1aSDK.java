package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFb1aSDK {
    public static void getMediationNetwork(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    String string = jSONObject.getString("appsflyerKey");
                    StringBuilder sb3 = new StringBuilder();
                    for (int i13 = 0; i13 < string.length(); i13++) {
                        if (i13 != 0 && i13 != string.length() - 1) {
                            sb3.append("*");
                        }
                        sb3.append(string.charAt(i13));
                    }
                    jSONObject.put("appsflyerKey", sb3.toString());
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", "tcstring");
                }
                if (jSONObject.has("referrer")) {
                    jSONObject.put("referrer", "referrer");
                }
                if (jSONObject.has("pia_token")) {
                    jSONObject.put("pia_token", "pia_token");
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1sSDK aFh1sSDK = AFh1sSDK.OTHER;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(jSONObject);
                aFLogger.i(aFh1sSDK, sb4.toString());
            } catch (JSONException e13) {
                AFLogger.INSTANCE.e(AFh1sSDK.OTHER, "Not able to log the payload", e13);
            }
        }
    }
}
