package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface AFb1gSDK {
    void AFAdRevenueData();

    boolean component2();

    void getCurrencyIso4217Code();

    void getCurrencyIso4217Code(@NotNull String str, int i13, @NotNull String str2);

    void getCurrencyIso4217Code(@NotNull String str, @NotNull String str2);

    void getMediationNetwork();

    boolean getMonetizationNetwork();

    void getRevenue();

    void getRevenue(@NotNull String str, @NotNull String str2);

    void getRevenue(@NotNull String str, @NotNull String... strArr);

    void getRevenue(@NotNull Throwable th3);

    void k_(String str, PackageManager packageManager);
}
