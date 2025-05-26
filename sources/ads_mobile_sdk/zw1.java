package ads_mobile_sdk;

import a.zb;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zw1 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f14966a;

    /* renamed from: b, reason: collision with root package name */
    public final zb f14967b;

    /* renamed from: c, reason: collision with root package name */
    public final oh0 f14968c;

    /* renamed from: d, reason: collision with root package name */
    public final m02 f14969d;

    /* renamed from: e, reason: collision with root package name */
    public final mo2.a f14970e;

    /* renamed from: f, reason: collision with root package name */
    public long f14971f;

    /* renamed from: g, reason: collision with root package name */
    public l02 f14972g;

    /* renamed from: h, reason: collision with root package name */
    public ao2.o1 f14973h;

    public zw1(j0 backgroundScope, zb clock, oh0 flags, m02 prewarmManagerProvider) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(prewarmManagerProvider, "prewarmManagerProvider");
        this.f14966a = backgroundScope;
        this.f14967b = clock;
        this.f14968c = flags;
        this.f14969d = prewarmManagerProvider;
        this.f14970e = mo2.d.a();
        this.f14971f = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004a, code lost:
    
        if (r8.f(null, r0) == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:11:0x004d, B:13:0x0076, B:15:0x007a, B:18:0x0081, B:19:0x009b, B:20:0x009d), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r7v4, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.zw1 r7, bl2.c r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof ads_mobile_sdk.ww1
            if (r0 == 0) goto L16
            r0 = r8
            ads_mobile_sdk.ww1 r0 = (ads_mobile_sdk.ww1) r0
            int r1 = r0.f13285e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f13285e = r1
            goto L1b
        L16:
            ads_mobile_sdk.ww1 r0 = new ads_mobile_sdk.ww1
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f13283c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f13285e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            mo2.a r7 = r0.f13282b
            ads_mobile_sdk.zw1 r0 = r0.f13281a
            ue.c.H(r8)
            r8 = r7
            r7 = r0
            goto L4d
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            ue.c.H(r8)
            mo2.a r8 = r7.f14970e
            r0.f13281a = r7
            r0.f13282b = r8
            r0.f13285e = r3
            mo2.c r8 = (mo2.c) r8
            java.lang.Object r0 = r8.f(r4, r0)
            if (r0 != r1) goto L4d
            goto La4
        L4d:
            a.zb r0 = r7.f14967b     // Catch: java.lang.Throwable -> L99
            r0.getClass()     // Catch: java.lang.Throwable -> L99
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L99
            long r2 = r7.f14971f     // Catch: java.lang.Throwable -> L99
            long r0 = r0 - r2
            ads_mobile_sdk.oh0 r2 = r7.f14968c     // Catch: java.lang.Throwable -> L99
            r2.getClass()     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = "gads:play_prewarm_manager_connection_duration"
            zn2.a r5 = zn2.b.f142311b     // Catch: java.lang.Throwable -> L99
            zn2.d r5 = zn2.d.SECONDS     // Catch: java.lang.Throwable -> L99
            r6 = 180(0xb4, float:2.52E-43)
            long r5 = dl2.b.P2(r6, r5)     // Catch: java.lang.Throwable -> L99
            long r2 = r2.b(r5, r3)     // Catch: java.lang.Throwable -> L99
            long r2 = zn2.b.e(r2)     // Catch: java.lang.Throwable -> L99
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L9d
            ads_mobile_sdk.l02 r0 = r7.f14972g     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L9b
            ads_mobile_sdk.q02 r0 = r0.f7598a     // Catch: java.lang.Throwable -> L99
            ads_mobile_sdk.jf2 r1 = r0.f9893a     // Catch: java.lang.Throwable -> L99
            if (r1 != 0) goto L81
            goto L9b
        L81:
            ads_mobile_sdk.u71 r1 = ads_mobile_sdk.q02.f9891c     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = "detach"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L99
            r1.a(r2, r3)     // Catch: java.lang.Throwable -> L99
            ads_mobile_sdk.jf2 r0 = r0.f9893a     // Catch: java.lang.Throwable -> L99
            r0.getClass()     // Catch: java.lang.Throwable -> L99
            ads_mobile_sdk.ef2 r1 = new ads_mobile_sdk.ef2     // Catch: java.lang.Throwable -> L99
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L99
            r0.b(r1)     // Catch: java.lang.Throwable -> L99
            goto L9b
        L99:
            r7 = move-exception
            goto La5
        L9b:
            r7.f14972g = r4     // Catch: java.lang.Throwable -> L99
        L9d:
            kotlin.Unit r1 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L99
            mo2.c r8 = (mo2.c) r8
            r8.i(r4)
        La4:
            return r1
        La5:
            mo2.c r8 = (mo2.c) r8
            r8.i(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zw1.a(ads_mobile_sdk.zw1, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:11:0x004e, B:13:0x0052, B:16:0x0061, B:17:0x0072, B:19:0x0093, B:20:0x0096), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:11:0x004e, B:13:0x0052, B:16:0x0061, B:17:0x0072, B:19:0x0093, B:20:0x0096), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v5, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.zw1 r5, java.lang.String r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.xw1
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.xw1 r0 = (ads_mobile_sdk.xw1) r0
            int r1 = r0.f13841f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13841f = r1
            goto L18
        L13:
            ads_mobile_sdk.xw1 r0 = new ads_mobile_sdk.xw1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f13839d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f13841f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            mo2.a r5 = r0.f13838c
            java.lang.String r6 = r0.f13837b
            ads_mobile_sdk.zw1 r0 = r0.f13836a
            ue.c.H(r7)
            r7 = r5
            r5 = r0
            goto L4e
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            ue.c.H(r7)
            mo2.a r7 = r5.f14970e
            r0.f13836a = r5
            r0.f13837b = r6
            r0.f13838c = r7
            r0.f13841f = r4
            mo2.c r7 = (mo2.c) r7
            java.lang.Object r0 = r7.f(r3, r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            ads_mobile_sdk.l02 r0 = r5.f14972g     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L72
            ads_mobile_sdk.m02 r0 = r5.f14969d     // Catch: java.lang.Throwable -> L70
            android.content.Context r0 = r0.f8038a     // Catch: java.lang.Throwable -> L70
            ads_mobile_sdk.l02 r1 = new ads_mobile_sdk.l02     // Catch: java.lang.Throwable -> L70
            ads_mobile_sdk.q02 r2 = new ads_mobile_sdk.q02     // Catch: java.lang.Throwable -> L70
            android.content.Context r4 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L61
            r0 = r4
        L61:
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L70
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = "create(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)     // Catch: java.lang.Throwable -> L70
            r5.f14972g = r1     // Catch: java.lang.Throwable -> L70
            r0 = r1
            goto L72
        L70:
            r5 = move-exception
            goto Lac
        L72:
            a.zb r1 = r5.f14967b     // Catch: java.lang.Throwable -> L70
            r1.getClass()     // Catch: java.lang.Throwable -> L70
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L70
            r5.f14971f = r1     // Catch: java.lang.Throwable -> L70
            ads_mobile_sdk.iy1 r1 = new ads_mobile_sdk.iy1     // Catch: java.lang.Throwable -> L70
            r1.<init>()     // Catch: java.lang.Throwable -> L70
            java.util.ArrayList r2 = r1.f6584a     // Catch: java.lang.Throwable -> L70
            r2.add(r6)     // Catch: java.lang.Throwable -> L70
            ads_mobile_sdk.jy1 r6 = new ads_mobile_sdk.jy1     // Catch: java.lang.Throwable -> L70
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L70
            r0.a(r6)     // Catch: java.lang.Throwable -> L70
            ao2.o1 r6 = r5.f14973h     // Catch: java.lang.Throwable -> L70
            if (r6 == 0) goto L96
            r6.cancel(r3)     // Catch: java.lang.Throwable -> L70
        L96:
            ao2.j0 r6 = r5.f14966a     // Catch: java.lang.Throwable -> L70
            ads_mobile_sdk.yw1 r0 = new ads_mobile_sdk.yw1     // Catch: java.lang.Throwable -> L70
            r0.<init>(r5, r3)     // Catch: java.lang.Throwable -> L70
            r1 = 3
            ao2.k2 r6 = kotlin.jvm.internal.j.z(r6, r3, r3, r0, r1)     // Catch: java.lang.Throwable -> L70
            r5.f14973h = r6     // Catch: java.lang.Throwable -> L70
            kotlin.Unit r5 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L70
            mo2.c r7 = (mo2.c) r7
            r7.i(r3)
            return r5
        Lac:
            mo2.c r7 = (mo2.c) r7
            r7.i(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zw1.a(ads_mobile_sdk.zw1, java.lang.String, bl2.c):java.lang.Object");
    }
}
