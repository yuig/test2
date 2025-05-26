package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* loaded from: classes3.dex */
public final class AFf1qSDK extends AFf1hSDK<String> {

    @NonNull
    private final String component2;
    private final AFd1nSDK copy;
    private final AFk1sSDK toString;

    public AFf1qSDK(@NonNull AFd1gSDK aFd1gSDK, @NonNull String str, AFk1sSDK aFk1sSDK) {
        super(AFf1rSDK.IMPRESSIONS, new AFf1rSDK[]{AFf1rSDK.RC_CDN, AFf1rSDK.FETCH_ADVERTISING_ID}, aFd1gSDK, str);
        this.component2 = str;
        this.toString = aFk1sSDK;
        this.copy = aFd1gSDK.getMonetizationNetwork();
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final boolean copy() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final AFe1rSDK<String> getCurrencyIso4217Code(@NonNull String str) {
        AFe1sSDK aFe1sSDK = this.areAllFieldsValid;
        String currencyIso4217Code = this.copy.getCurrencyIso4217Code();
        return aFe1sSDK.getMediationNetwork(AFc1sSDK.getMonetizationNetwork(currencyIso4217Code) ? this.component2 : Uri.parse(this.component2).buildUpon().appendQueryParameter("advertising_id", currencyIso4217Code).build().toString());
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final void getMediationNetwork() {
        super.getMediationNetwork();
        AFe1jSDK<Result> aFe1jSDK = ((AFf1hSDK) this).component1;
        if (aFe1jSDK != 0) {
            int statusCode = aFe1jSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb3 = new StringBuilder("Cross promotion impressions success: ");
                sb3.append(this.component2);
                AFLogger.afInfoLog(sb3.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb4 = new StringBuilder("call to ");
                sb4.append(this.component2);
                sb4.append(" failed: ");
                sb4.append(statusCode);
                AFLogger.afInfoLog(sb4.toString());
                return;
            }
            StringBuilder sb5 = new StringBuilder("Cross promotion redirection success: ");
            sb5.append(this.component2);
            AFLogger.afInfoLog(sb5.toString(), false);
            String currencyIso4217Code = aFe1jSDK.getCurrencyIso4217Code("Location");
            AFk1sSDK aFk1sSDK = this.toString;
            if (aFk1sSDK == null || currencyIso4217Code == null) {
                return;
            }
            aFk1sSDK.getCurrencyIso4217Code = currencyIso4217Code;
            Context context = aFk1sSDK.AFAdRevenueData.get();
            if (context != null) {
                try {
                    if (aFk1sSDK.getCurrencyIso4217Code != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFk1sSDK.getCurrencyIso4217Code)).setFlags(268435456));
                    }
                } catch (Exception e13) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e13)), e13);
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final boolean getRevenue() {
        return false;
    }
}
