package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFh1lSDK extends AFh1rSDK {
    private final boolean getCurrencyIso4217Code;

    @NotNull
    private final AFd1gSDK getMediationNetwork;

    public AFh1lSDK(@NotNull AFd1gSDK aFd1gSDK) {
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        this.getMediationNetwork = aFd1gSDK;
        this.getCurrencyIso4217Code = true;
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void d(@NotNull AFh1sSDK aFh1sSDK, @NotNull String str, boolean z13) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z13) {
            this.getMediationNetwork.copydefault().getRevenue("D", AFAdRevenueData(str, aFh1sSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void e(@NotNull AFh1sSDK aFh1sSDK, @NotNull String str, @NotNull Throwable th3, boolean z13, boolean z14, boolean z15, boolean z16) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th3, "");
        if (z16) {
            this.getMediationNetwork.copydefault().getRevenue("E", AFAdRevenueData(str, aFh1sSDK));
        }
        if (z16) {
            this.getMediationNetwork.copydefault().getRevenue(th3);
        }
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void force(@NotNull AFh1sSDK aFh1sSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.getMediationNetwork.copydefault().getRevenue("F", AFAdRevenueData(str, aFh1sSDK));
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final boolean getShouldExtendMsg() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void i(@NotNull AFh1sSDK aFh1sSDK, @NotNull String str, boolean z13) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z13) {
            this.getMediationNetwork.copydefault().getRevenue("I", AFAdRevenueData(str, aFh1sSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void v(@NotNull AFh1sSDK aFh1sSDK, @NotNull String str, boolean z13) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z13) {
            this.getMediationNetwork.copydefault().getRevenue("V", AFAdRevenueData(str, aFh1sSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void w(@NotNull AFh1sSDK aFh1sSDK, @NotNull String str, boolean z13) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z13) {
            this.getMediationNetwork.copydefault().getRevenue("W", AFAdRevenueData(str, aFh1sSDK));
        }
    }
}
