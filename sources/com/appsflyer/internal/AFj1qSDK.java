package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public final class AFj1qSDK extends AFj1wSDK {
    private final AFd1gSDK AFAdRevenueData;
    private final AFj1rSDK getRevenue;

    public AFj1qSDK(Runnable runnable, AFd1gSDK aFd1gSDK, AFj1rSDK aFj1rSDK) {
        super("store", "huawei", aFd1gSDK.getMonetizationNetwork(), runnable);
        this.AFAdRevenueData = aFd1gSDK;
        this.getRevenue = aFj1rSDK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0105, code lost:
    
        getRevenue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0108, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0102, code lost:
    
        if (0 == 0) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void getCurrencyIso4217Code(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1qSDK.getCurrencyIso4217Code(android.content.Context):void");
    }

    private boolean getMediationNetwork(Context context) {
        if (!getMonetizationNetwork()) {
            AFLogger.INSTANCE.d(AFh1sSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getRevenue.AFAdRevenueData(context)) {
            AFLogger.INSTANCE.d(AFh1sSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getRevenue.getMonetizationNetwork(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFh1sSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }

    @Override // com.appsflyer.internal.AFj1mSDK
    public final void getMonetizationNetwork(Context context) {
        if (getMediationNetwork(context)) {
            this.AFAdRevenueData.getMediationNetwork().execute(new l(3, this, context));
        }
    }
}
