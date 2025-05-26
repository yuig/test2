package ads_mobile_sdk;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rr2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10765a;

    public rr2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10765a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.rr2 r6, boolean r7, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.qr2
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.qr2 r0 = (ads_mobile_sdk.qr2) r0
            int r1 = r0.f10238c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10238c = r1
            goto L18
        L13:
            ads_mobile_sdk.qr2 r0 = new ads_mobile_sdk.qr2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f10236a
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f10238c
            r3 = 6
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            ue.c.H(r8)     // Catch: java.lang.Exception -> L29
            goto L5e
        L29:
            r6 = move-exception
            goto L66
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            ue.c.H(r8)
            android.content.Context r6 = r6.f10765a     // Catch: java.lang.Exception -> L29
            ga.d r6 = g4.u.s0(r6)     // Catch: java.lang.Exception -> L29
            if (r6 != 0) goto L49
            ads_mobile_sdk.kk0 r6 = new ads_mobile_sdk.kk0     // Catch: java.lang.Exception -> L29
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L29
            r7.<init>()     // Catch: java.lang.Exception -> L29
            r6.<init>(r7, r5, r5, r3)     // Catch: java.lang.Exception -> L29
            return r6
        L49:
            java.lang.String r8 = "com.google.android.libraries.ads.mobile.sdk"
            java.lang.String r2 = "adsSdkName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)     // Catch: java.lang.Exception -> L29
            ga.a r2 = new ga.a     // Catch: java.lang.Exception -> L29
            r2.<init>(r8, r7)     // Catch: java.lang.Exception -> L29
            r0.f10238c = r4     // Catch: java.lang.Exception -> L29
            java.lang.Object r8 = r6.a(r2, r0)     // Catch: java.lang.Exception -> L29
            if (r8 != r1) goto L5e
            return r1
        L5e:
            ga.b r8 = (ga.b) r8     // Catch: java.lang.Exception -> L29
            ads_mobile_sdk.pk0 r6 = new ads_mobile_sdk.pk0     // Catch: java.lang.Exception -> L29
            r6.<init>(r8)     // Catch: java.lang.Exception -> L29
            goto L6c
        L66:
            ads_mobile_sdk.kk0 r7 = new ads_mobile_sdk.kk0
            r7.<init>(r6, r5, r5, r3)
            r6 = r7
        L6c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rr2.a(ads_mobile_sdk.rr2, boolean, bl2.c):java.lang.Object");
    }
}
