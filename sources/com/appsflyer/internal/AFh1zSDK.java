package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFh1zSDK implements AFg1bSDK {

    @NotNull
    private final AFg1cSDK getCurrencyIso4217Code;

    public AFh1zSDK(@NotNull AFg1cSDK aFg1cSDK) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        this.getCurrencyIso4217Code = aFg1cSDK;
    }

    @Override // com.appsflyer.internal.AFg1bSDK
    public final boolean getRevenue(@NotNull AFg1aSDK aFg1aSDK) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        if (aFg1aSDK.getGetMediationNetwork()) {
            this.getCurrencyIso4217Code.AFAdRevenueData(aFg1aSDK);
        }
        return aFg1aSDK.getGetCurrencyIso4217Code();
    }
}
