package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFg1dSDK extends AFa1rSDK {
    /* JADX WARN: Illegal instructions before constructor call */
    @android.annotation.SuppressLint({"VisibleForTests"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AFg1dSDK(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.appsflyer.internal.AFg1eSDK.getMediationNetwork
            com.appsflyer.AppsFlyerLib r2 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r2 = r2.getHostPrefix()
            com.appsflyer.internal.AFb1tSDK r3 = com.appsflyer.internal.AFb1tSDK.getCurrencyIso4217Code()
            java.lang.String r3 = r3.getHostName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.append(r1)
            java.lang.String r5 = r5.getPackageName()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r1 = "Register"
            r4.<init>(r1, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1dSDK.<init>(android.content.Context):void");
    }

    @Override // com.appsflyer.internal.AFa1rSDK
    public final boolean component4() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1rSDK
    public final AFf1rSDK getRevenue() {
        return AFf1rSDK.REGISTER;
    }
}
