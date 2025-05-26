package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFg1mSDK {
    private final PackageManager AFAdRevenueData;

    @NotNull
    private final String getMonetizationNetwork;

    @NotNull
    private final Map<String, Object> getRevenue;

    public AFg1mSDK(@NotNull AFd1oSDK aFd1oSDK, @NotNull AFd1nSDK aFd1nSDK) {
        Intrinsics.checkNotNullParameter(aFd1oSDK, "");
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        this.getRevenue = new LinkedHashMap();
        Context context = aFd1oSDK.getMonetizationNetwork;
        this.AFAdRevenueData = context != null ? context.getPackageManager() : null;
        String packageName = aFd1nSDK.getRevenue.getMonetizationNetwork.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        this.getMonetizationNetwork = packageName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r2 = r3.getInstallSourceInfo(r2);
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> getRevenue() {
        /*
            r5 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.getRevenue
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6b
            android.content.pm.PackageManager r0 = r5.AFAdRevenueData     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L22
            java.lang.String r1 = r5.getMonetizationNetwork     // Catch: java.lang.Exception -> L1c
            java.lang.String r0 = r0.getInstallerPackageName(r1)     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L22
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.getRevenue     // Catch: java.lang.Exception -> L1c
            java.lang.String r2 = "installer_package"
            r1.put(r2, r0)     // Catch: java.lang.Exception -> L1c
            goto L22
        L1c:
            r0 = move-exception
            java.lang.String r1 = "Exception while getting the app's installer package. "
            com.appsflyer.AFLogger.afErrorLog(r1, r0)
        L22:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L6b
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.getRevenue
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r2 = r5.getMonetizationNetwork
            android.content.pm.PackageManager r3 = r5.AFAdRevenueData
            if (r3 == 0) goto L66
            android.content.pm.InstallSourceInfo r2 = as.d.e(r3, r2)
            if (r2 == 0) goto L66
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r3 = as.d.k(r2)
            if (r3 == 0) goto L50
            java.lang.String r4 = "initiating_package"
            r1.put(r4, r3)
        L50:
            java.lang.String r3 = as.d.t(r2)
            if (r3 == 0) goto L5b
            java.lang.String r4 = "installing_package"
            r1.put(r4, r3)
        L5b:
            java.lang.String r2 = as.d.v(r2)
            if (r2 == 0) goto L66
            java.lang.String r3 = "originating_package"
            r1.put(r3, r2)
        L66:
            java.lang.String r2 = "install_source_info"
            r0.put(r2, r1)
        L6b:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.getRevenue
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1mSDK.getRevenue():java.util.Map");
    }
}
