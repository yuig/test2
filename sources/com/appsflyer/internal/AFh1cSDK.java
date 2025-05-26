package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFh1cSDK extends AFa1rSDK {
    @Override // com.appsflyer.internal.AFa1rSDK
    public final boolean component2() {
        return true;
    }

    @Override // com.appsflyer.internal.AFa1rSDK
    public final AFf1rSDK getRevenue() {
        return this.component2 == 1 ? AFf1rSDK.CONVERSION : AFf1rSDK.LAUNCH;
    }
}
