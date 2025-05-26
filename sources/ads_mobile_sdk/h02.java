package ads_mobile_sdk;

import a.h3;
import a.zb;
import ao2.j0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h02 extends yr0 implements a.ie, h3 {
    public final LinkedHashMap A;
    public final LinkedHashMap B;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f5779d;

    /* renamed from: e, reason: collision with root package name */
    public final a.j3 f5780e;

    /* renamed from: f, reason: collision with root package name */
    public final sb2 f5781f;

    /* renamed from: g, reason: collision with root package name */
    public final zb f5782g;

    /* renamed from: h, reason: collision with root package name */
    public final oh0 f5783h;

    /* renamed from: i, reason: collision with root package name */
    public final a.v0 f5784i;

    /* renamed from: j, reason: collision with root package name */
    public final a.v7 f5785j;

    /* renamed from: k, reason: collision with root package name */
    public final a.v7 f5786k;

    /* renamed from: l, reason: collision with root package name */
    public final a.v7 f5787l;

    /* renamed from: m, reason: collision with root package name */
    public final a.v7 f5788m;

    /* renamed from: n, reason: collision with root package name */
    public final a.v7 f5789n;

    /* renamed from: o, reason: collision with root package name */
    public final mo2.a f5790o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5791p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5792q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5793r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5794s;

    /* renamed from: t, reason: collision with root package name */
    public long f5795t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5796u;

    /* renamed from: v, reason: collision with root package name */
    public long f5797v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f5798w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashMap f5799x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f5800y;

    /* renamed from: z, reason: collision with root package name */
    public final LinkedHashMap f5801z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h02(j0 backgroundScope, a.j3 traceLogger, sb2 rootTraceCreator, zb clock, oh0 flags, a.v0 randomGenerator, a.o8 appOpenComponentProvider, a.o8 bannerComponentProvider, a.o8 interstitialComponentProvider, a.o8 nativeComponentProvider, a.o8 rewardedComponentProvider) {
        super((il0) null, false, 7);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(randomGenerator, "randomGenerator");
        Intrinsics.checkNotNullParameter(appOpenComponentProvider, "appOpenComponentProvider");
        Intrinsics.checkNotNullParameter(bannerComponentProvider, "bannerComponentProvider");
        Intrinsics.checkNotNullParameter(interstitialComponentProvider, "interstitialComponentProvider");
        Intrinsics.checkNotNullParameter(nativeComponentProvider, "nativeComponentProvider");
        Intrinsics.checkNotNullParameter(rewardedComponentProvider, "rewardedComponentProvider");
        this.f5779d = backgroundScope;
        this.f5780e = traceLogger;
        this.f5781f = rootTraceCreator;
        this.f5782g = clock;
        this.f5783h = flags;
        this.f5784i = randomGenerator;
        this.f5785j = appOpenComponentProvider;
        this.f5786k = bannerComponentProvider;
        this.f5787l = interstitialComponentProvider;
        this.f5788m = nativeComponentProvider;
        this.f5789n = rewardedComponentProvider;
        this.f5790o = mo2.d.a();
        this.f5791p = true;
        this.f5792q = true;
        this.f5793r = true;
        this.f5794s = true;
        zn2.b.f142311b.getClass();
        this.f5795t = 0L;
        this.f5796u = true;
        this.f5797v = 0L;
        this.f5798w = new LinkedHashMap();
        this.f5799x = new LinkedHashMap();
        this.f5800y = new LinkedHashMap();
        this.f5801z = new LinkedHashMap();
        this.A = new LinkedHashMap();
        this.B = new LinkedHashMap();
    }

    public static final LinkedHashMap a(h02 h02Var, h92 h92Var) {
        h02Var.getClass();
        int ordinal = h92Var.ordinal();
        if (ordinal == 1) {
            return h02Var.f5798w;
        }
        if (ordinal == 2) {
            return h02Var.f5799x;
        }
        if (ordinal == 4) {
            return h02Var.f5800y;
        }
        if (ordinal == 5) {
            return h02Var.f5801z;
        }
        if (ordinal == 6) {
            return h02Var.A;
        }
        if (ordinal != 7) {
            return null;
        }
        return h02Var.B;
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f6: CHECK_CAST (r8 I:mo2.c) = (mo2.c) (r8 I:??[OBJECT, ARRAY]), block:B:62:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:12:0x0039, B:14:0x00c1, B:18:0x0098, B:20:0x009e, B:22:0x00a6, B:25:0x00b2, B:31:0x00b9, B:35:0x00e6, B:39:0x00c8, B:40:0x00e5, B:44:0x0078, B:46:0x0080, B:49:0x0085, B:50:0x00ee), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8 A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:12:0x0039, B:14:0x00c1, B:18:0x0098, B:20:0x009e, B:22:0x00a6, B:25:0x00b2, B:31:0x00b9, B:35:0x00e6, B:39:0x00c8, B:40:0x00e5, B:44:0x0078, B:46:0x0080, B:49:0x0085, B:50:0x00ee), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b9 -> B:14:0x00c1). Please report as a decompilation issue!!! */
    @Override // a.ie
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r10, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h02.b(long, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00d7: CHECK_CAST (r6 I:mo2.c) = (mo2.c) (r6 I:??[OBJECT, ARRAY]), block:B:54:0x00d7 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:12:0x0033, B:14:0x00a2, B:18:0x0087, B:20:0x008d, B:24:0x009a, B:26:0x00c7, B:30:0x00a9, B:31:0x00c4, B:35:0x006c, B:37:0x0074, B:40:0x0079, B:41:0x00cf), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9 A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:12:0x0033, B:14:0x00a2, B:18:0x0087, B:20:0x008d, B:24:0x009a, B:26:0x00c7, B:30:0x00a9, B:31:0x00c4, B:35:0x006c, B:37:0x0074, B:40:0x0079, B:41:0x00cf), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009a -> B:14:0x00a2). Please report as a decompilation issue!!! */
    @Override // a.h3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r10, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h02.c(long, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f7: CHECK_CAST (r8 I:mo2.c) = (mo2.c) (r8 I:??[OBJECT, ARRAY]), block:B:62:0x00f7 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:12:0x0039, B:14:0x00c2, B:18:0x0099, B:20:0x009f, B:22:0x00a7, B:25:0x00b3, B:31:0x00ba, B:35:0x00e7, B:39:0x00c9, B:40:0x00e6, B:44:0x0078, B:46:0x0080, B:49:0x0085, B:50:0x00ef), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9 A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:12:0x0039, B:14:0x00c2, B:18:0x0099, B:20:0x009f, B:22:0x00a7, B:25:0x00b3, B:31:0x00ba, B:35:0x00e7, B:39:0x00c9, B:40:0x00e6, B:44:0x0078, B:46:0x0080, B:49:0x0085, B:50:0x00ef), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ba -> B:14:0x00c2). Please report as a decompilation issue!!! */
    @Override // a.ie
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r10, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h02.d(long, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:11:0x007e, B:13:0x0082, B:14:0x0087, B:16:0x008b, B:17:0x008d), top: B:10:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:11:0x007e, B:13:0x0082, B:14:0x0087, B:16:0x008b, B:17:0x008d), top: B:10:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ads_mobile_sdk.yr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(bl2.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.fz1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.fz1 r0 = (ads_mobile_sdk.fz1) r0
            int r1 = r0.f5340e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5340e = r1
            goto L18
        L13:
            ads_mobile_sdk.fz1 r0 = new ads_mobile_sdk.fz1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f5338c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f5340e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            mo2.a r1 = r0.f5337b
            ads_mobile_sdk.h02 r0 = r0.f5336a
            ue.c.H(r8)
            goto L7e
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            ue.c.H(r8)
            ads_mobile_sdk.oh0 r8 = r7.f5783h
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            ads_mobile_sdk.wg0 r5 = ads_mobile_sdk.oh0.f9281e
            java.lang.String r6 = "gads:preload:bind_to_online:enabled"
            java.lang.Object r8 = r8.a(r6, r2, r5)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r7.f5791p = r8
            ads_mobile_sdk.oh0 r8 = r7.f5783h
            java.lang.String r6 = "gads:preload:bind_on_foreground"
            java.lang.Object r8 = r8.a(r6, r2, r5)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r7.f5792q = r8
            ads_mobile_sdk.oh0 r8 = r7.f5783h
            java.lang.String r6 = "gads:preload_app_open_in_background"
            java.lang.Object r8 = r8.a(r6, r2, r5)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r7.f5793r = r8
            mo2.a r8 = r7.f5790o
            r0.f5336a = r7
            r0.f5337b = r8
            r0.f5340e = r3
            mo2.c r8 = (mo2.c) r8
            java.lang.Object r0 = r8.f(r4, r0)
            if (r0 != r1) goto L7c
            return r1
        L7c:
            r0 = r7
            r1 = r8
        L7e:
            boolean r8 = r0.f5791p     // Catch: java.lang.Throwable -> L85
            if (r8 != 0) goto L87
            r0.f5796u = r3     // Catch: java.lang.Throwable -> L85
            goto L87
        L85:
            r8 = move-exception
            goto L9a
        L87:
            boolean r8 = r0.f5792q     // Catch: java.lang.Throwable -> L85
            if (r8 != 0) goto L8d
            r0.f5794s = r3     // Catch: java.lang.Throwable -> L85
        L8d:
            kotlin.Unit r8 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L85
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            ads_mobile_sdk.pk0 r0 = new ads_mobile_sdk.pk0
            r0.<init>(r8)
            return r0
        L9a:
            mo2.c r1 = (mo2.c) r1
            r1.i(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h02.e(bl2.c):java.lang.Object");
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00d6: CHECK_CAST (r6 I:mo2.c) = (mo2.c) (r6 I:??[OBJECT, ARRAY]), block:B:54:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:12:0x0033, B:14:0x00a1, B:18:0x0086, B:20:0x008c, B:24:0x0099, B:26:0x00c6, B:30:0x00a8, B:31:0x00c3, B:35:0x006c, B:37:0x0074, B:40:0x0079, B:41:0x00ce), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:12:0x0033, B:14:0x00a1, B:18:0x0086, B:20:0x008c, B:24:0x0099, B:26:0x00c6, B:30:0x00a8, B:31:0x00c3, B:35:0x006c, B:37:0x0074, B:40:0x0079, B:41:0x00ce), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0099 -> B:14:0x00a1). Please report as a decompilation issue!!! */
    @Override // a.h3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r10, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h02.a(long, bl2.c):java.lang.Object");
    }
}
