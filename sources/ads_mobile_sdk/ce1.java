package ads_mobile_sdk;

import android.graphics.Rect;
import ao2.j0;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ce1 implements a.l8 {

    /* renamed from: a, reason: collision with root package name */
    public final ub1 f3879a;

    /* renamed from: b, reason: collision with root package name */
    public final Optional f3880b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f3881c;

    /* renamed from: d, reason: collision with root package name */
    public final mo2.a f3882d;

    /* renamed from: e, reason: collision with root package name */
    public Rect f3883e;

    public ce1(ub1 mraidAfmaDispatcher, Optional optionalWebView, j0 uiScope) {
        Intrinsics.checkNotNullParameter(mraidAfmaDispatcher, "mraidAfmaDispatcher");
        Intrinsics.checkNotNullParameter(optionalWebView, "optionalWebView");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.f3879a = mraidAfmaDispatcher;
        this.f3880b = optionalWebView;
        this.f3881c = uiScope;
        this.f3882d = mo2.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v5, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ce1 r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.zd1
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.zd1 r0 = (ads_mobile_sdk.zd1) r0
            int r1 = r0.f14723e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14723e = r1
            goto L18
        L13:
            ads_mobile_sdk.zd1 r0 = new ads_mobile_sdk.zd1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f14721c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f14723e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            mo2.a r5 = r0.f14720b
            ads_mobile_sdk.ce1 r0 = r0.f14719a
            ue.c.H(r6)
            r6 = r5
            r5 = r0
            goto L4a
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            ue.c.H(r6)
            mo2.a r6 = r5.f3882d
            r0.f14719a = r5
            r0.f14720b = r6
            r0.f14723e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            android.graphics.Rect r5 = r5.f3883e     // Catch: java.lang.Throwable -> L52
            mo2.c r6 = (mo2.c) r6
            r6.i(r4)
            return r5
        L52:
            r5 = move-exception
            mo2.c r6 = (mo2.c) r6
            r6.i(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ce1.a(ads_mobile_sdk.ce1, bl2.c):java.lang.Object");
    }

    @Override // a.l8
    public final Object a(hy2 hy2Var, bl2.c cVar) {
        return a(this, hy2Var, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:11:0x004e, B:14:0x0071, B:19:0x0059, B:22:0x0064), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v6, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ce1 r5, ads_mobile_sdk.hy2 r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.ae1
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.ae1 r0 = (ads_mobile_sdk.ae1) r0
            int r1 = r0.f2380f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2380f = r1
            goto L18
        L13:
            ads_mobile_sdk.ae1 r0 = new ads_mobile_sdk.ae1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f2378d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f2380f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            mo2.a r5 = r0.f2377c
            ads_mobile_sdk.hy2 r6 = r0.f2376b
            ads_mobile_sdk.ce1 r0 = r0.f2375a
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
            mo2.a r7 = r5.f3882d
            r0.f2375a = r5
            r0.f2376b = r6
            r0.f2377c = r7
            r0.f2380f = r4
            mo2.c r7 = (mo2.c) r7
            java.lang.Object r0 = r7.f(r3, r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            java.util.Optional r0 = r5.f3880b     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = kh2.m2.U0(r0)     // Catch: java.lang.Throwable -> L79
            ads_mobile_sdk.ym0 r0 = (ads_mobile_sdk.ym0) r0     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto L59
            goto L71
        L59:
            android.graphics.Rect r6 = r6.f6146d     // Catch: java.lang.Throwable -> L79
            android.graphics.Rect r1 = r5.f3883e     // Catch: java.lang.Throwable -> L79
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r6, r1)     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L64
            goto L71
        L64:
            r5.f3883e = r6     // Catch: java.lang.Throwable -> L79
            ao2.j0 r1 = r5.f3881c     // Catch: java.lang.Throwable -> L79
            ads_mobile_sdk.be1 r2 = new ads_mobile_sdk.be1     // Catch: java.lang.Throwable -> L79
            r2.<init>(r5, r0, r6, r3)     // Catch: java.lang.Throwable -> L79
            r5 = 3
            kotlin.jvm.internal.j.z(r1, r3, r3, r2, r5)     // Catch: java.lang.Throwable -> L79
        L71:
            kotlin.Unit r5 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L79
            mo2.c r7 = (mo2.c) r7
            r7.i(r3)
            return r5
        L79:
            r5 = move-exception
            mo2.c r7 = (mo2.c) r7
            r7.i(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ce1.a(ads_mobile_sdk.ce1, ads_mobile_sdk.hy2, bl2.c):java.lang.Object");
    }
}
