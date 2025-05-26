package ads_mobile_sdk;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class kd0 {

    /* renamed from: a, reason: collision with root package name */
    public final fd0 f7232a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f7233b;

    /* renamed from: c, reason: collision with root package name */
    public final oh0 f7234c;

    public kd0(fd0 firebaseAnalyticsAdapter, j0 backgroundScope, oh0 flags) {
        Intrinsics.checkNotNullParameter(firebaseAnalyticsAdapter, "firebaseAnalyticsAdapter");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f7232a = firebaseAnalyticsAdapter;
        this.f7233b = backgroundScope;
        this.f7234c = flags;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.net.Uri r17, ads_mobile_sdk.cd0 r18, android.os.Bundle r19, bl2.c r20) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kd0.a(android.net.Uri, ads_mobile_sdk.cd0, android.os.Bundle, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.net.Uri.Builder r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.hd0
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.hd0 r0 = (ads_mobile_sdk.hd0) r0
            int r1 = r0.f5925g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5925g = r1
            goto L18
        L13:
            ads_mobile_sdk.hd0 r0 = new ads_mobile_sdk.hd0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f5923e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5925g
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            android.net.Uri r6 = r0.f5922d
            android.net.Uri$Builder r1 = r0.f5921c
            android.net.Uri$Builder r2 = r0.f5920b
            ads_mobile_sdk.kd0 r0 = r0.f5919a
            ue.c.H(r7)
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            ue.c.H(r7)
            android.net.Uri r7 = r6.build()
            ads_mobile_sdk.fd0 r2 = r5.f7232a
            r0.f5919a = r5
            r0.f5920b = r6
            r0.f5921c = r6
            r0.f5922d = r7
            r0.f5925g = r3
            r2.getClass()
            java.lang.Object r0 = ads_mobile_sdk.fd0.a(r2, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r1 = r6
            r2 = r1
            r6 = r7
            r7 = r0
            r0 = r5
        L59:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L68
            java.lang.String r3 = "gmp_app_id"
            java.lang.String r4 = r6.getQueryParameter(r3)
            if (r4 != 0) goto L68
            r1.appendQueryParameter(r3, r7)
        L68:
            ads_mobile_sdk.fd0 r7 = r0.f7232a
            java.lang.String r0 = "getAppInstanceId"
            java.lang.Object r7 = r7.a(r0)
            if (r7 == 0) goto L77
            java.lang.String r7 = r7.toString()
            goto L78
        L77:
            r7 = 0
        L78:
            if (r7 == 0) goto L85
            java.lang.String r0 = "fbs_aiid"
            java.lang.String r6 = r6.getQueryParameter(r0)
            if (r6 != 0) goto L85
            r1.appendQueryParameter(r0, r7)
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kd0.a(android.net.Uri$Builder, bl2.c):java.lang.Object");
    }
}
