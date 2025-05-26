package ads_mobile_sdk;

import a.a8;
import a.f4;
import a.zb;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.webkit.CookieManager;
import ao2.j0;
import ao2.m0;
import ao2.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.regex.Pattern;
import kh2.s0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nm.s;

/* loaded from: classes2.dex */
public final class zr extends yr0 implements SharedPreferences.OnSharedPreferenceChangeListener, f4 {
    public static final Pattern Q = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    public static final nm.u R;
    public static final nm.u S;
    public static final Bundle T;
    public nm.u A;
    public final ff1 B;
    public final ao2.x C;
    public CookieManager D;
    public SharedPreferences E;
    public final ff1 F;
    public final mo2.a G;
    public ao2.o1 H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final mo2.a f14872J;
    public ll K;
    public p0 L;
    public final mo2.a M;
    public String N;
    public p0 O;
    public long P;

    /* renamed from: d, reason: collision with root package name */
    public final Context f14873d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f14874e;

    /* renamed from: f, reason: collision with root package name */
    public final a.a5 f14875f;

    /* renamed from: g, reason: collision with root package name */
    public final a.j3 f14876g;

    /* renamed from: h, reason: collision with root package name */
    public final nm.o f14877h;

    /* renamed from: i, reason: collision with root package name */
    public final oh0 f14878i;

    /* renamed from: j, reason: collision with root package name */
    public final cm0 f14879j;

    /* renamed from: k, reason: collision with root package name */
    public final a8 f14880k;

    /* renamed from: l, reason: collision with root package name */
    public final se f14881l;

    /* renamed from: m, reason: collision with root package name */
    public final tu1 f14882m;

    /* renamed from: n, reason: collision with root package name */
    public final rr2 f14883n;

    /* renamed from: o, reason: collision with root package name */
    public final sg f14884o;

    /* renamed from: p, reason: collision with root package name */
    public final fd0 f14885p;

    /* renamed from: q, reason: collision with root package name */
    public final zb f14886q;

    /* renamed from: r, reason: collision with root package name */
    public final sb2 f14887r;

    /* renamed from: s, reason: collision with root package name */
    public final a.v0 f14888s;

    /* renamed from: t, reason: collision with root package name */
    public final a.v7 f14889t;

    /* renamed from: u, reason: collision with root package name */
    public final tg0 f14890u;

    /* renamed from: v, reason: collision with root package name */
    public final lg0 f14891v;

    /* renamed from: w, reason: collision with root package name */
    public final eg0 f14892w;

    /* renamed from: x, reason: collision with root package name */
    public final mo2.a f14893x;

    /* renamed from: y, reason: collision with root package name */
    public Bundle f14894y;

    /* renamed from: z, reason: collision with root package name */
    public final mo2.a f14895z;

    static {
        nm.u uVar = new nm.u();
        Boolean bool = Boolean.TRUE;
        uVar.t("gad_idless", bool);
        uVar.t("is_tad", bool);
        R = uVar;
        nm.u uVar2 = new nm.u();
        Boolean bool2 = Boolean.FALSE;
        uVar2.t("gad_idless", bool2);
        uVar2.t("is_tad", bool2);
        S = uVar2;
        T = e0.t.j(new Pair("fake_key", "fake_val"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr(Context applicationContext, j0 backgroundScope, a.a5 javascriptEngine, a.j3 traceLogger, nm.o gson, oh0 flags, cm0 gmaUtil, a8 advertisingIdClientWrapper, se appSetIdClientWrapper, tu1 paidLifecycleWrapper, rr2 topicsApiClient, sg attributionReportingApiClient, fd0 firebaseAnalyticsAdapter, zb clock, sb2 rootTraceCreator, a.v0 randomGenerator, a.o8 trustlessTokenClientProvider, tg0 flagValueProvider, lg0 flagUpdater, eg0 flagDataStore) {
        super(il0.CUI_NAME_SDKINIT_INIT_CONSENT_STATE, true, 2);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(advertisingIdClientWrapper, "advertisingIdClientWrapper");
        Intrinsics.checkNotNullParameter(appSetIdClientWrapper, "appSetIdClientWrapper");
        Intrinsics.checkNotNullParameter(paidLifecycleWrapper, "paidLifecycleWrapper");
        Intrinsics.checkNotNullParameter(topicsApiClient, "topicsApiClient");
        Intrinsics.checkNotNullParameter(attributionReportingApiClient, "attributionReportingApiClient");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsAdapter, "firebaseAnalyticsAdapter");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(randomGenerator, "randomGenerator");
        Intrinsics.checkNotNullParameter(trustlessTokenClientProvider, "trustlessTokenClientProvider");
        Intrinsics.checkNotNullParameter(flagValueProvider, "flagValueProvider");
        Intrinsics.checkNotNullParameter(flagUpdater, "flagUpdater");
        Intrinsics.checkNotNullParameter(flagDataStore, "flagDataStore");
        this.f14873d = applicationContext;
        this.f14874e = backgroundScope;
        this.f14875f = javascriptEngine;
        this.f14876g = traceLogger;
        this.f14877h = gson;
        this.f14878i = flags;
        this.f14879j = gmaUtil;
        this.f14880k = advertisingIdClientWrapper;
        this.f14881l = appSetIdClientWrapper;
        this.f14882m = paidLifecycleWrapper;
        this.f14883n = topicsApiClient;
        this.f14884o = attributionReportingApiClient;
        this.f14885p = firebaseAnalyticsAdapter;
        this.f14886q = clock;
        this.f14887r = rootTraceCreator;
        this.f14888s = randomGenerator;
        this.f14889t = trustlessTokenClientProvider;
        this.f14890u = flagValueProvider;
        this.f14891v = flagUpdater;
        this.f14892w = flagDataStore;
        this.f14893x = mo2.d.a();
        this.f14894y = T;
        this.f14895z = mo2.d.a();
        this.A = R;
        a.n0 builder = cq.v();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.B = new ff1(new eq(builder).a());
        this.C = m0.b();
        this.F = new ff1(c());
        this.G = mo2.d.a();
        this.f14872J = mo2.d.a();
        this.M = mo2.d.a();
        zn2.b.f142311b.getClass();
        this.P = 0L;
    }

    public static Object a(zr zrVar, boolean z13, bl2.c cVar, int i13) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        zrVar.getClass();
        return b(zrVar, z13, true, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v5, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(ads_mobile_sdk.zr r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.qq
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.qq r0 = (ads_mobile_sdk.qq) r0
            int r1 = r0.f10223e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10223e = r1
            goto L18
        L13:
            ads_mobile_sdk.qq r0 = new ads_mobile_sdk.qq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f10221c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f10223e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            mo2.a r5 = r0.f10220b
            ads_mobile_sdk.zr r0 = r0.f10219a
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
            mo2.a r6 = r5.f14895z
            r0.f10219a = r5
            r0.f10220b = r6
            r0.f10223e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            nm.u r5 = r5.A     // Catch: java.lang.Throwable -> L52
            mo2.c r6 = (mo2.c) r6
            r6.i(r4)
            return r5
        L52:
            r5 = move-exception
            mo2.c r6 = (mo2.c) r6
            r6.i(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.b(ads_mobile_sdk.zr, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object d(ads_mobile_sdk.zr r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.sq
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.sq r0 = (ads_mobile_sdk.sq) r0
            int r1 = r0.f11197g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11197g = r1
            goto L18
        L13:
            ads_mobile_sdk.sq r0 = new ads_mobile_sdk.sq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f11195e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f11197g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            nm.o r5 = r0.f11194d
            nm.o r1 = r0.f11193c
            mo2.a r2 = r0.f11192b
            ads_mobile_sdk.zr r0 = r0.f11191a
            ue.c.H(r6)
            goto L55
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            ue.c.H(r6)
            nm.o r6 = r5.f14877h
            mo2.a r2 = r5.f14893x
            r0.f11191a = r5
            r0.f11192b = r2
            r0.f11193c = r6
            r0.f11194d = r6
            r0.f11197g = r3
            mo2.c r2 = (mo2.c) r2
            java.lang.Object r0 = r2.f(r4, r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            r0 = r5
            r5 = r6
            r1 = r5
        L55:
            android.os.Bundle r6 = r0.f14894y     // Catch: java.lang.Throwable -> L67
            mo2.c r2 = (mo2.c) r2
            r2.i(r4)
            java.lang.String r5 = r5.k(r6)
            java.lang.Class<nm.u> r6 = nm.u.class
            java.lang.Object r5 = r1.b(r6, r5)
            return r5
        L67:
            r5 = move-exception
            mo2.c r2 = (mo2.c) r2
            r2.i(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.d(ads_mobile_sdk.zr, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object e(ads_mobile_sdk.zr r12, bl2.c r13) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.e(ads_mobile_sdk.zr, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:19:0x0088, B:21:0x009c, B:28:0x00ad, B:30:0x00b1, B:32:0x00e1, B:33:0x00f4, B:35:0x00f8, B:37:0x00fe, B:38:0x0106), top: B:18:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:19:0x0088, B:21:0x009c, B:28:0x00ad, B:30:0x00b1, B:32:0x00e1, B:33:0x00f4, B:35:0x00f8, B:37:0x00fe, B:38:0x0106), top: B:18:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r0v23, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object g(ads_mobile_sdk.zr r17, bl2.c r18) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.g(ads_mobile_sdk.zr, bl2.c):java.lang.Object");
    }

    public final String c() {
        this.f14888s.getClass();
        return String.valueOf(new Random().nextInt(Integer.MAX_VALUE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f A[Catch: JsonSyntaxException -> 0x002c, TryCatch #0 {JsonSyntaxException -> 0x002c, blocks: (B:11:0x0028, B:12:0x0085, B:14:0x0069, B:16:0x006f, B:20:0x008e), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0082 -> B:12:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(bl2.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.gq
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.gq r0 = (ads_mobile_sdk.gq) r0
            int r1 = r0.f5660e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5660e = r1
            goto L18
        L13:
            ads_mobile_sdk.gq r0 = new ads_mobile_sdk.gq
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f5658c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5660e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.util.Iterator r2 = r0.f5657b
            ads_mobile_sdk.zr r5 = r0.f5656a
            ue.c.H(r7)     // Catch: com.google.gson.JsonSyntaxException -> L2c
            goto L85
        L2c:
            r7 = move-exception
            goto L95
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            ue.c.H(r7)
            nm.o r7 = new nm.o     // Catch: com.google.gson.JsonSyntaxException -> L5e
            r7.<init>()     // Catch: com.google.gson.JsonSyntaxException -> L5e
            ads_mobile_sdk.oh0 r2 = r6.f14878i     // Catch: com.google.gson.JsonSyntaxException -> L5e
            java.lang.String r2 = r2.G()     // Catch: com.google.gson.JsonSyntaxException -> L5e
            java.lang.Class<nm.q> r5 = nm.q.class
            java.lang.Object r7 = r7.b(r5, r2)     // Catch: com.google.gson.JsonSyntaxException -> L5e
            nm.q r7 = (nm.q) r7     // Catch: com.google.gson.JsonSyntaxException -> L5e
            kotlin.jvm.internal.Intrinsics.f(r7)     // Catch: com.google.gson.JsonSyntaxException -> L5e
            boolean r2 = r7 instanceof java.util.Collection     // Catch: com.google.gson.JsonSyntaxException -> L5e
            if (r2 == 0) goto L61
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: com.google.gson.JsonSyntaxException -> L5e
            boolean r2 = r2.isEmpty()     // Catch: com.google.gson.JsonSyntaxException -> L5e
            if (r2 == 0) goto L61
            r5 = r6
            goto L8e
        L5e:
            r7 = move-exception
            r5 = r6
            goto L95
        L61:
            java.util.ArrayList r7 = r7.f91364a     // Catch: com.google.gson.JsonSyntaxException -> L5e
            java.util.Iterator r7 = r7.iterator()     // Catch: com.google.gson.JsonSyntaxException -> L5e
            r5 = r6
            r2 = r7
        L69:
            boolean r7 = r2.hasNext()     // Catch: com.google.gson.JsonSyntaxException -> L2c
            if (r7 == 0) goto L8e
            java.lang.Object r7 = r2.next()     // Catch: com.google.gson.JsonSyntaxException -> L2c
            nm.s r7 = (nm.s) r7     // Catch: com.google.gson.JsonSyntaxException -> L2c
            kotlin.jvm.internal.Intrinsics.f(r7)     // Catch: com.google.gson.JsonSyntaxException -> L2c
            r0.f5656a = r5     // Catch: com.google.gson.JsonSyntaxException -> L2c
            r0.f5657b = r2     // Catch: com.google.gson.JsonSyntaxException -> L2c
            r0.f5660e = r4     // Catch: com.google.gson.JsonSyntaxException -> L2c
            java.lang.Object r7 = r5.a(r7, r0)     // Catch: com.google.gson.JsonSyntaxException -> L2c
            if (r7 != r1) goto L85
            return r1
        L85:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: com.google.gson.JsonSyntaxException -> L2c
            boolean r7 = r7.booleanValue()     // Catch: com.google.gson.JsonSyntaxException -> L2c
            if (r7 == 0) goto L69
            r3 = r4
        L8e:
            r7 = r3 ^ 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: com.google.gson.JsonSyntaxException -> L2c
            return r7
        L95:
            a.j3 r0 = r5.f14876g
            ads_mobile_sdk.ks2 r0 = (ads_mobile_sdk.ks2) r0
            java.lang.String r1 = "JSON fallback consent keys set parsing failure"
            r0.a(r1, r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.f(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.iq
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.iq r0 = (ads_mobile_sdk.iq) r0
            int r1 = r0.f6519e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6519e = r1
            goto L18
        L13:
            ads_mobile_sdk.iq r0 = new ads_mobile_sdk.iq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f6517c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6519e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ads_mobile_sdk.aq r1 = r0.f6516b
            ads_mobile_sdk.zr r0 = r0.f6515a
            ue.c.H(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            ue.c.H(r5)
            ads_mobile_sdk.aq r5 = ads_mobile_sdk.aq.API_CLEAR_PER_APP_ID_V2
            ads_mobile_sdk.ff1 r2 = r4.B
            r0.f6515a = r4
            r0.f6516b = r5
            r0.f6519e = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r1 = r5
            r5 = r0
            r0 = r4
        L4a:
            ads_mobile_sdk.cq r5 = (ads_mobile_sdk.cq) r5
            ads_mobile_sdk.ew0 r5 = r5.s()
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L5b
            ads_mobile_sdk.tu1 r5 = r0.f14882m
            r5.b()
        L5b:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.h(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(bl2.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.jq
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.jq r0 = (ads_mobile_sdk.jq) r0
            int r1 = r0.f6915d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6915d = r1
            goto L18
        L13:
            ads_mobile_sdk.jq r0 = new ads_mobile_sdk.jq
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f6913b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6915d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            ue.c.H(r7)
            goto L67
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            ads_mobile_sdk.zr r2 = r0.f6912a
            ue.c.H(r7)
            goto L5b
        L3b:
            ads_mobile_sdk.zr r2 = r0.f6912a
            ue.c.H(r7)
            goto L50
        L41:
            ue.c.H(r7)
            r0.f6912a = r6
            r0.f6915d = r5
            java.lang.Object r7 = r6.j(r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r2 = r6
        L50:
            r0.f6912a = r2
            r0.f6915d = r4
            java.lang.Object r7 = r2.g(r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            r7 = 0
            r0.f6912a = r7
            r0.f6915d = r3
            java.lang.Object r7 = r2.h(r0)
            if (r7 != r1) goto L67
            return r1
        L67:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.i(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.kq
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.kq r0 = (ads_mobile_sdk.kq) r0
            int r1 = r0.f7446e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7446e = r1
            goto L18
        L13:
            ads_mobile_sdk.kq r0 = new ads_mobile_sdk.kq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f7444c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f7446e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ads_mobile_sdk.aq r1 = r0.f7443b
            ads_mobile_sdk.zr r0 = r0.f7442a
            ue.c.H(r6)
            goto L4a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            ue.c.H(r6)
            ads_mobile_sdk.aq r6 = ads_mobile_sdk.aq.API_CLEAR_WEBVIEW_COOKIE
            ads_mobile_sdk.ff1 r2 = r5.B
            r0.f7442a = r5
            r0.f7443b = r6
            r0.f7446e = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r1 = r6
            r6 = r0
            r0 = r5
        L4a:
            ads_mobile_sdk.cq r6 = (ads_mobile_sdk.cq) r6
            ads_mobile_sdk.ew0 r6 = r6.s()
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto Lc0
            android.webkit.CookieManager r6 = r0.D
            if (r6 == 0) goto L65
            ads_mobile_sdk.oh0 r1 = r0.f14878i
            java.lang.String r1 = r1.n0()
            java.lang.String r6 = r6.getCookie(r1)
            goto L66
        L65:
            r6 = 0
        L66:
            if (r6 != 0) goto L69
            goto Lc0
        L69:
            java.lang.String r1 = ";"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 6
            r4 = 0
            java.util.List r6 = kotlin.text.StringsKt.W(r6, r1, r4, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L7e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r6.next()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.text.z.j(r4)
            r4 = r4 ^ r3
            if (r4 == 0) goto L7e
            r1.add(r2)
            goto L7e
        L96:
            java.util.Iterator r6 = r1.iterator()
        L9a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lc0
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "="
            java.lang.String r1 = kotlin.text.StringsKt.e0(r1, r2, r1)
            java.lang.String r2 = "=; Max-Age=-1; path=/; domain=.doubleclick.net"
            java.lang.String r1 = a.a.C(r1, r2)
            android.webkit.CookieManager r2 = r0.D
            if (r2 == 0) goto L9a
            ads_mobile_sdk.oh0 r3 = r0.f14878i
            java.lang.String r3 = r3.n0()
            r2.setCookie(r3, r1)
            goto L9a
        Lc0:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.j(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.mq
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.mq r0 = (ads_mobile_sdk.mq) r0
            int r1 = r0.f8337e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8337e = r1
            goto L18
        L13:
            ads_mobile_sdk.mq r0 = new ads_mobile_sdk.mq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f8335c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f8337e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r6)
            goto L93
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            ads_mobile_sdk.aq r2 = r0.f8334b
            ads_mobile_sdk.zr r4 = r0.f8333a
            ue.c.H(r6)
            goto L4f
        L3a:
            ue.c.H(r6)
            ads_mobile_sdk.aq r2 = ads_mobile_sdk.aq.API_READ_ADVERTISING_ID
            ads_mobile_sdk.ff1 r6 = r5.B
            r0.f8333a = r5
            r0.f8334b = r2
            r0.f8337e = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r4 = r5
        L4f:
            ads_mobile_sdk.cq r6 = (ads_mobile_sdk.cq) r6
            ads_mobile_sdk.ew0 r6 = r6.s()
            boolean r6 = r6.contains(r2)
            r2 = 0
            if (r6 == 0) goto L96
            a.a8 r6 = r4.f14880k
            android.content.Context r4 = r4.f14873d
            r0.f8333a = r2
            r0.f8334b = r2
            r0.f8337e = r3
            r6.getClass()
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r6 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r4)     // Catch: java.lang.Exception -> L6e
            goto L90
        L6e:
            r6 = move-exception
            java.lang.String r0 = "message"
            java.lang.String r3 = "Exception while getting advertising Id info"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.WeakHashMap r0 = ads_mobile_sdk.qs2.f10249a
            ads_mobile_sdk.cs2 r0 = ads_mobile_sdk.qs2.a()
            ads_mobile_sdk.jw1 r4 = r0.f()
            java.util.List r4 = r4.f6994p
            r4.add(r3)
            ads_mobile_sdk.jw1 r3 = r0.f()
            r4 = 0
            r3.f6988j = r4
            r0.a(r6)
            r6 = r2
        L90:
            if (r6 != r1) goto L93
            return r1
        L93:
            r2 = r6
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r2 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r2
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.k(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.nq
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.nq r0 = (ads_mobile_sdk.nq) r0
            int r1 = r0.f8926e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8926e = r1
            goto L18
        L13:
            ads_mobile_sdk.nq r0 = new ads_mobile_sdk.nq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f8924c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f8926e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ads_mobile_sdk.aq r1 = r0.f8923b
            ads_mobile_sdk.zr r0 = r0.f8922a
            ue.c.H(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            ue.c.H(r5)
            ads_mobile_sdk.aq r5 = ads_mobile_sdk.aq.API_READ_AMAZON_FIRE_AD_ID
            ads_mobile_sdk.ff1 r2 = r4.B
            r0.f8922a = r4
            r0.f8923b = r5
            r0.f8926e = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r1 = r5
            r5 = r0
            r0 = r4
        L4a:
            ads_mobile_sdk.cq r5 = (ads_mobile_sdk.cq) r5
            ads_mobile_sdk.ew0 r5 = r5.s()
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L66
            android.content.Context r5 = r0.f14873d
            android.content.ContentResolver r5 = r5.getContentResolver()
            if (r5 != 0) goto L5f
            goto L66
        L5f:
            java.lang.String r0 = "advertising_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r0)
            goto L67
        L66:
            r5 = 0
        L67:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.l(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086 A[Catch: all -> 0x00d9, TryCatch #0 {all -> 0x00d9, blocks: (B:19:0x0082, B:21:0x0086, B:23:0x00c6, B:30:0x00db, B:32:0x00df, B:34:0x00e5, B:35:0x00ed), top: B:18:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(bl2.c r17) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.m(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.uq
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.uq r0 = (ads_mobile_sdk.uq) r0
            int r1 = r0.f12156e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12156e = r1
            goto L18
        L13:
            ads_mobile_sdk.uq r0 = new ads_mobile_sdk.uq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f12154c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12156e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ads_mobile_sdk.aq r1 = r0.f12153b
            ads_mobile_sdk.zr r0 = r0.f12152a
            ue.c.H(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            ue.c.H(r5)
            ads_mobile_sdk.aq r5 = ads_mobile_sdk.aq.API_READ_FIREBASE_AD_EVENT_ID
            ads_mobile_sdk.ff1 r2 = r4.B
            r0.f12152a = r4
            r0.f12153b = r5
            r0.f12156e = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r1 = r5
            r5 = r0
            r0 = r4
        L4a:
            ads_mobile_sdk.cq r5 = (ads_mobile_sdk.cq) r5
            ads_mobile_sdk.ew0 r5 = r5.s()
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L65
            ads_mobile_sdk.fd0 r5 = r0.f14885p
            java.lang.String r0 = "generateEventId"
            java.lang.Object r5 = r5.a(r0)
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.toString()
            goto L66
        L65:
            r5 = 0
        L66:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.n(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.vq
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.vq r0 = (ads_mobile_sdk.vq) r0
            int r1 = r0.f12603e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12603e = r1
            goto L18
        L13:
            ads_mobile_sdk.vq r0 = new ads_mobile_sdk.vq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f12601c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12603e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r6)
            goto L6e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            ads_mobile_sdk.aq r2 = r0.f12600b
            ads_mobile_sdk.zr r4 = r0.f12599a
            ue.c.H(r6)
            goto L4f
        L3a:
            ue.c.H(r6)
            ads_mobile_sdk.aq r2 = ads_mobile_sdk.aq.API_READ_FIREBASE_APP_ID
            ads_mobile_sdk.ff1 r6 = r5.B
            r0.f12599a = r5
            r0.f12600b = r2
            r0.f12603e = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r4 = r5
        L4f:
            ads_mobile_sdk.cq r6 = (ads_mobile_sdk.cq) r6
            ads_mobile_sdk.ew0 r6 = r6.s()
            boolean r6 = r6.contains(r2)
            r2 = 0
            if (r6 == 0) goto L71
            ads_mobile_sdk.fd0 r6 = r4.f14885p
            r0.f12599a = r2
            r0.f12600b = r2
            r0.f12603e = r3
            r6.getClass()
            java.lang.Object r6 = ads_mobile_sdk.fd0.a(r6, r0)
            if (r6 != r1) goto L6e
            return r1
        L6e:
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.o(bl2.c):java.lang.Object");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        oh0 oh0Var = this.f14878i;
        oh0Var.getClass();
        if (CollectionsKt.L((List) oh0Var.a("gads:sp:consent_keys_list", kotlin.collections.f0.j("IABTCF_AddtlConsent", "IABConsent_CMPPresent", "IABTCF_CmpSdkID", "IABConsent_ConsentString", "IABTCF_gdprApplies", "IABGPP_HDR_GppString", "IABGPP_GppSID", "gad_has_consent_for_cookies", "IABConsent_ParsedPurposeConsents", "personalized_ad_status", "IABTCF_PolicyVersion", "IABUSPrivacy_String", "IABTCF_PurposeConsents", "gad_rdp", "IABConsent_SubjectToGDPR", "IABTCF_TCString", "UPTC_UptcString", "IABConsent_ParsedVendorConsents"), oh0.f9286j), str)) {
            j0 j0Var = this.f14874e;
            ir block = new ir(this, null);
            kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.wq
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.wq r0 = (ads_mobile_sdk.wq) r0
            int r1 = r0.f13177e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13177e = r1
            goto L18
        L13:
            ads_mobile_sdk.wq r0 = new ads_mobile_sdk.wq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13175c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f13177e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ads_mobile_sdk.aq r1 = r0.f13174b
            ads_mobile_sdk.zr r0 = r0.f13173a
            ue.c.H(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            ue.c.H(r5)
            ads_mobile_sdk.aq r5 = ads_mobile_sdk.aq.API_READ_FIREBASE_APP_INSTANCE_ID
            ads_mobile_sdk.ff1 r2 = r4.B
            r0.f13173a = r4
            r0.f13174b = r5
            r0.f13177e = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r1 = r5
            r5 = r0
            r0 = r4
        L4a:
            ads_mobile_sdk.cq r5 = (ads_mobile_sdk.cq) r5
            ads_mobile_sdk.ew0 r5 = r5.s()
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L65
            ads_mobile_sdk.fd0 r5 = r0.f14885p
            java.lang.String r0 = "getAppInstanceId"
            java.lang.Object r5 = r5.a(r0)
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.toString()
            goto L66
        L65:
            r5 = 0
        L66:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.p(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(bl2.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.xq
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.xq r0 = (ads_mobile_sdk.xq) r0
            int r1 = r0.f13766e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13766e = r1
            goto L18
        L13:
            ads_mobile_sdk.xq r0 = new ads_mobile_sdk.xq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13764c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f13766e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ads_mobile_sdk.aq r1 = r0.f13763b
            ads_mobile_sdk.zr r0 = r0.f13762a
            ue.c.H(r6)
            goto L4a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            ue.c.H(r6)
            ads_mobile_sdk.aq r6 = ads_mobile_sdk.aq.API_PER_APP_ID_V1
            ads_mobile_sdk.ff1 r2 = r5.B
            r0.f13762a = r5
            r0.f13763b = r6
            r0.f13766e = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r1 = r6
            r6 = r0
            r0 = r5
        L4a:
            ads_mobile_sdk.cq r6 = (ads_mobile_sdk.cq) r6
            ads_mobile_sdk.ew0 r6 = r6.s()
            boolean r6 = r6.contains(r1)
            r1 = 0
            if (r6 == 0) goto Lc5
            ads_mobile_sdk.tu1 r6 = r0.f14882m
            r6.getClass()
            xk2.k r0 = r6.f11700c     // Catch: java.lang.Exception -> L9b
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L9b
            ads_mobile_sdk.vu1 r0 = (ads_mobile_sdk.vu1) r0     // Catch: java.lang.Exception -> L9b
            ads_mobile_sdk.oh0 r6 = r6.f11698a     // Catch: java.lang.Exception -> L9b
            r6.getClass()     // Catch: java.lang.Exception -> L9b
            java.lang.String r2 = "gads:signal:paid_v1_ttl"
            zn2.a r3 = zn2.b.f142311b     // Catch: java.lang.Exception -> L9b
            zn2.d r3 = zn2.d.DAYS     // Catch: java.lang.Exception -> L9b
            r4 = 182(0xb6, float:2.55E-43)
            long r3 = dl2.b.P2(r4, r3)     // Catch: java.lang.Exception -> L9b
            long r3 = zn2.b.e(r3)     // Catch: java.lang.Exception -> L9b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L9b
            ads_mobile_sdk.eh0 r4 = ads_mobile_sdk.oh0.f9283g     // Catch: java.lang.Exception -> L9b
            java.lang.Object r6 = r6.a(r2, r3, r4)     // Catch: java.lang.Exception -> L9b
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Exception -> L9b
            long r2 = r6.longValue()     // Catch: java.lang.Exception -> L9b
            r0.getClass()     // Catch: java.lang.Exception -> L9b
            java.lang.Class<ads_mobile_sdk.vu1> r6 = ads_mobile_sdk.vu1.class
            monitor-enter(r6)     // Catch: java.lang.Exception -> L9b
            ads_mobile_sdk.wn0 r0 = r0.a(r2)     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9d
            ads_mobile_sdk.pk0 r6 = new ads_mobile_sdk.pk0     // Catch: java.lang.Exception -> L9b
            r6.<init>(r0)     // Catch: java.lang.Exception -> L9b
            r1 = r6
            goto Lc5
        L9b:
            r6 = move-exception
            goto La0
        L9d:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9d
            throw r0     // Catch: java.lang.Exception -> L9b
        La0:
            java.lang.String r0 = "Exception while getting PAIDV1"
            java.lang.String r2 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            ads_mobile_sdk.cs2 r2 = ads_mobile_sdk.qs2.a()
            ads_mobile_sdk.jw1 r3 = r2.f()
            java.util.List r3 = r3.f6994p
            r3.add(r0)
            ads_mobile_sdk.jw1 r0 = r2.f()
            r3 = 0
            r0.f6988j = r3
            r2.a(r6)
            ads_mobile_sdk.kk0 r0 = new ads_mobile_sdk.kk0
            r2 = 6
            r0.<init>(r6, r1, r1, r2)
            r1 = r0
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.q(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(bl2.c r7) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.r(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(bl2.c r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof ads_mobile_sdk.dr
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.dr r0 = (ads_mobile_sdk.dr) r0
            int r1 = r0.f4414e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4414e = r1
            goto L18
        L13:
            ads_mobile_sdk.dr r0 = new ads_mobile_sdk.dr
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.f4412c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4414e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ads_mobile_sdk.aq r1 = r0.f4411b
            ads_mobile_sdk.zr r0 = r0.f4410a
            ue.c.H(r13)
            goto L4a
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L33:
            ue.c.H(r13)
            ads_mobile_sdk.aq r13 = ads_mobile_sdk.aq.API_GET_WEBVIEW_COOKIE
            ads_mobile_sdk.ff1 r2 = r12.B
            r0.f4410a = r12
            r0.f4411b = r13
            r0.f4414e = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r1 = r13
            r13 = r0
            r0 = r12
        L4a:
            ads_mobile_sdk.cq r13 = (ads_mobile_sdk.cq) r13
            ads_mobile_sdk.ew0 r13 = r13.s()
            boolean r13 = r13.contains(r1)
            r1 = 0
            if (r13 == 0) goto La8
            android.webkit.CookieManager r13 = r0.D
            if (r13 == 0) goto L66
            ads_mobile_sdk.oh0 r0 = r0.f14878i
            java.lang.String r0 = r0.n0()
            java.lang.String r13 = r13.getCookie(r0)
            goto L67
        L66:
            r13 = r1
        L67:
            if (r13 == 0) goto La8
            int r0 = r13.length()
            if (r0 != 0) goto L70
            goto La8
        L70:
            java.util.regex.Pattern r0 = ads_mobile_sdk.zr.Q
            java.util.regex.Matcher r13 = r0.matcher(r13)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L7b:
            boolean r0 = r13.find()
            if (r0 == 0) goto L9b
            java.lang.String r0 = r13.group(r3)
            if (r0 == 0) goto L7b
            java.lang.String r1 = "id="
            boolean r1 = kotlin.text.z.p(r0, r1, r3)
            if (r1 != 0) goto L97
            java.lang.String r1 = "ide="
            boolean r1 = kotlin.text.z.p(r0, r1, r3)
            if (r1 == 0) goto L7b
        L97:
            r4.add(r0)
            goto L7b
        L9b:
            r9 = 0
            r10 = 0
            java.lang.String r5 = "; "
            r6 = 0
            r7 = 0
            r8 = 0
            r11 = 62
            java.lang.String r1 = kotlin.collections.CollectionsKt.Z(r4, r5, r6, r7, r8, r9, r10, r11)
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.s(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0185 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01fb A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #4 {all -> 0x0045, blocks: (B:15:0x0040, B:16:0x01f5, B:18:0x01fb), top: B:14:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0225 A[Catch: all -> 0x0235, TryCatch #13 {all -> 0x0235, blocks: (B:26:0x021e, B:28:0x0225, B:30:0x022c, B:32:0x0230, B:34:0x0234, B:35:0x0238, B:36:0x023d, B:37:0x023e, B:38:0x0245, B:39:0x0246, B:40:0x024d, B:41:0x024e), top: B:25:0x021e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x024e A[Catch: all -> 0x0235, TRY_LEAVE, TryCatch #13 {all -> 0x0235, blocks: (B:26:0x021e, B:28:0x0225, B:30:0x022c, B:32:0x0230, B:34:0x0234, B:35:0x0238, B:36:0x023d, B:37:0x023e, B:38:0x0245, B:39:0x0246, B:40:0x024d, B:41:0x024e), top: B:25:0x021e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(bl2.c r18) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.t(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.hr
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.hr r0 = (ads_mobile_sdk.hr) r0
            int r1 = r0.f6056e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6056e = r1
            goto L18
        L13:
            ads_mobile_sdk.hr r0 = new ads_mobile_sdk.hr
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f6054c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6056e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ads_mobile_sdk.aq r1 = r0.f6053b
            ads_mobile_sdk.zr r0 = r0.f6052a
            ue.c.H(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            ue.c.H(r5)
            ads_mobile_sdk.aq r5 = ads_mobile_sdk.aq.API_READ_AMAZON_FIRE_AD_ID
            ads_mobile_sdk.ff1 r2 = r4.B
            r0.f6052a = r4
            r0.f6053b = r5
            r0.f6056e = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r1 = r5
            r5 = r0
            r0 = r4
        L4a:
            ads_mobile_sdk.cq r5 = (ads_mobile_sdk.cq) r5
            ads_mobile_sdk.ew0 r5 = r5.s()
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L6f
            android.content.Context r5 = r0.f14873d
            android.content.ContentResolver r5 = r5.getContentResolver()
            if (r5 != 0) goto L5f
            goto L6f
        L5f:
            java.lang.String r0 = "limit_ad_tracking"
            r1 = 0
            int r5 = android.provider.Settings.Secure.getInt(r5, r0, r1)
            if (r5 != r3) goto L69
            goto L6a
        L69:
            r3 = r1
        L6a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            goto L70
        L6f:
            r5 = 0
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.u(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(7:18|19|20|21|22|13|14))(1:27))(2:32|(1:34)(1:35))|28|(1:30)(6:31|20|21|22|13|14)))|40|6|7|(0)(0)|28|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0041, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Failed to read the updated in memory consent state", "message");
        r2 = ads_mobile_sdk.qs2.a();
        r2.f().f6994p.add("Failed to read the updated in memory consent state");
        r2.f().f6988j = false;
        r2.a(r10);
        r0.f6927a = null;
        r0.f6928b = null;
        r0.f6929c = null;
        r0.f6932f = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        if (r5.w(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d9, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v4, types: [ads_mobile_sdk.zr] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(bl2.c r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.v(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(bl2.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.pr
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.pr r0 = (ads_mobile_sdk.pr) r0
            int r1 = r0.f9783e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9783e = r1
            goto L18
        L13:
            ads_mobile_sdk.pr r0 = new ads_mobile_sdk.pr
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f9781c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9783e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            ue.c.H(r7)
            goto L6f
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            mo2.a r2 = r0.f9780b
            ads_mobile_sdk.zr r4 = r0.f9779a
            ue.c.H(r7)
            goto L51
        L3b:
            ue.c.H(r7)
            mo2.a r7 = r6.f14895z
            r0.f9779a = r6
            r0.f9780b = r7
            r0.f9783e = r4
            r2 = r7
            mo2.c r2 = (mo2.c) r2
            java.lang.Object r7 = r2.f(r5, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r4 = r6
        L51:
            nm.u r7 = ads_mobile_sdk.zr.R     // Catch: java.lang.Throwable -> L72
            r4.A = r7     // Catch: java.lang.Throwable -> L72
            kotlin.Unit r7 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L72
            mo2.c r2 = (mo2.c) r2
            r2.i(r5)
            ads_mobile_sdk.ff1 r7 = r4.B
            ads_mobile_sdk.cq r2 = r4.d()
            r0.f9779a = r5
            r0.f9780b = r5
            r0.f9783e = r3
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        L72:
            r7 = move-exception
            mo2.c r2 = (mo2.c) r2
            r2.i(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.w(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(bl2.c r14) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.x(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.zr r17, boolean r18, boolean r19, bl2.c r20) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.a(ads_mobile_sdk.zr, boolean, boolean, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v5, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object c(ads_mobile_sdk.zr r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.rq
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.rq r0 = (ads_mobile_sdk.rq) r0
            int r1 = r0.f10752e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10752e = r1
            goto L18
        L13:
            ads_mobile_sdk.rq r0 = new ads_mobile_sdk.rq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f10750c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f10752e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            mo2.a r5 = r0.f10749b
            ads_mobile_sdk.zr r0 = r0.f10748a
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
            mo2.a r6 = r5.f14893x
            r0.f10748a = r5
            r0.f10749b = r6
            r0.f10752e = r3
            mo2.c r6 = (mo2.c) r6
            java.lang.Object r0 = r6.f(r4, r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            android.os.Bundle r5 = r5.f14894y     // Catch: java.lang.Throwable -> L52
            mo2.c r6 = (mo2.c) r6
            r6.i(r4)
            return r5
        L52:
            r5 = move-exception
            mo2.c r6 = (mo2.c) r6
            r6.i(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.c(ads_mobile_sdk.zr, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:18:0x005a, B:20:0x005e, B:21:0x0061, B:26:0x0069), top: B:17:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v5, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(ads_mobile_sdk.zr r6, boolean r7, boolean r8, bl2.c r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.kr
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.kr r0 = (ads_mobile_sdk.kr) r0
            int r1 = r0.f7460g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7460g = r1
            goto L18
        L13:
            ads_mobile_sdk.kr r0 = new ads_mobile_sdk.kr
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f7458e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f7460g
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L34
            if (r2 != r3) goto L2c
            ue.c.H(r9)
            goto La0
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            boolean r8 = r0.f7457d
            boolean r7 = r0.f7456c
            mo2.a r6 = r0.f7455b
            ads_mobile_sdk.zr r2 = r0.f7454a
            ue.c.H(r9)
            r9 = r6
            r6 = r2
            goto L5a
        L42:
            ue.c.H(r9)
            mo2.a r9 = r6.G
            r0.f7454a = r6
            r0.f7455b = r9
            r0.f7456c = r7
            r0.f7457d = r8
            r0.f7460g = r5
            mo2.c r9 = (mo2.c) r9
            java.lang.Object r2 = r9.f(r4, r0)
            if (r2 != r1) goto L5a
            return r1
        L5a:
            ao2.o1 r2 = r6.H     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L61
            r2.cancel(r4)     // Catch: java.lang.Throwable -> La3
        L61:
            boolean r2 = r6.I     // Catch: java.lang.Throwable -> La3
            if (r2 != 0) goto L69
            if (r7 == 0) goto L68
            goto L69
        L68:
            r5 = 0
        L69:
            r6.I = r5     // Catch: java.lang.Throwable -> La3
            ao2.j0 r7 = r6.f14874e     // Catch: java.lang.Throwable -> La3
            ads_mobile_sdk.lr r2 = new ads_mobile_sdk.lr     // Catch: java.lang.Throwable -> La3
            r2.<init>(r6, r5, r8, r4)     // Catch: java.lang.Throwable -> La3
            kotlin.coroutines.j r8 = kotlin.coroutines.j.f80412a     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r5)     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)     // Catch: java.lang.Throwable -> La3
            ads_mobile_sdk.et2 r5 = new ads_mobile_sdk.et2     // Catch: java.lang.Throwable -> La3
            r5.<init>(r2, r4)     // Catch: java.lang.Throwable -> La3
            ao2.k2 r7 = kotlin.jvm.internal.j.z(r7, r8, r4, r5, r3)     // Catch: java.lang.Throwable -> La3
            r6.H = r7     // Catch: java.lang.Throwable -> La3
            mo2.c r9 = (mo2.c) r9
            r9.i(r4)
            r0.f7454a = r4
            r0.f7455b = r4
            r0.f7460g = r3
            java.lang.Object r6 = r7.join(r0)
            if (r6 != r1) goto La0
            return r1
        La0:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        La3:
            r6 = move-exception
            mo2.c r9 = (mo2.c) r9
            r9.i(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.b(ads_mobile_sdk.zr, boolean, boolean, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object h(ads_mobile_sdk.zr r14, bl2.c r15) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.h(ads_mobile_sdk.zr, bl2.c):java.lang.Object");
    }

    public final cq d() {
        a.n0 builder = cq.v();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        ew0 i13 = builder.i();
        Intrinsics.checkNotNullExpressionValue(i13, "getAllowedApisList(...)");
        ba0 ba0Var = new ba0(i13);
        oh0 oh0Var = this.f14878i;
        oh0Var.getClass();
        a.n0 builder2 = cq.v();
        Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder2, "builder");
        eq eqVar = new eq(builder2);
        ba0 b13 = eqVar.b();
        aq aqVar = aq.API_READ_SHARED_PREFERENCES_CONSENT_DATA;
        Intrinsics.checkNotNullParameter(b13, "<this>");
        ba0 q13 = s0.q(aqVar, builder2, aqVar, eqVar);
        aq aqVar2 = aq.API_READ_FLAG_VALUES;
        Intrinsics.checkNotNullParameter(q13, "<this>");
        ba0 q14 = s0.q(aqVar2, builder2, aqVar2, eqVar);
        aq aqVar3 = aq.API_WRITE_FLAG_VALUES;
        Intrinsics.checkNotNullParameter(q14, "<this>");
        ba0 q15 = s0.q(aqVar3, builder2, aqVar3, eqVar);
        aq aqVar4 = aq.API_READ_CLD_RESPONSE;
        Intrinsics.checkNotNullParameter(q15, "<this>");
        ba0 q16 = s0.q(aqVar4, builder2, aqVar4, eqVar);
        aq aqVar5 = aq.API_CLEAR_WEBVIEW_COOKIE;
        Intrinsics.checkNotNullParameter(q16, "<this>");
        ba0 q17 = s0.q(aqVar5, builder2, aqVar5, eqVar);
        aq aqVar6 = aq.API_READ_ANDROID_ID;
        Intrinsics.checkNotNullParameter(q17, "<this>");
        ba0 q18 = s0.q(aqVar6, builder2, aqVar6, eqVar);
        aq aqVar7 = aq.API_READ_ADVERTISING_ID;
        Intrinsics.checkNotNullParameter(q18, "<this>");
        ba0 q19 = s0.q(aqVar7, builder2, aqVar7, eqVar);
        aq aqVar8 = aq.API_READ_APP_SET_ID;
        Intrinsics.checkNotNullParameter(q19, "<this>");
        ba0 q23 = s0.q(aqVar8, builder2, aqVar8, eqVar);
        aq aqVar9 = aq.API_CLEAR_PER_APP_ID_V1;
        Intrinsics.checkNotNullParameter(q23, "<this>");
        ba0 q24 = s0.q(aqVar9, builder2, aqVar9, eqVar);
        aq aqVar10 = aq.API_CLEAR_PER_APP_ID_V2;
        Intrinsics.checkNotNullParameter(q24, "<this>");
        ba0 q25 = s0.q(aqVar10, builder2, aqVar10, eqVar);
        aq aqVar11 = aq.API_READ_FIREBASE_APP_ID;
        Intrinsics.checkNotNullParameter(q25, "<this>");
        ba0 q26 = s0.q(aqVar11, builder2, aqVar11, eqVar);
        aq value = aq.API_READ_FIREBASE_APP_INSTANCE_ID;
        Intrinsics.checkNotNullParameter(q26, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        builder2.g(value);
        ba0 b14 = eqVar.b();
        aq value2 = aq.API_READ_FIREBASE_AD_EVENT_ID;
        Intrinsics.checkNotNullParameter(b14, "<this>");
        Intrinsics.checkNotNullParameter(value2, "value");
        builder2.g(value2);
        Unit unit = Unit.f80348a;
        a.g1 t13 = eqVar.a().t();
        Intrinsics.checkNotNullExpressionValue(t13, "getAllowedApisValueList(...)");
        List list = (List) oh0Var.a("gads:consent_allowlist_default:string", t13, oh0.f9287k);
        ArrayList values = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aq a13 = aq.a(((Number) it.next()).intValue());
            if (a13 != null) {
                values.add(a13);
            }
        }
        Intrinsics.checkNotNullParameter(ba0Var, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        builder.h(values);
        sj0 a14 = builder.a();
        Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
        return (cq) a14;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object f(ads_mobile_sdk.zr r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.zq
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.zq r0 = (ads_mobile_sdk.zq) r0
            int r1 = r0.f14862e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14862e = r1
            goto L18
        L13:
            ads_mobile_sdk.zq r0 = new ads_mobile_sdk.zq
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f14860c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f14862e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r7)
            goto L6e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ads_mobile_sdk.aq r6 = r0.f14859b
            ads_mobile_sdk.zr r2 = r0.f14858a
            ue.c.H(r7)
            goto L52
        L3a:
            ue.c.H(r7)
            ads_mobile_sdk.aq r7 = ads_mobile_sdk.aq.API_READ_SESSION_ID
            ads_mobile_sdk.ff1 r2 = r6.B
            r0.f14858a = r6
            r0.f14859b = r7
            r0.f14862e = r4
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L4e
            return r1
        L4e:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L52:
            ads_mobile_sdk.cq r7 = (ads_mobile_sdk.cq) r7
            ads_mobile_sdk.ew0 r7 = r7.s()
            boolean r6 = r7.contains(r6)
            r7 = 0
            if (r6 == 0) goto L70
            ads_mobile_sdk.ff1 r6 = r2.F
            r0.f14858a = r7
            r0.f14859b = r7
            r0.f14862e = r3
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r1) goto L6e
            return r1
        L6e:
            java.lang.String r7 = (java.lang.String) r7
        L70:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.f(ads_mobile_sdk.zr, bl2.c):java.lang.Object");
    }

    @Override // ads_mobile_sdk.yr0
    public final Object e(bl2.c cVar) {
        return h(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.hq
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.hq r0 = (ads_mobile_sdk.hq) r0
            int r1 = r0.f6045e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6045e = r1
            goto L18
        L13:
            ads_mobile_sdk.hq r0 = new ads_mobile_sdk.hq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f6043c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6045e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ads_mobile_sdk.aq r1 = r0.f6042b
            ads_mobile_sdk.zr r0 = r0.f6041a
            ue.c.H(r5)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            ue.c.H(r5)
            ads_mobile_sdk.aq r5 = ads_mobile_sdk.aq.API_CLEAR_PER_APP_ID_V1
            ads_mobile_sdk.ff1 r2 = r4.B
            r0.f6041a = r4
            r0.f6042b = r5
            r0.f6045e = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r1 = r5
            r5 = r0
            r0 = r4
        L4a:
            ads_mobile_sdk.cq r5 = (ads_mobile_sdk.cq) r5
            ads_mobile_sdk.ew0 r5 = r5.s()
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L5b
            ads_mobile_sdk.tu1 r5 = r0.f14882m
            r5.a()
        L5b:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.g(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0357 A[Catch: all -> 0x0406, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x0406, blocks: (B:74:0x03ce, B:96:0x0334, B:98:0x033a, B:102:0x0357, B:104:0x0360, B:106:0x0377, B:115:0x040b), top: B:7:0x0036, inners: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0240 A[Catch: all -> 0x00e7, TRY_LEAVE, TryCatch #9 {all -> 0x00e7, blocks: (B:123:0x00de, B:127:0x0237, B:129:0x0240, B:133:0x024d, B:134:0x0253, B:136:0x00f5, B:138:0x026b, B:140:0x0284, B:141:0x0287, B:188:0x0127, B:190:0x02a7, B:192:0x02c0, B:193:0x02c3, B:197:0x0135, B:198:0x01d6, B:126:0x0233), top: B:7:0x0036, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0284 A[Catch: all -> 0x00e7, TryCatch #9 {all -> 0x00e7, blocks: (B:123:0x00de, B:127:0x0237, B:129:0x0240, B:133:0x024d, B:134:0x0253, B:136:0x00f5, B:138:0x026b, B:140:0x0284, B:141:0x0287, B:188:0x0127, B:190:0x02a7, B:192:0x02c0, B:193:0x02c3, B:197:0x0135, B:198:0x01d6, B:126:0x0233), top: B:7:0x0036, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x022e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0264 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02d6 A[Catch: all -> 0x02e6, TryCatch #7 {all -> 0x02e6, blocks: (B:163:0x02cf, B:165:0x02d6, B:167:0x02dd, B:169:0x02e1, B:171:0x02e5, B:172:0x02e9, B:173:0x02ee, B:174:0x02ef, B:175:0x02f6, B:176:0x02f7, B:177:0x02fe, B:178:0x02ff), top: B:162:0x02cf }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ff A[Catch: all -> 0x02e6, TRY_LEAVE, TryCatch #7 {all -> 0x02e6, blocks: (B:163:0x02cf, B:165:0x02d6, B:167:0x02dd, B:169:0x02e1, B:171:0x02e5, B:172:0x02e9, B:173:0x02ee, B:174:0x02ef, B:175:0x02f6, B:176:0x02f7, B:177:0x02fe, B:178:0x02ff), top: B:162:0x02cf }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03ba A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #17 {all -> 0x0058, blocks: (B:13:0x004f, B:17:0x03b1, B:19:0x03ba, B:24:0x03c6, B:25:0x03cc, B:27:0x0066, B:29:0x03e3, B:31:0x03fc, B:32:0x03ff, B:79:0x0099, B:81:0x0420, B:83:0x0439, B:84:0x043c, B:88:0x00a7, B:89:0x0350, B:16:0x03ad), top: B:7:0x0036, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01c1 A[Catch: all -> 0x028e, TRY_LEAVE, TryCatch #13 {all -> 0x028e, blocks: (B:155:0x0255, B:206:0x01bb, B:208:0x01c1, B:212:0x01dd, B:214:0x01e6, B:216:0x01ff, B:224:0x0293), top: B:205:0x01bb, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01dd A[Catch: all -> 0x028e, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x028e, blocks: (B:155:0x0255, B:206:0x01bb, B:208:0x01c1, B:212:0x01dd, B:214:0x01e6, B:216:0x01ff, B:224:0x0293), top: B:205:0x01bb, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03fc A[Catch: all -> 0x0058, TryCatch #17 {all -> 0x0058, blocks: (B:13:0x004f, B:17:0x03b1, B:19:0x03ba, B:24:0x03c6, B:25:0x03cc, B:27:0x0066, B:29:0x03e3, B:31:0x03fc, B:32:0x03ff, B:79:0x0099, B:81:0x0420, B:83:0x0439, B:84:0x043c, B:88:0x00a7, B:89:0x0350, B:16:0x03ad), top: B:7:0x0036, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x044f A[Catch: all -> 0x045f, TryCatch #21 {all -> 0x045f, blocks: (B:48:0x0448, B:50:0x044f, B:52:0x0456, B:54:0x045a, B:56:0x045e, B:57:0x0462, B:58:0x0467, B:59:0x0468, B:60:0x046f, B:61:0x0470, B:62:0x0477, B:63:0x0478), top: B:47:0x0448 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0478 A[Catch: all -> 0x045f, TRY_LEAVE, TryCatch #21 {all -> 0x045f, blocks: (B:48:0x0448, B:50:0x044f, B:52:0x0456, B:54:0x045a, B:56:0x045e, B:57:0x0462, B:58:0x0467, B:59:0x0468, B:60:0x046f, B:61:0x0470, B:62:0x0477, B:63:0x0478), top: B:47:0x0448 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x033a A[Catch: all -> 0x0406, TRY_LEAVE, TryCatch #8 {all -> 0x0406, blocks: (B:74:0x03ce, B:96:0x0334, B:98:0x033a, B:102:0x0357, B:104:0x0360, B:106:0x0377, B:115:0x040b), top: B:7:0x0036, inners: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /* JADX WARN: Type inference failed for: r4v0, types: [cl2.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11, types: [ads_mobile_sdk.cs2, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [ads_mobile_sdk.p12, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.os.Bundle r25, bl2.c r26) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.a(android.os.Bundle, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x021a, code lost:
    
        if (r12.w(r0) == r1) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0130, code lost:
    
        if (r12.w(r0) == r1) goto L220;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ee A[Catch: all -> 0x01ff, TRY_LEAVE, TryCatch #19 {all -> 0x01ff, blocks: (B:112:0x01e8, B:115:0x01ee, B:118:0x01f5, B:124:0x0208, B:126:0x020c, B:129:0x0214), top: B:111:0x01e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0208 A[Catch: all -> 0x01ff, TryCatch #19 {all -> 0x01ff, blocks: (B:112:0x01e8, B:115:0x01ee, B:118:0x01f5, B:124:0x0208, B:126:0x020c, B:129:0x0214), top: B:111:0x01e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x017e A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:139:0x007d, B:140:0x0178, B:142:0x017e), top: B:138:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0267 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #13 {all -> 0x0039, blocks: (B:13:0x0034, B:14:0x0261, B:16:0x0267), top: B:12:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0105 A[Catch: all -> 0x0116, TRY_LEAVE, TryCatch #11 {all -> 0x0116, blocks: (B:176:0x00ff, B:179:0x0105, B:182:0x010c, B:188:0x011f, B:190:0x0123, B:193:0x012a), top: B:175:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x011f A[Catch: all -> 0x0116, TryCatch #11 {all -> 0x0116, blocks: (B:176:0x00ff, B:179:0x0105, B:182:0x010c, B:188:0x011f, B:190:0x0123, B:193:0x012a), top: B:175:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a3 A[Catch: all -> 0x01b3, TryCatch #8 {all -> 0x01b3, blocks: (B:26:0x019c, B:28:0x01a3, B:30:0x01aa, B:32:0x01ae, B:34:0x01b2, B:35:0x01b5, B:36:0x01ba, B:37:0x01bb, B:38:0x01c2, B:39:0x01c3, B:40:0x01ca, B:41:0x01cb), top: B:25:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cb A[Catch: all -> 0x01b3, TRY_LEAVE, TryCatch #8 {all -> 0x01b3, blocks: (B:26:0x019c, B:28:0x01a3, B:30:0x01aa, B:32:0x01ae, B:34:0x01b2, B:35:0x01b5, B:36:0x01ba, B:37:0x01bb, B:38:0x01c2, B:39:0x01c3, B:40:0x01ca, B:41:0x01cb), top: B:25:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x028d A[Catch: all -> 0x029d, TryCatch #18 {all -> 0x029d, blocks: (B:57:0x0286, B:59:0x028d, B:61:0x0294, B:63:0x0298, B:65:0x029c, B:66:0x029f, B:67:0x02a4, B:68:0x02a5, B:69:0x02ac, B:70:0x02ad, B:71:0x02b4, B:72:0x02b5), top: B:56:0x0286 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b5 A[Catch: all -> 0x029d, TRY_LEAVE, TryCatch #18 {all -> 0x029d, blocks: (B:57:0x0286, B:59:0x028d, B:61:0x0294, B:63:0x0298, B:65:0x029c, B:66:0x029f, B:67:0x02a4, B:68:0x02a5, B:69:0x02ac, B:70:0x02ad, B:71:0x02b4, B:72:0x02b5), top: B:56:0x0286 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004d  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v25, types: [mo2.c] */
    /* JADX WARN: Type inference failed for: r13v28, types: [kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r13v68 */
    /* JADX WARN: Type inference failed for: r13v69 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v70 */
    /* JADX WARN: Type inference failed for: r13v73 */
    /* JADX WARN: Type inference failed for: r13v76 */
    /* JADX WARN: Type inference failed for: r2v18, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14, types: [ads_mobile_sdk.zr] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v32, types: [ads_mobile_sdk.zr] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.zr r12, bl2.c r13) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.a(ads_mobile_sdk.zr, bl2.c):java.lang.Object");
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        Set<String> keySet2 = bundle2.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet2, "keySet(...)");
        if (!keySet.containsAll(keySet2)) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                if (!a((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (!Intrinsics.d(obj, obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(7:12|13|14|15|16|(1:18)|22)(2:27|28))(7:29|30|31|32|33|(1:35)|22))(5:40|41|42|43|44))(4:49|50|51|(2:53|(1:55)(4:56|42|43|44))(1:(2:58|(1:60)(6:61|31|32|33|(0)|22))(2:(2:63|(1:65)(5:66|14|15|16|(0)))|22)))|19|20))|71|6|7|(0)(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0037, code lost:
    
        r9 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v13, types: [ads_mobile_sdk.zr] */
    /* JADX WARN: Type inference failed for: r0v14, types: [ads_mobile_sdk.zr] */
    /* JADX WARN: Type inference failed for: r0v15, types: [ads_mobile_sdk.zr] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ads_mobile_sdk.lq, bl2.c] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(nm.s r9, bl2.c r10) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.a(nm.s, bl2.c):java.lang.Object");
    }

    public final void a(Map map, s sVar, Bundle bundle) {
        try {
            nm.u i13 = sVar.i();
            s v13 = i13.v("bk");
            String p13 = v13 != null ? v13.p() : null;
            s v14 = i13.v("sk");
            String p14 = v14 != null ? v14.p() : null;
            s v15 = i13.v("type");
            Integer valueOf = v15 != null ? Integer.valueOf(v15.e()) : null;
            Object obj = map.get(p14);
            hs hsVar = hs.f6059b;
            if (valueOf != null && valueOf.intValue() == 0) {
                if (obj instanceof String) {
                    bundle.putString(p13, (String) obj);
                    return;
                }
                return;
            }
            if (valueOf.intValue() == 1) {
                if (obj instanceof Integer) {
                    bundle.putInt(p13, ((Number) obj).intValue());
                    return;
                } else if (obj instanceof Long) {
                    bundle.putLong(p13, ((Number) obj).longValue());
                    return;
                } else {
                    if (obj instanceof Float) {
                        bundle.putFloat(p13, ((Number) obj).floatValue());
                        return;
                    }
                    return;
                }
            }
            if (valueOf != null && valueOf.intValue() == 2 && (obj instanceof Boolean)) {
                bundle.putBoolean(p13, ((Boolean) obj).booleanValue());
            }
        } catch (IllegalStateException e13) {
            ((ks2) this.f14876g).a("JSON shared preference consent key object parsing failure", e13);
        } catch (NumberFormatException e14) {
            ((ks2) this.f14876g).a("JSON shared preference consent key object parsing failure", e14);
        } catch (UnsupportedOperationException e15) {
            ((ks2) this.f14876g).a("JSON shared preference consent key object parsing failure", e15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.zr r6, boolean r7, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.ar
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.ar r0 = (ads_mobile_sdk.ar) r0
            int r1 = r0.f2503f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2503f = r1
            goto L18
        L13:
            ads_mobile_sdk.ar r0 = new ads_mobile_sdk.ar
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f2501d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f2503f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r8)
            goto L75
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            boolean r7 = r0.f2500c
            ads_mobile_sdk.aq r6 = r0.f2499b
            ads_mobile_sdk.zr r2 = r0.f2498a
            ue.c.H(r8)
            goto L56
        L3c:
            ue.c.H(r8)
            ads_mobile_sdk.aq r8 = ads_mobile_sdk.aq.API_GET_TOPICS
            ads_mobile_sdk.ff1 r2 = r6.B
            r0.f2498a = r6
            r0.f2499b = r8
            r0.f2500c = r7
            r0.f2503f = r4
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L52
            return r1
        L52:
            r5 = r2
            r2 = r6
            r6 = r8
            r8 = r5
        L56:
            ads_mobile_sdk.cq r8 = (ads_mobile_sdk.cq) r8
            ads_mobile_sdk.ew0 r8 = r8.s()
            boolean r6 = r8.contains(r6)
            r8 = 0
            if (r6 == 0) goto L77
            ads_mobile_sdk.rr2 r6 = r2.f14883n
            r0.f2498a = r8
            r0.f2499b = r8
            r0.f2503f = r3
            r6.getClass()
            java.lang.Object r8 = ads_mobile_sdk.rr2.a(r6, r7, r0)
            if (r8 != r1) goto L75
            return r1
        L75:
            a.ad r8 = (a.ad) r8
        L77:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.a(ads_mobile_sdk.zr, boolean, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Exception r5, bl2.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.er
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.er r0 = (ads_mobile_sdk.er) r0
            int r1 = r0.f4926d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4926d = r1
            goto L18
        L13:
            ads_mobile_sdk.er r0 = new ads_mobile_sdk.er
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4924b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4926d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Exception r5 = r0.f4923a
            ue.c.H(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ue.c.H(r6)
            ads_mobile_sdk.cq r6 = r4.d()
            r0.f4923a = r5
            r0.f4926d = r3
            java.lang.Object r6 = r4.a(r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.String r6 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            ads_mobile_sdk.cs2 r6 = ads_mobile_sdk.qs2.a()
            ads_mobile_sdk.jw1 r0 = r6.f()
            r1 = 0
            r0.f6988j = r1
            if (r5 == 0) goto L58
            r6.a(r5)
        L58:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.a(java.lang.Exception, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.jk0 r5, bl2.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.fr
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.fr r0 = (ads_mobile_sdk.fr) r0
            int r1 = r0.f5245d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5245d = r1
            goto L18
        L13:
            ads_mobile_sdk.fr r0 = new ads_mobile_sdk.fr
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f5243b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5245d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ads_mobile_sdk.jk0 r5 = r0.f5242a
            ue.c.H(r6)
            goto L53
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ue.c.H(r6)
            boolean r6 = r5 instanceof ads_mobile_sdk.kk0
            if (r6 == 0) goto L44
            r6 = r5
            ads_mobile_sdk.kk0 r6 = (ads_mobile_sdk.kk0) r6
            java.lang.Throwable r6 = r6.f7342c
            boolean r6 = r6 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L44
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        L44:
            ads_mobile_sdk.cq r6 = r4.d()
            r0.f5242a = r5
            r0.f5245d = r3
            java.lang.Object r6 = r4.a(r6, r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            ads_mobile_sdk.ft2.a(r5)
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.a(ads_mobile_sdk.jk0, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.zr r6, android.net.Uri r7, android.view.InputEvent r8, bl2.c r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.or
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.or r0 = (ads_mobile_sdk.or) r0
            int r1 = r0.f9414g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9414g = r1
            goto L18
        L13:
            ads_mobile_sdk.or r0 = new ads_mobile_sdk.or
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f9412e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f9414g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ue.c.H(r9)
            goto L89
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ads_mobile_sdk.aq r6 = r0.f9411d
            java.lang.Object r7 = r0.f9410c
            r8 = r7
            android.view.InputEvent r8 = (android.view.InputEvent) r8
            android.net.Uri r7 = r0.f9409b
            ads_mobile_sdk.zr r2 = r0.f9408a
            ue.c.H(r9)
            goto L5d
        L41:
            ue.c.H(r9)
            ads_mobile_sdk.aq r9 = ads_mobile_sdk.aq.API_ATTRIBUTION_REPORTING
            ads_mobile_sdk.ff1 r2 = r6.B
            r0.f9408a = r6
            r0.f9409b = r7
            r0.f9410c = r8
            r0.f9411d = r9
            r0.f9414g = r4
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L5d:
            ads_mobile_sdk.cq r9 = (ads_mobile_sdk.cq) r9
            ads_mobile_sdk.ew0 r9 = r9.s()
            boolean r6 = r9.contains(r6)
            r9 = 0
            if (r6 == 0) goto L8b
            ads_mobile_sdk.sg r6 = r2.f14884o
            r0.f9408a = r9
            r0.f9409b = r9
            r0.f9410c = r9
            r0.f9411d = r9
            r0.f9414g = r3
            ao2.j0 r2 = r6.f11085b
            ads_mobile_sdk.rg r3 = new ads_mobile_sdk.rg
            r3.<init>(r6, r7, r8, r9)
            r6 = 3
            ao2.q0 r6 = kotlin.jvm.internal.j.d(r2, r9, r3, r6)
            java.lang.Object r9 = r6.v(r0)
            if (r9 != r1) goto L89
            return r1
        L89:
            a.ad r9 = (a.ad) r9
        L8b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.a(ads_mobile_sdk.zr, android.net.Uri, android.view.InputEvent, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.cq r13, bl2.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof ads_mobile_sdk.ur
            if (r0 == 0) goto L13
            r0 = r14
            ads_mobile_sdk.ur r0 = (ads_mobile_sdk.ur) r0
            int r1 = r0.f12163d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12163d = r1
            goto L18
        L13:
            ads_mobile_sdk.ur r0 = new ads_mobile_sdk.ur
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f12161b
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12163d
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L49
            if (r2 == r7) goto L43
            if (r2 == r6) goto L3f
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            ue.c.H(r14)
            goto L74
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            ads_mobile_sdk.zr r13 = r0.f12160a
            ue.c.H(r14)
            goto L69
        L3f:
            ue.c.H(r14)
            goto L94
        L43:
            ads_mobile_sdk.zr r13 = r0.f12160a
            ue.c.H(r14)
            goto L85
        L49:
            ue.c.H(r14)
            ads_mobile_sdk.oh0 r14 = r12.f14878i
            boolean r2 = r14.f9297b
            if (r2 != 0) goto L77
            double r8 = r14.f9298c
            r10 = 0
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 <= 0) goto L5b
            goto L77
        L5b:
            ads_mobile_sdk.ff1 r14 = r12.B
            r0.f12160a = r12
            r0.f12163d = r5
            java.lang.Object r13 = r14.a(r13, r0)
            if (r13 != r1) goto L68
            return r1
        L68:
            r13 = r12
        L69:
            r0.f12160a = r3
            r0.f12163d = r4
            java.lang.Object r13 = r13.i(r0)
            if (r13 != r1) goto L74
            return r1
        L74:
            kotlin.Unit r13 = kotlin.Unit.f80348a
            return r13
        L77:
            ads_mobile_sdk.ff1 r14 = r12.B
            r0.f12160a = r12
            r0.f12163d = r7
            java.lang.Object r13 = r14.a(r13, r0)
            if (r13 != r1) goto L84
            return r1
        L84:
            r13 = r12
        L85:
            r0.f12160a = r3
            r0.f12163d = r6
            r13.getClass()
            r14 = 0
            java.lang.Object r13 = b(r13, r7, r14, r0)
            if (r13 != r1) goto L94
            return r1
        L94:
            kotlin.Unit r13 = kotlin.Unit.f80348a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.a(ads_mobile_sdk.cq, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, bl2.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.vr
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.vr r0 = (ads_mobile_sdk.vr) r0
            int r1 = r0.f12613f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12613f = r1
            goto L18
        L13:
            ads_mobile_sdk.vr r0 = new ads_mobile_sdk.vr
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f12611d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12613f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            ads_mobile_sdk.aq r5 = r0.f12610c
            java.lang.String r1 = r0.f12609b
            ads_mobile_sdk.zr r0 = r0.f12608a
            ue.c.H(r6)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            ue.c.H(r6)
            ads_mobile_sdk.aq r6 = ads_mobile_sdk.aq.API_SET_WEBVIEW_COOKIE
            ads_mobile_sdk.ff1 r2 = r4.B
            r0.f12608a = r4
            r0.f12609b = r5
            r0.f12610c = r6
            r0.f12613f = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r1 = r5
            r5 = r6
            r6 = r0
            r0 = r4
        L4f:
            ads_mobile_sdk.cq r6 = (ads_mobile_sdk.cq) r6
            ads_mobile_sdk.ew0 r6 = r6.s()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L68
            android.webkit.CookieManager r5 = r0.D
            if (r5 == 0) goto L68
            ads_mobile_sdk.oh0 r6 = r0.f14878i
            java.lang.String r6 = r6.n0()
            r5.setCookie(r6, r1)
        L68:
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zr.a(java.lang.String, bl2.c):java.lang.Object");
    }
}
