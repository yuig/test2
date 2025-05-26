package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFh1iSDK {
    public final Intent AFAdRevenueData;
    public final String getCurrencyIso4217Code;

    @NotNull
    public final String getMonetizationNetwork;

    public AFh1iSDK(@NotNull Activity activity, @NotNull AFi1jSDK aFi1jSDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFi1jSDK, "");
        this.AFAdRevenueData = activity.getIntent();
        this.getMonetizationNetwork = aFi1jSDK.getMediationNetwork(activity);
        this.getCurrencyIso4217Code = aFi1jSDK.getRevenue(activity);
    }
}
