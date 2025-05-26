package ads_mobile_sdk;

import a.zb;
import android.content.Context;
import ao2.j0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pc2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9624a;

    /* renamed from: b, reason: collision with root package name */
    public final zb f9625b;

    /* renamed from: c, reason: collision with root package name */
    public final eg f9626c;

    /* renamed from: d, reason: collision with root package name */
    public final a.fe f9627d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f9628e;

    /* renamed from: f, reason: collision with root package name */
    public final a.j3 f9629f;

    /* renamed from: g, reason: collision with root package name */
    public final sb2 f9630g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9631h;

    /* renamed from: i, reason: collision with root package name */
    public final long f9632i;

    /* renamed from: j, reason: collision with root package name */
    public final mo2.a f9633j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f9634k;

    public pc2(oh0 flags, Context context, zb clock, eg appState, a.fe mediationAdapterProxyFactory, j0 backgroundScope, a.j3 traceLogger, sb2 rootTraceCreator) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(mediationAdapterProxyFactory, "mediationAdapterProxyFactory");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        this.f9624a = context;
        this.f9625b = clock;
        this.f9626c = appState;
        this.f9627d = mediationAdapterProxyFactory;
        this.f9628e = backgroundScope;
        this.f9629f = traceLogger;
        this.f9630g = rootTraceCreator;
        this.f9631h = flags.d0();
        this.f9632i = zn2.b.l(flags.e0(), yk2.f14304e.a());
        this.f9633j = mo2.d.a();
        this.f9634k = new ArrayList();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01c2 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #6 {all -> 0x003d, blocks: (B:13:0x0038, B:14:0x01bc, B:16:0x01c2), top: B:12:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d9 A[Catch: all -> 0x01e9, TryCatch #4 {all -> 0x01e9, blocks: (B:25:0x01d2, B:27:0x01d9, B:29:0x01e0, B:31:0x01e4, B:33:0x01e8, B:34:0x01ec, B:35:0x01f1, B:36:0x01f2, B:37:0x01f9, B:38:0x01fa, B:39:0x0201, B:40:0x0202), top: B:24:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0202 A[Catch: all -> 0x01e9, TRY_LEAVE, TryCatch #4 {all -> 0x01e9, blocks: (B:25:0x01d2, B:27:0x01d9, B:29:0x01e0, B:31:0x01e4, B:33:0x01e8, B:34:0x01ec, B:35:0x01f1, B:36:0x01f2, B:37:0x01f9, B:38:0x01fa, B:39:0x0201, B:40:0x0202), top: B:24:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fc A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #1 {all -> 0x0051, blocks: (B:53:0x004c, B:54:0x00f6, B:56:0x00fc), top: B:52:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113 A[Catch: all -> 0x0123, TryCatch #2 {all -> 0x0123, blocks: (B:62:0x010c, B:64:0x0113, B:66:0x011a, B:68:0x011e, B:70:0x0122, B:71:0x0126, B:72:0x012b, B:73:0x012c, B:74:0x0133, B:75:0x0134, B:76:0x013b, B:77:0x013c), top: B:61:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c A[Catch: all -> 0x0123, TRY_LEAVE, TryCatch #2 {all -> 0x0123, blocks: (B:62:0x010c, B:64:0x0113, B:66:0x011a, B:68:0x011e, B:70:0x0122, B:71:0x0126, B:72:0x012b, B:73:0x012c, B:74:0x0133, B:75:0x0134, B:76:0x013b, B:77:0x013c), top: B:61:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r16v0, types: [ads_mobile_sdk.pc2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v25, types: [ads_mobile_sdk.cs2] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ads_mobile_sdk.pc2 r16, java.util.Map.Entry r17, wi.k r18, java.util.Map r19, java.lang.String r20, vi.a r21, bl2.c r22) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pc2.a(ads_mobile_sdk.pc2, java.util.Map$Entry, wi.k, java.util.Map, java.lang.String, vi.a, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(5:(2:3|(13:5|6|7|(1:(1:(5:11|12|13|14|15)(2:21|22))(4:23|24|25|26))(12:47|48|49|50|51|52|53|54|55|56|57|(1:59)(1:60))|27|28|29|30|(1:32)|12|13|14|15))|12|13|14|15)|79|6|7|(0)(0)|27|28|29|30|(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        r19 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0131 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.os.Bundle r33, android.os.Bundle r34, vi.a r35, java.lang.String r36, java.lang.String r37, bl2.c r38) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pc2.a(android.os.Bundle, android.os.Bundle, vi.a, java.lang.String, java.lang.String, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(vi.a r17, java.lang.String r18, wi.k r19, bl2.c r20) {
        /*
            r16 = this;
            r7 = r16
            r0 = r20
            boolean r1 = r0 instanceof ads_mobile_sdk.jc2
            if (r1 == 0) goto L18
            r1 = r0
            ads_mobile_sdk.jc2 r1 = (ads_mobile_sdk.jc2) r1
            int r2 = r1.f6750e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f6750e = r2
        L16:
            r0 = r1
            goto L1e
        L18:
            ads_mobile_sdk.jc2 r1 = new ads_mobile_sdk.jc2
            r1.<init>(r7, r0)
            goto L16
        L1e:
            java.lang.Object r1 = r0.f6748c
            cl2.a r8 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f6750e
            r9 = 2
            r10 = 1
            r11 = 0
            if (r2 == 0) goto L43
            if (r2 == r10) goto L3d
            if (r2 != r9) goto L35
            mo2.a r2 = r0.f6747b
            ads_mobile_sdk.pc2 r0 = r0.f6746a
            ue.c.H(r1)
            goto L7a
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            ads_mobile_sdk.pc2 r2 = r0.f6746a
            ue.c.H(r1)
            goto L65
        L43:
            ue.c.H(r1)
            a.l0 r12 = ads_mobile_sdk.cm0.f3958f
            long r13 = r7.f9632i
            ads_mobile_sdk.lc2 r15 = new ads_mobile_sdk.lc2
            r6 = 0
            r1 = r15
            r2 = r16
            r3 = r19
            r4 = r18
            r5 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r0.f6746a = r7
            r0.f6750e = r10
            java.lang.Object r1 = r12.a(r13, r15, r0)
            if (r1 != r8) goto L64
            return r8
        L64:
            r2 = r7
        L65:
            a.ad r1 = (a.ad) r1
            mo2.a r1 = r2.f9633j
            r0.f6746a = r2
            r0.f6747b = r1
            r0.f6750e = r9
            mo2.c r1 = (mo2.c) r1
            java.lang.Object r0 = r1.f(r11, r0)
            if (r0 != r8) goto L78
            return r8
        L78:
            r0 = r2
            r2 = r1
        L7a:
            java.util.ArrayList r0 = r0.f9634k     // Catch: java.lang.Throwable -> L82
            mo2.c r2 = (mo2.c) r2
            r2.i(r11)
            return r0
        L82:
            r0 = move-exception
            r1 = r0
            mo2.c r2 = (mo2.c) r2
            r2.i(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pc2.a(vi.a, java.lang.String, wi.k, bl2.c):java.lang.Object");
    }
}
