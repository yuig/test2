package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFh1vSDK {
    public static void getCurrencyIso4217Code(Map<String, Object> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1tSDK.getCurrencyIso4217Code().getCurrencyIso4217Code;
        if (appsFlyerConversionListener != null) {
            StringBuilder sb3 = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            sb3.append(map.toString());
            AFLogger.afDebugLog(sb3.toString());
            appsFlyerConversionListener.onConversionDataSuccess(map);
        }
    }

    public static void getMonetizationNetwork(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1tSDK.getCurrencyIso4217Code().getCurrencyIso4217Code;
        if (appsFlyerConversionListener != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            appsFlyerConversionListener.onConversionDataFail(str);
        }
    }
}
