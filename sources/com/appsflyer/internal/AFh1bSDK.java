package com.appsflyer.internal;

/* loaded from: classes3.dex */
public final class AFh1bSDK extends AFa1rSDK {
    public final AFf1rSDK toString;

    @Deprecated
    public AFh1bSDK() {
        this.toString = null;
    }

    @Override // com.appsflyer.internal.AFa1rSDK
    public final AFf1rSDK getRevenue() {
        AFf1rSDK aFf1rSDK = this.toString;
        return aFf1rSDK != null ? aFf1rSDK : AFf1rSDK.CACHED_EVENT;
    }

    public AFh1bSDK(String str, byte[] bArr, String str2, AFf1rSDK aFf1rSDK) {
        super(null, str, Boolean.FALSE);
        this.getMediationNetwork = str2;
        AFAdRevenueData(bArr);
        this.toString = aFf1rSDK;
    }
}
