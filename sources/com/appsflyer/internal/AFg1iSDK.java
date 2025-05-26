package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class AFg1iSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;

    @NotNull
    final String getMediationNetwork;
    final int getMonetizationNetwork;
    final int getRevenue;

    public AFg1iSDK(int i13, int i14, int i15, int i16, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getMonetizationNetwork = i13;
        this.AFAdRevenueData = i14;
        this.getCurrencyIso4217Code = i15;
        this.getRevenue = i16;
        this.getMediationNetwork = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1iSDK)) {
            return false;
        }
        AFg1iSDK aFg1iSDK = (AFg1iSDK) obj;
        return this.getMonetizationNetwork == aFg1iSDK.getMonetizationNetwork && this.AFAdRevenueData == aFg1iSDK.AFAdRevenueData && this.getCurrencyIso4217Code == aFg1iSDK.getCurrencyIso4217Code && this.getRevenue == aFg1iSDK.getRevenue && Intrinsics.d(this.getMediationNetwork, aFg1iSDK.getMediationNetwork);
    }

    public final int hashCode() {
        return this.getMediationNetwork.hashCode() + ep.b.b(this.getRevenue, ep.b.b(this.getCurrencyIso4217Code, ep.b.b(this.AFAdRevenueData, Integer.hashCode(this.getMonetizationNetwork) * 31, 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        int i13 = this.getMonetizationNetwork;
        int i14 = this.AFAdRevenueData;
        int i15 = this.getCurrencyIso4217Code;
        int i16 = this.getRevenue;
        String str = this.getMediationNetwork;
        StringBuilder t13 = a.a.t("CmpTcfData(policyVersion=", i13, ", gdprApplies=", i14, ", cmpSdkId=");
        a.a.z(t13, i15, ", cmpSdkVersion=", i16, ", tcString=");
        return a.a.p(t13, str, ")");
    }
}
