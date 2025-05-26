package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;

/* loaded from: classes3.dex */
public final class AFi1vSDK extends AFh1aSDK {
    public AFi1vSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFa1rSDK
    public final AFa1rSDK getRevenue(String str) {
        return super.getRevenue(AFa1rSDK.AFAdRevenueData(str));
    }

    @Override // com.appsflyer.internal.AFa1rSDK
    public final AFf1rSDK getRevenue() {
        return AFf1rSDK.PURCHASE_VALIDATE;
    }
}
