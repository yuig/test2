package ads_mobile_sdk;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class nu1 extends hn2 {

    /* renamed from: e, reason: collision with root package name */
    public final Context f8993e;

    /* renamed from: f, reason: collision with root package name */
    public final cm0 f8994f;

    public nu1(Context context, cm0 gmaUtil) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        this.f8993e = context;
        this.f8994f = gmaUtil;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.PACKAGE_INFO;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x0089
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // a.t5
    public final java.lang.Object c(bl2.c r10) {
        /*
            r9 = this;
            ads_mobile_sdk.pk0 r10 = new ads_mobile_sdk.pk0
            ads_mobile_sdk.mu1 r7 = new ads_mobile_sdk.mu1
            android.content.Context r0 = r9.f8993e
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            java.lang.String r1 = r0.packageName
            java.lang.String r0 = "packageName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            android.content.Context r0 = r9.f8993e
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Context r2 = r9.f8993e
            java.lang.String r2 = r2.getPackageName()
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r3)
            java.lang.String r2 = r0.versionName
            ads_mobile_sdk.cm0 r0 = r9.f8994f
            android.content.Context r4 = r0.f3961a
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            if (r4 == 0) goto L3e
            android.content.Context r0 = r0.f3961a
            java.lang.String r0 = r0.getPackageName()
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r0, r3)
            if (r0 == 0) goto L3e
            int r0 = r0.versionCode
            goto L3f
        L3e:
            r0 = 0
        L3f:
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r0)
            android.content.Context r0 = r9.f8993e
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Context r4 = r9.f8993e
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            java.lang.CharSequence r0 = r0.getApplicationLabel(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            r5 = 30
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L89
            if (r6 < r5) goto L76
            android.content.Context r6 = r9.f8993e     // Catch: java.lang.Throwable -> L89
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L89
            android.content.Context r8 = r9.f8993e     // Catch: java.lang.Throwable -> L89
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()     // Catch: java.lang.Throwable -> L89
            java.lang.String r8 = r8.packageName     // Catch: java.lang.Throwable -> L89
            android.content.pm.InstallSourceInfo r6 = a.s0.e(r6, r8)     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = a.s0.k(r6)     // Catch: java.lang.Throwable -> L89
            goto L8a
        L76:
            android.content.Context r6 = r9.f8993e     // Catch: java.lang.Throwable -> L89
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L89
            android.content.Context r8 = r9.f8993e     // Catch: java.lang.Throwable -> L89
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()     // Catch: java.lang.Throwable -> L89
            java.lang.String r8 = r8.packageName     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = r6.getInstallerPackageName(r8)     // Catch: java.lang.Throwable -> L89
            goto L8a
        L89:
            r6 = r0
        L8a:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> La4
            if (r8 < r5) goto La4
            android.content.Context r5 = r9.f8993e     // Catch: java.lang.Throwable -> La4
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> La4
            android.content.Context r8 = r9.f8993e     // Catch: java.lang.Throwable -> La4
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()     // Catch: java.lang.Throwable -> La4
            java.lang.String r8 = r8.packageName     // Catch: java.lang.Throwable -> La4
            android.content.pm.InstallSourceInfo r5 = a.s0.e(r5, r8)     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = a.s0.x(r5)     // Catch: java.lang.Throwable -> La4
        La4:
            r8 = r0
            r0 = r7
            r5 = r6
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.<init>(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nu1.c(bl2.c):java.lang.Object");
    }
}
