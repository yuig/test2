package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFh1oSDK implements AFh1qSDK {

    @NotNull
    private final AFd1gSDK getCurrencyIso4217Code;
    private AFh1tSDK getMediationNetwork;
    private AFh1pSDK getMonetizationNetwork;
    private AFh1lSDK getRevenue;

    public AFh1oSDK(@NotNull AFd1gSDK aFd1gSDK) {
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        this.getCurrencyIso4217Code = aFd1gSDK;
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final void AFAdRevenueData() {
        AFh1lSDK aFh1lSDK = this.getRevenue;
        if (aFh1lSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1rSDK.v$default(aFLogger, AFh1sSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1lSDK);
            this.getRevenue = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final void component3() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1rSDK[] aFh1rSDKArr = new AFh1rSDK[1];
        if (this.getMediationNetwork == null) {
            this.getMediationNetwork = new AFh1tSDK();
        }
        AFh1tSDK aFh1tSDK = this.getMediationNetwork;
        Intrinsics.f(aFh1tSDK);
        aFh1rSDKArr[0] = aFh1tSDK;
        aFLogger.registerClient(aFh1rSDKArr);
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final void getCurrencyIso4217Code() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1rSDK[] aFh1rSDKArr = new AFh1rSDK[1];
        if (this.getRevenue == null) {
            this.getRevenue = new AFh1lSDK(this.getCurrencyIso4217Code);
        }
        AFh1lSDK aFh1lSDK = this.getRevenue;
        Intrinsics.f(aFh1lSDK);
        aFh1rSDKArr[0] = aFh1lSDK;
        aFLogger.registerClient(aFh1rSDKArr);
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final void getMediationNetwork() {
        AFh1tSDK aFh1tSDK = this.getMediationNetwork;
        if (aFh1tSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1rSDK.v$default(aFLogger, AFh1sSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1tSDK);
            this.getMediationNetwork = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final void getMonetizationNetwork() {
        AFh1pSDK aFh1pSDK = this.getMonetizationNetwork;
        if (aFh1pSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1rSDK.v$default(aFLogger, AFh1sSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1pSDK);
            this.getMonetizationNetwork = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1qSDK
    public final void getRevenue() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1rSDK[] aFh1rSDKArr = new AFh1rSDK[1];
        if (this.getMonetizationNetwork == null) {
            this.getMonetizationNetwork = new AFh1pSDK(this.getCurrencyIso4217Code);
        }
        AFh1pSDK aFh1pSDK = this.getMonetizationNetwork;
        Intrinsics.f(aFh1pSDK);
        aFh1rSDKArr[0] = aFh1pSDK;
        aFLogger.registerClient(aFh1rSDKArr);
    }
}
