package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFf1uSDK.AnonymousClass3;

/* loaded from: classes.dex */
public final class AFf1jSDK extends AFe1aSDK<Boolean> {
    private static volatile boolean component3 = false;
    private final AFf1uSDK areAllFieldsValid;
    private Boolean component1;
    private final AFd1gSDK component2;
    private final AFb1rSDK component4;

    public AFf1jSDK(@NonNull AFd1gSDK aFd1gSDK) {
        super(AFf1rSDK.LOAD_CACHE, new AFf1rSDK[0], "LoadCachedRequests");
        this.component4 = aFd1gSDK.valueOf();
        this.areAllFieldsValid = aFd1gSDK.copy();
        this.component2 = aFd1gSDK;
    }

    public static boolean component2() {
        return component3;
    }

    private static String getMediationNetwork(AFb1jSDK aFb1jSDK) {
        long currentTimeMillis = System.currentTimeMillis();
        long parseLong = Long.parseLong(aFb1jSDK.getMediationNetwork, 10);
        String str = aFb1jSDK.AFAdRevenueData;
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("isCachedRequest", "true").appendQueryParameter("timeincache", String.valueOf((currentTimeMillis - parseLong) / 1000)).toString();
        } catch (Exception e13) {
            AFLogger.afErrorLogForExcManagerOnly("Couldn't parse the uri", e13);
            return str;
        }
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    @NonNull
    public final AFf1wSDK getCurrencyIso4217Code() {
        for (AFb1jSDK aFb1jSDK : this.component4.getMonetizationNetwork()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1sSDK aFh1sSDK = AFh1sSDK.CACHE;
            StringBuilder sb3 = new StringBuilder("resending request: ");
            sb3.append(aFb1jSDK.AFAdRevenueData);
            aFLogger.i(aFh1sSDK, sb3.toString());
            try {
                AFh1bSDK aFh1bSDK = new AFh1bSDK(getMediationNetwork(aFb1jSDK), aFb1jSDK.getMonetizationNetwork(), aFb1jSDK.getMediationNetwork, aFb1jSDK.getCurrencyIso4217Code);
                AFf1uSDK aFf1uSDK = this.areAllFieldsValid;
                aFf1uSDK.getCurrencyIso4217Code.execute(aFf1uSDK.new AnonymousClass3(new AFf1bSDK(aFh1bSDK, this.component2)));
            } catch (Exception e13) {
                AFLogger.INSTANCE.e(AFh1sSDK.QUEUE, "Failed to resend cached request", e13);
            }
        }
        this.component1 = Boolean.TRUE;
        component3 = true;
        return AFf1wSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public final long getMonetizationNetwork() {
        return 30000L;
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public final boolean getRevenue() {
        return false;
    }
}
