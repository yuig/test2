package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1cSDK {
    public final String AFAdRevenueData;
    public final long getCurrencyIso4217Code;
    public final long getMediationNetwork;
    public final String getRevenue;

    public AFi1cSDK(long j13, long j14, String str, String str2) {
        this.getCurrencyIso4217Code = j13;
        this.getMediationNetwork = j14;
        this.getRevenue = str;
        this.AFAdRevenueData = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1cSDK)) {
            return false;
        }
        AFi1cSDK aFi1cSDK = (AFi1cSDK) obj;
        return this.getCurrencyIso4217Code == aFi1cSDK.getCurrencyIso4217Code && this.getMediationNetwork == aFi1cSDK.getMediationNetwork && Intrinsics.d(this.getRevenue, aFi1cSDK.getRevenue) && Intrinsics.d(this.AFAdRevenueData, aFi1cSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        int c13 = a.a.c(this.getMediationNetwork, Long.hashCode(this.getCurrencyIso4217Code) * 31, 31);
        String str = this.getRevenue;
        int hashCode = (c13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.AFAdRevenueData;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        long j13 = this.getCurrencyIso4217Code;
        long j14 = this.getMediationNetwork;
        String str = this.getRevenue;
        String str2 = this.AFAdRevenueData;
        StringBuilder u13 = a.a.u("PlayIntegrityApiData(piaTimestamp=", j13, ", ttrMillis=");
        u13.append(j14);
        u13.append(", piaToken=");
        u13.append(str);
        u13.append(", errorCode=");
        u13.append(str2);
        u13.append(")");
        return u13.toString();
    }
}
