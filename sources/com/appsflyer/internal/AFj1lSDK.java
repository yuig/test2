package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1mSDK;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class AFj1lSDK {
    public final AFd1gSDK AFAdRevenueData;
    public final List<AFj1mSDK> getMonetizationNetwork = new ArrayList();

    public AFj1lSDK(AFd1gSDK aFd1gSDK) {
        this.AFAdRevenueData = aFd1gSDK;
    }

    public /* synthetic */ void component2(Runnable runnable) {
        AFj1sSDK aFj1sSDK = new AFj1sSDK(this.AFAdRevenueData.getMonetizationNetwork(), this.AFAdRevenueData.getMediationNetwork(), AFj1uSDK.INSTAGRAM, runnable, new o(this, runnable, 2));
        getCurrencyIso4217Code(aFj1sSDK);
        aFj1sSDK.getMonetizationNetwork(this.AFAdRevenueData.AFInAppEventType().getMonetizationNetwork);
    }

    public static /* synthetic */ void getMediationNetwork() {
    }

    public /* synthetic */ void getMonetizationNetwork(Runnable runnable) {
        AFj1aSDK.getRevenue(this.AFAdRevenueData.getRevenue(), new o(this, runnable, 0), 0L, TimeUnit.MILLISECONDS);
    }

    @NonNull
    public final synchronized AFj1mSDK[] AFAdRevenueData() {
        return (AFj1mSDK[]) this.getMonetizationNetwork.toArray(new AFj1mSDK[0]);
    }

    public final synchronized void getCurrencyIso4217Code(AFj1mSDK aFj1mSDK) {
        this.getMonetizationNetwork.add(aFj1mSDK);
    }

    public final AFj1vSDK getRevenue(Runnable runnable) {
        return new AFj1vSDK(new o(this, runnable, 3), this.AFAdRevenueData.getMediationNetwork(), this.AFAdRevenueData.getMonetizationNetwork());
    }

    public /* synthetic */ void AFAdRevenueData(Runnable runnable) {
        AFj1sSDK aFj1sSDK = new AFj1sSDK(this.AFAdRevenueData.getMonetizationNetwork(), this.AFAdRevenueData.getMediationNetwork(), AFj1uSDK.FACEBOOK_LITE, runnable, new p(0));
        getCurrencyIso4217Code(aFj1sSDK);
        aFj1sSDK.getMonetizationNetwork(this.AFAdRevenueData.AFInAppEventType().getMonetizationNetwork);
    }

    public final void getMediationNetwork(Runnable runnable) {
        getCurrencyIso4217Code(new AFj1sSDK(this.AFAdRevenueData.getMonetizationNetwork(), this.AFAdRevenueData.getMediationNetwork(), AFj1uSDK.FACEBOOK, runnable, new o(this, runnable, 1)));
    }

    public /* synthetic */ void getCurrencyIso4217Code(Runnable runnable) {
        try {
            if (getRevenue(new AFh1fSDK())) {
                runnable.run();
            }
        } catch (Throwable th3) {
            AFLogger.afErrorLog(th3.getMessage(), th3);
        }
    }

    public final boolean getMonetizationNetwork() {
        return this.AFAdRevenueData.getMonetizationNetwork().getCurrencyIso4217Code("AF_PREINSTALL_DISABLED", false);
    }

    public final boolean getRevenue(AFa1rSDK aFa1rSDK) {
        int AFAdRevenueData = this.AFAdRevenueData.getMonetizationNetwork().getCurrencyIso4217Code.AFAdRevenueData("appsFlyerCount", 0);
        return (!this.AFAdRevenueData.component2().getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, false) && AFAdRevenueData == 1) || (AFAdRevenueData == 1 && !(aFa1rSDK instanceof AFh1fSDK));
    }

    public /* synthetic */ void getMediationNetwork(AFj1vSDK aFj1vSDK, Runnable runnable) {
        AFd1pSDK component2 = this.AFAdRevenueData.component2();
        int AFAdRevenueData = this.AFAdRevenueData.getMonetizationNetwork().getCurrencyIso4217Code.AFAdRevenueData("appsFlyerCount", 0);
        boolean mediationNetwork = component2.getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, false);
        boolean z13 = aFj1vSDK.component1 == AFj1mSDK.AFa1zSDK.NOT_STARTED;
        if (AFAdRevenueData == 1) {
            if (z13 || mediationNetwork) {
                runnable.run();
            }
        }
    }

    public final Runnable getRevenue(AFj1vSDK aFj1vSDK, Runnable runnable) {
        return new h6.o(this, aFj1vSDK, runnable, 11);
    }
}
