package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class AFe1zSDK implements AFd1aSDK {

    @NotNull
    private final AFd1cSDK AFAdRevenueData;

    public AFe1zSDK(@NotNull AFd1cSDK aFd1cSDK) {
        Intrinsics.checkNotNullParameter(aFd1cSDK, "");
        this.AFAdRevenueData = aFd1cSDK;
    }

    @Override // com.appsflyer.internal.AFd1aSDK
    public final void getMonetizationNetwork(@NotNull byte[] bArr, Map<String, String> map, int i13) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFe1xSDK(bArr, map, 2000).getCurrencyIso4217Code()) {
            this.AFAdRevenueData.getMediationNetwork();
        }
    }
}
