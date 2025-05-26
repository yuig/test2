package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1uSDK {
    public static JSONObject getCurrencyIso4217Code(String str) {
        JSONObject revenue = AFa1qSDK.getRevenue(str);
        if (revenue != null) {
            try {
                if (revenue.has("ol_id")) {
                    String optString = revenue.optString("ol_scheme", null);
                    String optString2 = revenue.optString("ol_domain", null);
                    String optString3 = revenue.optString("ol_ver", null);
                    if (optString != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                    }
                    if (optString2 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                    }
                    if (optString3 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_VERSION, optString3);
                    }
                }
            } catch (Throwable th3) {
                StringBuilder sb3 = new StringBuilder("Error in handleResponse: ");
                sb3.append(th3.getMessage());
                AFLogger.afErrorLogForExcManagerOnly(sb3.toString(), th3);
                AFb1tSDK.getCurrencyIso4217Code().AFAdRevenueData().copydefault().getCurrencyIso4217Code();
                AFb1tSDK.getCurrencyIso4217Code().AFAdRevenueData().copydefault().getRevenue();
            }
        }
        return revenue;
    }
}
