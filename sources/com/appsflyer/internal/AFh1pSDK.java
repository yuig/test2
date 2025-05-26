package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class AFh1pSDK extends AFh1rSDK {

    @NotNull
    private final AFd1gSDK getRevenue;

    public AFh1pSDK(@NotNull AFd1gSDK aFd1gSDK) {
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        this.getRevenue = aFd1gSDK;
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final void e(@NotNull AFh1sSDK aFh1sSDK, @NotNull String str, @NotNull Throwable th3, boolean z13, boolean z14, boolean z15, boolean z16) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th3, "");
        if (z15) {
            if (z.j(str)) {
                str = "missing label";
            }
            this.getRevenue.afErrorLog().getMediationNetwork(th3, withTag$SDK_prodRelease(str, aFh1sSDK));
        }
    }
}
