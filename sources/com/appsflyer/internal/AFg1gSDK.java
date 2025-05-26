package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface AFg1gSDK {
    void AFAdRevenueData(@NotNull AFa1rSDK aFa1rSDK);

    void AFAdRevenueData(@NotNull Map<String, Object> map);

    void getCurrencyIso4217Code(@NotNull AFa1rSDK aFa1rSDK);

    void getMediationNetwork(@NotNull AFa1rSDK aFa1rSDK);

    void getMediationNetwork(@NotNull Map<String, Object> map, int i13, int i14);

    long getMonetizationNetwork();

    void getMonetizationNetwork(@NotNull AFa1rSDK aFa1rSDK);

    void getMonetizationNetwork(@NotNull Map<String, Object> map);

    Long getRevenue();

    void getRevenue(@NotNull AFa1rSDK aFa1rSDK);

    void getRevenue(@NotNull Map<String, Object> map);
}
