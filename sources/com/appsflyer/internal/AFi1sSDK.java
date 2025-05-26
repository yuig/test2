package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class AFi1sSDK {
    public final int AFAdRevenueData;
    public final Throwable areAllFieldsValid;
    public final String component1;
    public final AFi1pSDK component3;
    public final String getCurrencyIso4217Code;
    public final long getMediationNetwork;

    @NonNull
    public final String getMonetizationNetwork;
    public final long getRevenue;

    public AFi1sSDK(String str, @NonNull String str2, long j13, long j14, int i13, AFi1pSDK aFi1pSDK, String str3, Throwable th3) {
        this.getCurrencyIso4217Code = str;
        this.getMonetizationNetwork = str2;
        this.getRevenue = j13;
        this.getMediationNetwork = j14;
        this.AFAdRevenueData = i13;
        this.component3 = aFi1pSDK;
        this.component1 = str3;
        this.areAllFieldsValid = th3;
    }
}
