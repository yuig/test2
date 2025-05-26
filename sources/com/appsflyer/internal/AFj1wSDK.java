package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public abstract class AFj1wSDK extends AFj1mSDK {
    private AFd1nSDK AFAdRevenueData;

    public AFj1wSDK(String str, String str2, AFd1nSDK aFd1nSDK, Runnable runnable) {
        super(str, str2, runnable);
        this.AFAdRevenueData = aFd1nSDK;
    }

    public final boolean getMonetizationNetwork() {
        if (this.AFAdRevenueData.getCurrencyIso4217Code.AFAdRevenueData("appsFlyerCount", 0) <= 0) {
            return true;
        }
        AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
        return false;
    }
}
