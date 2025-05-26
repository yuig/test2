package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1sSDK extends AFj1wSDK {

    @NotNull
    private final ExecutorService AFAdRevenueData;

    @NotNull
    private final Runnable component3;

    @NotNull
    private final AFj1uSDK component4;

    @NotNull
    private final AFd1nSDK getRevenue;
    private String hashCode;

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFj1uSDK.values().length];
            try {
                iArr[AFj1uSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1uSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1uSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getMediationNetwork = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AFj1sSDK(@org.jetbrains.annotations.NotNull com.appsflyer.internal.AFd1nSDK r3, @org.jetbrains.annotations.NotNull java.util.concurrent.ExecutorService r4, @org.jetbrains.annotations.NotNull com.appsflyer.internal.AFj1uSDK r5, @org.jetbrains.annotations.NotNull java.lang.Runnable r6, @org.jetbrains.annotations.NotNull java.lang.Runnable r7) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int[] r0 = com.appsflyer.internal.AFj1pSDK.AFa1uSDK.getCurrencyIso4217Code
            int r1 = r5.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2e
            r1 = 2
            if (r0 == r1) goto L2b
            r1 = 3
            if (r0 != r1) goto L25
            java.lang.String r0 = "facebook_lite"
            goto L30
        L25:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L2b:
            java.lang.String r0 = "instagram"
            goto L30
        L2e:
            java.lang.String r0 = "facebook"
        L30:
            java.lang.String r1 = "app"
            r2.<init>(r1, r0, r3, r6)
            r2.getRevenue = r3
            r2.AFAdRevenueData = r4
            r2.component4 = r5
            r2.component3 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1sSDK.<init>(com.appsflyer.internal.AFd1nSDK, java.util.concurrent.ExecutorService, com.appsflyer.internal.AFj1uSDK, java.lang.Runnable, java.lang.Runnable):void");
    }

    private static boolean AFAdRevenueData(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean component2(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private final boolean getCurrencyIso4217Code(Context context) {
        int i13 = AFa1uSDK.getMediationNetwork[this.component4.ordinal()];
        if (i13 == 1) {
            return AFAdRevenueData(context);
        }
        if (i13 == 2) {
            return getRevenue(context);
        }
        if (i13 == 3) {
            return component2(context);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r0 == null) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean getMediationNetwork(android.content.Context r12) {
        /*
            r11 = this;
            boolean r0 = r11.getMonetizationNetwork()
            r1 = 0
            if (r0 != 0) goto L14
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1sSDK r3 = com.appsflyer.internal.AFh1sSDK.META_REFERRER
            r6 = 4
            r7 = 0
            java.lang.String r4 = "Referrer collection disallowed by counter."
            r5 = 0
            com.appsflyer.internal.AFh1rSDK.d$default(r2, r3, r4, r5, r6, r7)
            return r1
        L14:
            com.appsflyer.internal.AFd1nSDK r0 = r11.getRevenue
            java.lang.String r2 = "com.facebook.sdk.ApplicationId"
            java.lang.String r0 = r0.getRevenue(r2)
            java.lang.String r2 = "fb"
            r3 = 0
            if (r0 == 0) goto L26
            java.lang.String r0 = kotlin.text.StringsKt.R(r2, r0)
            goto L27
        L26:
            r0 = r3
        L27:
            if (r0 == 0) goto L2f
            int r4 = r0.length()
            if (r4 != 0) goto L3c
        L2f:
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1sSDK r6 = com.appsflyer.internal.AFh1sSDK.META_REFERRER
            r9 = 4
            r10 = 0
            java.lang.String r7 = "Facebook app id Manifest metadata is not found."
            r8 = 0
            com.appsflyer.internal.AFh1rSDK.d$default(r5, r6, r7, r8, r9, r10)
            r0 = r3
        L3c:
            if (r0 != 0) goto L8d
            com.appsflyer.internal.AFd1nSDK r0 = r11.getRevenue
            java.lang.String r4 = "facebook_application_id"
            java.lang.String r0 = r0.getMonetizationNetwork(r4)
            if (r0 == 0) goto L4d
            java.lang.String r0 = kotlin.text.StringsKt.R(r2, r0)
            goto L4e
        L4d:
            r0 = r3
        L4e:
            if (r0 == 0) goto L56
            int r4 = r0.length()
            if (r4 != 0) goto L63
        L56:
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1sSDK r6 = com.appsflyer.internal.AFh1sSDK.META_REFERRER
            r9 = 4
            r10 = 0
            java.lang.String r7 = "Facebook app id string resource is not found."
            r8 = 0
            com.appsflyer.internal.AFh1rSDK.d$default(r5, r6, r7, r8, r9, r10)
            r0 = r3
        L63:
            if (r0 != 0) goto L8d
            com.appsflyer.internal.AFd1nSDK r0 = r11.getRevenue
            java.lang.String r4 = "com.appsflyer.FacebookApplicationId"
            java.lang.String r0 = r0.getRevenue(r4)
            if (r0 == 0) goto L74
            java.lang.String r0 = kotlin.text.StringsKt.R(r2, r0)
            goto L75
        L74:
            r0 = r3
        L75:
            if (r0 == 0) goto L7d
            int r2 = r0.length()
            if (r2 != 0) goto L8a
        L7d:
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1sSDK r5 = com.appsflyer.internal.AFh1sSDK.META_REFERRER
            r8 = 4
            r9 = 0
            java.lang.String r6 = "AF Facebook app id Manifest metadata is not found."
            r7 = 0
            com.appsflyer.internal.AFh1rSDK.d$default(r4, r5, r6, r7, r8, r9)
            r0 = r3
        L8a:
            if (r0 != 0) goto L8d
            goto L8e
        L8d:
            r3 = r0
        L8e:
            r11.hashCode = r3
            if (r3 != 0) goto L9f
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1sSDK r5 = com.appsflyer.internal.AFh1sSDK.META_REFERRER
            r8 = 4
            r9 = 0
            java.lang.String r6 = "Referrer collection disallowed by missing Facebook app id."
            r7 = 0
            com.appsflyer.internal.AFh1rSDK.d$default(r4, r5, r6, r7, r8, r9)
            return r1
        L9f:
            boolean r12 = r11.getCurrencyIso4217Code(r12)
            if (r12 != 0) goto Lb2
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1sSDK r3 = com.appsflyer.internal.AFh1sSDK.META_REFERRER
            r6 = 4
            r7 = 0
            java.lang.String r4 = "Referrer collection disallowed by missing content providers."
            r5 = 0
            com.appsflyer.internal.AFh1rSDK.d$default(r2, r3, r4, r5, r6, r7)
            return r1
        Lb2:
            r12 = 1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1sSDK.getMediationNetwork(android.content.Context):boolean");
    }

    private static boolean getRevenue(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    @Override // com.appsflyer.internal.AFj1mSDK
    @SuppressLint({"NewApi"})
    public final void getMonetizationNetwork(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getMediationNetwork(context)) {
            this.AFAdRevenueData.execute(new l(4, this, context));
        } else {
            this.component3.run();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x022a, code lost:
    
        if (r10 != null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0214, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0212, code lost:
    
        if (r10 != null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0261, code lost:
    
        if (r10 != null) goto L175;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #2 {all -> 0x006b, blocks: (B:10:0x004c, B:12:0x0052, B:18:0x00e9, B:82:0x0072, B:84:0x0083, B:85:0x0088, B:86:0x0089, B:88:0x008f, B:89:0x00a7, B:90:0x00b7, B:92:0x00bd, B:93:0x00d5), top: B:5:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void getRevenue(com.appsflyer.internal.AFj1sSDK r31, android.content.Context r32) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1sSDK.getRevenue(com.appsflyer.internal.AFj1sSDK, android.content.Context):void");
    }
}
