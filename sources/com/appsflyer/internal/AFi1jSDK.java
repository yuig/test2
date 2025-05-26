package com.appsflyer.internal;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface AFi1jSDK {
    void getCurrencyIso4217Code(@NotNull Activity activity);

    @NotNull
    String getMediationNetwork(Activity activity);

    String getRevenue(Activity activity);
}
