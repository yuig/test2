package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFh1ySDK implements AFg1cSDK {

    @NotNull
    private final AFd1pSDK getMediationNetwork;

    public AFh1ySDK(@NotNull AFd1pSDK aFd1pSDK) {
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        this.getMediationNetwork = aFd1pSDK;
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final Boolean AFAdRevenueData(@NotNull AFg1aSDK aFg1aSDK) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        return null;
    }
}
