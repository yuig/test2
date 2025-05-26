package ads_mobile_sdk;

import a.zb;
import android.content.Context;
import android.net.ConnectivityManager;
import ao2.j0;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class un1 implements a.c5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12130a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f12131b;

    /* renamed from: c, reason: collision with root package name */
    public final zb f12132c;

    /* renamed from: d, reason: collision with root package name */
    public final a.j3 f12133d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f12134e;

    /* renamed from: f, reason: collision with root package name */
    public ConnectivityManager f12135f;

    /* renamed from: g, reason: collision with root package name */
    public on1 f12136g;

    /* renamed from: h, reason: collision with root package name */
    public final mo2.a f12137h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12138i;

    /* renamed from: j, reason: collision with root package name */
    public long f12139j;

    /* renamed from: k, reason: collision with root package name */
    public do2 f12140k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f12141l;

    public un1(Context context, j0 backgroundScope, zb clock, a.j3 traceLogger, Set networkChangeListeners) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(networkChangeListeners, "networkChangeListeners");
        this.f12130a = context;
        this.f12131b = backgroundScope;
        this.f12132c = clock;
        this.f12133d = traceLogger;
        this.f12134e = networkChangeListeners;
        this.f12137h = mo2.d.a();
        this.f12138i = true;
        zn2.b.f142311b.getClass();
        this.f12139j = zn2.b.j(0L, dl2.b.P2(1, zn2.d.SECONDS));
        this.f12141l = new AtomicBoolean(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0221 A[LOOP:0: B:16:0x021b->B:18:0x0221, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019e A[Catch: all -> 0x01a7, TRY_LEAVE, TryCatch #1 {all -> 0x01a7, blocks: (B:31:0x0196, B:33:0x019e, B:36:0x01a9, B:38:0x01b9, B:43:0x01c9), top: B:30:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a9 A[Catch: all -> 0x01a7, TRY_ENTER, TryCatch #1 {all -> 0x01a7, blocks: (B:31:0x0196, B:33:0x019e, B:36:0x01a9, B:38:0x01b9, B:43:0x01c9), top: B:30:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5 A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #2 {all -> 0x00ad, blocks: (B:51:0x009d, B:53:0x00a5, B:56:0x00b1), top: B:50:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1 A[Catch: all -> 0x00ad, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00ad, blocks: (B:51:0x009d, B:53:0x00a5, B:56:0x00b1), top: B:50:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r26, android.net.Network r28, android.net.NetworkCapabilities r29, boolean r30, bl2.c r31) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.un1.a(long, android.net.Network, android.net.NetworkCapabilities, boolean, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(bl2.c r10) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.un1.b(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof ads_mobile_sdk.gn1
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.gn1 r0 = (ads_mobile_sdk.gn1) r0
            int r1 = r0.f5632e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5632e = r1
            goto L18
        L13:
            ads_mobile_sdk.gn1 r0 = new ads_mobile_sdk.gn1
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.f5630c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5632e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mo2.a r1 = r0.f5629b
            ads_mobile_sdk.un1 r0 = r0.f5628a
            ue.c.H(r13)
            goto L4a
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L34:
            ue.c.H(r13)
            mo2.a r13 = r12.f12137h
            r0.f5628a = r12
            r0.f5629b = r13
            r0.f5632e = r3
            mo2.c r13 = (mo2.c) r13
            java.lang.Object r0 = r13.f(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            r0 = r12
            r1 = r13
        L4a:
            ads_mobile_sdk.do2 r13 = r0.f12140k     // Catch: java.lang.Throwable -> Lb0
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            if (r13 != 0) goto Laf
            ads_mobile_sdk.do2 r13 = new ads_mobile_sdk.do2
            android.content.Context r1 = r0.f12130a
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.Class<android.telephony.TelephonyManager> r3 = android.telephony.TelephonyManager.class
            java.lang.Object r1 = r1.getSystemService(r3)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            java.lang.String r6 = r1.getNetworkOperator()
            java.lang.String r1 = "getNetworkOperator(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            android.content.Context r1 = r0.f12130a
            int r7 = rl2.g0.i(r1, r4)
            android.content.Context r1 = r0.f12130a
            int r8 = rl2.g0.m(r1)
            android.content.Context r1 = r0.f12130a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.Object r1 = r1.getSystemService(r3)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            int r9 = r1.getPhoneType()
            android.content.Context r1 = r0.f12130a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = rl2.g0.j(r1, r2)
            if (r2 == 0) goto La3
            java.lang.Class<android.net.ConnectivityManager> r2 = android.net.ConnectivityManager.class
            java.lang.Object r1 = r1.getSystemService(r2)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            boolean r1 = r1.isActiveNetworkMetered()
        La1:
            r10 = r1
            goto La5
        La3:
            r1 = 0
            goto La1
        La5:
            android.content.Context r0 = r0.f12130a
            int r11 = rl2.g0.h(r0)
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
        Laf:
            return r13
        Lb0:
            r13 = move-exception
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.un1.a(bl2.c):java.lang.Object");
    }

    public final boolean a() {
        return this.f12141l.get();
    }
}
