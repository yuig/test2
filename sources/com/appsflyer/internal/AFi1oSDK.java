package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1oSDK {
    public final String getCurrencyIso4217Code;
    public final String getMediationNetwork;
    private final boolean getMonetizationNetwork;

    @NotNull
    public final String getRevenue;

    public AFi1oSDK(@NotNull String str, String str2, String str3, boolean z13) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getRevenue = str;
        this.getCurrencyIso4217Code = str2;
        this.getMediationNetwork = str3;
        this.getMonetizationNetwork = z13;
    }

    public final boolean getMediationNetwork() {
        return this.getMonetizationNetwork;
    }
}
