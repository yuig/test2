package com.appsflyer.internal;

import com.appsflyer.internal.AFf1uSDK.AnonymousClass3;
import com.appsflyer.internal.AFf1xSDK;
import com.appsflyer.internal.AFf1zSDK;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFc1rSDK implements Runnable {
    private final Map<String, Object> AFAdRevenueData;

    @NotNull
    private final AFd1gSDK getMediationNetwork;

    @NotNull
    private final AFa1rSDK getRevenue;

    public AFc1rSDK(@NotNull AFd1gSDK aFd1gSDK, @NotNull AFa1rSDK aFa1rSDK, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        this.getMediationNetwork = aFd1gSDK;
        this.getRevenue = aFa1rSDK;
        this.AFAdRevenueData = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFg1xSDK aFg1xSDK;
        if (this.getRevenue.getMediationNetwork()) {
            AFg1ySDK aFg1ySDK = new AFg1ySDK(this.getRevenue, this.getMediationNetwork);
            aFg1ySDK.copydefault = this.AFAdRevenueData;
            aFg1xSDK = aFg1ySDK;
        } else {
            aFg1xSDK = this.getRevenue instanceof AFh1gSDK ? new AFg1zSDK((AFh1gSDK) this.getRevenue, this.getMediationNetwork) : new AFg1xSDK(this.getRevenue, this.getMediationNetwork);
        }
        AFf1uSDK copy = this.getMediationNetwork.copy();
        copy.getCurrencyIso4217Code.execute(copy.new AnonymousClass3(aFg1xSDK));
        this.getMediationNetwork.values();
        if (AFe1eSDK.AFAdRevenueData()) {
            AFf1xSDK currencyIso4217Code = this.getMediationNetwork.getCurrencyIso4217Code();
            AFa1rSDK aFa1rSDK = this.getRevenue;
            Intrinsics.checkNotNullParameter(aFa1rSDK, "");
            if (AFb1qSDK.getCurrencyIso4217Code(currencyIso4217Code.getRevenue.getMonetizationNetwork)) {
                AFf1zSDK.Companion companion = AFf1zSDK.INSTANCE;
                AFf1zSDK revenue = AFf1zSDK.Companion.getRevenue(aFa1rSDK);
                if (revenue == null) {
                    return;
                }
                if (!(revenue instanceof AFf1zSDK.AFa1uSDK) || currencyIso4217Code.getMediationNetwork.getRevenue(AFg1aSDK.IS_INAPP_TRIGGER_ENABLED)) {
                    currencyIso4217Code.getMonetizationNetwork(revenue, AFf1xSDK.AnonymousClass5.getMediationNetwork);
                }
            }
        }
    }
}
