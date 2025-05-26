package ow;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import ao2.e2;
import ao2.v0;
import com.pinterest.api.model.f30;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class p0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final xw.a f97859a;

    /* renamed from: b, reason: collision with root package name */
    public final uw.b f97860b;

    /* renamed from: c, reason: collision with root package name */
    public final pw.a f97861c;

    /* renamed from: d, reason: collision with root package name */
    public final yw.a f97862d;

    /* renamed from: e, reason: collision with root package name */
    public final es.a f97863e;

    /* renamed from: f, reason: collision with root package name */
    public final gs.a f97864f;

    /* renamed from: g, reason: collision with root package name */
    public final ao2.j0 f97865g;

    /* renamed from: h, reason: collision with root package name */
    public final m60.e f97866h;

    /* renamed from: i, reason: collision with root package name */
    public final ws1.a f97867i;

    /* renamed from: j, reason: collision with root package name */
    public final pb0.a f97868j;

    /* renamed from: k, reason: collision with root package name */
    public final ao2.f0 f97869k;

    /* renamed from: l, reason: collision with root package name */
    public final ao2.f0 f97870l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f97871m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f97872n;

    /* renamed from: o, reason: collision with root package name */
    public fn.g f97873o;

    /* renamed from: p, reason: collision with root package name */
    public String f97874p;

    public p0(xw.a powerScoreExpt, uw.b decorator, pw.c analytics, yw.f adsOpenMeasurementJsRepository, es.a adFormats, gs.a adQuarantine, ao2.j0 appScope, m60.e applicationInfoProvider, ws1.a linkValidation, pb0.a clock) {
        ko2.f fVar = v0.f20219a;
        ko2.e ioDispatcher = ko2.e.f80326c;
        e2 mainDispatcher = ho2.q.f69782a;
        Intrinsics.checkNotNullParameter(powerScoreExpt, "powerScoreExpt");
        Intrinsics.checkNotNullParameter(decorator, "decorator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adsOpenMeasurementJsRepository, "adsOpenMeasurementJsRepository");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adQuarantine, "adQuarantine");
        Intrinsics.checkNotNullParameter(appScope, "appScope");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(linkValidation, "linkValidation");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        this.f97859a = powerScoreExpt;
        this.f97860b = decorator;
        this.f97861c = analytics;
        this.f97862d = adsOpenMeasurementJsRepository;
        this.f97863e = adFormats;
        this.f97864f = adQuarantine;
        this.f97865g = appScope;
        this.f97866h = applicationInfoProvider;
        this.f97867i = linkValidation;
        this.f97868j = clock;
        this.f97869k = ioDispatcher;
        this.f97870l = mainDispatcher;
        this.f97871m = new LinkedHashMap();
        this.f97872n = new LinkedHashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(ow.p0 r6, java.lang.String r7, com.iab.omid.library.pinterest.adsession.media.b r8, ww.b r9, bl2.c r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ow.p0.b(ow.p0, java.lang.String, com.iab.omid.library.pinterest.adsession.media.b, ww.b, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(ow.p0 r6, java.lang.String r7, com.iab.omid.library.pinterest.adsession.media.b r8, bl2.c r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof ow.v
            if (r0 == 0) goto L16
            r0 = r9
            ow.v r0 = (ow.v) r0
            int r1 = r0.f97902v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f97902v = r1
            goto L1b
        L16:
            ow.v r0 = new ow.v
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.f97900t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f97902v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            ww.g r6 = r0.f97899s
            ow.p0 r7 = r0.f97898r
            ue.c.H(r9)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L59
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            ue.c.H(r9)
            java.util.LinkedHashMap r9 = r6.f97871m
            java.lang.Object r7 = r9.get(r7)
            ww.g r7 = (ww.g) r7
            ow.w r9 = new ow.w
            r9.<init>(r6, r8, r3)
            r0.f97898r = r6
            r0.f97899s = r7
            r0.f97902v = r4
            ao2.f0 r8 = r6.f97870l
            java.lang.Object r9 = kotlin.jvm.internal.j.M(r0, r8, r9)
            if (r9 != r1) goto L59
            goto L9b
        L59:
            ww.f r9 = (ww.f) r9
            boolean r8 = r9 instanceof ww.d
            if (r8 == 0) goto L73
            pw.a r6 = r6.f97861c
            if (r7 == 0) goto L67
            com.pinterest.api.model.f30 r3 = r7.a()
        L67:
            ww.d r9 = (ww.d) r9
            java.lang.Throwable r7 = r9.a()
            pw.c r6 = (pw.c) r6
            r6.f(r3, r7)
            goto L99
        L73:
            boolean r8 = r9 instanceof ww.e
            if (r8 == 0) goto L99
            pw.a r6 = r6.f97861c
            if (r7 == 0) goto L80
            com.pinterest.api.model.f30 r7 = r7.a()
            goto L81
        L80:
            r7 = r3
        L81:
            pw.c r6 = (pw.c) r6
            r6.getClass()
            java.lang.String r8 = "message"
            java.lang.String r9 = "[AD USER INTERACTION CLICK] Success"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r8)
            rw.a r8 = rw.a.AD_USER_INTERACTION_CLICK
            sw.a r9 = r6.f101492a
            sw.a.a(r9, r8, r3)
            qw.a r6 = r6.f101493b
            qw.a.a(r6, r8, r7)
        L99:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ow.p0.c(ow.p0, java.lang.String, com.iab.omid.library.pinterest.adsession.media.b, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(ow.p0 r6, java.lang.String r7, com.iab.omid.library.pinterest.adsession.media.b r8, bl2.c r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof ow.x
            if (r0 == 0) goto L16
            r0 = r9
            ow.x r0 = (ow.x) r0
            int r1 = r0.f97909v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f97909v = r1
            goto L1b
        L16:
            ow.x r0 = new ow.x
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.f97907t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f97909v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            ww.g r6 = r0.f97906s
            ow.p0 r7 = r0.f97905r
            ue.c.H(r9)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L59
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            ue.c.H(r9)
            java.util.LinkedHashMap r9 = r6.f97871m
            java.lang.Object r7 = r9.get(r7)
            ww.g r7 = (ww.g) r7
            ow.y r9 = new ow.y
            r9.<init>(r6, r8, r4)
            r0.f97905r = r6
            r0.f97906s = r7
            r0.f97909v = r3
            ao2.f0 r8 = r6.f97870l
            java.lang.Object r9 = kotlin.jvm.internal.j.M(r0, r8, r9)
            if (r9 != r1) goto L59
            goto Lc1
        L59:
            ww.f r9 = (ww.f) r9
            boolean r8 = r9 instanceof ww.d
            if (r8 == 0) goto L9b
            pw.a r6 = r6.f97861c
            if (r7 == 0) goto L67
            com.pinterest.api.model.f30 r4 = r7.a()
        L67:
            ww.d r9 = (ww.d) r9
            java.lang.Throwable r7 = r9.a()
            pw.c r6 = (pw.c) r6
            r6.getClass()
            java.lang.String r8 = "throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            java.lang.String r8 = r7.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "[VIDEO BUFFERING END] Error: "
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            pw.c.h(r8)
            rw.a r8 = rw.a.VIDEO_BUFFER_FINISH
            sw.a r9 = r6.f101492a
            r0 = 8
            sw.a.b(r9, r8, r7, r4, r0)
            qw.a r6 = r6.f101493b
            qw.a.b(r6, r8, r7, r4, r0)
            goto Lbf
        L9b:
            boolean r8 = r9 instanceof ww.e
            if (r8 == 0) goto Lbf
            pw.a r6 = r6.f97861c
            if (r7 == 0) goto La7
            com.pinterest.api.model.f30 r4 = r7.a()
        La7:
            pw.c r6 = (pw.c) r6
            r6.getClass()
            java.lang.String r7 = "message"
            java.lang.String r8 = "[VIDEO BUFFERING END] Success"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            rw.a r7 = rw.a.VIDEO_BUFFER_FINISH
            sw.a r8 = r6.f101492a
            sw.a.a(r8, r7, r4)
            qw.a r6 = r6.f101493b
            qw.a.a(r6, r7, r4)
        Lbf:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ow.p0.d(ow.p0, java.lang.String, com.iab.omid.library.pinterest.adsession.media.b, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(ow.p0 r6, java.lang.String r7, com.iab.omid.library.pinterest.adsession.media.b r8, bl2.c r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof ow.z
            if (r0 == 0) goto L16
            r0 = r9
            ow.z r0 = (ow.z) r0
            int r1 = r0.f97916v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f97916v = r1
            goto L1b
        L16:
            ow.z r0 = new ow.z
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.f97914t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f97916v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            ww.g r6 = r0.f97913s
            ow.p0 r7 = r0.f97912r
            ue.c.H(r9)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L59
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            ue.c.H(r9)
            java.util.LinkedHashMap r9 = r6.f97871m
            java.lang.Object r7 = r9.get(r7)
            ww.g r7 = (ww.g) r7
            ow.a0 r9 = new ow.a0
            r9.<init>(r6, r8, r4)
            r0.f97912r = r6
            r0.f97913s = r7
            r0.f97916v = r3
            ao2.f0 r8 = r6.f97870l
            java.lang.Object r9 = kotlin.jvm.internal.j.M(r0, r8, r9)
            if (r9 != r1) goto L59
            goto Lc1
        L59:
            ww.f r9 = (ww.f) r9
            boolean r8 = r9 instanceof ww.d
            if (r8 == 0) goto L9b
            pw.a r6 = r6.f97861c
            if (r7 == 0) goto L67
            com.pinterest.api.model.f30 r4 = r7.a()
        L67:
            ww.d r9 = (ww.d) r9
            java.lang.Throwable r7 = r9.a()
            pw.c r6 = (pw.c) r6
            r6.getClass()
            java.lang.String r8 = "throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            java.lang.String r8 = r7.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "[VIDEO BUFFERING START] Error: "
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            pw.c.h(r8)
            rw.a r8 = rw.a.VIDEO_BUFFER_START
            sw.a r9 = r6.f101492a
            r0 = 8
            sw.a.b(r9, r8, r7, r4, r0)
            qw.a r6 = r6.f101493b
            qw.a.b(r6, r8, r7, r4, r0)
            goto Lbf
        L9b:
            boolean r8 = r9 instanceof ww.e
            if (r8 == 0) goto Lbf
            pw.a r6 = r6.f97861c
            if (r7 == 0) goto La7
            com.pinterest.api.model.f30 r4 = r7.a()
        La7:
            pw.c r6 = (pw.c) r6
            r6.getClass()
            java.lang.String r7 = "message"
            java.lang.String r8 = "[VIDEO BUFFERING START] Success"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            rw.a r7 = rw.a.VIDEO_BUFFER_START
            sw.a r8 = r6.f101492a
            sw.a.a(r8, r7, r4)
            qw.a r6 = r6.f101493b
            qw.a.a(r6, r7, r4)
        Lbf:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ow.p0.e(ow.p0, java.lang.String, com.iab.omid.library.pinterest.adsession.media.b, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(ow.p0 r7, java.lang.String r8, boolean r9, bl2.c r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof ow.b0
            if (r0 == 0) goto L16
            r0 = r10
            ow.b0 r0 = (ow.b0) r0
            int r1 = r0.f97759v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f97759v = r1
            goto L1b
        L16:
            ow.b0 r0 = new ow.b0
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f97757t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f97759v
            java.lang.String r3 = "message"
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            ww.g r7 = r0.f97756s
            ow.p0 r8 = r0.f97755r
            ue.c.H(r10)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L7d
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            ue.c.H(r10)
            java.util.LinkedHashMap r10 = r7.f97871m
            java.lang.Object r8 = r10.get(r8)
            ww.g r8 = (ww.g) r8
            r10 = 0
            if (r8 == 0) goto L4c
            fn.i r2 = r8.f131165c
            goto L4d
        L4c:
            r2 = r10
        L4d:
            pw.a r5 = r7.f97861c
            if (r2 == 0) goto Lb5
            com.iab.omid.library.pinterest.adsession.media.b r2 = r8.f131166d
            if (r2 != 0) goto L56
            goto Lb5
        L56:
            boolean r2 = r8.f131169g
            if (r2 == 0) goto L67
            pw.c r5 = (pw.c) r5
            r5.getClass()
            java.lang.String r7 = "Deduplicated creative loaded event for ad session."
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            kotlin.Unit r1 = kotlin.Unit.f80348a
            goto Lc7
        L67:
            r8.f131169g = r4
            ow.c0 r2 = new ow.c0
            r2.<init>(r7, r8, r9, r10)
            r0.f97755r = r7
            r0.f97756s = r8
            r0.f97759v = r4
            ao2.f0 r9 = r7.f97870l
            java.lang.Object r10 = kotlin.jvm.internal.j.M(r0, r9, r2)
            if (r10 != r1) goto L7d
            goto Lc7
        L7d:
            ww.f r10 = (ww.f) r10
            boolean r9 = r10 instanceof ww.e
            if (r9 == 0) goto L9e
            pw.a r7 = r7.f97861c
            com.pinterest.api.model.f30 r8 = r8.f131164b
            pw.c r7 = (pw.c) r7
            r7.getClass()
            java.lang.String r9 = "[CREATIVE LOADED] Success"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
            rw.a r9 = rw.a.AD_LOADED
            sw.a r10 = r7.f101492a
            sw.a.a(r10, r9, r8)
            qw.a r7 = r7.f101493b
            qw.a.a(r7, r9, r8)
            goto Lb2
        L9e:
            boolean r9 = r10 instanceof ww.d
            if (r9 == 0) goto Lb2
            r9 = 0
            r8.f131169g = r9
            pw.a r7 = r7.f97861c
            ww.d r10 = (ww.d) r10
            java.lang.Throwable r9 = r10.f131161a
            pw.c r7 = (pw.c) r7
            com.pinterest.api.model.f30 r8 = r8.f131164b
            r7.c(r8, r9)
        Lb2:
            kotlin.Unit r1 = kotlin.Unit.f80348a
            goto Lc7
        Lb5:
            if (r8 == 0) goto Lb9
            com.pinterest.api.model.f30 r10 = r8.f131164b
        Lb9:
            java.lang.Throwable r7 = new java.lang.Throwable
            java.lang.String r8 = "Attempting to mark creative loaded event for ad session or ad events that do not exist."
            r7.<init>(r8)
            pw.c r5 = (pw.c) r5
            r5.c(r10, r7)
            kotlin.Unit r1 = kotlin.Unit.f80348a
        Lc7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ow.p0.f(ow.p0, java.lang.String, boolean, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(ow.p0 r5, ww.g r6, bl2.c r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof ow.d0
            if (r0 == 0) goto L16
            r0 = r7
            ow.d0 r0 = (ow.d0) r0
            int r1 = r0.f97772v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f97772v = r1
            goto L1b
        L16:
            ow.d0 r0 = new ow.d0
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f97770t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f97772v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            ww.g r6 = r0.f97769s
            ow.p0 r5 = r0.f97768r
            ue.c.H(r7)
            goto L5a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            ue.c.H(r7)
            boolean r7 = r6.f131172j
            if (r7 != 0) goto Lbb
            com.iab.omid.library.pinterest.adsession.media.b r7 = r6.f131167e
            if (r7 != 0) goto L44
            goto Lbb
        L44:
            r6.f131172j = r3
            ow.e0 r7 = new ow.e0
            r7.<init>(r5, r6, r4)
            r0.f97768r = r5
            r0.f97769s = r6
            r0.f97772v = r3
            ao2.f0 r2 = r5.f97870l
            java.lang.Object r7 = kotlin.jvm.internal.j.M(r0, r2, r7)
            if (r7 != r1) goto L5a
            goto Lbd
        L5a:
            ww.f r7 = (ww.f) r7
            boolean r0 = r7 instanceof ww.d
            if (r0 == 0) goto L98
            pw.a r5 = r5.f97861c
            com.pinterest.api.model.f30 r6 = r6.f131164b
            ww.d r7 = (ww.d) r7
            java.lang.Throwable r7 = r7.f131161a
            pw.c r5 = (pw.c) r5
            r5.getClass()
            java.lang.String r0 = "throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = r7.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[VIDEO COMPLETE] Error: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            pw.c.h(r0)
            rw.a r0 = rw.a.VIDEO_COMPLETE
            r1 = 8
            sw.a r2 = r5.f101492a
            sw.a.b(r2, r0, r7, r6, r1)
            r6 = 12
            qw.a r5 = r5.f101493b
            qw.a.b(r5, r0, r7, r4, r6)
            goto Lb8
        L98:
            boolean r7 = r7 instanceof ww.e
            if (r7 == 0) goto Lb8
            pw.a r5 = r5.f97861c
            com.pinterest.api.model.f30 r6 = r6.f131164b
            pw.c r5 = (pw.c) r5
            r5.getClass()
            java.lang.String r7 = "message"
            java.lang.String r0 = "[VIDEO COMPLETE] Success"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r7)
            rw.a r7 = rw.a.VIDEO_COMPLETE
            sw.a r0 = r5.f101492a
            sw.a.a(r0, r7, r6)
            qw.a r5 = r5.f101493b
            qw.a.a(r5, r7, r6)
        Lb8:
            kotlin.Unit r1 = kotlin.Unit.f80348a
            goto Lbd
        Lbb:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ow.p0.g(ow.p0, ww.g, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(ow.p0 r6, java.lang.String r7, com.iab.omid.library.pinterest.adsession.media.b r8, bl2.c r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof ow.f0
            if (r0 == 0) goto L16
            r0 = r9
            ow.f0 r0 = (ow.f0) r0
            int r1 = r0.f97788v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f97788v = r1
            goto L1b
        L16:
            ow.f0 r0 = new ow.f0
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.f97786t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f97788v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            ww.g r6 = r0.f97785s
            ow.p0 r7 = r0.f97784r
            ue.c.H(r9)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L59
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            ue.c.H(r9)
            java.util.LinkedHashMap r9 = r6.f97871m
            java.lang.Object r7 = r9.get(r7)
            ww.g r7 = (ww.g) r7
            ow.g0 r9 = new ow.g0
            r9.<init>(r6, r8, r4)
            r0.f97784r = r6
            r0.f97785s = r7
            r0.f97788v = r3
            ao2.f0 r8 = r6.f97870l
            java.lang.Object r9 = kotlin.jvm.internal.j.M(r0, r8, r9)
            if (r9 != r1) goto L59
            goto Lc1
        L59:
            ww.f r9 = (ww.f) r9
            boolean r8 = r9 instanceof ww.d
            if (r8 == 0) goto L9b
            pw.a r6 = r6.f97861c
            if (r7 == 0) goto L67
            com.pinterest.api.model.f30 r4 = r7.a()
        L67:
            ww.d r9 = (ww.d) r9
            java.lang.Throwable r7 = r9.a()
            pw.c r6 = (pw.c) r6
            r6.getClass()
            java.lang.String r8 = "throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            java.lang.String r8 = r7.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "[VIDEO PAUSE] Error: "
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            pw.c.h(r8)
            rw.a r8 = rw.a.VIDEO_PAUSE
            sw.a r9 = r6.f101492a
            r0 = 8
            sw.a.b(r9, r8, r7, r4, r0)
            qw.a r6 = r6.f101493b
            qw.a.b(r6, r8, r7, r4, r0)
            goto Lbf
        L9b:
            boolean r8 = r9 instanceof ww.e
            if (r8 == 0) goto Lbf
            pw.a r6 = r6.f97861c
            if (r7 == 0) goto La7
            com.pinterest.api.model.f30 r4 = r7.a()
        La7:
            pw.c r6 = (pw.c) r6
            r6.getClass()
            java.lang.String r7 = "message"
            java.lang.String r8 = "[VIDEO PAUSE] Success"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            rw.a r7 = rw.a.VIDEO_PAUSE
            sw.a r8 = r6.f101492a
            sw.a.a(r8, r7, r4)
            qw.a r6 = r6.f101493b
            qw.a.a(r6, r7, r4)
        Lbf:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ow.p0.h(ow.p0, java.lang.String, com.iab.omid.library.pinterest.adsession.media.b, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(ow.p0 r6, java.lang.String r7, com.iab.omid.library.pinterest.adsession.media.b r8, bl2.c r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof ow.h0
            if (r0 == 0) goto L16
            r0 = r9
            ow.h0 r0 = (ow.h0) r0
            int r1 = r0.f97801v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f97801v = r1
            goto L1b
        L16:
            ow.h0 r0 = new ow.h0
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.f97799t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f97801v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            ww.g r6 = r0.f97798s
            ow.p0 r7 = r0.f97797r
            ue.c.H(r9)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L59
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            ue.c.H(r9)
            java.util.LinkedHashMap r9 = r6.f97871m
            java.lang.Object r7 = r9.get(r7)
            ww.g r7 = (ww.g) r7
            ow.i0 r9 = new ow.i0
            r9.<init>(r6, r8, r4)
            r0.f97797r = r6
            r0.f97798s = r7
            r0.f97801v = r3
            ao2.f0 r8 = r6.f97870l
            java.lang.Object r9 = kotlin.jvm.internal.j.M(r0, r8, r9)
            if (r9 != r1) goto L59
            goto Lc1
        L59:
            ww.f r9 = (ww.f) r9
            boolean r8 = r9 instanceof ww.d
            if (r8 == 0) goto L9b
            pw.a r6 = r6.f97861c
            if (r7 == 0) goto L67
            com.pinterest.api.model.f30 r4 = r7.a()
        L67:
            ww.d r9 = (ww.d) r9
            java.lang.Throwable r7 = r9.a()
            pw.c r6 = (pw.c) r6
            r6.getClass()
            java.lang.String r8 = "throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            java.lang.String r8 = r7.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "[VIDEO RESUME] Error: "
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            pw.c.h(r8)
            rw.a r8 = rw.a.VIDEO_RESUME
            sw.a r9 = r6.f101492a
            r0 = 8
            sw.a.b(r9, r8, r7, r4, r0)
            qw.a r6 = r6.f101493b
            qw.a.b(r6, r8, r7, r4, r0)
            goto Lbf
        L9b:
            boolean r8 = r9 instanceof ww.e
            if (r8 == 0) goto Lbf
            pw.a r6 = r6.f97861c
            if (r7 == 0) goto La7
            com.pinterest.api.model.f30 r4 = r7.a()
        La7:
            pw.c r6 = (pw.c) r6
            r6.getClass()
            java.lang.String r7 = "message"
            java.lang.String r8 = "[VIDEO RESUME] Success"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            rw.a r7 = rw.a.VIDEO_RESUME
            sw.a r8 = r6.f101492a
            sw.a.a(r8, r7, r4)
            qw.a r6 = r6.f101493b
            qw.a.a(r6, r7, r4)
        Lbf:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ow.p0.i(ow.p0, java.lang.String, com.iab.omid.library.pinterest.adsession.media.b, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(ow.p0 r12, java.lang.String r13, com.iab.omid.library.pinterest.adsession.media.b r14, float r15, float r16, bl2.c r17) {
        /*
            r6 = r12
            r0 = r17
            r12.getClass()
            boolean r1 = r0 instanceof ow.j0
            if (r1 == 0) goto L1a
            r1 = r0
            ow.j0 r1 = (ow.j0) r1
            int r2 = r1.f97813v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1a
            int r2 = r2 - r3
            r1.f97813v = r2
        L18:
            r7 = r1
            goto L20
        L1a:
            ow.j0 r1 = new ow.j0
            r1.<init>(r12, r0)
            goto L18
        L20:
            java.lang.Object r0 = r7.f97811t
            cl2.a r8 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r7.f97813v
            r9 = 1
            if (r1 == 0) goto L3b
            if (r1 != r9) goto L33
            ww.g r1 = r7.f97810s
            ow.p0 r2 = r7.f97809r
            ue.c.H(r0)
            goto L65
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            ue.c.H(r0)
            java.util.LinkedHashMap r0 = r6.f97871m
            r1 = r13
            java.lang.Object r0 = r0.get(r13)
            r10 = r0
            ww.g r10 = (ww.g) r10
            ow.k0 r11 = new ow.k0
            r5 = 0
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r7.f97809r = r6
            r7.f97810s = r10
            r7.f97813v = r9
            ao2.f0 r0 = r6.f97870l
            java.lang.Object r0 = kotlin.jvm.internal.j.M(r7, r0, r11)
            if (r0 != r8) goto L63
            goto Lce
        L63:
            r2 = r6
            r1 = r10
        L65:
            ww.f r0 = (ww.f) r0
            boolean r3 = r0 instanceof ww.d
            r4 = 0
            if (r3 == 0) goto La8
            pw.a r2 = r2.f97861c
            if (r1 == 0) goto L74
            com.pinterest.api.model.f30 r4 = r1.a()
        L74:
            ww.d r0 = (ww.d) r0
            java.lang.Throwable r0 = r0.a()
            pw.c r2 = (pw.c) r2
            r2.getClass()
            java.lang.String r1 = "throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "[VIDEO START] Error: "
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            pw.c.h(r1)
            rw.a r1 = rw.a.VIDEO_START
            sw.a r3 = r2.f101492a
            r5 = 8
            sw.a.b(r3, r1, r0, r4, r5)
            qw.a r2 = r2.f101493b
            qw.a.b(r2, r1, r0, r4, r5)
            goto Lcc
        La8:
            boolean r0 = r0 instanceof ww.e
            if (r0 == 0) goto Lcc
            pw.a r0 = r2.f97861c
            if (r1 == 0) goto Lb4
            com.pinterest.api.model.f30 r4 = r1.a()
        Lb4:
            pw.c r0 = (pw.c) r0
            r0.getClass()
            java.lang.String r1 = "message"
            java.lang.String r2 = "[VIDEO START] Success"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            rw.a r1 = rw.a.VIDEO_START
            sw.a r2 = r0.f101492a
            sw.a.a(r2, r1, r4)
            qw.a r0 = r0.f101493b
            qw.a.a(r0, r1, r4)
        Lcc:
            kotlin.Unit r8 = kotlin.Unit.f80348a
        Lce:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ow.p0.j(ow.p0, java.lang.String, com.iab.omid.library.pinterest.adsession.media.b, float, float, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(ow.p0 r4, com.iab.omid.library.pinterest.adsession.media.b r5, com.iab.omid.library.pinterest.adsession.media.c r6, bl2.c r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof ow.l0
            if (r0 == 0) goto L16
            r0 = r7
            ow.l0 r0 = (ow.l0) r0
            int r1 = r0.f97828v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f97828v = r1
            goto L1b
        L16:
            ow.l0 r0 = new ow.l0
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f97826t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f97828v
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.iab.omid.library.pinterest.adsession.media.c r6 = r0.f97825s
            ow.p0 r4 = r0.f97824r
            ue.c.H(r7)
            goto L4e
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            ue.c.H(r7)
            ow.m0 r7 = new ow.m0
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.f97824r = r4
            r0.f97825s = r6
            r0.f97828v = r3
            ao2.f0 r5 = r4.f97870l
            java.lang.Object r7 = kotlin.jvm.internal.j.M(r0, r5, r7)
            if (r7 != r1) goto L4e
            goto L8d
        L4e:
            ww.f r7 = (ww.f) r7
            boolean r5 = r7 instanceof ww.d
            if (r5 == 0) goto L7e
            pw.a r4 = r4.f97861c
            java.lang.String r5 = r6.name()
            ww.d r7 = (ww.d) r7
            java.lang.Throwable r6 = r7.a()
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "OM SDK videoPlayerStateChanged failed ("
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r5 = "). "
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            pw.a.a(r4, r5)
            goto L8b
        L7e:
            boolean r5 = r7 instanceof ww.e
            if (r5 == 0) goto L8b
            pw.a r4 = r4.f97861c
            pw.c r4 = (pw.c) r4
            java.lang.String r5 = "OM SDK videoPlayerStateChanged success"
            r4.g(r5)
        L8b:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ow.p0.k(ow.p0, com.iab.omid.library.pinterest.adsession.media.b, com.iab.omid.library.pinterest.adsession.media.c, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(ow.p0 r6, java.lang.String r7, float r8, com.iab.omid.library.pinterest.adsession.media.b r9, bl2.c r10) {
        /*
            r6.getClass()
            boolean r0 = r10 instanceof ow.n0
            if (r0 == 0) goto L16
            r0 = r10
            ow.n0 r0 = (ow.n0) r0
            int r1 = r0.f97842w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f97842w = r1
            goto L1b
        L16:
            ow.n0 r0 = new ow.n0
            r0.<init>(r6, r10)
        L1b:
            java.lang.Object r10 = r0.f97840u
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f97842w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            float r8 = r0.f97839t
            ww.g r6 = r0.f97838s
            ow.p0 r7 = r0.f97837r
            ue.c.H(r10)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L5e
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            ue.c.H(r10)
            java.util.LinkedHashMap r10 = r6.f97871m
            java.lang.Object r7 = r10.get(r7)
            ww.g r7 = (ww.g) r7
            ow.o0 r10 = new ow.o0
            r10.<init>(r6, r9, r8, r4)
            r0.f97837r = r6
            r0.f97838s = r7
            r0.f97839t = r8
            r0.f97842w = r3
            ao2.f0 r9 = r6.f97870l
            java.lang.Object r10 = kotlin.jvm.internal.j.M(r0, r9, r10)
            if (r10 != r1) goto L5e
            goto Ld8
        L5e:
            ww.f r10 = (ww.f) r10
            boolean r9 = r10 instanceof ww.d
            if (r9 == 0) goto La8
            pw.a r6 = r6.f97861c
            if (r7 == 0) goto L6c
            com.pinterest.api.model.f30 r4 = r7.a()
        L6c:
            ww.d r10 = (ww.d) r10
            java.lang.Throwable r7 = r10.a()
            pw.c r6 = (pw.c) r6
            r6.getClass()
            java.lang.String r9 = "throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r9)
            java.lang.String r9 = r7.getMessage()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "[VIDEO VOLUME CHANGE] Error: "
            r10.<init>(r0)
            r10.append(r9)
            java.lang.String r9 = ", volume="
            r10.append(r9)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            pw.c.h(r8)
            rw.a r8 = rw.a.VIDEO_VOLUME_CHANGE
            sw.a r9 = r6.f101492a
            r10 = 8
            sw.a.b(r9, r8, r7, r4, r10)
            qw.a r6 = r6.f101493b
            qw.a.b(r6, r8, r7, r4, r10)
            goto Ld6
        La8:
            boolean r9 = r10 instanceof ww.e
            if (r9 == 0) goto Ld6
            pw.a r6 = r6.f97861c
            if (r7 == 0) goto Lb4
            com.pinterest.api.model.f30 r4 = r7.a()
        Lb4:
            pw.c r6 = (pw.c) r6
            r6.getClass()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "[VIDEO VOLUME CHANGE] Success, volume="
            r7.<init>(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.g(r7)
            rw.a r7 = rw.a.VIDEO_VOLUME_CHANGE
            sw.a r8 = r6.f101492a
            sw.a.a(r8, r7, r4)
            qw.a r6 = r6.f101493b
            qw.a.a(r6, r7, r4)
        Ld6:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        Ld8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ow.p0.l(ow.p0, java.lang.String, float, com.iab.omid.library.pinterest.adsession.media.b, bl2.c):java.lang.Object");
    }

    public final void m() {
        Object dVar;
        Object dVar2;
        pb0.g gVar = (pb0.g) this.f97868j;
        gVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        boolean n13 = n();
        pw.a aVar = this.f97861c;
        if (!n13) {
            ((pw.c) aVar).g("OM SDK experiment is not enabled for this user.");
            return;
        }
        this.f97864f.getClass();
        try {
            if (Build.VERSION.SDK_INT > 28) {
                try {
                    CookieManager.getInstance();
                    uw.b bVar = this.f97860b;
                    bVar.getClass();
                    try {
                        if (!en.a.f59641a.f59642a) {
                            en.a.a(bVar.f123225a);
                        }
                        dVar = new ww.e(Unit.f80348a);
                    } catch (Exception e13) {
                        dVar = new ww.d(e13);
                    }
                    if (!(dVar instanceof ww.e)) {
                        if (dVar instanceof ww.d) {
                            gVar.getClass();
                            ((pw.c) aVar).k(System.currentTimeMillis() - currentTimeMillis, ((ww.d) dVar).a());
                            return;
                        }
                        return;
                    }
                    gVar.getClass();
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    gVar.getClass();
                    long currentTimeMillis3 = System.currentTimeMillis();
                    String appVersion = ((m60.d) this.f97866h).d();
                    Intrinsics.checkNotNullExpressionValue(appVersion, "getCurrentVersionNameFromCode(...)");
                    Intrinsics.checkNotNullParameter("pinterest", "partnerName");
                    Intrinsics.checkNotNullParameter(appVersion, "appVersion");
                    try {
                    } catch (Exception e14) {
                        dVar2 = new ww.d(e14);
                    }
                    if (TextUtils.isEmpty("pinterest")) {
                        throw new IllegalArgumentException("Name is null or empty");
                    }
                    if (TextUtils.isEmpty(appVersion)) {
                        throw new IllegalArgumentException("Version is null or empty");
                    }
                    dVar2 = new ww.e(new fn.g(appVersion));
                    if (dVar2 instanceof ww.e) {
                        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                        this.f97873o = (fn.g) ((ww.e) dVar2).f131162a;
                        pw.c cVar = (pw.c) aVar;
                        cVar.getClass();
                        cVar.g("[FETCH PARTNER] Success duration: " + currentTimeMillis4);
                        ((sw.b) cVar.f101492a).c(rw.a.FETCH_PARTNER, null, Long.valueOf(currentTimeMillis4));
                    } else if (dVar2 instanceof ww.d) {
                        ((pw.c) aVar).i(System.currentTimeMillis() - currentTimeMillis3, ((ww.d) dVar2).a());
                    }
                    i iVar = new i(this, null);
                    ao2.f0 f0Var = this.f97869k;
                    ao2.j0 j0Var = this.f97865g;
                    kotlin.jvm.internal.j.z(j0Var, f0Var, null, iVar, 2);
                    kotlin.jvm.internal.j.z(j0Var, null, null, new n(this, null), 3);
                    pw.c cVar2 = (pw.c) aVar;
                    cVar2.getClass();
                    cVar2.g("[SDK INIT] Success duration: " + currentTimeMillis2);
                    ((sw.b) cVar2.f101492a).c(rw.a.SDK_INIT, null, Long.valueOf(currentTimeMillis2));
                    return;
                } catch (Exception unused) {
                    ((pw.c) aVar).g("Webview is not available, quarantine failed.");
                }
            }
        } catch (Exception unused2) {
        }
        ((pw.c) aVar).g("Android API below safety threshold, quarantine failed.");
        pw.c cVar3 = (pw.c) aVar;
        cVar3.g("Quarantine failed, do not initialize the OMSDK.");
        cVar3.j(new Throwable("User failed quarantine"));
    }

    public final boolean n() {
        xw.b bVar = (xw.b) this.f97859a;
        iz1.a aVar = bVar.f136112a;
        Regex regex = iz1.a.f73940e;
        if (aVar.b("android_ad_om", "block", true, true)) {
            bVar.a("android_ad_om");
            return true;
        }
        iz1.a aVar2 = bVar.f136112a;
        if (aVar2.b("android_ad_om_aj", "block", true, true)) {
            bVar.a("android_ad_om_aj");
            return true;
        }
        if (!aVar2.b("android_ad_om_cu", "block", true, true)) {
            return false;
        }
        bVar.a("android_ad_om_cu");
        return true;
    }

    public final void o(f30 pin, long j13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        kotlin.jvm.internal.j.z(this.f97865g, null, null, new p(pin, this, j13, null), 3);
    }
}
