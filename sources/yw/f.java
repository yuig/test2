package yw;

import ao2.f0;
import kotlin.jvm.internal.Intrinsics;
import lb0.g;
import lb0.o;
import pb0.i;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final long f140257g = i.WEEKS.getMilliseconds();

    /* renamed from: h, reason: collision with root package name */
    public static final int f140258h = 2;

    /* renamed from: a, reason: collision with root package name */
    public final tw.a f140259a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f140260b;

    /* renamed from: c, reason: collision with root package name */
    public final pb0.a f140261c;

    /* renamed from: d, reason: collision with root package name */
    public final g f140262d;

    /* renamed from: e, reason: collision with root package name */
    public final o f140263e;

    /* renamed from: f, reason: collision with root package name */
    public String f140264f;

    public f(tw.a api, ko2.e ioDispatcher, pb0.a clock, g diskCache, o userPreferences) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(diskCache, "diskCache");
        Intrinsics.checkNotNullParameter(userPreferences, "userPreferences");
        this.f140259a = api;
        this.f140260b = ioDispatcher;
        this.f140261c = clock;
        this.f140262d = diskCache;
        this.f140263e = userPreferences;
        this.f140264f = "";
    }

    public static final void a(f fVar) {
        fVar.f140262d.getClass();
        g.a("ADS_OPEN_MEASUREMENT_SERVICE_CONTENT");
        ((lb0.b) fVar.f140263e).m("PREF_ADS_OPEN_MEASUREMENT_JS_EXPIRY_MS", 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(yw.f r9, kotlin.jvm.functions.Function1 r10, bl2.c r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof yw.c
            if (r0 == 0) goto L17
            r0 = r11
            yw.c r0 = (yw.c) r0
            int r1 = r0.f140252t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f140252t = r1
        L15:
            r8 = r0
            goto L1d
        L17:
            yw.c r0 = new yw.c
            r0.<init>(r9, r11)
            goto L15
        L1d:
            java.lang.Object r11 = r8.f140250r
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r8.f140252t
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            ue.c.H(r11)     // Catch: java.lang.Exception -> L2c
            goto L51
        L2c:
            r9 = move-exception
            goto L55
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            ue.c.H(r11)
            int r3 = yw.f.f140258h     // Catch: java.lang.Exception -> L2c
            yw.d r6 = yw.d.f140253i     // Catch: java.lang.Exception -> L2c
            yw.e r7 = new yw.e     // Catch: java.lang.Exception -> L2c
            r11 = 0
            r7.<init>(r9, r10, r11)     // Catch: java.lang.Exception -> L2c
            r8.f140252t = r2     // Catch: java.lang.Exception -> L2c
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1
            r1 = 2500(0x9c4, double:1.235E-320)
            java.lang.Object r11 = pk.a0.e1(r1, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L2c
            if (r11 != r0) goto L51
            goto L5b
        L51:
            com.pinterest.api.adapter.coroutine.NetworkResponse r11 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r11     // Catch: java.lang.Exception -> L2c
            r0 = r11
            goto L5b
        L55:
            xz.a r10 = new xz.a
            r10.<init>(r9)
            r0 = r10
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yw.f.b(yw.f, kotlin.jvm.functions.Function1, bl2.c):java.lang.Object");
    }
}
