package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class AFh1uSDK extends AFe1aSDK<Void> {
    private final Throwable areAllFieldsValid;
    private final AFe1jSDK<String> component1;
    private final AFd1pSDK component4;

    public AFh1uSDK(AFg1ySDK aFg1ySDK, AFd1pSDK aFd1pSDK) {
        super(AFf1rSDK.GCDSDK, new AFf1rSDK[]{AFf1rSDK.RC_CDN}, "GCD-CHECK");
        this.areAllFieldsValid = aFg1ySDK.component4();
        this.component1 = ((AFf1hSDK) aFg1ySDK).component1;
        this.component4 = aFd1pSDK;
    }

    private Map<String, Object> areAllFieldsValid() {
        String currencyIso4217Code = this.component4.getCurrencyIso4217Code("attributionId", null);
        if (currencyIso4217Code == null) {
            return null;
        }
        try {
            new AFe1nSDK();
            return AFe1nSDK.getMonetizationNetwork(currencyIso4217Code);
        } catch (JSONException e13) {
            StringBuilder sb3 = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb3.append(e13.getMessage());
            AFLogger.afErrorLog(sb3.toString(), e13);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    @NonNull
    public final AFf1wSDK getCurrencyIso4217Code() {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.component4.AFAdRevenueData("appsFlyerCount", 0))));
        long mediationNetwork = this.component4.getMediationNetwork("appsflyerConversionDataCacheExpiration", 0L);
        if (mediationNetwork != 0 && System.currentTimeMillis() - mediationNetwork > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.component4.getRevenue("sixtyDayConversionData", true);
            this.component4.getMonetizationNetwork("attributionId", (String) null);
            this.component4.getMonetizationNetwork("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> areAllFieldsValid = areAllFieldsValid();
        if (areAllFieldsValid != null) {
            try {
                if (!areAllFieldsValid.containsKey("is_first_launch")) {
                    areAllFieldsValid.put("is_first_launch", Boolean.FALSE);
                }
                AFh1vSDK.getCurrencyIso4217Code(areAllFieldsValid);
            } catch (Exception e13) {
                StringBuilder sb3 = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb3.append(e13.getLocalizedMessage());
                AFLogger.afErrorLog(sb3.toString(), e13);
            }
            return AFf1wSDK.SUCCESS;
        }
        try {
        } catch (Exception e14) {
            StringBuilder sb4 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb4.append(e14.getLocalizedMessage());
            AFLogger.afErrorLog(sb4.toString(), e14);
        }
        if (this.areAllFieldsValid != null) {
            StringBuilder sb5 = new StringBuilder("Launch exception: ");
            sb5.append(this.areAllFieldsValid.getMessage());
            AFh1vSDK.getMonetizationNetwork(sb5.toString());
            return AFf1wSDK.SUCCESS;
        }
        AFe1jSDK<String> aFe1jSDK = this.component1;
        if (aFe1jSDK != null && !aFe1jSDK.isSuccessful()) {
            StringBuilder sb6 = new StringBuilder("Launch status code: ");
            sb6.append(this.component1.getStatusCode());
            AFh1vSDK.getMonetizationNetwork(sb6.toString());
            return AFf1wSDK.SUCCESS;
        }
        return AFf1wSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public final long getMonetizationNetwork() {
        return 1000L;
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public final boolean getRevenue() {
        return false;
    }
}
