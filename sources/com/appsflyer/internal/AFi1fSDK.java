package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1fSDK implements AFi1jSDK {
    private String getMediationNetwork;

    private static String AFAdRevenueData(Activity activity) {
        Uri s_ = AFd1zSDK.s_(activity != null ? activity.getIntent() : null);
        String obj = s_ != null ? s_.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (getMonetizationNetwork(obj)) {
            return null;
        }
        return obj;
    }

    private static boolean getMonetizationNetwork(String str) {
        return z.p(str, "android-app://", false);
    }

    @Override // com.appsflyer.internal.AFi1jSDK
    public final void getCurrencyIso4217Code(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.getMediationNetwork;
        if (str == null || str.length() == 0) {
            this.getMediationNetwork = AFAdRevenueData(activity);
        }
    }

    @Override // com.appsflyer.internal.AFi1jSDK
    @NotNull
    public final String getMediationNetwork(Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String obj = referrer != null ? referrer.toString() : null;
        return obj == null ? "" : obj;
    }

    @Override // com.appsflyer.internal.AFi1jSDK
    public final String getRevenue(Activity activity) {
        String str = this.getMediationNetwork;
        this.getMediationNetwork = null;
        return (str == null || str.length() == 0) ? AFAdRevenueData(activity) : str;
    }
}
