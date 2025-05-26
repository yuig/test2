package ads_mobile_sdk;

import a.zb;
import android.net.Uri;
import android.os.Bundle;
import ao2.j0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a00 extends s.b {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f2128a;

    /* renamed from: b, reason: collision with root package name */
    public final zb f2129b;

    /* renamed from: c, reason: collision with root package name */
    public final oh0 f2130c;

    /* renamed from: d, reason: collision with root package name */
    public final xg2 f2131d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2132e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2133f;

    /* renamed from: g, reason: collision with root package name */
    public ao2.o1 f2134g;

    /* renamed from: h, reason: collision with root package name */
    public long f2135h;

    /* renamed from: i, reason: collision with root package name */
    public long f2136i;

    /* renamed from: j, reason: collision with root package name */
    public String f2137j;

    /* renamed from: k, reason: collision with root package name */
    public s.r f2138k;

    /* renamed from: l, reason: collision with root package name */
    public s.b f2139l;

    /* renamed from: m, reason: collision with root package name */
    public final nm.q f2140m;

    /* renamed from: n, reason: collision with root package name */
    public final List f2141n;

    public a00(j0 backgroundScope, zb clock, oh0 flags, xg2 signalCache) {
        nm.q qVar;
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(signalCache, "signalCache");
        this.f2128a = backgroundScope;
        this.f2129b = clock;
        this.f2130c = flags;
        this.f2131d = signalCache;
        this.f2132e = new Object();
        zn2.b.f142311b.getClass();
        this.f2135h = 0L;
        this.f2136i = 0L;
        try {
            qVar = (nm.q) new nm.o().b(nm.q.class, flags.V());
        } catch (Exception e13) {
            ft2.a(e13);
            qVar = null;
        }
        this.f2140m = qVar == null ? new nm.q() : qVar;
        this.f2141n = this.f2130c.v();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.a00 r9, bl2.c r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof ads_mobile_sdk.uz
            if (r0 == 0) goto L16
            r0 = r10
            ads_mobile_sdk.uz r0 = (ads_mobile_sdk.uz) r0
            int r1 = r0.f12258d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f12258d = r1
            goto L1b
        L16:
            ads_mobile_sdk.uz r0 = new ads_mobile_sdk.uz
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.f12256b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12258d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            ads_mobile_sdk.a00 r9 = r0.f12255a
            ue.c.H(r10)
            goto L85
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            ue.c.H(r10)
            java.lang.Object r10 = r9.f2132e
            monitor-enter(r10)
            boolean r2 = r9.f2133f     // Catch: java.lang.Throwable -> La9
            if (r2 != 0) goto Lb8
            zn2.a r2 = zn2.b.f142311b     // Catch: java.lang.Throwable -> La9
            a.zb r2 = r9.f2129b     // Catch: java.lang.Throwable -> La9
            r2.getClass()     // Catch: java.lang.Throwable -> La9
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La9
            zn2.d r2 = zn2.d.MILLISECONDS     // Catch: java.lang.Throwable -> La9
            long r5 = dl2.b.Q2(r5, r2)     // Catch: java.lang.Throwable -> La9
            long r7 = r9.f2136i     // Catch: java.lang.Throwable -> La9
            int r5 = zn2.b.c(r5, r7)     // Catch: java.lang.Throwable -> La9
            if (r5 <= 0) goto L59
            goto Lb8
        L59:
            s.r r5 = r9.f2138k     // Catch: java.lang.Throwable -> La9
            if (r5 == 0) goto Lb1
            java.lang.String r6 = r9.f2137j     // Catch: java.lang.Throwable -> La9
            if (r6 == 0) goto Lab
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch: java.lang.Throwable -> La9
            r5.b(r6)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r10)
            ads_mobile_sdk.oh0 r10 = r9.f2130c
            r10.getClass()
            r5 = 100
            long r5 = dl2.b.P2(r5, r2)
            java.lang.String r2 = "gads:pact_polling_interval_ms"
            long r5 = r10.a(r5, r2)
            r0.f12255a = r9
            r0.f12258d = r4
            java.lang.Object r10 = lb.l0.T(r5, r0)
            if (r10 != r1) goto L85
            goto Lbb
        L85:
            ao2.j0 r10 = r9.f2128a
            ads_mobile_sdk.vz r0 = new ads_mobile_sdk.vz
            r0.<init>(r9, r3)
            kotlin.coroutines.j r9 = kotlin.coroutines.j.f80412a
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            java.lang.String r1 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            ads_mobile_sdk.et2 r1 = new ads_mobile_sdk.et2
            r1.<init>(r0, r3)
            r0 = 2
            kotlin.jvm.internal.j.z(r10, r9, r3, r1, r0)
            kotlin.Unit r1 = kotlin.Unit.f80348a
            goto Lbb
        La9:
            r9 = move-exception
            goto Lbc
        Lab:
            java.lang.String r9 = "origin"
            kotlin.jvm.internal.Intrinsics.r(r9)     // Catch: java.lang.Throwable -> La9
            throw r3     // Catch: java.lang.Throwable -> La9
        Lb1:
            java.lang.String r9 = "session"
            kotlin.jvm.internal.Intrinsics.r(r9)     // Catch: java.lang.Throwable -> La9
            throw r3     // Catch: java.lang.Throwable -> La9
        Lb8:
            kotlin.Unit r1 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> La9
            monitor-exit(r10)
        Lbb:
            return r1
        Lbc:
            monitor-exit(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.a00.a(ads_mobile_sdk.a00, bl2.c):java.lang.Object");
    }

    @Override // s.b
    public final void extraCallback(String callbackName, Bundle bundle) {
        s.b bVar;
        Intrinsics.checkNotNullParameter(callbackName, "callbackName");
        synchronized (this.f2132e) {
            bVar = this.f2139l;
        }
        if (bVar != null) {
            bVar.extraCallback(callbackName, bundle);
        }
    }

    @Override // s.b
    public final Bundle extraCallbackWithResult(String callbackName, Bundle bundle) {
        s.b bVar;
        Intrinsics.checkNotNullParameter(callbackName, "callbackName");
        synchronized (this.f2132e) {
            bVar = this.f2139l;
        }
        if (bVar != null) {
            return bVar.extraCallbackWithResult(callbackName, bundle);
        }
        return null;
    }

    @Override // s.b
    public final void onActivityResized(int i13, int i14, Bundle extras) {
        s.b bVar;
        Intrinsics.checkNotNullParameter(extras, "extras");
        synchronized (this.f2132e) {
            bVar = this.f2139l;
        }
        if (bVar != null) {
            bVar.onActivityResized(i13, i14, extras);
        }
    }

    @Override // s.b
    public final void onMessageChannelReady(Bundle bundle) {
        synchronized (this.f2132e) {
            try {
                this.f2133f = false;
                s.b bVar = this.f2139l;
                if (bVar != null) {
                    bVar.onMessageChannelReady(bundle);
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // s.b
    public final void onNavigationEvent(int i13, Bundle bundle) {
        long a13;
        synchronized (this.f2132e) {
            try {
                this.f2133f = false;
                s.b bVar = this.f2139l;
                if (bVar != null) {
                    bVar.onNavigationEvent(i13, bundle);
                }
                zn2.a aVar = zn2.b.f142311b;
                this.f2129b.getClass();
                this.f2135h = dl2.b.Q2(System.currentTimeMillis(), zn2.d.MILLISECONDS);
                if (this.f2141n.contains(String.valueOf(i13))) {
                    long j13 = this.f2135h;
                    if (((Boolean) this.f2130c.a("gads:pact_polling_forever:enabled", Boolean.FALSE, oh0.f9281e)).booleanValue()) {
                        aVar.getClass();
                        a13 = zn2.b.f142312c;
                    } else {
                        oh0 oh0Var = this.f2130c;
                        oh0Var.getClass();
                        a13 = oh0Var.a(dl2.b.P2(60, zn2.d.SECONDS), "gads:pact_polling_duration_ms");
                    }
                    this.f2136i = zn2.b.k(j13, a13);
                    ao2.o1 o1Var = this.f2134g;
                    if (o1Var == null || o1Var.isCompleted()) {
                        j0 j0Var = this.f2128a;
                        xz block = new xz(this, null);
                        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(block, "block");
                        this.f2134g = kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
                    }
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // s.b
    public final void onPostMessage(String message, Bundle bundle) {
        nm.u uVar;
        s.b bVar;
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            uVar = (nm.u) new nm.o().b(nm.u.class, message);
        } catch (Exception e13) {
            List list = c0.d.f(e13, e13).f6994p;
            String message2 = e13.getMessage();
            if (message2 == null) {
                message2 = e13.getClass().getName();
            }
            list.add(message2);
            uVar = null;
        }
        if (uVar != null && k41.a(uVar, "gpa", -1) == 0) {
            synchronized (this.f2132e) {
                this.f2133f = true;
                Unit unit = Unit.f80348a;
            }
            a(k41.a(uVar, "paw_id", ""));
        }
        synchronized (this.f2132e) {
            bVar = this.f2139l;
        }
        if (bVar != null) {
            bVar.onPostMessage(message, bundle);
        }
    }

    @Override // s.b
    public final void onRelationshipValidationResult(int i13, Uri requestedOrigin, boolean z13, Bundle bundle) {
        s.b bVar;
        Intrinsics.checkNotNullParameter(requestedOrigin, "requestedOrigin");
        synchronized (this.f2132e) {
            bVar = this.f2139l;
        }
        if (bVar != null) {
            bVar.onRelationshipValidationResult(i13, requestedOrigin, z13, bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.a00 r6, java.lang.String r7, bl2.c r8) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.a00.a(ads_mobile_sdk.a00, java.lang.String, bl2.c):java.lang.Object");
    }

    public final void a(String str) {
        synchronized (this.f2132e) {
            nm.u uVar = new nm.u();
            uVar.r("eids", this.f2140m);
            uVar.t("gsppack", Boolean.TRUE);
            uVar.u("fpt", String.valueOf(zn2.b.e(this.f2135h)));
            s.r rVar = this.f2138k;
            if (rVar != null) {
                rVar.a(uVar.toString());
                j0 j0Var = this.f2128a;
                zz block = new zz(this, str, null);
                kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
                Intrinsics.checkNotNullParameter(j0Var, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(block, "block");
                kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
                Unit unit = Unit.f80348a;
            } else {
                Intrinsics.r("session");
                throw null;
            }
        }
    }
}
