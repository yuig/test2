package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class yg {

    /* renamed from: a, reason: collision with root package name */
    public final x92 f14232a;

    /* renamed from: b, reason: collision with root package name */
    public final xz2 f14233b;

    /* renamed from: c, reason: collision with root package name */
    public final zr f14234c;

    /* renamed from: d, reason: collision with root package name */
    public final a.v0 f14235d;

    /* renamed from: e, reason: collision with root package name */
    public final oh0 f14236e;

    /* renamed from: f, reason: collision with root package name */
    public final a.j3 f14237f;

    public yg(x92 urlPinger, xz2 webViewInputEventStore, zr consentManager, a.v0 randomGenerator, oh0 flags, a.j3 traceLogger) {
        Intrinsics.checkNotNullParameter(urlPinger, "urlPinger");
        Intrinsics.checkNotNullParameter(webViewInputEventStore, "webViewInputEventStore");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        Intrinsics.checkNotNullParameter(randomGenerator, "randomGenerator");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.f14232a = urlPinger;
        this.f14233b = webViewInputEventStore;
        this.f14234c = consentManager;
        this.f14235d = randomGenerator;
        this.f14236e = flags;
        this.f14237f = traceLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #2 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x006d, B:14:0x0073), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:21:0x0081, B:23:0x0088, B:25:0x008f, B:27:0x0093, B:29:0x0097, B:30:0x009a, B:31:0x009f, B:32:0x00a0, B:33:0x00a7, B:34:0x00a8, B:35:0x00af, B:36:0x00b0), top: B:20:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0 A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #1 {all -> 0x0098, blocks: (B:21:0x0081, B:23:0x0088, B:25:0x008f, B:27:0x0093, B:29:0x0097, B:30:0x009a, B:31:0x009f, B:32:0x00a0, B:33:0x00a7, B:34:0x00a8, B:35:0x00af, B:36:0x00b0), top: B:20:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.net.Uri r10, bl2.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.ug
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.ug r0 = (ads_mobile_sdk.ug) r0
            int r1 = r0.f12072e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12072e = r1
            goto L18
        L13:
            ads_mobile_sdk.ug r0 = new ads_mobile_sdk.ug
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f12070c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12072e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            ads_mobile_sdk.cs2 r10 = r0.f12069b
            ads_mobile_sdk.cs2 r0 = r0.f12068a
            ue.c.H(r11)     // Catch: java.lang.Throwable -> L2c
            goto L6d
        L2c:
            r11 = move-exception
            goto L81
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            ue.c.H(r11)
            ads_mobile_sdk.il0 r11 = ads_mobile_sdk.il0.CUI_NAME_REGISTER_ATTRIBUTION_SOURCE
            java.util.WeakHashMap r2 = ads_mobile_sdk.qs2.f10249a
            kotlin.collections.q0 r2 = kotlin.collections.q0.f80391a
            ads_mobile_sdk.cs2 r11 = ads_mobile_sdk.qs2.a(r11, r2, r3)
            a.l0 r2 = ads_mobile_sdk.cm0.f3958f     // Catch: java.lang.Throwable -> L7d
            ads_mobile_sdk.oh0 r5 = r9.f14236e     // Catch: java.lang.Throwable -> L7d
            r5.getClass()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r6 = "gads:source_registration_timeout_in_millis"
            zn2.a r7 = zn2.b.f142311b     // Catch: java.lang.Throwable -> L7d
            zn2.d r7 = zn2.d.MINUTES     // Catch: java.lang.Throwable -> L7d
            long r7 = dl2.b.P2(r3, r7)     // Catch: java.lang.Throwable -> L7d
            long r5 = r5.a(r7, r6)     // Catch: java.lang.Throwable -> L7d
            ads_mobile_sdk.vg r7 = new ads_mobile_sdk.vg     // Catch: java.lang.Throwable -> L7d
            r7.<init>(r9, r10, r4)     // Catch: java.lang.Throwable -> L7d
            r0.f12068a = r11     // Catch: java.lang.Throwable -> L7d
            r0.f12069b = r11     // Catch: java.lang.Throwable -> L7d
            r0.f12072e = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r10 = r2.a(r5, r7, r0)     // Catch: java.lang.Throwable -> L7d
            if (r10 != r1) goto L6a
            return r1
        L6a:
            r0 = r11
            r11 = r10
            r10 = r0
        L6d:
            a.ad r11 = (a.ad) r11     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r11 instanceof ads_mobile_sdk.jk0     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L79
            r1 = r11
            ads_mobile_sdk.jk0 r1 = (ads_mobile_sdk.jk0) r1     // Catch: java.lang.Throwable -> L2c
            ads_mobile_sdk.ft2.a(r1)     // Catch: java.lang.Throwable -> L2c
        L79:
            dl2.b.J(r10, r4)
            return r11
        L7d:
            r10 = move-exception
            r0 = r11
            r11 = r10
            r10 = r0
        L81:
            r0.b(r11)     // Catch: java.lang.Throwable -> L98
            boolean r1 = r11 instanceof a.jf     // Catch: java.lang.Throwable -> L98
            if (r1 != 0) goto Lb0
            r0.a(r11)     // Catch: java.lang.Throwable -> L98
            boolean r0 = r11 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto La8
            boolean r0 = r11 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto La0
            boolean r0 = r11 instanceof ads_mobile_sdk.uk0     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L9a
            throw r11     // Catch: java.lang.Throwable -> L98
        L98:
            r11 = move-exception
            goto Lb1
        L9a:
            ads_mobile_sdk.dk0 r0 = new ads_mobile_sdk.dk0     // Catch: java.lang.Throwable -> L98
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L98
            throw r0     // Catch: java.lang.Throwable -> L98
        La0:
            ads_mobile_sdk.yj0 r0 = new ads_mobile_sdk.yj0     // Catch: java.lang.Throwable -> L98
            java.util.concurrent.CancellationException r11 = (java.util.concurrent.CancellationException) r11     // Catch: java.lang.Throwable -> L98
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L98
            throw r0     // Catch: java.lang.Throwable -> L98
        La8:
            ads_mobile_sdk.xl0 r0 = new ads_mobile_sdk.xl0     // Catch: java.lang.Throwable -> L98
            kotlinx.coroutines.TimeoutCancellationException r11 = (kotlinx.coroutines.TimeoutCancellationException) r11     // Catch: java.lang.Throwable -> L98
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L98
            throw r0     // Catch: java.lang.Throwable -> L98
        Lb0:
            throw r11     // Catch: java.lang.Throwable -> L98
        Lb1:
            throw r11     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r0 = move-exception
            dl2.b.J(r10, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yg.a(android.net.Uri, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.net.Uri r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.wg
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.wg r0 = (ads_mobile_sdk.wg) r0
            int r1 = r0.f13025d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13025d = r1
            goto L18
        L13:
            ads_mobile_sdk.wg r0 = new ads_mobile_sdk.wg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f13023b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f13025d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            android.net.Uri r7 = r0.f13022a
            ue.c.H(r8)
            goto L53
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            ue.c.H(r8)
            ads_mobile_sdk.oh0 r8 = r6.f14236e
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            ads_mobile_sdk.wg0 r4 = ads_mobile_sdk.oh0.f9281e
            java.lang.String r5 = "gads:attribution_reporting:enabled"
            java.lang.Object r8 = r8.a(r5, r2, r4)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L62
            r0.f13022a = r7
            r0.f13025d = r3
            java.lang.Object r8 = r6.a(r7, r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            a.ad r8 = (a.ad) r8
            boolean r0 = r8 instanceof ads_mobile_sdk.pk0
            if (r0 == 0) goto L5f
            ads_mobile_sdk.pk0 r8 = (ads_mobile_sdk.pk0) r8
            java.lang.Object r7 = r8.f9719b
            android.net.Uri r7 = (android.net.Uri) r7
        L5f:
            kotlin.jvm.internal.Intrinsics.f(r7)
        L62:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yg.b(android.net.Uri, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.net.Uri r8, bl2.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.xg
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.xg r0 = (ads_mobile_sdk.xg) r0
            int r1 = r0.f13649e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13649e = r1
            goto L18
        L13:
            ads_mobile_sdk.xg r0 = new ads_mobile_sdk.xg
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f13647c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f13649e
            r3 = 1
            java.lang.String r4 = "toString(...)"
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            android.net.Uri r8 = r0.f13646b
            ads_mobile_sdk.yg r0 = r0.f13645a
            ue.c.H(r9)
            goto L5b
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            ue.c.H(r9)
            ads_mobile_sdk.oh0 r9 = r7.f14236e
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            ads_mobile_sdk.wg0 r5 = ads_mobile_sdk.oh0.f9281e
            java.lang.String r6 = "gads:attribution_reporting:enabled"
            java.lang.Object r9 = r9.a(r6, r2, r5)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto La1
            r0.f13645a = r7
            r0.f13646b = r8
            r0.f13649e = r3
            java.lang.Object r9 = r7.a(r8, r0)
            if (r9 != r1) goto L5a
            return r1
        L5a:
            r0 = r7
        L5b:
            a.ad r9 = (a.ad) r9
            boolean r1 = r9 instanceof ads_mobile_sdk.pk0
            if (r1 == 0) goto L84
            ads_mobile_sdk.x92 r8 = r0.f14232a
            ads_mobile_sdk.pk0 r9 = (ads_mobile_sdk.pk0) r9
            java.lang.Object r9 = r9.f9719b
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.String r9 = r9.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r4)
            java.net.URL r0 = new java.net.URL
            r0.<init>(r9)
            java.lang.String r9 = r0.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r4)
            android.net.Uri r9 = android.net.Uri.parse(r9)
            r8.a(r9)
            goto Lbd
        L84:
            ads_mobile_sdk.x92 r9 = r0.f14232a
            java.lang.String r8 = r8.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r4)
            java.net.URL r0 = new java.net.URL
            r0.<init>(r8)
            java.lang.String r8 = r0.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r4)
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r9.a(r8)
            goto Lbd
        La1:
            ads_mobile_sdk.x92 r9 = r7.f14232a
            java.lang.String r8 = r8.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r4)
            java.net.URL r0 = new java.net.URL
            r0.<init>(r8)
            java.lang.String r8 = r0.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r4)
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r9.a(r8)
        Lbd:
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yg.c(android.net.Uri, bl2.c):java.lang.Object");
    }
}
