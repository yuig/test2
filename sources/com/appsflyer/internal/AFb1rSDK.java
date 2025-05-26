package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface AFb1rSDK {
    void AFAdRevenueData();

    boolean AFAdRevenueData(String str);

    void getCurrencyIso4217Code();

    String getMonetizationNetwork(@NotNull AFb1jSDK aFb1jSDK);

    @NotNull
    List<AFb1jSDK> getMonetizationNetwork();
}
