package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes3.dex */
public final class AFf1bSDK extends AFf1hSDK<String> {
    private final AFh1bSDK component2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AFf1bSDK(@androidx.annotation.NonNull com.appsflyer.internal.AFh1bSDK r8, @androidx.annotation.NonNull com.appsflyer.internal.AFd1gSDK r9) {
        /*
            r7 = this;
            com.appsflyer.internal.AFf1rSDK r0 = r8.toString
            if (r0 == 0) goto L6
        L4:
            r2 = r0
            goto L9
        L6:
            com.appsflyer.internal.AFf1rSDK r0 = com.appsflyer.internal.AFf1rSDK.CACHED_EVENT
            goto L4
        L9:
            com.appsflyer.internal.AFf1rSDK r0 = com.appsflyer.internal.AFf1rSDK.RC_CDN
            com.appsflyer.internal.AFf1rSDK[] r3 = new com.appsflyer.internal.AFf1rSDK[]{r0}
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.getMediationNetwork
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            java.lang.String r1 = AFAdRevenueData(r8)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = r8.getMediationNetwork
            r1 = r7
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.component2 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1bSDK.<init>(com.appsflyer.internal.AFh1bSDK, com.appsflyer.internal.AFd1gSDK):void");
    }

    private static String AFAdRevenueData(AFh1bSDK aFh1bSDK) {
        try {
            return new URL(aFh1bSDK.component1).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return this.component2.getMonetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final boolean copy() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final AFe1rSDK<String> getCurrencyIso4217Code(@NonNull String str) {
        String encodeToString = Base64.encodeToString(this.component2.AFAdRevenueData(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        ((AFf1hSDK) this).component3.getCurrencyIso4217Code(this.component2.component1, encodeToString);
        return this.areAllFieldsValid.AFAdRevenueData(this.component2);
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final boolean getRevenue() {
        ResponseNetwork responseNetwork;
        AFf1rSDK aFf1rSDK = this.component2.toString;
        if (aFf1rSDK == null) {
            aFf1rSDK = AFf1rSDK.CACHED_EVENT;
        }
        return (aFf1rSDK == AFf1rSDK.ARS_VALIDATE && (responseNetwork = ((AFf1hSDK) this).component1) != null && responseNetwork.getStatusCode() == 424) || super.getRevenue();
    }
}
