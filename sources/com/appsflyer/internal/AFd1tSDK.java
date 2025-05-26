package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1tSDK {
    public final int AFAdRevenueData;

    @NotNull
    public final String getMonetizationNetwork;

    public AFd1tSDK(int i13, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFAdRevenueData = i13;
        this.getMonetizationNetwork = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFd1tSDK)) {
            return false;
        }
        AFd1tSDK aFd1tSDK = (AFd1tSDK) obj;
        return this.AFAdRevenueData == aFd1tSDK.AFAdRevenueData && Intrinsics.d(this.getMonetizationNetwork, aFd1tSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        return this.getMonetizationNetwork.hashCode() + (Integer.hashCode(this.AFAdRevenueData) * 31);
    }

    @NotNull
    public final String toString() {
        return "AppSetIdModel(scope=" + this.AFAdRevenueData + ", id=" + this.getMonetizationNetwork + ")";
    }
}
